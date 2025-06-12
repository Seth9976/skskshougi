package com.google.android.gms.analytics.internal;

public enum zzm {
    NONE,
    BATCH_BY_SESSION,
    BATCH_BY_TIME,
    BATCH_BY_BRUTE_FORCE,
    BATCH_BY_COUNT,
    BATCH_BY_SIZE;

    public static zzm zzbc(String s) {
        if("BATCH_BY_SESSION".equalsIgnoreCase(s)) {
            return zzm.zzKA;
        }
        if("BATCH_BY_TIME".equalsIgnoreCase(s)) {
            return zzm.zzKB;
        }
        if("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s)) {
            return zzm.zzKC;
        }
        if("BATCH_BY_COUNT".equalsIgnoreCase(s)) {
            return zzm.zzKD;
        }
        return "BATCH_BY_SIZE".equalsIgnoreCase(s) ? zzm.zzKE : zzm.zzKz;
    }
}

