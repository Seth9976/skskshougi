package com.sdkbox.services;

public class HttpRequestListenerAdapter implements HttpRequestListener {
    @Override  // com.sdkbox.services.HttpRequestListener
    public void onAbort(HttpRequest request) {
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onError(HttpRequest request, String description) {
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onLoad(HttpRequest request) {
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onProgress(HttpRequest request, float value) {
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onReadyStateChange(HttpRequest request, HttpRequestReadyState state) {
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onTimeout(HttpRequest request) {
    }
}

