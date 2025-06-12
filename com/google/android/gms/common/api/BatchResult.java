package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.TimeUnit;

public final class BatchResult implements Result {
    private final Status zzOt;
    private final PendingResult[] zzWq;

    BatchResult(Status status, PendingResult[] arr_pendingResult) {
        this.zzOt = status;
        this.zzWq = arr_pendingResult;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    public Result take(BatchResultToken batchResultToken0) {
        zzu.zzb(batchResultToken0.mId < this.zzWq.length, "The result token does not belong to this batch");
        return this.zzWq[batchResultToken0.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}

