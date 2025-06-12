package org.cocos2dx.lib;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestHandle;

class DownloadTask {
    long bytesReceived;
    byte[] data;
    RequestHandle handle;
    AsyncHttpResponseHandler handler;
    long totalBytesExpected;
    long totalBytesReceived;

    DownloadTask() {
        this.handle = null;
        this.handler = null;
        this.resetStatus();
    }

    void resetStatus() {
        this.bytesReceived = 0L;
        this.totalBytesReceived = 0L;
        this.totalBytesExpected = 0L;
        this.data = null;
    }
}

