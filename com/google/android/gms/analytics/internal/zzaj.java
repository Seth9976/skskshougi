package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;

class zzaj {
    private long zzMC;
    private final zzlb zzpw;

    public zzaj(zzlb zzlb0) {
        zzu.zzu(zzlb0);
        this.zzpw = zzlb0;
    }

    public zzaj(zzlb zzlb0, long v) {
        zzu.zzu(zzlb0);
        this.zzpw = zzlb0;
        this.zzMC = v;
    }

    public void clear() {
        this.zzMC = 0L;
    }

    public void start() {
        this.zzMC = this.zzpw.elapsedRealtime();
    }

    public boolean zzv(long v) {
        return this.zzMC == 0L ? true : this.zzpw.elapsedRealtime() - this.zzMC > v;
    }
}

