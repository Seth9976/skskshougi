package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zzob extends zznq {
    private String mCategory;
    private String zzaEH;
    private long zzaoL;
    private String zzuO;

    public String getAction() {
        return this.zzuO;
    }

    public String getLabel() {
        return this.zzaEH;
    }

    public long getValue() {
        return this.zzaoL;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("category", this.mCategory);
        hashMap0.put("action", this.zzuO);
        hashMap0.put("label", this.zzaEH);
        hashMap0.put("value", this.zzaoL);
        return zzob.zzy(hashMap0);
    }

    public void zzM(long v) {
        this.zzaoL = v;
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzob)zznq0));
    }

    public void zza(zzob zzob0) {
        if(!TextUtils.isEmpty(this.mCategory)) {
            zzob0.zzdG(this.mCategory);
        }
        if(!TextUtils.isEmpty(this.zzuO)) {
            zzob0.zzdH(this.zzuO);
        }
        if(!TextUtils.isEmpty(this.zzaEH)) {
            zzob0.zzdI(this.zzaEH);
        }
        if(this.zzaoL != 0L) {
            zzob0.zzM(this.zzaoL);
        }
    }

    public void zzdG(String s) {
        this.mCategory = s;
    }

    public void zzdH(String s) {
        this.zzuO = s;
    }

    public void zzdI(String s) {
        this.zzaEH = s;
    }

    public String zzwy() {
        return this.mCategory;
    }
}

