package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zzof extends zznq {
    public String mCategory;
    public String zzaEH;
    public String zzaET;
    public long zzaEU;

    public String getLabel() {
        return this.zzaEH;
    }

    public long getTimeInMillis() {
        return this.zzaEU;
    }

    public void setTimeInMillis(long milliseconds) {
        this.zzaEU = milliseconds;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("variableName", this.zzaET);
        hashMap0.put("timeInMillis", this.zzaEU);
        hashMap0.put("category", this.mCategory);
        hashMap0.put("label", this.zzaEH);
        return zzof.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzof)zznq0));
    }

    public void zza(zzof zzof0) {
        if(!TextUtils.isEmpty(this.zzaET)) {
            zzof0.zzdN(this.zzaET);
        }
        if(this.zzaEU != 0L) {
            zzof0.setTimeInMillis(this.zzaEU);
        }
        if(!TextUtils.isEmpty(this.mCategory)) {
            zzof0.zzdG(this.mCategory);
        }
        if(!TextUtils.isEmpty(this.zzaEH)) {
            zzof0.zzdI(this.zzaEH);
        }
    }

    public void zzdG(String s) {
        this.mCategory = s;
    }

    public void zzdI(String s) {
        this.zzaEH = s;
    }

    public void zzdN(String s) {
        this.zzaET = s;
    }

    public String zzwJ() {
        return this.zzaET;
    }

    public String zzwy() {
        return this.mCategory;
    }
}

