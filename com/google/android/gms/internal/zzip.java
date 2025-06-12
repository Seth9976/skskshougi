package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;

public final class zzip extends zznq {
    private String zzEO;
    private String zzJc;
    private String zzJd;
    private String zzJe;
    private boolean zzJf;
    private String zzJg;
    private boolean zzJh;
    private double zzJi;

    public String getClientId() {
        return this.zzJd;
    }

    public String getUserId() {
        return this.zzEO;
    }

    public void setClientId(String clientId) {
        this.zzJd = clientId;
    }

    public void setSampleRate(double percentage) {
        zzu.zzb(percentage >= 0.0 && percentage <= 100.0, "Sample rate must be between 0% and 100%");
        this.zzJi = percentage;
    }

    public void setUserId(String userId) {
        this.zzEO = userId;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("hitType", this.zzJc);
        hashMap0.put("clientId", this.zzJd);
        hashMap0.put("userId", this.zzEO);
        hashMap0.put("androidAdId", this.zzJe);
        hashMap0.put("AdTargetingEnabled", Boolean.valueOf(this.zzJf));
        hashMap0.put("sessionControl", this.zzJg);
        hashMap0.put("nonInteraction", Boolean.valueOf(this.zzJh));
        hashMap0.put("sampleRate", this.zzJi);
        return zzip.zzy(hashMap0);
    }

    public void zzE(boolean z) {
        this.zzJf = z;
    }

    public void zzF(boolean z) {
        this.zzJh = z;
    }

    public void zza(zzip zzip0) {
        if(!TextUtils.isEmpty(this.zzJc)) {
            zzip0.zzaN(this.zzJc);
        }
        if(!TextUtils.isEmpty(this.zzJd)) {
            zzip0.setClientId(this.zzJd);
        }
        if(!TextUtils.isEmpty(this.zzEO)) {
            zzip0.setUserId(this.zzEO);
        }
        if(!TextUtils.isEmpty(this.zzJe)) {
            zzip0.zzaO(this.zzJe);
        }
        if(this.zzJf) {
            zzip0.zzE(true);
        }
        if(!TextUtils.isEmpty(this.zzJg)) {
            zzip0.zzaP(this.zzJg);
        }
        if(this.zzJh) {
            zzip0.zzF(this.zzJh);
        }
        if(this.zzJi != 0.0) {
            zzip0.setSampleRate(this.zzJi);
        }
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzip)zznq0));
    }

    public void zzaN(String s) {
        this.zzJc = s;
    }

    public void zzaO(String s) {
        this.zzJe = s;
    }

    public void zzaP(String s) {
        this.zzJg = s;
    }

    public boolean zzhA() {
        return this.zzJh;
    }

    public double zzhB() {
        return this.zzJi;
    }

    public String zzhw() {
        return this.zzJc;
    }

    public String zzhx() {
        return this.zzJe;
    }

    public boolean zzhy() {
        return this.zzJf;
    }

    public String zzhz() {
        return this.zzJg;
    }
}

