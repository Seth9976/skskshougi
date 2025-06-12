package com.loopj.android.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

public class AsyncHttpRequest implements Runnable {
    private boolean cancelIsNotified;
    private final AbstractHttpClient client;
    private final HttpContext context;
    private int executionCount;
    private final AtomicBoolean isCancelled;
    private volatile boolean isFinished;
    private boolean isRequestPreProcessed;
    private final HttpUriRequest request;
    private final ResponseHandlerInterface responseHandler;

    public AsyncHttpRequest(AbstractHttpClient client, HttpContext context, HttpUriRequest request, ResponseHandlerInterface responseHandler) {
        this.isCancelled = new AtomicBoolean();
        this.client = (AbstractHttpClient)Utils.notNull(client, "client");
        this.context = (HttpContext)Utils.notNull(context, "context");
        this.request = (HttpUriRequest)Utils.notNull(request, "request");
        this.responseHandler = (ResponseHandlerInterface)Utils.notNull(responseHandler, "responseHandler");
    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        this.isCancelled.set(true);
        this.request.abort();
        return this.isCancelled();
    }

    public Object getTag() {
        return this.responseHandler.getTag();
    }

    public boolean isCancelled() {
        boolean z = this.isCancelled.get();
        if(z) {
            this.sendCancelNotification();
        }
        return z;
    }

    // 去混淆评级： 低(20)
    public boolean isDone() {
        return this.isCancelled() || this.isFinished;
    }

    private void makeRequest() throws IOException {
        if(!this.isCancelled()) {
            if(this.request.getURI().getScheme() == null) {
                throw new MalformedURLException("No valid URI scheme was provided");
            }
            if(this.responseHandler instanceof RangeFileAsyncHttpResponseHandler) {
                ((RangeFileAsyncHttpResponseHandler)this.responseHandler).updateRequestHeaders(this.request);
            }
            HttpResponse httpResponse0 = this.client.execute(this.request, this.context);
            if(!this.isCancelled()) {
                this.responseHandler.onPreProcessResponse(this.responseHandler, httpResponse0);
                if(!this.isCancelled()) {
                    this.responseHandler.sendResponseMessage(httpResponse0);
                    if(!this.isCancelled()) {
                        this.responseHandler.onPostProcessResponse(this.responseHandler, httpResponse0);
                    }
                }
            }
        }
    }

    private void makeRequestWithRetries() throws IOException {
        Throwable cause;
        IOException cause;
        boolean retry = true;
        HttpRequestRetryHandler httpRequestRetryHandler0 = this.client.getHttpRequestRetryHandler();
        IOException cause;
        for(cause = null; retry; cause = cause) {
            try {
                try {
                    this.makeRequest();
                    return;
                }
                catch(UnknownHostException e) {
                    cause = new IOException("UnknownHostException exception: " + e.getMessage());
                    if(this.executionCount > 0) {
                        int v = this.executionCount + 1;
                        this.executionCount = v;
                        retry = httpRequestRetryHandler0.retryRequest(e, v, this.context);
                    }
                    else {
                        retry = false;
                    }
                }
                catch(NullPointerException e) {
                    cause = new IOException("NPE in HttpClient: " + e.getMessage());
                    int v1 = this.executionCount + 1;
                    this.executionCount = v1;
                    retry = httpRequestRetryHandler0.retryRequest(cause, v1, this.context);
                }
                catch(IOException e) {
                    if(this.isCancelled()) {
                        return;
                    }
                    cause = e;
                    int v2 = this.executionCount + 1;
                    this.executionCount = v2;
                    retry = httpRequestRetryHandler0.retryRequest(cause, v2, this.context);
                }
                if(retry) {
                    this.responseHandler.sendRetryMessage(this.executionCount);
                }
            }
            catch(Exception exception0) {
                AsyncHttpClient.log.e("AsyncHttpRequest", "Unhandled exception origin cause", exception0);
                cause = new IOException("Unhandled exception: " + exception0.getMessage());
                throw cause;
            }
        }
        cause = cause;
        throw cause;
    }

    public void onPostProcessRequest(AsyncHttpRequest request) {
    }

    public void onPreProcessRequest(AsyncHttpRequest request) {
    }

    @Override
    public void run() {
        if(!this.isCancelled()) {
            if(!this.isRequestPreProcessed) {
                this.isRequestPreProcessed = true;
            }
            if(!this.isCancelled()) {
                this.responseHandler.sendStartMessage();
                if(!this.isCancelled()) {
                    try {
                        this.makeRequestWithRetries();
                    }
                    catch(IOException e) {
                        if(this.isCancelled()) {
                            AsyncHttpClient.log.e("AsyncHttpRequest", "makeRequestWithRetries returned error", e);
                        }
                        else {
                            this.responseHandler.sendFailureMessage(0, null, null, e);
                        }
                    }
                    if(!this.isCancelled()) {
                        this.responseHandler.sendFinishMessage();
                        if(!this.isCancelled()) {
                            this.isFinished = true;
                        }
                    }
                }
            }
        }
    }

    private void sendCancelNotification() {
        synchronized(this) {
            if(!this.isFinished && this.isCancelled.get() && !this.cancelIsNotified) {
                this.cancelIsNotified = true;
                this.responseHandler.sendCancelMessage();
            }
        }
    }

    public AsyncHttpRequest setRequestTag(Object TAG) {
        this.responseHandler.setTag(TAG);
        return this;
    }
}

