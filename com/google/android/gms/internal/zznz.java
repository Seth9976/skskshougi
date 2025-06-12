package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zznz extends zznq {
    private String zzRA;
    public int zzaEE;
    public int zzaEF;
    public int zzaEG;
    public int zzyW;
    public int zzyX;

    public String getLanguage() {
        return this.zzRA;
    }

    public void setLanguage(String language) {
        this.zzRA = language;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("language", this.zzRA);
        hashMap0.put("screenColors", this.zzaEE);
        hashMap0.put("screenWidth", this.zzyW);
        hashMap0.put("screenHeight", this.zzyX);
        hashMap0.put("viewportWidth", this.zzaEF);
        hashMap0.put("viewportHeight", this.zzaEG);
        return zznz.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zznz)zznq0));
    }

    public void zza(zznz zznz0) {
        if(this.zzaEE != 0) {
            zznz0.zzhF(this.zzaEE);
        }
        if(this.zzyW != 0) {
            zznz0.zzhG(this.zzyW);
        }
        if(this.zzyX != 0) {
            zznz0.zzhH(this.zzyX);
        }
        if(this.zzaEF != 0) {
            zznz0.zzhI(this.zzaEF);
        }
        if(this.zzaEG != 0) {
            zznz0.zzhJ(this.zzaEG);
        }
        if(!TextUtils.isEmpty(this.zzRA)) {
            zznz0.setLanguage(this.zzRA);
        }
    }

    public void zzhF(int v) {
        this.zzaEE = v;
    }

    public void zzhG(int v) {
        this.zzyW = v;
    }

    public void zzhH(int v) {
        this.zzyX = v;
    }

    public void zzhI(int v) {
        this.zzaEF = v;
    }

    public void zzhJ(int v) {
        this.zzaEG = v;
    }

    public int zzwp() {
        return this.zzaEE;
    }

    public int zzwq() {
        return this.zzyW;
    }

    public int zzwr() {
        return this.zzyX;
    }

    public int zzws() {
        return this.zzaEF;
    }

    public int zzwt() {
        return this.zzaEG;
    }
}

