package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import jeb.synthetic.FIN;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.ByteArrayBuffer;

public abstract class AsyncHttpResponseHandler implements ResponseHandlerInterface {
    static class ResponderHandler extends Handler {
        private final AsyncHttpResponseHandler mResponder;

        ResponderHandler(AsyncHttpResponseHandler mResponder, Looper looper) {
            super(looper);
            this.mResponder = mResponder;
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            this.mResponder.handleMessage(msg);
        }
    }

    protected static final int BUFFER_SIZE = 0x1000;
    protected static final int CANCEL_MESSAGE = 6;
    public static final String DEFAULT_CHARSET = "UTF-8";
    protected static final int FAILURE_MESSAGE = 1;
    protected static final int FINISH_MESSAGE = 3;
    private static final String LOG_TAG = "AsyncHttpRH";
    protected static final int PROGRESS_MESSAGE = 4;
    protected static final int RETRY_MESSAGE = 5;
    protected static final int START_MESSAGE = 2;
    protected static final int SUCCESS_MESSAGE = 0;
    private WeakReference TAG;
    public static final String UTF8_BOM = "﻿";
    private Handler handler;
    private Looper looper;
    private Header[] requestHeaders;
    private URI requestURI;
    private String responseCharset;
    private boolean usePoolThread;
    private boolean useSynchronousMode;

    public AsyncHttpResponseHandler() {
        this(null);
    }

    public AsyncHttpResponseHandler(Looper looper) {
        this.responseCharset = "UTF-8";
        this.requestURI = null;
        this.requestHeaders = null;
        this.looper = null;
        this.TAG = new WeakReference(null);
        if(looper == null) {
            looper = Looper.myLooper();
        }
        this.looper = looper;
        this.setUseSynchronousMode(false);
        this.setUsePoolThread(false);
    }

    public AsyncHttpResponseHandler(boolean usePoolThread) {
        this.responseCharset = "UTF-8";
        this.requestURI = null;
        this.requestHeaders = null;
        this.looper = null;
        this.TAG = new WeakReference(null);
        this.setUsePoolThread(usePoolThread);
        if(!this.getUsePoolThread()) {
            this.looper = Looper.myLooper();
            this.setUseSynchronousMode(false);
        }
    }

