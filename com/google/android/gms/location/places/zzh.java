package com.google.android.gms.location.places;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzq;

public class zzh extends AbstractDataBuffer {
    public zzh(DataHolder dataHolder0) {
        super(dataHolder0);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzgP(x0);
    }

    public zzg zzgP(int v) {
        return new zzq(this.zzWu, v);
    }
}

