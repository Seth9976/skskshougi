package com.loopj.android.http;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class RequestHandle {
    private final WeakReference request;

    public RequestHandle(AsyncHttpRequest request) {
        this.request = new WeakReference(request);
    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        AsyncHttpRequest _request = (AsyncHttpRequest)this.request.get();
        if(_request != null) {
            if(Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        _request.cancel(mayInterruptIfRunning);
                    }
                }).start();
                return true;
            }
            return _request.cancel(mayInterruptIfRunning);
        }
        return false;
    }

    public Object getTag() {
        AsyncHttpRequest _request = (AsyncHttpRequest)this.request.get();
        return _request == null ? null : _request.getTag();
    }

    public boolean isCancelled() {
        AsyncHttpRequest _request = (AsyncHttpRequest)this.request.get();
        return _request == null || _request.isCancelled();
    }

    public boolean isFinished() {
        AsyncHttpRequest _request = (AsyncHttpRequest)this.request.get();
        return _request == null || _request.isDone();
    }

    public RequestHandle setTag(Object tag) {
        AsyncHttpRequest _request = (AsyncHttpRequest)this.request.get();
        if(_request != null) {
            _request.setRequestTag(tag);
        }
        return this;
    }

    public boolean shouldBeGarbageCollected() {
        boolean should = this.isCancelled() || this.isFinished();
        if(should) {
            this.request.clear();
        }
        return should;
    }
}