    public String getCharset() {
        return this.responseCharset == null ? "UTF-8" : this.responseCharset;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public Header[] getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public URI getRequestURI() {
        return this.requestURI;
    }

    byte[] getResponseData(HttpEntity entity) throws IOException {
        if(entity != null) {
            InputStream inputStream0 = entity.getContent();
            if(inputStream0 != null) {
                long v = entity.getContentLength();
                if(v > 0x7FFFFFFFL) {
                    throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                }
                try {
                    ByteArrayBuffer buffer = new ByteArrayBuffer((v > 0L ? ((int)v) : 0x1000));
                    int v1 = FIN.finallyOpen$NT();
                    byte[] tmp = new byte[0x1000];
                    long count = 0L;
                    while(true) {
                        int v3 = inputStream0.read(tmp);
                        if(v3 == -1 || Thread.currentThread().isInterrupted()) {
                            FIN.finallyCodeBegin$NT(v1);
                            AsyncHttpClient.silentCloseInputStream(inputStream0);
                            AsyncHttpClient.endEntityViaReflection(entity);
                            FIN.finallyCodeEnd$NT(v1);
                            return buffer.toByteArray();
                        }
                        count += (long)v3;
                        buffer.append(tmp, 0, v3);
                        this.sendProgressMessage(count, (v > 0L ? v : 1L));
                    }
                }
                catch(OutOfMemoryError unused_ex) {
                    System.gc();
                    throw new IOException("File too large to fit into available memory");
                }
            }
        }
        return null;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public Object getTag() {
        return this.TAG.get();
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public boolean getUsePoolThread() {
        return this.usePoolThread;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public boolean getUseSynchronousMode() {
        return this.useSynchronousMode;
    }

    protected void handleMessage(Message message) {
        try {
            switch(message.what) {
                case 0: {
                    Object[] response = (Object[])message.obj;
                    if(response != null && response.length >= 3) {
                        this.onSuccess(((int)(((Integer)response[0]))), ((Header[])response[1]), ((byte[])response[2]));
                        return;
                    }
                    AsyncHttpClient.log.e("AsyncHttpRH", "SUCCESS_MESSAGE didn\'t got enough params");
                    return;
                }
                case 1: {
                    Object[] response = (Object[])message.obj;
                    if(response != null && response.length >= 4) {
                        this.onFailure(((int)(((Integer)response[0]))), ((Header[])response[1]), ((byte[])response[2]), ((Throwable)response[3]));
                        return;
                    }
                    AsyncHttpClient.log.e("AsyncHttpRH", "FAILURE_MESSAGE didn\'t got enough params");
                    return;
                }
                case 2: {
                    this.onStart();
                    return;
                }
                case 3: {
                    this.onFinish();
                    return;
                }
                case 4: {
                    Object[] response = (Object[])message.obj;
                    if(response == null || response.length < 2) {
                        AsyncHttpClient.log.e("AsyncHttpRH", "PROGRESS_MESSAGE didn\'t got enough params");
                        return;
                    }
                    try {
                        this.onProgress(((long)(((Long)response[0]))), ((long)(((Long)response[1]))));
                    }
                    catch(Throwable t) {
                        AsyncHttpClient.log.e("AsyncHttpRH", "custom onProgress contains an error", t);
                    }
                    return;
                }
                case 5: {
                    Object[] response = (Object[])message.obj;
                    if(response != null && response.length == 1) {
                        this.onRetry(((int)(((Integer)response[0]))));
                        return;
                    }
                    AsyncHttpClient.log.e("AsyncHttpRH", "RETRY_MESSAGE didn\'t get enough params");
                    return;
                }
                case 6: {
                    this.onCancel();
                }
            }
        }
        catch(Throwable error) {
            this.onUserException(error);
        }
    }

    protected Message obtainMessage(int responseMessageId, Object responseMessageData) {
        return Message.obtain(this.handler, responseMessageId, responseMessageData);
    }

    public void onCancel() {
        AsyncHttpClient.log.d("AsyncHttpRH", "Request got cancelled");
    }

    public abstract void onFailure(int arg1, Header[] arg2, byte[] arg3, Throwable arg4);

    public void onFinish() {
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void onPostProcessResponse(ResponseHandlerInterface instance, HttpResponse response) {
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void onPreProcessResponse(ResponseHandlerInterface instance, HttpResponse response) {
    }

    public void onProgress(long bytesWritten, long totalSize) {
        AsyncHttpClient.log.v("AsyncHttpRH", String.format("Progress %d from %d (%2.0f%%)", bytesWritten, totalSize, ((double)(totalSize <= 0L ? -1.0 : ((double)bytesWritten) * 1.0 / ((double)totalSize) * 100.0))));
    }

    public void onRetry(int retryNo) {
        AsyncHttpClient.log.d("AsyncHttpRH", String.format("Request retry no. %d", retryNo));
    }

    public void onStart() {
    }

    public abstract void onSuccess(int arg1, Header[] arg2, byte[] arg3);

    public void onUserException(Throwable error) {
        AsyncHttpClient.log.e("AsyncHttpRH", "User-space exception detected!", error);
        throw new RuntimeException(error);
    }

    protected void postRunnable(Runnable runnable) {
        if(runnable != null) {
            if(this.getUseSynchronousMode() || this.handler == null) {
                runnable.run();
                return;
            }
            this.handler.post(runnable);
        }
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendCancelMessage() {
        this.sendMessage(this.obtainMessage(6, null));
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendFailureMessage(int statusCode, Header[] headers, byte[] responseBody, Throwable throwable) {
        this.sendMessage(this.obtainMessage(1, new Object[]{statusCode, headers, responseBody, throwable}));
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendFinishMessage() {
        this.sendMessage(this.obtainMessage(3, null));
    }

    protected void sendMessage(Message msg) {
        if(this.getUseSynchronousMode() || this.handler == null) {
            this.handleMessage(msg);
            return;
        }
        if(!Thread.currentThread().isInterrupted()) {
            Utils.asserts(this.handler != null, "handler should not be null!");
            this.handler.sendMessage(msg);
        }
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendProgressMessage(long bytesWritten, long bytesTotal) {
        this.sendMessage(this.obtainMessage(4, new Object[]{bytesWritten, bytesTotal}));
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void sendResponseMessage(HttpResponse response) throws IOException {
        if(!Thread.currentThread().isInterrupted()) {
            StatusLine statusLine0 = response.getStatusLine();
            byte[] arr_b = this.getResponseData(response.getEntity());
            if(!Thread.currentThread().isInterrupted()) {
                if(statusLine0.getStatusCode() >= 300) {
                    this.sendFailureMessage(statusLine0.getStatusCode(), response.getAllHeaders(), arr_b, ((Throwable)new HttpResponseException(statusLine0.getStatusCode(), statusLine0.getReasonPhrase())));
                    return;
                }
                this.sendSuccessMessage(statusLine0.getStatusCode(), response.getAllHeaders(), arr_b);
            }
        }
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendRetryMessage(int retryNo) {
        this.sendMessage(this.obtainMessage(5, new Object[]{retryNo}));
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendStartMessage() {
        this.sendMessage(this.obtainMessage(2, null));
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public final void sendSuccessMessage(int statusCode, Header[] headers, byte[] responseBytes) {
        this.sendMessage(this.obtainMessage(0, new Object[]{statusCode, headers, responseBytes}));
    }

    public void setCharset(String charset) {
        this.responseCharset = charset;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void setRequestHeaders(Header[] requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void setRequestURI(URI requestURI) {
        this.requestURI = requestURI;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void setTag(Object TAG) {
        this.TAG = new WeakReference(TAG);
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void setUsePoolThread(boolean pool) {
        if(pool) {
            this.looper = null;
            this.handler = null;
        }
        this.usePoolThread = pool;
    }

    @Override  // com.loopj.android.http.ResponseHandlerInterface
    public void setUseSynchronousMode(boolean sync) {
        if(!sync && this.looper == null) {
            sync = true;
            AsyncHttpClient.log.w("AsyncHttpRH", "Current thread has not called Looper.prepare(). Forcing synchronous mode.");
        }
        if(!sync && this.handler == null) {
            this.handler = new ResponderHandler(this, this.looper);
        }
        else if(sync && this.handler != null) {
            this.handler = null;
        }
        this.useSynchronousMode = sync;
    }
}

