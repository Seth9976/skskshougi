package com.google.android.gms.internal;

import com.google.android.gms.common.api.PendingResult.BatchCallback;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

class zzmw implements PendingResult {
    private final Result zzakV;

    zzmw(Result result0) {
        this.zzakV = result0;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public void addBatchCallback(BatchCallback callback) {
        callback.zzs(this.zzakV.getStatus());
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public Result await() {
        return this.zzakV;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public Result await(long time, TimeUnit units) {
        return this.zzakV;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public void cancel() {
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public void setResultCallback(ResultCallback resultCallback0) {
        resultCallback0.onResult(this.zzakV);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public void setResultCallback(ResultCallback resultCallback0, long time, TimeUnit units) {
        resultCallback0.onResult(this.zzakV);
    }
}

