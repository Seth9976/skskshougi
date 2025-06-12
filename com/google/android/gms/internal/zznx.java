package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zznx extends zznq {
    private String zzLU;
    private String zzLV;
    private String zzaEw;
    private String zzaEx;

    public void setAppId(String value) {
        this.zzaEw = value;
    }

    public void setAppInstallerId(String value) {
        this.zzaEx = value;
    }

    public void setAppName(String value) {
        this.zzLU = value;
    }

    public void setAppVersion(String value) {
        this.zzLV = value;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("appName", this.zzLU);
        hashMap0.put("appVersion", this.zzLV);
        hashMap0.put("appId", this.zzaEw);
        hashMap0.put("appInstallerId", this.zzaEx);
        return zznx.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zznx)zznq0));
    }

    public void zza(zznx zznx0) {
        if(!TextUtils.isEmpty(this.zzLU)) {
            zznx0.setAppName(this.zzLU);
        }
        if(!TextUtils.isEmpty(this.zzLV)) {
            zznx0.setAppVersion(this.zzLV);
        }
        if(!TextUtils.isEmpty(this.zzaEw)) {
            zznx0.setAppId(this.zzaEw);
        }
        if(!TextUtils.isEmpty(this.zzaEx)) {
            zznx0.setAppInstallerId(this.zzaEx);
        }
    }

    public String zzjL() {
        return this.zzLU;
    }

    public String zzjN() {
        return this.zzLV;
    }

    public String zzsK() {
        return this.zzaEw;
    }

    public String zzwi() {
        return this.zzaEx;
    }
}

