package com.loopj.android.http;

import java.io.UnsupportedEncodingException;
import org.apache.http.Header;

public abstract class TextHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "TextHttpRH";

    public TextHttpResponseHandler() {
        this("UTF-8");
    }

    public TextHttpResponseHandler(String encoding) {
        this.setCharset(encoding);
    }

    public static String getResponseString(byte[] stringBytes, String charset) {
        String toReturn;
        if(stringBytes == null) {
            toReturn = null;
        }
        else {
            try {
                toReturn = new String(stringBytes, charset);
            label_4:
                if(toReturn != null) {
                    return toReturn.startsWith("﻿") ? toReturn.substring(1) : toReturn;
                }
            }
            catch(UnsupportedEncodingException e) {
                AsyncHttpClient.log.e("TextHttpRH", "Encoding response into string failed", e);
            }
            return null;
        }
        goto label_4;
    }

    public abstract void onFailure(int arg1, Header[] arg2, String arg3, Throwable arg4);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onFailure(int statusCode, Header[] headers, byte[] responseBytes, Throwable throwable) {
        this.onFailure(statusCode, headers, TextHttpResponseHandler.getResponseString(responseBytes, this.getCharset()), throwable);
    }

    public abstract void onSuccess(int arg1, Header[] arg2, String arg3);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBytes) {
        this.onSuccess(statusCode, headers, TextHttpResponseHandler.getResponseString(responseBytes, this.getCharset()));
    }
}

