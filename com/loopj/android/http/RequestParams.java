package com.loopj.android.http;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class RequestParams implements Serializable {
    public static class FileWrapper implements Serializable {
        public final String contentType;
        public final String customFileName;
        public final File file;

        public FileWrapper(File file, String contentType, String customFileName) {
            this.file = file;
            this.contentType = contentType;
            this.customFileName = customFileName;
        }
    }

    public static class StreamWrapper {
        public final boolean autoClose;
        public final String contentType;
        public final InputStream inputStream;
        public final String name;

        public StreamWrapper(InputStream inputStream, String name, String contentType, boolean autoClose) {
            this.inputStream = inputStream;
            this.name = name;
            this.contentType = contentType;
            this.autoClose = autoClose;
        }

        static StreamWrapper newInstance(InputStream inputStream, String name, String contentType, boolean autoClose) {
            if(contentType == null) {
                contentType = "application/octet-stream";
            }
            return new StreamWrapper(inputStream, name, contentType, autoClose);
        }
    }

    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
    protected static final String LOG_TAG = "RequestParams";
    protected boolean autoCloseInputStreams;
    protected String contentEncoding;
    protected String elapsedFieldInJsonStreamer;
    protected final ConcurrentHashMap fileArrayParams;
    protected final ConcurrentHashMap fileParams;
    protected boolean forceMultipartEntity;
    protected boolean isRepeatable;
    protected final ConcurrentHashMap streamParams;
    protected final ConcurrentHashMap urlParams;
    protected final ConcurrentHashMap urlParamsWithObjects;
    protected boolean useJsonStreamer;

    public RequestParams() {
        this(null);
    }

    public RequestParams(String key, String value) {
        this(new HashMap() {
            {
                String s = value;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.put(value, this.val$value);
            }
        });
    }

    public RequestParams(Map map0) {
        this.forceMultipartEntity = false;
        this.elapsedFieldInJsonStreamer = "_elapsed";
        this.urlParams = new ConcurrentHashMap();
        this.streamParams = new ConcurrentHashMap();
        this.fileParams = new ConcurrentHashMap();
        this.fileArrayParams = new ConcurrentHashMap();
        this.urlParamsWithObjects = new ConcurrentHashMap();
        this.contentEncoding = "UTF-8";
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                this.put(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
        }
    }

    public RequestParams(Object[] keysAndValues) {
        this.forceMultipartEntity = false;
        this.elapsedFieldInJsonStreamer = "_elapsed";
        this.urlParams = new ConcurrentHashMap();
        this.streamParams = new ConcurrentHashMap();
        this.fileParams = new ConcurrentHashMap();
        this.fileArrayParams = new ConcurrentHashMap();
        this.urlParamsWithObjects = new ConcurrentHashMap();
        this.contentEncoding = "UTF-8";
        if(keysAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Supplied arguments must be even");
        }
        for(int i = 0; i < keysAndValues.length; i += 2) {
            this.put(String.valueOf(keysAndValues[i]), String.valueOf(keysAndValues[i + 1]));
        }
    }

    public void add(String key, String value) {
        if(key != null && value != null) {
            HashSet params = this.urlParamsWithObjects.get(key);
            if(params == null) {
                params = new HashSet();
                this.put(key, params);
            }
            if(params instanceof List) {
                ((List)params).add(value);
                return;
            }
            if(params instanceof Set) {
                params.add(value);
            }
        }
    }

    private HttpEntity createFormEntity() {
        try {
            return new UrlEncodedFormEntity(this.getParamsList(), this.contentEncoding);
        }
        catch(UnsupportedEncodingException e) {
            AsyncHttpClient.log.e("RequestParams", "createFormEntity failed", e);
            return null;
        }
    }

    private HttpEntity createJsonStreamerEntity(ResponseHandlerInterface progressHandler) throws IOException {
        HttpEntity entity = new JsonStreamerEntity(progressHandler, !this.fileParams.isEmpty() || !this.streamParams.isEmpty(), this.elapsedFieldInJsonStreamer);
        for(Object object0: this.urlParams.entrySet()) {
            ((JsonStreamerEntity)entity).addPart(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        for(Object object1: this.urlParamsWithObjects.entrySet()) {
            ((JsonStreamerEntity)entity).addPart(((String)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue());
        }
        for(Object object2: this.fileParams.entrySet()) {
            ((JsonStreamerEntity)entity).addPart(((String)((Map.Entry)object2).getKey()), ((Map.Entry)object2).getValue());
        }
        for(Object object3: this.streamParams.entrySet()) {
            Map.Entry entry = (Map.Entry)object3;
            StreamWrapper stream = (StreamWrapper)entry.getValue();
            if(stream.inputStream != null) {
                ((JsonStreamerEntity)entity).addPart(((String)entry.getKey()), StreamWrapper.newInstance(stream.inputStream, stream.name, stream.contentType, stream.autoClose));
            }
        }
        return entity;
    }

    private HttpEntity createMultipartEntity(ResponseHandlerInterface progressHandler) throws IOException {
        HttpEntity entity = new SimpleMultipartEntity(progressHandler);
        ((SimpleMultipartEntity)entity).setIsRepeatable(this.isRepeatable);
        for(Object object0: this.urlParams.entrySet()) {
            ((SimpleMultipartEntity)entity).addPartWithCharset(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()), this.contentEncoding);
        }
        for(Object object1: this.getParamsList(null, this.urlParamsWithObjects)) {
            ((SimpleMultipartEntity)entity).addPartWithCharset(((BasicNameValuePair)object1).getName(), ((BasicNameValuePair)object1).getValue(), this.contentEncoding);
        }
        for(Object object2: this.streamParams.entrySet()) {
            Map.Entry entry = (Map.Entry)object2;
            StreamWrapper stream = (StreamWrapper)entry.getValue();
            if(stream.inputStream != null) {
                ((SimpleMultipartEntity)entity).addPart(((String)entry.getKey()), stream.name, stream.inputStream, stream.contentType);
            }
        }
        for(Object object3: this.fileParams.entrySet()) {
            FileWrapper fileWrapper = (FileWrapper)((Map.Entry)object3).getValue();
            ((SimpleMultipartEntity)entity).addPart(((String)((Map.Entry)object3).getKey()), fileWrapper.file, fileWrapper.contentType, fileWrapper.customFileName);
        }
        for(Object object4: this.fileArrayParams.entrySet()) {
            Map.Entry entry = (Map.Entry)object4;
            for(Object object5: ((List)entry.getValue())) {
                ((SimpleMultipartEntity)entity).addPart(((String)entry.getKey()), ((FileWrapper)object5).file, ((FileWrapper)object5).contentType, ((FileWrapper)object5).customFileName);
            }
        }
        return entity;
    }

    public HttpEntity getEntity(ResponseHandlerInterface progressHandler) throws IOException {
        if(this.useJsonStreamer) {
            return this.createJsonStreamerEntity(progressHandler);
        }
        return this.forceMultipartEntity || !this.streamParams.isEmpty() || !this.fileParams.isEmpty() || !this.fileArrayParams.isEmpty() ? this.createMultipartEntity(progressHandler) : this.createFormEntity();
    }

    protected String getParamString() {
        return URLEncodedUtils.format(this.getParamsList(), this.contentEncoding);
    }

    private List getParamsList(String key, Object value) {
        List params = new LinkedList();
        if(value instanceof Map) {
            ArrayList list = new ArrayList(((Map)value).keySet());
            if(list.size() > 0 && list.get(0) instanceof Comparable) {
                Collections.sort(list);
            }
            for(Object object1: list) {
                if(object1 instanceof String) {
                    Object object2 = ((Map)value).get(object1);
                    if(object2 != null) {
                        params.addAll(this.getParamsList((key == null ? ((String)object1) : String.format(Locale.US, "%s[%s]", key, object1)), object2));
                    }
                }
            }
            return params;
        }
        if(value instanceof List) {
            int v = ((List)value).size();
            for(int nestedValueIndex = 0; nestedValueIndex < v; ++nestedValueIndex) {
                params.addAll(this.getParamsList(String.format(Locale.US, "%s[%d]", key, nestedValueIndex), ((List)value).get(nestedValueIndex)));
            }
            return params;
        }
        if(value instanceof Object[]) {
            for(int nestedValueIndex = 0; nestedValueIndex < ((Object[])value).length; ++nestedValueIndex) {
                params.addAll(this.getParamsList(String.format(Locale.US, "%s[%d]", key, nestedValueIndex), ((Object[])value)[nestedValueIndex]));
            }
            return params;
        }
        if(value instanceof Set) {
            for(Object object3: ((Set)value)) {
                params.addAll(this.getParamsList(key, object3));
            }
            return params;
        }
        params.add(new BasicNameValuePair(key, value.toString()));
        return params;
    }

    protected List getParamsList() {
        List lparams = new LinkedList();
        for(Object object0: this.urlParams.entrySet()) {
            lparams.add(new BasicNameValuePair(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
        }
        lparams.addAll(this.getParamsList(null, this.urlParamsWithObjects));
        return lparams;
    }

    public boolean has(String key) {
        return this.urlParams.get(key) != null || this.streamParams.get(key) != null || this.fileParams.get(key) != null || this.urlParamsWithObjects.get(key) != null || this.fileArrayParams.get(key) != null;
    }

    public void put(String key, int value) {
        if(key != null) {
            this.urlParams.put(key, String.valueOf(value));
        }
    }

    public void put(String key, long value) {
        if(key != null) {
            this.urlParams.put(key, String.valueOf(value));
        }
    }

    public void put(String key, File file) throws FileNotFoundException {
        this.put(key, file, null, null);
    }

    public void put(String key, File file, String contentType) throws FileNotFoundException {
        this.put(key, file, contentType, null);
    }

    public void put(String key, File file, String contentType, String customFileName) throws FileNotFoundException {
        if(file == null || !file.exists()) {
            throw new FileNotFoundException();
        }
        if(key != null) {
            FileWrapper requestParams$FileWrapper0 = new FileWrapper(file, contentType, customFileName);
            this.fileParams.put(key, requestParams$FileWrapper0);
        }
    }

    public void put(String key, InputStream stream) {
        this.put(key, stream, null);
    }

    public void put(String key, InputStream stream, String name) {
        this.put(key, stream, name, null);
    }

    public void put(String key, InputStream stream, String name, String contentType) {
        this.put(key, stream, name, contentType, this.autoCloseInputStreams);
    }

    public void put(String key, InputStream stream, String name, String contentType, boolean autoClose) {
        if(key != null && stream != null) {
            StreamWrapper requestParams$StreamWrapper0 = StreamWrapper.newInstance(stream, name, contentType, autoClose);
            this.streamParams.put(key, requestParams$StreamWrapper0);
        }
    }

    public void put(String key, Object value) {
        if(key != null && value != null) {
            this.urlParamsWithObjects.put(key, value);
        }
    }

    public void put(String key, String value) {
        if(key != null && value != null) {
            this.urlParams.put(key, value);
        }
    }

    public void put(String key, String customFileName, File file) throws FileNotFoundException {
        this.put(key, file, null, customFileName);
    }

    public void put(String key, File[] files) throws FileNotFoundException {
        this.put(key, files, null, null);
    }

    public void put(String key, File[] files, String contentType, String customFileName) throws FileNotFoundException {
        if(key != null) {
            ArrayList fileWrappers = new ArrayList();
            for(int v = 0; v < files.length; ++v) {
                File file = files[v];
                if(file == null || !file.exists()) {
                    throw new FileNotFoundException();
                }
                fileWrappers.add(new FileWrapper(file, contentType, customFileName));
            }
            this.fileArrayParams.put(key, fileWrappers);
        }
    }

    public void remove(String key) {
        this.urlParams.remove(key);
        this.streamParams.remove(key);
        this.fileParams.remove(key);
        this.urlParamsWithObjects.remove(key);
        this.fileArrayParams.remove(key);
    }

    public void setAutoCloseInputStreams(boolean flag) {
        this.autoCloseInputStreams = flag;
    }

    public void setContentEncoding(String encoding) {
        if(encoding != null) {
            this.contentEncoding = encoding;
            return;
        }
        AsyncHttpClient.log.d("RequestParams", "setContentEncoding called with null attribute");
    }

    public void setElapsedFieldInJsonStreamer(String value) {
        this.elapsedFieldInJsonStreamer = value;
    }

    public void setForceMultipartEntityContentType(boolean force) {
        this.forceMultipartEntity = force;
    }

    public void setHttpEntityIsRepeatable(boolean flag) {
        this.isRepeatable = flag;
    }

    public void setUseJsonStreamer(boolean flag) {
        this.useJsonStreamer = flag;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Object object0: this.urlParams.entrySet()) {
            if(result.length() > 0) {
                result.append("&");
            }
            result.append(((String)((Map.Entry)object0).getKey()));
            result.append("=");
            result.append(((String)((Map.Entry)object0).getValue()));
        }
        for(Object object1: this.streamParams.entrySet()) {
            if(result.length() > 0) {
                result.append("&");
            }
            result.append(((String)((Map.Entry)object1).getKey()));
            result.append("=");
            result.append("STREAM");
        }
        for(Object object2: this.fileParams.entrySet()) {
            if(result.length() > 0) {
                result.append("&");
            }
            result.append(((String)((Map.Entry)object2).getKey()));
            result.append("=");
            result.append("FILE");
        }
        for(Object object3: this.fileArrayParams.entrySet()) {
            if(result.length() > 0) {
                result.append("&");
            }
            result.append(((String)((Map.Entry)object3).getKey()));
            result.append("=");
            result.append("FILES(SIZE=").append(((List)((Map.Entry)object3).getValue()).size()).append(")");
        }
        for(Object object4: this.getParamsList(null, this.urlParamsWithObjects)) {
            if(result.length() > 0) {
                result.append("&");
            }
            result.append(((BasicNameValuePair)object4).getName());
            result.append("=");
            result.append(((BasicNameValuePair)object4).getValue());
        }
        return result.toString();
    }
}

