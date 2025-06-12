package com.sdkbox.services;

public interface HttpRequestListener {
    void onAbort(HttpRequest arg1);

    void onError(HttpRequest arg1, String arg2);

    void onLoad(HttpRequest arg1);

    void onProgress(HttpRequest arg1, float arg2);

    void onReadyStateChange(HttpRequest arg1, HttpRequestReadyState arg2);

    void onTimeout(HttpRequest arg1);
}

