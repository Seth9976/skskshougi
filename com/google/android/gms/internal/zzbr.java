package com.google.android.gms.internal;

import android.text.TextUtils;

@zzgd
public final class zzbr {
    private String zztu;
    private int zztv;

    public zzbr() {
        this(((String)zzbz.zztD.zzcY()), -1);
    }

    public zzbr(String s) {
        this(s, -1);
    }

    public zzbr(String s, int v) {
        this.zztv = -1;
        this.zztu = TextUtils.isEmpty(s) ? ((String)zzbz.zztD.zzcY()) : s;
        this.zztv = v;
    }

    public String zzcW() {
        return this.zztu;
    }

    public int zzcX() {
        return this.zztv;
    }
}

