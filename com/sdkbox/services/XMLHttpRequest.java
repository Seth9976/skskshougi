package com.sdkbox.services;

import com.sdkbox.plugin.SDKBox;
import com.sdkbox.plugin.SdkboxLog;
import com.sdkbox.plugin.TrackingInfoAndroid;
import com.sdkbox.services.jni.XMLHttpRequestJNIListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class XMLHttpRequest implements HttpRequest {
    private boolean aborted;
    private boolean async;
    private String bodyContents;
    private HttpURLConnection connection;
    private int contentLength;
    private List listeners;
    private String method;
    private String overrideMimeType;
    private Map parameters;
    private boolean paramsAsBodyContents;
    private HttpRequestReadyState readyState;
    private Map requestHeaders;
    private byte[] response;
    private Map responseHeaders;
    private String responseMimeType;
    private String responseText;
    private boolean saveContents;
    private int saveFlags;
    private String savePath;
    private boolean savedContentsOk;
    private int status;
    private int timeout;
    private boolean withCredentials;

    public XMLHttpRequest() {
        this.readyState = HttpRequestReadyState.UNSENT;
        this.status = 0;
        this.responseText = "";
        this.response = null;
        this.timeout = 0;
        this.method = "GET";
        this.contentLength = 0;
        this.bodyContents = null;
        this.paramsAsBodyContents = false;
        this.parameters = new HashMap();
        this.requestHeaders = new HashMap();
        this.responseHeaders = new HashMap();
        this.async = true;
        this.aborted = false;
        this.connection = null;
        this.savePath = null;
        this.saveFlags = 0;
        this.saveContents = false;
        this.savedContentsOk = true;
        this.listeners = new CopyOnWriteArrayList();
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void abort() {
        this.aborted = true;
        this.notifyAborted();
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void addEventListener(HttpRequestListener listener) {
        this.listeners.add(listener);
    }

    public boolean deleteFile() {
        return SDKBox.getContext().deleteFile(this.savePath);
    }

    protected void dumpHeaders() {
        for(Object object0: this.responseHeaders.entrySet()) {
            Map.Entry entry = (Map.Entry)object0;
            SdkboxLog.d("XMLHttpRequest", "Header " + (entry.getKey() == null ? "null" : ((String)entry.getKey())), new Object[0]);
            List v = (List)entry.getValue();
            if(v == null) {
                SdkboxLog.d("XMLHttpRequest", "null value", new Object[0]);
            }
            else {
                for(Object object1: v) {
                    SdkboxLog.d("XMLHttpRequest", ((String)object1), new Object[0]);
                }
            }
        }
    }

    @Override  // com.sdkbox.services.HttpRequest
    public Map getAllResponseHeaders() {
        return this.responseHeaders;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public int getReadyState() {
        return this.readyState.getValue();
    }

    @Override  // com.sdkbox.services.HttpRequest
    public byte[] getResponse() {
        return this.response;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public List getResponseHeader(String header) {
        return (List)this.responseHeaders.get(header);
    }

    protected boolean getResponseHeaders() throws IOException {
        if(this.status == 200) {
            this.responseHeaders = this.connection.getHeaderFields();
            this.setReadyState(HttpRequestReadyState.HEADERS_RECEIVED);
            try {
                this.responseMimeType = (String)this.getResponseHeader("Content-Type").get(0);
            }
            catch(Exception unused_ex) {
                this.responseMimeType = "unknown";
            }
            try {
                this.contentLength = Integer.parseInt(((String)this.getResponseHeader("Content-Length").get(0)));
            }
            catch(Exception unused_ex) {
                this.contentLength = -1;
            }
            return true;
        }
        SdkboxLog.d("XMLHttpRequest", "Response code=" + this.status, new Object[0]);
        return false;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public String getResponseText() {
        return this.responseText;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public String getResponseType() {
        return "text/html";
    }

    @Override  // com.sdkbox.services.HttpRequest
    public int getStatus() {
        return this.status;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public int getTimeout() {
        return this.timeout;
    }

    public boolean isSavedContentOk() {
        return this.savedContentsOk;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public boolean isWithCredentials() {
        return this.withCredentials;
    }

    protected void notifyAborted() {
        HttpRequestListener[] arr_httpRequestListener = (HttpRequestListener[])this.listeners.toArray(new HttpRequestListener[this.listeners.size()]);
        for(int v = 0; v < arr_httpRequestListener.length; ++v) {
            arr_httpRequestListener[v].onAbort(this);
        }
    }

    protected void notifyError(String error_msg) {
        HttpRequestListener[] arr_httpRequestListener = (HttpRequestListener[])this.listeners.toArray(new HttpRequestListener[this.listeners.size()]);
        for(int v = 0; v < arr_httpRequestListener.length; ++v) {
            arr_httpRequestListener[v].onError(this, error_msg);
        }
    }

    protected void notifyOnLoad() {
        HttpRequestListener[] arr_httpRequestListener = (HttpRequestListener[])this.listeners.toArray(new HttpRequestListener[this.listeners.size()]);
        for(int v = 0; v < arr_httpRequestListener.length; ++v) {
            arr_httpRequestListener[v].onLoad(this);
        }
    }

    protected void notifyProgress(float progress) {
        if(!this.aborted) {
            HttpRequestListener[] arr_httpRequestListener = (HttpRequestListener[])this.listeners.toArray(new HttpRequestListener[this.listeners.size()]);
            for(int v = 0; v < arr_httpRequestListener.length; ++v) {
                arr_httpRequestListener[v].onProgress(this, progress);
            }
        }
    }

    protected void notifyStateChange() {
        if(!this.aborted) {
            HttpRequestListener[] arr_httpRequestListener = (HttpRequestListener[])this.listeners.toArray(new HttpRequestListener[this.listeners.size()]);
            for(int v = 0; v < arr_httpRequestListener.length; ++v) {
                arr_httpRequestListener[v].onReadyStateChange(this, this.readyState);
            }
        }
    }

    protected void notifyTimeout() {
        HttpRequestListener[] arr_httpRequestListener = (HttpRequestListener[])this.listeners.toArray(new HttpRequestListener[this.listeners.size()]);
        for(int v = 0; v < arr_httpRequestListener.length; ++v) {
            arr_httpRequestListener[v].onTimeout(this);
        }
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void open(String method, String url) {
        this.open(method, url, this.async);
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void open(String method, String url, boolean async) {
        this.open(method, url, async, null, null);
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void open(String method, String surl, boolean async, String user, String password) {
        try {
            int v = surl.indexOf("?");
            if(-1 != v && surl.indexOf("metrics.sdkbox.com") != -1) {
                surl = surl.substring(0, v) + "?" + URLEncoder.encode(surl.substring(v + 1), "UTF-8");
            }
            String queryStringParams = "";
            for(Object object0: this.parameters.entrySet()) {
                queryStringParams = queryStringParams + URLEncoder.encode(((String)((Map.Entry)object0).getKey()), "UTF-8") + "=" + URLEncoder.encode(((String)((Map.Entry)object0).getValue()), "UTF-8") + "&";
            }
            if(!method.equalsIgnoreCase("POST") || !this.paramsAsBodyContents) {
                surl = (-1 == v ? surl + "?" : surl + "&") + queryStringParams;
            }
            else {
                this.bodyContents = queryStringParams;
            }
            this.connection = (HttpURLConnection)new URL(surl).openConnection();
            this.connection.setRequestMethod(method);
            this.setRequestHeaders();
            String s5 = TrackingInfoAndroid.getAppName() + " " + "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
            this.connection.setRequestProperty("User-Agent", s5);
            this.connection.setUseCaches(false);
            this.connection.setRequestMethod(method);
            if(this.timeout > 0) {
                this.connection.setReadTimeout(this.timeout);
                this.connection.setConnectTimeout(1000);
            }
            if(method.equalsIgnoreCase("POST") && this.bodyContents != null) {
                this.connection.setDoOutput(true);
                this.connection.setFixedLengthStreamingMode(this.bodyContents.length());
                this.connection.setRequestProperty("Content-Length", String.valueOf(this.bodyContents.length()));
                BufferedOutputStream o = new BufferedOutputStream(this.connection.getOutputStream());
                o.write(this.bodyContents.getBytes("UTF8"));
                o.flush();
            }
            this.async = async;
            this.method = method;
        }
        catch(Exception x) {
            x.printStackTrace();
            this.notifyError("URL error: " + surl);
            this.connection = null;
        }
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void overrideMimeType(String newMimeType) {
        this.overrideMimeType = newMimeType;
    }

    protected void readAsync() {
        this.readSync();
    }

    protected void readContents() throws IOException {
        FileOutputStream fout = null;
        if(this.saveContents) {
            try {
                fout = SDKBox.getContext().openFileOutput(this.savePath, this.saveFlags);
            }
            catch(Exception unused_ex) {
                this.savedContentsOk = false;
            }
        }
        int currentLength = 0;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.connection.getInputStream()));
            String s;
            while((s = reader.readLine()) != null) {
                sb.append(s);
                if(this.saveContents && fout != null) {
                    try {
                        fout.write(s.getBytes());
                    }
                    catch(Exception unused_ex) {
                        this.savedContentsOk = false;
                    }
                }
                currentLength += s.length();
                this.notifyProgress((this.contentLength <= 0 ? -1.0f : ((float)currentLength) / ((float)this.contentLength)));
            }
        }
        catch(IOException unused_ex) {
        }
        this.responseText = sb.toString();
        this.response = this.responseText.getBytes();
        this.notifyProgress(1.0f);
        this.setReadyState(HttpRequestReadyState.DONE);
        this.notifyOnLoad();
    }

    protected void readSync() {
        boolean error;
        try {
            this.connection.connect();
            this.setReadyState(HttpRequestReadyState.OPENED);
            this.status = this.connection.getResponseCode();
            error = false;
            goto label_9;
        }
        catch(Exception x) {
            try {
                this.notifyError(x.toString());
                this.connection = null;
                error = true;
            label_9:
                if(!error) {
                    if(this.getResponseHeaders()) {
                        this.setReadyState(HttpRequestReadyState.LOADING);
                        this.readContents();
                        return;
                    }
                    this.notifyError("Can\'t read headers.");
                    return;
                }
                return;
            }
            catch(SocketTimeoutException unused_ex) {
            }
            catch(IOException unused_ex) {
                goto label_21;
            }
        }
        if(this.saveContents) {
            SDKBox.getContext().deleteFile(this.savePath);
        }
        this.notifyTimeout();
        return;
    label_21:
        if(this.saveContents) {
            SDKBox.getContext().deleteFile(this.savePath);
        }
        this.notifyError("Error reading contents. Saved content (if any) has been deleted");
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void removeEventListener(HttpRequestListener listener) {
        this.listeners.remove(listener);
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void saveContentsToFile(String path) {
        this.saveContents = true;
        this.savePath = path;
        this.saveFlags = 0;
    }

    public void send(String method, String url, boolean async) {
        if(async) {
            SDKBox.executeInBackground(new Runnable() {
                @Override
                public void run() {
                    XMLHttpRequest.this.open(method, url);
                    XMLHttpRequest.this.send(true);
                }
            });
            return;
        }
        this.open(method, url);
        this.send(false);
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void send(boolean async) {
        if(this.connection != null) {
            try {
                this.readSync();
            }
            catch(Throwable throwable0) {
                if(this.connection != null) {
                    try {
                        this.connection.disconnect();
                    }
                    catch(Exception unused_ex) {
                    }
                }
                throw throwable0;
            }
            try {
                if(this.connection != null) {
                    this.connection.disconnect();
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void setBodyContents(String bc) {
        this.bodyContents = bc;
    }

    public void setParameter(String key, String value) {
        this.parameters.put(key, value);
    }

    public void setParameters(Map map0) {
        this.parameters = map0;
    }

    public void setParamsAsBodyContents() {
        this.paramsAsBodyContents = true;
    }

    protected void setReadyState(HttpRequestReadyState s) {
        this.readyState = s;
        this.notifyStateChange();
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void setRequestHeader(String header, String value) {
        if(header != null && value != null) {
            this.requestHeaders.put(header, value);
        }
    }

    protected void setRequestHeaders() {
        for(Object object0: this.requestHeaders.entrySet()) {
            this.connection.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
    }

    public void setRequestHeaders(Map map0) {
        this.requestHeaders = map0;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void setResponseType(String response_type) {
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void setTimeout(int timeout_in_millis) {
        this.timeout = timeout_in_millis;
    }

    @Override  // com.sdkbox.services.HttpRequest
    public void setWithCredentials(boolean b) {
        this.withCredentials = b;
    }

    private void setupNativeObserver() {
        this.addEventListener(new XMLHttpRequestJNIListener());
    }
}

