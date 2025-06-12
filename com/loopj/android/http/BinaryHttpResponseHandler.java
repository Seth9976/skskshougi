package com.loopj.android.http;

import android.os.Looper;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

public abstract class BinaryHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "BinaryHttpRH";
    private String[] mAllowedContentTypes;

    public BinaryHttpResponseHandler() {
        this.mAllowedContentTypes = new String[]{"application/octet-stream", "image/jpeg", "image/png", "image/gif"};
    }

    public BinaryHttpResponseHandler(String[] allowedContentTypes) {
        this.mAllowedContentTypes = new String[]{"application/octet-stream", "image/jpeg", "image/png", "image/gif"};
        if(allowedContentTypes != null) {
            this.mAllowedContentTypes = allowedContentTypes;
            return;
        }
        AsyncHttpClient.log.e("BinaryHttpRH", "Constructor passed allowedContentTypes was null !");
    }

    public BinaryHttpResponseHandler(String[] allowedContentTypes, Looper looper) {
        super(looper);
        this.mAllowedContentTypes = new String[]{"application/octet-stream", "image/jpeg", "image/png", "image/gif"};
        if(allowedContentTypes != null) {
            this.mAllowedContentTypes = allowedContentTypes;
            return;
        }
        AsyncHttpClient.log.e("BinaryHttpRH", "Constructor passed allowedContentTypes was null !");
    }

    public String[] getAllowedContentTypes() {
        return this.mAllowedContentTypes;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public abstract void onFailure(int arg1, Header[] arg2, byte[] arg3, Throwable arg4);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public abstract void onSuccess(int arg1, Header[] arg2, byte[] arg3);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public final void sendResponseMessage(HttpResponse response) throws IOException {
        StatusLine statusLine0 = response.getStatusLine();
        Header[] arr_header = response.getHeaders("Content-Type");
        if(arr_header.length != 1) {
            this.sendFailureMessage(statusLine0.getStatusCode(), response.getAllHeaders(), null, ((Throwable)new HttpResponseException(statusLine0.getStatusCode(), "None, or more than one, Content-Type Header found!")));
            return;
        }
        Header contentTypeHeader = arr_header[0];
        boolean foundAllowedContentType = false;
        String[] arr_s = this.getAllowedContentTypes();
        for(int v = 0; v < arr_s.length; ++v) {
            String anAllowedContentType = arr_s[v];
            try {
                if(Pattern.matches(anAllowedContentType, contentTypeHeader.getValue())) {
                    foundAllowedContentType = true;
                }
            }
            catch(PatternSyntaxException e) {
                AsyncHttpClient.log.e("BinaryHttpRH", "Given pattern is not valid: " + anAllowedContentType, e);
            }
        }
        if(!foundAllowedContentType) {
            this.sendFailureMessage(statusLine0.getStatusCode(), response.getAllHeaders(), null, ((Throwable)new HttpResponseException(statusLine0.getStatusCode(), "Content-Type (" + contentTypeHeader.getValue() + ") not allowed!")));
            return;
        }
        super.sendResponseMessage(response);
    }
}

