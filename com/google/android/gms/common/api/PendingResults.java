package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.zzu;

public final class PendingResults {
    static final class zza extends AbstractPendingResult {
        private final Result zzXN;

        public zza(Result result0) {
            super(Looper.getMainLooper());
            this.zzXN = result0;
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status status) {
            if(status.getStatusCode() != this.zzXN.getStatus().getStatusCode()) {
                throw new UnsupportedOperationException("Creating failed results is not supported");
            }
            return this.zzXN;
        }
    }

    static final class zzb extends AbstractPendingResult {
        public zzb() {
            super(Looper.getMainLooper());
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    public static PendingResult canceledPendingResult() {
        PendingResult pendingResult0 = new zzl(Looper.getMainLooper());
        ((zzl)pendingResult0).cancel();
        return pendingResult0;
    }

    public static PendingResult canceledPendingResult(Result result0) {
        zzu.zzb(result0, "Result must not be null");
        zzu.zzb(result0.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        PendingResult pendingResult0 = new zza(result0);
        ((zza)pendingResult0).cancel();
        return pendingResult0;
    }

    public static PendingResult immediatePendingResult(Result result0) {
        zzu.zzb(result0, "Result must not be null");
        PendingResult pendingResult0 = new zzb();
        ((zzb)pendingResult0).setResult(result0);
        return pendingResult0;
    }

    public static PendingResult immediatePendingResult(Status result) {
        zzu.zzb(result, "Result must not be null");
        PendingResult pendingResult0 = new zzl(Looper.getMainLooper());
        ((zzl)pendingResult0).setResult(result);
        return pendingResult0;
    }
}

