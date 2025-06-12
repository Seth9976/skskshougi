package com.loopj.android.http;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

class RetryHandler implements HttpRequestRetryHandler {
    private static final HashSet exceptionBlacklist;
    private static final HashSet exceptionWhitelist;
    private final int maxRetries;
    private final int retrySleepTimeMS;

    static {
        RetryHandler.exceptionWhitelist = new HashSet();
        RetryHandler.exceptionBlacklist = new HashSet();
        RetryHandler.exceptionWhitelist.add(NoHttpResponseException.class);
        RetryHandler.exceptionWhitelist.add(UnknownHostException.class);
        RetryHandler.exceptionWhitelist.add(SocketException.class);
        RetryHandler.exceptionBlacklist.add(InterruptedIOException.class);
        RetryHandler.exceptionBlacklist.add(SSLException.class);
    }

    public RetryHandler(int maxRetries, int retrySleepTimeMS) {
        this.maxRetries = maxRetries;
        this.retrySleepTimeMS = retrySleepTimeMS;
    }

    static void addClassToBlacklist(Class class0) {
        RetryHandler.exceptionBlacklist.add(class0);
    }

    static void addClassToWhitelist(Class class0) {
        RetryHandler.exceptionWhitelist.add(class0);
    }

    protected boolean isInList(HashSet hashSet0, Throwable error) {
        for(Object object0: hashSet0) {
            if(((Class)object0).isInstance(error)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
        boolean retry = true;
        Boolean b = (Boolean)context.getAttribute("http.request_sent");
        boolean z1 = b != null && b.booleanValue();
        if(executionCount > this.maxRetries) {
            retry = false;
        }
        else if(!this.isInList(RetryHandler.exceptionWhitelist, exception) && this.isInList(RetryHandler.exceptionBlacklist, exception)) {
            retry = false;
        }
        if(retry && ((HttpUriRequest)context.getAttribute("http.request")) == null) {
            return false;
        }
        if(retry) {
            SystemClock.sleep(this.retrySleepTimeMS);
            return true;
        }
        exception.printStackTrace();
        return false;
    }
}

