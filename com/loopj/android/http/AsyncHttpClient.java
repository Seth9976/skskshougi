package com.loopj.android.http;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

public class AsyncHttpClient {
    static class InflatingEntity extends HttpEntityWrapper {
        GZIPInputStream gzippedStream;
        PushbackInputStream pushbackStream;
        InputStream wrappedStream;

        public InflatingEntity(HttpEntity wrapped) {
            super(wrapped);
        }

        public void consumeContent() throws IOException {
            AsyncHttpClient.silentCloseInputStream(this.wrappedStream);
            AsyncHttpClient.silentCloseInputStream(this.pushbackStream);
            AsyncHttpClient.silentCloseInputStream(this.gzippedStream);
            super.consumeContent();
        }

        public InputStream getContent() throws IOException {
            this.wrappedStream = this.wrappedEntity.getContent();
            this.pushbackStream = new PushbackInputStream(this.wrappedStream, 2);
            if(AsyncHttpClient.isInputStreamGZIPCompressed(this.pushbackStream)) {
                this.gzippedStream = new GZIPInputStream(this.pushbackStream);
                return this.gzippedStream;
            }
            return this.pushbackStream;
        }

        public long getContentLength() {
            return this.wrappedEntity == null ? 0L : this.wrappedEntity.getContentLength();
        }
    }

    public static final int DEFAULT_MAX_CONNECTIONS = 10;
    public static final int DEFAULT_MAX_RETRIES = 5;
    public static final int DEFAULT_RETRY_SLEEP_TIME_MILLIS = 1500;
    public static final int DEFAULT_SOCKET_BUFFER_SIZE = 0x2000;
    public static final int DEFAULT_SOCKET_TIMEOUT = 10000;
    public static final String ENCODING_GZIP = "gzip";
    public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String HEADER_CONTENT_DISPOSITION = "Content-Disposition";
    public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
    public static final String HEADER_CONTENT_RANGE = "Content-Range";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String LOG_TAG = "AsyncHttpClient";
    private final Map clientHeaderMap;
    private int connectTimeout;
    private final DefaultHttpClient httpClient;
    private final HttpContext httpContext;
    private boolean isUrlEncodingEnabled;
    public static LogInterface log;
    private int maxConnections;
    private final Map requestMap;
    private int responseTimeout;
    private ExecutorService threadPool;

    static {
        AsyncHttpClient.log = new LogHandler();
    }

    public AsyncHttpClient() {
        this(false, 80, 443);
    }

    public AsyncHttpClient(int httpPort) {
        this(false, httpPort, 443);
    }

    public AsyncHttpClient(int httpPort, int httpsPort) {
        this(false, httpPort, httpsPort);
    }

