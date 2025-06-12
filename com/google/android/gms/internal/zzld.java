package com.google.android.gms.internal;

import android.os.SystemClock;

public final class zzld implements zzlb {
    private static zzld zzacK;

    @Override  // com.google.android.gms.internal.zzlb
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override  // com.google.android.gms.internal.zzlb
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static zzlb zzoQ() {
        synchronized(zzld.class) {
            if(zzld.zzacK == null) {
                zzld.zzacK = new zzld();
            }
            return zzld.zzacK;
        }
    }
}

