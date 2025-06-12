package com.sdkbox.services;

import java.util.List;
import java.util.Map;

public interface HttpRequest {
    void abort();

    void addEventListener(HttpRequestListener arg1);

    Map getAllResponseHeaders();

    int getReadyState();

    byte[] getResponse();

    List getResponseHeader(String arg1);

    String getResponseText();

    String getResponseType();

    int getStatus();

    int getTimeout();

    boolean isWithCredentials();

    void open(String arg1, String arg2);

    void open(String arg1, String arg2, boolean arg3);

    void open(String arg1, String arg2, boolean arg3, String arg4, String arg5);

    void overrideMimeType(String arg1);

    void removeEventListener(HttpRequestListener arg1);

    void saveContentsToFile(String arg1);

    void send(boolean arg1);

    void setRequestHeader(String arg1, String arg2);

    void setResponseType(String arg1);

    void setTimeout(int arg1);

    void setWithCredentials(boolean arg1);
}

