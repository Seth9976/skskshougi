package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzb implements com.google.android.gms.common.api.zzi.zzb {
    private final DataHolder zzWu;

    protected zzb(DataHolder dataHolder0) {
        this.zzWu = dataHolder0;
    }

    protected abstract void zza(Object arg1, DataHolder arg2);

    @Override  // com.google.android.gms.common.api.zzi$zzb
    public void zzmw() {
        if(this.zzWu != null) {
            this.zzWu.close();
        }
    }

    @Override  // com.google.android.gms.common.api.zzi$zzb
    public final void zzn(Object object0) {
        this.zza(object0, this.zzWu);
    }
}

