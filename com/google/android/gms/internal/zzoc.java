package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zzoc extends zznq {
    public boolean zzaEI;
    public String zzakM;

    public String getDescription() {
        return this.zzakM;
    }

    public void setDescription(String description) {
        this.zzakM = description;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("description", this.zzakM);
        hashMap0.put("fatal", Boolean.valueOf(this.zzaEI));
        return zzoc.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzoc)zznq0));
    }

    public void zza(zzoc zzoc0) {
        if(!TextUtils.isEmpty(this.zzakM)) {
            zzoc0.setDescription(this.zzakM);
        }
        if(this.zzaEI) {
            zzoc0.zzag(this.zzaEI);
        }
    }

    public void zzag(boolean z) {
        this.zzaEI = z;
    }

    public boolean zzwz() {
        return this.zzaEI;
    }
}

