package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.UUID;

public final class zzod extends zznq {
    private String zzaEJ;
    private int zzaEK;
    private int zzaEL;
    private String zzaEM;
    private String zzaEN;
    private boolean zzaEO;
    private boolean zzaEP;
    private boolean zzaEQ;

    public zzod() {
        this(false);
    }

    public zzod(boolean z) {
        this(z, zzod.zzwA());
    }

    public zzod(boolean z, int v) {
        zzu.zzbw(v);
        this.zzaEK = v;
        this.zzaEP = z;
    }

    public boolean isMutable() {
        return !this.zzaEQ;
    }

    public void setScreenName(String screenName) {
        this.zzwH();
        this.zzaEJ = screenName;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("screenName", this.zzaEJ);
        hashMap0.put("interstitial", Boolean.valueOf(this.zzaEO));
        hashMap0.put("automatic", Boolean.valueOf(this.zzaEP));
        hashMap0.put("screenId", this.zzaEK);
        hashMap0.put("referrerScreenId", this.zzaEL);
        hashMap0.put("referrerScreenName", this.zzaEM);
        hashMap0.put("referrerUri", this.zzaEN);
        return zzod.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zzc(((zzod)zznq0));
    }

    public void zzah(boolean z) {
        this.zzwH();
        this.zzaEP = z;
    }

    public void zzai(boolean z) {
        this.zzwH();
        this.zzaEO = z;
    }

    public int zzbn() {
        return this.zzaEK;
    }

    public void zzc(zzod zzod0) {
        if(!TextUtils.isEmpty(this.zzaEJ)) {
            zzod0.setScreenName(this.zzaEJ);
        }
        if(this.zzaEK != 0) {
            zzod0.zzhK(this.zzaEK);
        }
        if(this.zzaEL != 0) {
            zzod0.zzhL(this.zzaEL);
        }
        if(!TextUtils.isEmpty(this.zzaEM)) {
            zzod0.zzdJ(this.zzaEM);
        }
        if(!TextUtils.isEmpty(this.zzaEN)) {
            zzod0.zzdK(this.zzaEN);
        }
        if(this.zzaEO) {
            zzod0.zzai(this.zzaEO);
        }
        if(this.zzaEP) {
            zzod0.zzah(this.zzaEP);
        }
    }

    public void zzdJ(String s) {
        this.zzwH();
        this.zzaEM = s;
    }

    public void zzdK(String s) {
        this.zzwH();
        if(TextUtils.isEmpty(s)) {
            this.zzaEN = null;
            return;
        }
        this.zzaEN = s;
    }

    public void zzhK(int v) {
        this.zzwH();
        this.zzaEK = v;
    }

    public void zzhL(int v) {
        this.zzwH();
        this.zzaEL = v;
    }

    static int zzwA() {
        UUID uUID0 = UUID.randomUUID();
        int v = (int)(uUID0.getLeastSignificantBits() & 0x7FFFFFFFL);
        if(v == 0) {
            v = (int)(uUID0.getMostSignificantBits() & 0x7FFFFFFFL);
            if(v == 0) {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                return 0x7FFFFFFF;
            }
        }
        return v;
    }

    public String zzwB() {
        return this.zzaEJ;
    }

    public int zzwC() {
        return this.zzaEL;
    }

    public String zzwD() {
        return this.zzaEM;
    }

    public String zzwE() {
        return this.zzaEN;
    }

    public void zzwF() {
        this.zzaEQ = true;
    }

    public boolean zzwG() {
        return this.zzaEO;
    }

    private void zzwH() {
        if(this.zzaEQ) {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        }
    }
}

