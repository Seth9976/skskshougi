package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzc implements Releasable, Result {
    protected final Status zzOt;
    protected final DataHolder zzWu;

    protected zzc(DataHolder dataHolder0) {
        this(dataHolder0, new Status(dataHolder0.getStatusCode()));
    }

    protected zzc(DataHolder dataHolder0, Status status0) {
        this.zzOt = status0;
        this.zzWu = dataHolder0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
        if(this.zzWu != null) {
            this.zzWu.close();
        }
    }
}

