package com.loopj.android.http;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpGet extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "GET";

    public HttpGet() {
    }

    public HttpGet(String uri) {
        this.setURI(URI.create(uri));
    }

    public HttpGet(URI uri) {
        this.setURI(uri);
    }

    public String getMethod() {
        return "GET";
    }
}

