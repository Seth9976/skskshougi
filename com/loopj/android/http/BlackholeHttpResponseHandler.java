package com.loopj.android.http;

import org.apache.http.Header;
import org.apache.http.HttpResponse;

public class BlackholeHttpResponseHandler extends AsyncHttpResponseHandler {
    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onCancel() {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onFinish() {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onPostProcessResponse(ResponseHandlerInterface instance, HttpResponse response) {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onPreProcessResponse(ResponseHandlerInterface instance, HttpResponse response) {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onProgress(long bytesWritten, long totalSize) {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onRetry(int retryNo) {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onStart() {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onUserException(Throwable error) {
    }
}

