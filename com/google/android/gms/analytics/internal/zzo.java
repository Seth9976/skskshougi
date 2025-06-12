package com.google.android.gms.analytics.internal;

public enum zzo {
    NONE,
    GZIP;

    // 去混淆评级： 低(20)
    public static zzo zzbd(String s) {
        return "GZIP".equalsIgnoreCase(s) ? zzo.zzKL : zzo.zzKK;
    }
}

