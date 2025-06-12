package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;

public class zzpy {
    private final String zzaKy;
    private final String zzaMW;
    private final Integer zzaPb;
    private final String zzaPc;
    private final boolean zzaPd;

    public zzpy(String s, Integer integer0, String s1, boolean z) {
        this(s, integer0, s1, z, "");
    }

    public zzpy(String s, Integer integer0, String s1, boolean z, String s2) {
        zzu.zzu(s);
        zzu.zzu(s2);
        this.zzaKy = s;
        this.zzaPb = integer0;
        this.zzaPc = s1;
        this.zzaPd = z;
        this.zzaMW = s2;
    }

    public String getContainerId() {
        return this.zzaKy;
    }

    public String zzAa() {
        return this.zzaPc;
    }

    public String zzAb() {
        return this.zzaPc == null ? this.zzaKy : this.zzaPc + "_" + this.zzaKy;
    }

    public boolean zzAc() {
        return this.zzaPd;
    }

    public String zzAd() {
        return this.zzaMW;
    }

    public Integer zzzZ() {
        return this.zzaPb;
    }
}

