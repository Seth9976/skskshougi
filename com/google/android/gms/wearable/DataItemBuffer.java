package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzac;

public class DataItemBuffer extends zzf implements Result {
    private final Status zzOt;

    public DataItemBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzOt = new Status(dataHolder.getStatusCode());
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzv(v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "path";
    }

    protected DataItem zzv(int v, int v1) {
        return new zzac(this.zzWu, v, v1);
    }
}

