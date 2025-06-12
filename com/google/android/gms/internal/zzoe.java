package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zzoe extends zznq {
    public String zzaER;
    public String zzaES;
    public String zzuO;

    public String getAction() {
        return this.zzuO;
    }

    public String getTarget() {
        return this.zzaES;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("network", this.zzaER);
        hashMap0.put("action", this.zzuO);
        hashMap0.put("target", this.zzaES);
        return zzoe.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzoe)zznq0));
    }

    public void zza(zzoe zzoe0) {
        if(!TextUtils.isEmpty(this.zzaER)) {
            zzoe0.zzdL(this.zzaER);
        }
        if(!TextUtils.isEmpty(this.zzuO)) {
            zzoe0.zzdH(this.zzuO);
        }
        if(!TextUtils.isEmpty(this.zzaES)) {
            zzoe0.zzdM(this.zzaES);
        }
    }

    public void zzdH(String s) {
        this.zzuO = s;
    }

    public void zzdL(String s) {
        this.zzaER = s;
    }

    public void zzdM(String s) {
        this.zzaES = s;
    }

    public String zzwI() {
        return this.zzaER;
    }
}

