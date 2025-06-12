package com.loopj.android.http;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpPatch extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "PATCH";

    public HttpPatch() {
    }

    public HttpPatch(String uri) {
        this.setURI(URI.create(uri));
    }

    public HttpPatch(URI uri) {
        this.setURI(uri);
    }

    public String getMethod() {
        return "PATCH";
    }
}

