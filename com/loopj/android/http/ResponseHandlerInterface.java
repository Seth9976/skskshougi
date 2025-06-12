package com.loopj.android.http;

import java.io.IOException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public interface ResponseHandlerInterface {
    Header[] getRequestHeaders();

    URI getRequestURI();

    Object getTag();

    boolean getUsePoolThread();

    boolean getUseSynchronousMode();

    void onPostProcessResponse(ResponseHandlerInterface arg1, HttpResponse arg2);

    void onPreProcessResponse(ResponseHandlerInterface arg1, HttpResponse arg2);

    void sendCancelMessage();

    void sendFailureMessage(int arg1, Header[] arg2, byte[] arg3, Throwable arg4);

    void sendFinishMessage();

    void sendProgressMessage(long arg1, long arg2);

    void sendResponseMessage(HttpResponse arg1) throws IOException;

    void sendRetryMessage(int arg1);

    void sendStartMessage();

    void sendSuccessMessage(int arg1, Header[] arg2, byte[] arg3);

    void setRequestHeaders(Header[] arg1);

    void setRequestURI(URI arg1);

    void setTag(Object arg1);

    void setUsePoolThread(boolean arg1);

    void setUseSynchronousMode(boolean arg1);
}

