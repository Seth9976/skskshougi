package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class zza {
    private final int mTextColor;
    private static final int zzuW;
    private static final int zzuX;
    static final int zzuY;
    static final int zzuZ;
    private final String zzva;
    private final Drawable zzvb;
    private final int zzvc;
    private final int zzvd;

    static {
        zza.zzuW = Color.rgb(12, 0xAE, 206);
        zza.zzuX = Color.rgb(204, 204, 204);
        zza.zzuY = zza.zzuX;
        zza.zzuZ = zza.zzuW;
    }

    public zza(String s, Drawable drawable0, Integer integer0, Integer integer1, Integer integer2) {
        this.zzva = s;
        this.zzvb = drawable0;
        this.zzvc = integer0 == null ? zza.zzuY : ((int)integer0);
        this.mTextColor = integer1 == null ? zza.zzuZ : ((int)integer1);
        this.zzvd = integer2 == null ? 12 : ((int)integer2);
    }

    public int getBackgroundColor() {
        return this.zzvc;
    }

    public Drawable getIcon() {
        return this.zzvb;
    }

    public String getText() {
        return this.zzva;
    }

    public int getTextSize() {
        return this.zzvd;
    }

    public int zzdu() {
        return this.mTextColor;
    }
}

