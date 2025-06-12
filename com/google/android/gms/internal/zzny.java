package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;

public final class zzny extends zznq {
    private String mName;
    private String zzKI;
    private String zzaEA;
    private String zzaEB;
    private String zzaEC;
    private String zzaED;
    private String zzaEy;
    private String zzaEz;
    private String zzazL;
    private String zzuU;

    public String getContent() {
        return this.zzuU;
    }

    public String getId() {
        return this.zzKI;
    }

    public String getName() {
        return this.mName;
    }

    public String getSource() {
        return this.zzazL;
    }

    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("name", this.mName);
        hashMap0.put("source", this.zzazL);
        hashMap0.put("medium", this.zzaEy);
        hashMap0.put("keyword", this.zzaEz);
        hashMap0.put("content", this.zzuU);
        hashMap0.put("id", this.zzKI);
        hashMap0.put("adNetworkId", this.zzaEA);
        hashMap0.put("gclid", this.zzaEB);
        hashMap0.put("dclid", this.zzaEC);
        hashMap0.put("aclid", this.zzaED);
        return zzny.zzy(hashMap0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzny)zznq0));
    }

    public void zza(zzny zzny0) {
        if(!TextUtils.isEmpty(this.mName)) {
            zzny0.setName(this.mName);
        }
        if(!TextUtils.isEmpty(this.zzazL)) {
            zzny0.zzdx(this.zzazL);
        }
        if(!TextUtils.isEmpty(this.zzaEy)) {
            zzny0.zzdy(this.zzaEy);
        }
        if(!TextUtils.isEmpty(this.zzaEz)) {
            zzny0.zzdz(this.zzaEz);
        }
        if(!TextUtils.isEmpty(this.zzuU)) {
            zzny0.zzdA(this.zzuU);
        }
        if(!TextUtils.isEmpty(this.zzKI)) {
            zzny0.zzdB(this.zzKI);
        }
        if(!TextUtils.isEmpty(this.zzaEA)) {
            zzny0.zzdC(this.zzaEA);
        }
        if(!TextUtils.isEmpty(this.zzaEB)) {
            zzny0.zzdD(this.zzaEB);
        }
        if(!TextUtils.isEmpty(this.zzaEC)) {
            zzny0.zzdE(this.zzaEC);
        }
        if(!TextUtils.isEmpty(this.zzaED)) {
            zzny0.zzdF(this.zzaED);
        }
    }

    public void zzdA(String s) {
        this.zzuU = s;
    }

    public void zzdB(String s) {
        this.zzKI = s;
    }

    public void zzdC(String s) {
        this.zzaEA = s;
    }

    public void zzdD(String s) {
        this.zzaEB = s;
    }

    public void zzdE(String s) {
        this.zzaEC = s;
    }

    public void zzdF(String s) {
        this.zzaED = s;
    }

    public void zzdx(String s) {
        this.zzazL = s;
    }

    public void zzdy(String s) {
        this.zzaEy = s;
    }

    public void zzdz(String s) {
        this.zzaEz = s;
    }

    public String zzwj() {
        return this.zzaEy;
    }

    public String zzwk() {
        return this.zzaEz;
    }

    public String zzwl() {
        return this.zzaEA;
    }

    public String zzwm() {
        return this.zzaEB;
    }

    public String zzwn() {
        return this.zzaEC;
    }

    public String zzwo() {
        return this.zzaED;
    }
}

