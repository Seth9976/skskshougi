package org.cocos2dx.lib;

import android.util.Log;
import com.loopj.android.http.BinaryHttpResponseHandler;
import org.apache.http.Header;

class DataTaskHandler extends BinaryHttpResponseHandler {
    private Cocos2dxDownloader _downloader;
    int _id;
    private long _lastBytesWritten;

    public DataTaskHandler(Cocos2dxDownloader downloader, int id) {
        super(new String[]{".*"});
        this._downloader = downloader;
        this._id = id;
        this._lastBytesWritten = 0L;
    }

    void LogD(String msg) {
        Log.d("Cocos2dxDownloader", msg);
    }

    @Override  // com.loopj.android.http.BinaryHttpResponseHandler
    public void onFailure(int i, Header[] headers, byte[] errorResponse, Throwable throwable) {
        this.LogD("onFailure(i:" + i + " headers:" + headers + " throwable:" + throwable);
        this._downloader.onFinish(this._id, i, (throwable == null ? "" : throwable.toString()), null);
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onProgress(long bytesWritten, long totalSize) {
        this._downloader.onProgress(this._id, bytesWritten - this._lastBytesWritten, bytesWritten, totalSize);
        this._lastBytesWritten = bytesWritten;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onStart() {
        this._downloader.onStart(this._id);
    }

    @Override  // com.loopj.android.http.BinaryHttpResponseHandler
    public void onSuccess(int i, Header[] headers, byte[] binaryData) {
        this.LogD("onSuccess(i:" + i + " headers:" + headers);
        this._downloader.onFinish(this._id, 0, null, binaryData);
    }
}

