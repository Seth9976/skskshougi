package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public interface PendingResult {
    public interface BatchCallback {
        void zzs(Status arg1);
    }

    void addBatchCallback(BatchCallback arg1);

    Result await();

    Result await(long arg1, TimeUnit arg2);

    void cancel();

    boolean isCanceled();

    void setResultCallback(ResultCallback arg1);

    void setResultCallback(ResultCallback arg1, long arg2, TimeUnit arg3);
}

