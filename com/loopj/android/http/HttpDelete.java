package com.loopj.android.http;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpDelete extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "DELETE";

    public HttpDelete() {
    }

    public HttpDelete(String uri) {
        this.setURI(URI.create(uri));
    }

    public HttpDelete(URI uri) {
        this.setURI(uri);
    }

    public String getMethod() {
        return "DELETE";
    }
}

