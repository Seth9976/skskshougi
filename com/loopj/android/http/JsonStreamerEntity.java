package com.loopj.android.http;

import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonStreamerEntity implements HttpEntity {
    private static final int BUFFER_SIZE = 0x1000;
    private static final UnsupportedOperationException ERR_UNSUPPORTED = null;
    private static final Header HEADER_GZIP_ENCODING = null;
    private static final Header HEADER_JSON_CONTENT = null;
    private static final byte[] JSON_FALSE = null;
    private static final byte[] JSON_NULL = null;
    private static final byte[] JSON_TRUE = null;
    private static final String LOG_TAG = "JsonStreamerEntity";
    private static final byte[] STREAM_CONTENTS;
    private static final byte[] STREAM_NAME;
    private static final byte[] STREAM_TYPE;
    private final byte[] buffer;
    private final Header contentEncoding;
    private final byte[] elapsedField;
    private final Map jsonParams;
    private final ResponseHandlerInterface progressHandler;

    static {
        JsonStreamerEntity.ERR_UNSUPPORTED = new UnsupportedOperationException("Unsupported operation in this implementation.");
        JsonStreamerEntity.JSON_TRUE = "true".getBytes();
        JsonStreamerEntity.JSON_FALSE = "false".getBytes();
        JsonStreamerEntity.JSON_NULL = "null".getBytes();
        JsonStreamerEntity.STREAM_NAME = new byte[]{34, 110, 97, 109, 101, 34};
        JsonStreamerEntity.STREAM_TYPE = new byte[]{34, 0x74, 0x79, 0x70, 101, 34};
        JsonStreamerEntity.STREAM_CONTENTS = new byte[]{34, 99, 0x6F, 110, 0x74, 101, 110, 0x74, 0x73, 34};
        JsonStreamerEntity.HEADER_JSON_CONTENT = new BasicHeader("Content-Type", "application/json");
        JsonStreamerEntity.HEADER_GZIP_ENCODING = new BasicHeader("Content-Encoding", "gzip");
    }

    public JsonStreamerEntity(ResponseHandlerInterface progressHandler, boolean useGZipCompression, String elapsedField) {
        byte[] arr_b = null;
        super();
        this.buffer = new byte[0x1000];
        this.jsonParams = new HashMap();
        this.progressHandler = progressHandler;
        this.contentEncoding = useGZipCompression ? JsonStreamerEntity.HEADER_GZIP_ENCODING : null;
        if(!TextUtils.isEmpty(elapsedField)) {
            arr_b = JsonStreamerEntity.escape(elapsedField);
        }
        this.elapsedField = arr_b;
    }

    public void addPart(String key, Object value) {
        this.jsonParams.put(key, value);
    }

    public void consumeContent() throws IOException, UnsupportedOperationException {
    }

    private void endMetaData(OutputStream os) throws IOException {
        os.write(34);
    }

    static byte[] escape(String string) [...] // Potential decryptor

    public InputStream getContent() throws IOException, UnsupportedOperationException {
        throw JsonStreamerEntity.ERR_UNSUPPORTED;
    }

    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    public long getContentLength() {
        return -1L;
    }

    public Header getContentType() {
        return JsonStreamerEntity.HEADER_JSON_CONTENT;
    }

    public boolean isChunked() {
        return false;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return false;
    }

    private void writeMetaData(OutputStream os, String name, String contentType) throws IOException {
        os.write(JsonStreamerEntity.STREAM_NAME);
        os.write(58);
        os.write(JsonStreamerEntity.escape(name));
        os.write(44);
        os.write(JsonStreamerEntity.STREAM_TYPE);
        os.write(58);
        os.write(JsonStreamerEntity.escape(contentType));
        os.write(44);
        os.write(JsonStreamerEntity.STREAM_CONTENTS);
        os.write(58);
        os.write(34);
    }

    public void writeTo(OutputStream out) throws IOException {
        if(out == null) {
            throw new IllegalStateException("Output stream cannot be null.");
        }
        long v = System.currentTimeMillis();
        OutputStream os = this.contentEncoding == null ? out : new GZIPOutputStream(out, 0x1000);
        os.write(0x7B);
        Set set0 = this.jsonParams.keySet();
        int v1 = set0.size();
        if(v1 > 0) {
            int keysProcessed = 0;
            for(Object object0: set0) {
                String key = (String)object0;
                ++keysProcessed;
                try {
                    Object object1 = this.jsonParams.get(key);
                    os.write(JsonStreamerEntity.escape(key));
                    os.write(58);
                    if(object1 == null) {
                        os.write(JsonStreamerEntity.JSON_NULL);
                    }
                    else if(object1 instanceof FileWrapper || object1 instanceof StreamWrapper) {
                        os.write(0x7B);
                        if(object1 instanceof FileWrapper) {
                            this.writeToFromFile(os, ((FileWrapper)object1));
                        }
                        else {
                            this.writeToFromStream(os, ((StreamWrapper)object1));
                        }
                        os.write(0x7D);
                    }
                    else if(object1 instanceof JsonValueInterface) {
                        os.write(((JsonValueInterface)object1).getEscapedJsonValue());
                    }
                    else if(object1 instanceof JSONObject) {
                        os.write(object1.toString().getBytes());
                    }
                    else if(object1 instanceof JSONArray) {
                        os.write(object1.toString().getBytes());
                    }
                    else if(object1 instanceof Boolean) {
                        os.write((((Boolean)object1).booleanValue() ? JsonStreamerEntity.JSON_TRUE : JsonStreamerEntity.JSON_FALSE));
                    }
                    else if(object1 instanceof Long) {
                        os.write((((Number)object1).longValue() + "").getBytes());
                    }
                    else if(object1 instanceof Double) {
                        os.write((((Number)object1).doubleValue() + "").getBytes());
                    }
                    else if(object1 instanceof Float) {
                        os.write((((Number)object1).floatValue() + "").getBytes());
                    }
                    else if(object1 instanceof Integer) {
                        os.write((((Number)object1).intValue() + "").getBytes());
                    }
                    else {
                        os.write(JsonStreamerEntity.escape(object1.toString()));
                    }
                }
                catch(Throwable throwable0) {
                    if(this.elapsedField != null || keysProcessed < v1) {
                        os.write(44);
                    }
                    throw throwable0;
                }
                if(this.elapsedField != null || keysProcessed < v1) {
                    os.write(44);
                }
            }
            long elapsedTime = System.currentTimeMillis() - v;
            if(this.elapsedField != null) {
                os.write(this.elapsedField);
                os.write(58);
                os.write((elapsedTime + "").getBytes());
            }
            AsyncHttpClient.log.i("JsonStreamerEntity", "Uploaded JSON in " + Math.floor(elapsedTime / 1000L) + " seconds");
        }
        os.write(0x7D);
        os.flush();
        AsyncHttpClient.silentCloseOutputStream(os);
    }

    private void writeToFromFile(OutputStream os, FileWrapper wrapper) throws IOException {
        this.writeMetaData(os, wrapper.file.getName(), wrapper.contentType);
        long bytesWritten = 0L;
        long v1 = wrapper.file.length();
        FileInputStream in = new FileInputStream(wrapper.file);
        Base64OutputStream bos = new Base64OutputStream(os, 18);
        int v2;
        while((v2 = in.read(this.buffer)) != -1) {
            bos.write(this.buffer, 0, v2);
            bytesWritten += (long)v2;
            this.progressHandler.sendProgressMessage(bytesWritten, v1);
        }
        AsyncHttpClient.silentCloseOutputStream(bos);
        this.endMetaData(os);
        AsyncHttpClient.silentCloseInputStream(in);
    }

    private void writeToFromStream(OutputStream os, StreamWrapper entry) throws IOException {
        this.writeMetaData(os, entry.name, entry.contentType);
        Base64OutputStream bos = new Base64OutputStream(os, 18);
        int v;
        while((v = entry.inputStream.read(this.buffer)) != -1) {
            bos.write(this.buffer, 0, v);
        }
        AsyncHttpClient.silentCloseOutputStream(bos);
        this.endMetaData(os);
        if(entry.autoClose) {
            AsyncHttpClient.silentCloseInputStream(entry.inputStream);
        }
    }
}