    public AsyncHttpClient(SchemeRegistry schemeRegistry) {
        boolean z = true;
        super();
        this.maxConnections = 10;
        this.connectTimeout = 10000;
        this.responseTimeout = 10000;
        this.isUrlEncodingEnabled = true;
        BasicHttpParams httpParams = new BasicHttpParams();
        ConnManagerParams.setTimeout(((HttpParams)httpParams), 10000L);
        ConnManagerParams.setMaxConnectionsPerRoute(((HttpParams)httpParams), ((ConnPerRoute)new ConnPerRouteBean(10)));
        ConnManagerParams.setMaxTotalConnections(((HttpParams)httpParams), 10);
        HttpConnectionParams.setSoTimeout(((HttpParams)httpParams), 10000);
        HttpConnectionParams.setConnectionTimeout(((HttpParams)httpParams), 10000);
        HttpConnectionParams.setTcpNoDelay(((HttpParams)httpParams), true);
        HttpConnectionParams.setSocketBufferSize(((HttpParams)httpParams), 0x2000);
        HttpProtocolParams.setVersion(((HttpParams)httpParams), ((ProtocolVersion)HttpVersion.HTTP_1_1));
        ClientConnectionManager clientConnectionManager0 = this.createConnectionManager(schemeRegistry, httpParams);
        if(clientConnectionManager0 == null) {
            z = false;
        }
        Utils.asserts(z, "Custom implementation of #createConnectionManager(SchemeRegistry, BasicHttpParams) returned null");
        this.threadPool = this.getDefaultThreadPool();
        this.requestMap = Collections.synchronizedMap(new WeakHashMap());
        this.clientHeaderMap = new HashMap();
        this.httpContext = new SyncBasicHttpContext(((HttpContext)new BasicHttpContext()));
        this.httpClient = new DefaultHttpClient(clientConnectionManager0, ((HttpParams)httpParams));
        com.loopj.android.http.AsyncHttpClient.1 asyncHttpClient$10 = new HttpRequestInterceptor() {
            public void process(HttpRequest request, HttpContext context) {
                if(!request.containsHeader("Accept-Encoding")) {
                    request.addHeader("Accept-Encoding", "gzip");
                }
                for(Object object0: AsyncHttpClient.this.clientHeaderMap.keySet()) {
                    String header = (String)object0;
                    if(request.containsHeader(header)) {
                        Header header0 = request.getFirstHeader(header);
                        AsyncHttpClient.log.d("AsyncHttpClient", String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", header, AsyncHttpClient.this.clientHeaderMap.get(header), header0.getName(), header0.getValue()));
                        request.removeHeader(header0);
                    }
                    request.addHeader(header, ((String)AsyncHttpClient.this.clientHeaderMap.get(header)));
                }
            }
        };
        this.httpClient.addRequestInterceptor(asyncHttpClient$10);
        com.loopj.android.http.AsyncHttpClient.2 asyncHttpClient$20 = new HttpResponseInterceptor() {
            public void process(HttpResponse response, HttpContext context) {
                HttpEntity httpEntity0 = response.getEntity();
                if(httpEntity0 != null) {
                    Header header0 = httpEntity0.getContentEncoding();
                    if(header0 != null) {
                        HeaderElement[] arr_headerElement = header0.getElements();
                        for(int v = 0; v < arr_headerElement.length; ++v) {
                            if(arr_headerElement[v].getName().equalsIgnoreCase("gzip")) {
                                response.setEntity(((HttpEntity)new InflatingEntity(httpEntity0)));
                                return;
                            }
                        }
                    }
                }
            }
        };
        this.httpClient.addResponseInterceptor(asyncHttpClient$20);
        com.loopj.android.http.AsyncHttpClient.3 asyncHttpClient$30 = new HttpRequestInterceptor() {
            public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
                AuthState authState = (AuthState)context.getAttribute("http.auth.target-scope");
                CredentialsProvider credsProvider = (CredentialsProvider)context.getAttribute("http.auth.credentials-provider");
                HttpHost targetHost = (HttpHost)context.getAttribute("http.target_host");
                if(authState.getAuthScheme() == null) {
                    Credentials credentials0 = credsProvider.getCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()));
                    if(credentials0 != null) {
                        authState.setAuthScheme(((AuthScheme)new BasicScheme()));
                        authState.setCredentials(credentials0);
                    }
                }
            }
        };
        this.httpClient.addRequestInterceptor(asyncHttpClient$30, 0);
        RetryHandler retryHandler0 = new RetryHandler(5, 1500);
        this.httpClient.setHttpRequestRetryHandler(retryHandler0);
    }

    public AsyncHttpClient(boolean fixNoHttpResponseException, int httpPort, int httpsPort) {
        this(AsyncHttpClient.getDefaultSchemeRegistry(fixNoHttpResponseException, httpPort, httpsPort));
    }

    private HttpEntityEnclosingRequestBase addEntityToRequestBase(HttpEntityEnclosingRequestBase requestBase, HttpEntity entity) {
        if(entity != null) {
            requestBase.setEntity(entity);
        }
        return requestBase;
    }

    public void addHeader(String header, String value) {
        this.clientHeaderMap.put(header, value);
    }

    public static void allowRetryExceptionClass(Class class0) {
        if(class0 != null) {
            RetryHandler.addClassToWhitelist(class0);
        }
    }

    public static void blockRetryExceptionClass(Class class0) {
        if(class0 != null) {
            RetryHandler.addClassToBlacklist(class0);
        }
    }

    public void cancelAllRequests(boolean mayInterruptIfRunning) {
        for(Object object0: this.requestMap.values()) {
            List requestList = (List)object0;
            if(requestList != null) {
                for(Object object1: requestList) {
                    ((RequestHandle)object1).cancel(mayInterruptIfRunning);
                }
            }
        }
        this.requestMap.clear();
    }

    // 检测为 lambda 实现。
    private void cancelRequests(List list0, boolean mayInterruptIfRunning) {
        if(list0 != null) {
            for(Object object0: list0) {
                ((RequestHandle)object0).cancel(mayInterruptIfRunning);
            }
        }
    }

    public void cancelRequests(Context context, boolean mayInterruptIfRunning) {
        if(context == null) {
            AsyncHttpClient.log.e("AsyncHttpClient", "Passed null Context to cancelRequests");
            return;
        }
        List requestList = (List)this.requestMap.get(context);
        this.requestMap.remove(context);
        if(Looper.myLooper() == Looper.getMainLooper()) {
            com.loopj.android.http.AsyncHttpClient.4 runnable = () -> if(this.val$requestList != null) {
                for(Object object0: this.val$requestList) {
                    ((RequestHandle)object0).cancel(this.val$mayInterruptIfRunning);
                }
            };
            this.threadPool.submit(runnable);
            return;
        }
        this.cancelRequests(requestList, mayInterruptIfRunning);

        class com.loopj.android.http.AsyncHttpClient.4 implements Runnable {
            com.loopj.android.http.AsyncHttpClient.4(List list0, boolean z) {
            }

            @Override
            public void run() {
                AsyncHttpClient.this.cancelRequests(this.val$requestList, this.val$mayInterruptIfRunning);
            }
        }

    }

    public void cancelRequestsByTAG(Object TAG, boolean mayInterruptIfRunning) {
        if(TAG == null) {
            AsyncHttpClient.log.d("AsyncHttpClient", "cancelRequestsByTAG, passed TAG is null, cannot proceed");
            return;
        }
        for(Object object1: this.requestMap.values()) {
            List requestList = (List)object1;
            if(requestList != null) {
                for(Object object2: requestList) {
                    RequestHandle requestHandle = (RequestHandle)object2;
                    if(TAG.equals(requestHandle.getTag())) {
                        requestHandle.cancel(mayInterruptIfRunning);
                    }
                }
            }
        }
    }

    public void clearCredentialsProvider() {
        this.httpClient.getCredentialsProvider().clear();
    }

    protected ClientConnectionManager createConnectionManager(SchemeRegistry schemeRegistry, BasicHttpParams httpParams) {
        return new ThreadSafeClientConnManager(((HttpParams)httpParams), schemeRegistry);
    }

    public RequestHandle delete(Context context, String url, ResponseHandlerInterface responseHandler) {
        HttpDelete delete = new HttpDelete(this.getURI(url));
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)delete), null, responseHandler, context);
    }

    public RequestHandle delete(Context context, String url, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(new HttpDelete(URI.create(url).normalize()), entity);
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle delete(Context context, String url, Header[] headers, RequestParams params, ResponseHandlerInterface responseHandler) {
        HttpDelete httpDelete = new HttpDelete(AsyncHttpClient.getUrlWithQueryString(this.isUrlEncodingEnabled, url, params));
        if(headers != null) {
            httpDelete.setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpDelete), null, responseHandler, context);
    }

    public RequestHandle delete(Context context, String url, Header[] headers, ResponseHandlerInterface responseHandler) {
        HttpDelete delete = new HttpDelete(this.getURI(url));
        if(headers != null) {
            delete.setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)delete), null, responseHandler, context);
    }

    public RequestHandle delete(String url, ResponseHandlerInterface responseHandler) {
        return this.delete(null, url, responseHandler);
    }

    public void delete(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        HttpDelete delete = new HttpDelete(AsyncHttpClient.getUrlWithQueryString(this.isUrlEncodingEnabled, url, params));
        this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)delete), null, responseHandler, null);
    }

    public static void endEntityViaReflection(HttpEntity entity) {
        if(entity instanceof HttpEntityWrapper) {
            try {
                Field f = null;
                Field[] arr_field = HttpEntityWrapper.class.getDeclaredFields();
                for(int v = 0; v < arr_field.length; ++v) {
                    Field ff = arr_field[v];
                    if(ff.getName().equals("wrappedEntity")) {
                        f = ff;
                        break;
                    }
                }
                if(f != null) {
                    f.setAccessible(true);
                    HttpEntity wrapped = (HttpEntity)f.get(entity);
                    if(wrapped != null) {
                        wrapped.consumeContent();
                    }
                }
                return;
            }
            catch(Throwable t) {
            }
        }
        else {
            return;
        }
        AsyncHttpClient.log.e("AsyncHttpClient", "wrappedEntity consume", t);
    }

    public RequestHandle get(Context context, String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        HttpGet httpGet0 = new HttpGet(AsyncHttpClient.getUrlWithQueryString(this.isUrlEncodingEnabled, url, params));
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpGet0), null, responseHandler, context);
    }

    public RequestHandle get(Context context, String url, ResponseHandlerInterface responseHandler) {
        return this.get(context, url, null, responseHandler);
    }

    public RequestHandle get(Context context, String url, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(new HttpGet(URI.create(url).normalize()), entity);
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle get(Context context, String url, Header[] headers, RequestParams params, ResponseHandlerInterface responseHandler) {
        HttpGet request = new HttpGet(AsyncHttpClient.getUrlWithQueryString(this.isUrlEncodingEnabled, url, params));
        if(headers != null) {
            ((HttpUriRequest)request).setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)request), null, responseHandler, context);
    }

    public RequestHandle get(String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.get(null, url, params, responseHandler);
    }

    public RequestHandle get(String url, ResponseHandlerInterface responseHandler) {
        return this.get(null, url, null, responseHandler);
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    private static SchemeRegistry getDefaultSchemeRegistry(boolean fixNoHttpResponseException, int httpPort, int httpsPort) {
        if(fixNoHttpResponseException) {
            AsyncHttpClient.log.d("AsyncHttpClient", "Beware! Using the fix is insecure, as it doesn\'t verify SSL certificates.");
        }
        if(httpPort < 1) {
            httpPort = 80;
            AsyncHttpClient.log.d("AsyncHttpClient", "Invalid HTTP port number specified, defaulting to 80");
        }
        if(httpsPort < 1) {
            httpsPort = 443;
            AsyncHttpClient.log.d("AsyncHttpClient", "Invalid HTTPS port number specified, defaulting to 443");
        }
        SSLSocketFactory sSLSocketFactory0 = fixNoHttpResponseException ? MySSLSocketFactory.getFixedSocketFactory() : SSLSocketFactory.getSocketFactory();
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", ((SocketFactory)PlainSocketFactory.getSocketFactory()), httpPort));
        schemeRegistry.register(new Scheme("https", sSLSocketFactory0, httpsPort));
        return schemeRegistry;
    }

    protected ExecutorService getDefaultThreadPool() {
        return Executors.newCachedThreadPool();
    }

    public HttpClient getHttpClient() {
        return this.httpClient;
    }

    public HttpContext getHttpContext() {
        return this.httpContext;
    }

    public LogInterface getLogInterface() {
        return AsyncHttpClient.log;
    }

    public int getLoggingLevel() {
        return AsyncHttpClient.log.getLoggingLevel();
    }

    public int getMaxConnections() {
        return this.maxConnections;
    }

    public int getResponseTimeout() {
        return this.responseTimeout;
    }

    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    protected URI getURI(String url) {
        return URI.create(url).normalize();
    }

    public static String getUrlWithQueryString(boolean shouldEncodeUrl, String url, RequestParams params) {
        if(url == null) {
            return null;
        }
        if(shouldEncodeUrl) {
            try {
                URL _url = new URL(URLDecoder.decode(url, "UTF-8"));
                url = new URI(_url.getProtocol(), _url.getUserInfo(), _url.getHost(), _url.getPort(), _url.getPath(), _url.getQuery(), _url.getRef()).toASCIIString();
            }
            catch(Exception ex) {
                AsyncHttpClient.log.e("AsyncHttpClient", "getUrlWithQueryString encoding URL", ex);
            }
        }
        if(params != null) {
            String s1 = params.getParamString().trim();
            if(!s1.equals("") && !s1.equals("?")) {
                StringBuilder stringBuilder0 = new StringBuilder().append(url);
                return url.contains("?") ? stringBuilder0.append("&").toString() + s1 : stringBuilder0.append("?").toString() + s1;
            }
        }
        return url;
    }

    public RequestHandle head(Context context, String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        HttpHead httpHead0 = new HttpHead(AsyncHttpClient.getUrlWithQueryString(this.isUrlEncodingEnabled, url, params));
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpHead0), null, responseHandler, context);
    }

    public RequestHandle head(Context context, String url, ResponseHandlerInterface responseHandler) {
        return this.head(context, url, null, responseHandler);
    }

    public RequestHandle head(Context context, String url, Header[] headers, RequestParams params, ResponseHandlerInterface responseHandler) {
        HttpHead request = new HttpHead(AsyncHttpClient.getUrlWithQueryString(this.isUrlEncodingEnabled, url, params));
        if(headers != null) {
            ((HttpUriRequest)request).setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)request), null, responseHandler, context);
    }

    public RequestHandle head(String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.head(null, url, params, responseHandler);
    }

    public RequestHandle head(String url, ResponseHandlerInterface responseHandler) {
        return this.head(null, url, null, responseHandler);
    }

    public static boolean isInputStreamGZIPCompressed(PushbackInputStream inputStream) throws IOException {
        if(inputStream == null) {
            return false;
        }
        byte[] signature = new byte[2];
        int v = inputStream.read(signature);
        inputStream.unread(signature);
        return v == 2 && 0x8B1F == (signature[0] & 0xFF | signature[1] << 8 & 0xFF00);
    }

    public boolean isLoggingEnabled() {
        return AsyncHttpClient.log.isLoggingEnabled();
    }

    public boolean isUrlEncodingEnabled() {
        return this.isUrlEncodingEnabled;
    }

    protected AsyncHttpRequest newAsyncHttpRequest(DefaultHttpClient client, HttpContext httpContext, HttpUriRequest uriRequest, String contentType, ResponseHandlerInterface responseHandler, Context context) {
        return new AsyncHttpRequest(((AbstractHttpClient)client), httpContext, uriRequest, responseHandler);
    }

    private HttpEntity paramsToEntity(RequestParams params, ResponseHandlerInterface responseHandler) {
        if(params != null) {
            try {
                return params.getEntity(responseHandler);
            }
            catch(IOException e) {
                if(responseHandler != null) {
                    responseHandler.sendFailureMessage(0, null, null, e);
                    return null;
                }
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public RequestHandle patch(Context context, String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.patch(context, url, this.paramsToEntity(params, responseHandler), null, responseHandler);
    }

    public RequestHandle patch(Context context, String url, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(new HttpPatch(this.getURI(url)), entity);
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle patch(Context context, String url, Header[] headers, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(new HttpPatch(this.getURI(url)), entity);
        if(headers != null) {
            httpEntityEnclosingRequestBase0.setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle patch(String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.patch(null, url, params, responseHandler);
    }

    public RequestHandle patch(String url, ResponseHandlerInterface responseHandler) {
        return this.patch(null, url, null, responseHandler);
    }

    public RequestHandle post(Context context, String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.post(context, url, this.paramsToEntity(params, responseHandler), null, responseHandler);
    }

    public RequestHandle post(Context context, String url, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(((HttpEntityEnclosingRequestBase)new HttpPost(this.getURI(url))), entity);
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle post(Context context, String url, Header[] headers, RequestParams params, String contentType, ResponseHandlerInterface responseHandler) {
        HttpPost request = new HttpPost(this.getURI(url));
        if(params != null) {
            ((HttpEntityEnclosingRequestBase)request).setEntity(this.paramsToEntity(params, responseHandler));
        }
        if(headers != null) {
            ((HttpEntityEnclosingRequestBase)request).setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)request), contentType, responseHandler, context);
    }

    public RequestHandle post(Context context, String url, Header[] headers, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(((HttpEntityEnclosingRequestBase)new HttpPost(this.getURI(url))), entity);
        if(headers != null) {
            httpEntityEnclosingRequestBase0.setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle post(String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.post(null, url, params, responseHandler);
    }

    public RequestHandle post(String url, ResponseHandlerInterface responseHandler) {
        return this.post(null, url, null, responseHandler);
    }

    public RequestHandle put(Context context, String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.put(context, url, this.paramsToEntity(params, responseHandler), null, responseHandler);
    }

    public RequestHandle put(Context context, String url, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(((HttpEntityEnclosingRequestBase)new HttpPut(this.getURI(url))), entity);
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle put(Context context, String url, Header[] headers, HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0 = this.addEntityToRequestBase(((HttpEntityEnclosingRequestBase)new HttpPut(this.getURI(url))), entity);
        if(headers != null) {
            httpEntityEnclosingRequestBase0.setHeaders(headers);
        }
        return this.sendRequest(this.httpClient, this.httpContext, ((HttpUriRequest)httpEntityEnclosingRequestBase0), contentType, responseHandler, context);
    }

    public RequestHandle put(String url, RequestParams params, ResponseHandlerInterface responseHandler) {
        return this.put(null, url, params, responseHandler);
    }

    public RequestHandle put(String url, ResponseHandlerInterface responseHandler) {
        return this.put(null, url, null, responseHandler);
    }

    public void removeAllHeaders() {
        this.clientHeaderMap.clear();
    }

    public void removeHeader(String header) {
        this.clientHeaderMap.remove(header);
    }

    protected RequestHandle sendRequest(DefaultHttpClient client, HttpContext httpContext, HttpUriRequest uriRequest, String contentType, ResponseHandlerInterface responseHandler, Context context) {
        List requestList;
        if(uriRequest == null) {
            throw new IllegalArgumentException("HttpUriRequest must not be null");
        }
        if(responseHandler == null) {
            throw new IllegalArgumentException("ResponseHandler must not be null");
        }
        if(responseHandler.getUseSynchronousMode() && !responseHandler.getUsePoolThread()) {
            throw new IllegalArgumentException("Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead.");
        }
        if(contentType != null) {
            if(!(uriRequest instanceof HttpEntityEnclosingRequestBase) || ((HttpEntityEnclosingRequestBase)uriRequest).getEntity() == null || !uriRequest.containsHeader("Content-Type")) {
                uriRequest.setHeader("Content-Type", contentType);
            }
            else {
                AsyncHttpClient.log.w("AsyncHttpClient", "Passed contentType will be ignored because HttpEntity sets content type");
            }
        }
        responseHandler.setRequestHeaders(uriRequest.getAllHeaders());
        responseHandler.setRequestURI(uriRequest.getURI());
        AsyncHttpRequest asyncHttpRequest0 = this.newAsyncHttpRequest(client, httpContext, uriRequest, contentType, responseHandler, context);
        this.threadPool.submit(asyncHttpRequest0);
        RequestHandle requestHandle = new RequestHandle(asyncHttpRequest0);
        if(context != null) {
            synchronized(this.requestMap) {
                requestList = (List)this.requestMap.get(context);
                if(requestList == null) {
                    requestList = Collections.synchronizedList(new LinkedList());
                    this.requestMap.put(context, requestList);
                }
            }
            requestList.add(requestHandle);
            Iterator iterator0 = requestList.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((RequestHandle)object0).shouldBeGarbageCollected()) {
                    iterator0.remove();
                }
            }
        }
        return requestHandle;
    }

    public void setAuthenticationPreemptive(boolean isPreemptive) {
        if(isPreemptive) {
            PreemptiveAuthorizationHttpRequestInterceptor preemptiveAuthorizationHttpRequestInterceptor0 = new PreemptiveAuthorizationHttpRequestInterceptor();
            this.httpClient.addRequestInterceptor(preemptiveAuthorizationHttpRequestInterceptor0, 0);
            return;
        }
        this.httpClient.removeRequestInterceptorByClass(PreemptiveAuthorizationHttpRequestInterceptor.class);
    }

    public void setBasicAuth(String username, String password) {
        this.setBasicAuth(username, password, false);
    }

    public void setBasicAuth(String username, String password, AuthScope scope) {
        this.setBasicAuth(username, password, scope, false);
    }

    public void setBasicAuth(String username, String password, AuthScope scope, boolean preemptive) {
        this.setCredentials(scope, ((Credentials)new UsernamePasswordCredentials(username, password)));
        this.setAuthenticationPreemptive(preemptive);
    }

    public void setBasicAuth(String username, String password, boolean preemptive) {
        this.setBasicAuth(username, password, null, preemptive);
    }

    public void setConnectTimeout(int value) {
        if(value < 1000) {
            value = 10000;
        }
        this.connectTimeout = value;
        HttpParams httpParams0 = this.httpClient.getParams();
        ConnManagerParams.setTimeout(httpParams0, ((long)this.connectTimeout));
        HttpConnectionParams.setConnectionTimeout(httpParams0, this.connectTimeout);
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.httpContext.setAttribute("http.cookie-store", cookieStore);
    }

    public void setCredentials(AuthScope authScope, Credentials credentials) {
        if(credentials == null) {
            AsyncHttpClient.log.d("AsyncHttpClient", "Provided credentials are null, not setting");
            return;
        }
        CredentialsProvider credentialsProvider0 = this.httpClient.getCredentialsProvider();
        if(authScope == null) {
            authScope = AuthScope.ANY;
        }
        credentialsProvider0.setCredentials(authScope, credentials);
    }

    public void setEnableRedirects(boolean enableRedirects) {
        this.setEnableRedirects(enableRedirects, enableRedirects, enableRedirects);
    }

    public void setEnableRedirects(boolean enableRedirects, boolean enableRelativeRedirects) {
        this.setEnableRedirects(enableRedirects, enableRelativeRedirects, true);
    }

    public void setEnableRedirects(boolean enableRedirects, boolean enableRelativeRedirects, boolean enableCircularRedirects) {
        this.httpClient.getParams().setBooleanParameter("http.protocol.reject-relative-redirect", !enableRelativeRedirects);
        this.httpClient.getParams().setBooleanParameter("http.protocol.allow-circular-redirects", enableCircularRedirects);
        MyRedirectHandler myRedirectHandler0 = new MyRedirectHandler(enableRedirects);
        this.httpClient.setRedirectHandler(((RedirectHandler)myRedirectHandler0));
    }

    public void setLogInterface(LogInterface logInterfaceInstance) {
        if(logInterfaceInstance != null) {
            AsyncHttpClient.log = logInterfaceInstance;
        }
    }

    public void setLoggingEnabled(boolean loggingEnabled) {
        AsyncHttpClient.log.setLoggingEnabled(loggingEnabled);
    }

    public void setLoggingLevel(int logLevel) {
        AsyncHttpClient.log.setLoggingLevel(logLevel);
    }

    public void setMaxConnections(int maxConnections) {
        if(maxConnections < 1) {
            maxConnections = 10;
        }
        this.maxConnections = maxConnections;
        ConnManagerParams.setMaxConnectionsPerRoute(this.httpClient.getParams(), ((ConnPerRoute)new ConnPerRouteBean(this.maxConnections)));
    }

    public void setMaxRetriesAndTimeout(int retries, int timeout) {
        RetryHandler retryHandler0 = new RetryHandler(retries, timeout);
        this.httpClient.setHttpRequestRetryHandler(retryHandler0);
    }

    public void setProxy(String hostname, int port) {
        HttpHost proxy = new HttpHost(hostname, port);
        this.httpClient.getParams().setParameter("http.route.default-proxy", proxy);
    }

    public void setProxy(String hostname, int port, String username, String password) {
        this.httpClient.getCredentialsProvider().setCredentials(new AuthScope(hostname, port), ((Credentials)new UsernamePasswordCredentials(username, password)));
        HttpHost proxy = new HttpHost(hostname, port);
        this.httpClient.getParams().setParameter("http.route.default-proxy", proxy);
    }

    public void setRedirectHandler(RedirectHandler customRedirectHandler) {
        this.httpClient.setRedirectHandler(customRedirectHandler);
    }

    public void setResponseTimeout(int value) {
        if(value < 1000) {
            value = 10000;
        }
        this.responseTimeout = value;
        HttpConnectionParams.setSoTimeout(this.httpClient.getParams(), this.responseTimeout);
    }

    public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", sslSocketFactory, 443));
    }

    public void setThreadPool(ExecutorService threadPool) {
        this.threadPool = threadPool;
    }

    public void setTimeout(int value) {
        if(value < 1000) {
            value = 10000;
        }
        this.setConnectTimeout(value);
        this.setResponseTimeout(value);
    }

    public void setURLEncodingEnabled(boolean enabled) {
        this.isUrlEncodingEnabled = enabled;
    }

    public void setUserAgent(String userAgent) {
        HttpProtocolParams.setUserAgent(this.httpClient.getParams(), userAgent);
    }

    public static void silentCloseInputStream(InputStream is) {
        if(is != null) {
            try {
                is.close();
            }
            catch(IOException e) {
                AsyncHttpClient.log.w("AsyncHttpClient", "Cannot close input stream", e);
            }
        }
    }

    public static void silentCloseOutputStream(OutputStream os) {
        if(os != null) {
            try {
                os.close();
            }
            catch(IOException e) {
                AsyncHttpClient.log.w("AsyncHttpClient", "Cannot close output stream", e);
            }
        }
    }
}

