package org.cocos2dx.lib;

import android.util.Log;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import java.io.File;
import org.apache.http.Header;

class FileTaskHandler extends FileAsyncHttpResponseHandler {
    private Cocos2dxDownloader _downloader;
    File _finalFile;
    int _id;
    private long _initFileLen;
    private long _lastBytesWritten;

    public FileTaskHandler(Cocos2dxDownloader downloader, int id, File temp, File finalFile) {
        super(temp, true);
        this._finalFile = finalFile;
        this._downloader = downloader;
        this._id = id;
        this._initFileLen = this.getTargetFile().length();
        this._lastBytesWritten = 0L;
    }

    void LogD(String msg) {
        Log.d("Cocos2dxDownloader", msg);
    }

    @Override  // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onFailure(int i, Header[] headers, Throwable throwable, File file) {
        this.LogD("onFailure(i:" + i + " headers:" + headers + " throwable:" + throwable + " file:" + file);
        this._downloader.onFinish(this._id, i, (throwable == null ? "" : throwable.toString()), null);
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onFinish() {
        Runnable runnable0 = this._downloader.dequeue();
        if(runnable0 != null) {
            Cocos2dxHelper.getActivity().runOnUiThread(runnable0);
        }
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onProgress(long bytesWritten, long totalSize) {
        this._downloader.onProgress(this._id, bytesWritten - this._lastBytesWritten, bytesWritten + this._initFileLen, totalSize + this._initFileLen);
        this._lastBytesWritten = bytesWritten;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onStart() {
        this._downloader.onStart(this._id);
    }

    @Override  // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onSuccess(int i, Header[] headers, File file) {
        this.LogD("onSuccess(i:" + i + " headers:" + headers + " file:" + file);
        String errStr = null;
        if(!this._finalFile.exists()) {
            this.getTargetFile().renameTo(this._finalFile);
        }
        else if(this._finalFile.isDirectory()) {
            errStr = "Dest file is directory:" + this._finalFile.getAbsolutePath();
        }
        else if(this._finalFile.delete()) {
            this.getTargetFile().renameTo(this._finalFile);
        }
        else {
            errStr = "Can\'t remove old file:" + this._finalFile.getAbsolutePath();
        }
        this._downloader.onFinish(this._id, 0, errStr, null);
    }
}

