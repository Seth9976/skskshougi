package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzae;

public final class zzc {
    public static String zzN(int v) {
        return zzc.zzc("&cd", v);
    }

    public static String zzO(int v) {
        return zzc.zzc("cd", v);
    }

    public static String zzP(int v) {
        return zzc.zzc("&cm", v);
    }

    public static String zzQ(int v) {
        return zzc.zzc("cm", v);
    }

    public static String zzR(int v) {
        return zzc.zzc("&pr", v);
    }

    public static String zzS(int v) {
        return zzc.zzc("pr", v);
    }

    public static String zzT(int v) {
        return zzc.zzc("&promo", v);
    }

    public static String zzU(int v) {
        return zzc.zzc("promo", v);
    }

    public static String zzV(int v) {
        return zzc.zzc("pi", v);
    }

    public static String zzW(int v) {
        return zzc.zzc("&il", v);
    }

    public static String zzX(int v) {
        return zzc.zzc("il", v);
    }

    public static String zzY(int v) {
        return zzc.zzc("cd", v);
    }

    public static String zzZ(int v) {
        return zzc.zzc("cm", v);
    }

    private static String zzc(String s, int v) {
        if(v < 1) {
            zzae.zzf("index out of range for prefix", s);
            return "";
        }
        return s + v;
    }
}

