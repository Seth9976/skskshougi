package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends AbstractPendingResult {
    public static final class Builder {
        private List zzWs;
        private Looper zzWt;

        public Builder(GoogleApiClient googleApiClient) {
            this.zzWs = new ArrayList();
            this.zzWt = googleApiClient.getLooper();
        }

        public BatchResultToken add(PendingResult pendingResult0) {
            BatchResultToken batchResultToken0 = new BatchResultToken(this.zzWs.size());
            this.zzWs.add(pendingResult0);
            return batchResultToken0;
        }

        public Batch build() {
            return new Batch(this.zzWs, this.zzWt, null);
        }
    }

    private int zzWn;
    private boolean zzWo;
    private boolean zzWp;
    private final PendingResult[] zzWq;
    private final Object zzqt;

    private Batch(List list0, Looper looper) {
        super(new CallbackHandler(looper));
        this.zzqt = new Object();
        this.zzWn = list0.size();
        this.zzWq = new PendingResult[this.zzWn];
        for(int v = 0; v < list0.size(); ++v) {
            PendingResult pendingResult0 = (PendingResult)list0.get(v);
            this.zzWq[v] = pendingResult0;
            pendingResult0.addBatchCallback(new BatchCallback() {
                @Override  // com.google.android.gms.common.api.PendingResult$BatchCallback
                public void zzs(Status status0) {
                    synchronized(Batch.this.zzqt) {
                        if(Batch.this.isCanceled()) {
                            return;
                        }
                        if(status0.isCanceled()) {
                            Batch.this.zzWp = true;
                        }
                        else if(!status0.isSuccess()) {
                            Batch.this.zzWo = true;
                        }
                        Batch.zzb(Batch.this);
                        if(Batch.this.zzWn == 0) {
                            if(Batch.this.zzWp) {
                                Batch.this.cancel();
                            }
                            else {
                                BatchResult batchResult0 = new BatchResult((Batch.this.zzWo ? new Status(13) : Status.zzXP), Batch.this.zzWq);
                                Batch.this.setResult(batchResult0);
                            }
                        }
                    }
                }
            });
        }
    }

    Batch(List x0, Looper x1, com.google.android.gms.common.api.Batch.1 x2) {
        this(x0, x1);
    }

    @Override  // com.google.android.gms.common.api.AbstractPendingResult
    public void cancel() {
        super.cancel();
        PendingResult[] arr_pendingResult = this.zzWq;
        for(int v = 0; v < arr_pendingResult.length; ++v) {
            arr_pendingResult[v].cancel();
        }
    }

    public BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zzWq);
    }

    @Override  // com.google.android.gms.common.api.AbstractPendingResult
    public Result createFailedResult(Status x0) {
        return this.createFailedResult(x0);
    }

    static int zzb(Batch batch0) {
        int v = batch0.zzWn;
        batch0.zzWn = v - 1;
        return v;
    }
}

