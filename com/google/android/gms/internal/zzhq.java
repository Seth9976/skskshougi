package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;

public class zzhq {
    private long zzGC;
    private long zzGD;
    private Object zzqt;

    public zzhq(long v) {
        this.zzGD = 0x8000000000000000L;
        this.zzqt = new Object();
        this.zzGC = v;
    }

    public boolean tryAcquire() {
        synchronized(this.zzqt) {
            long v1 = zzo.zzbz().elapsedRealtime();
            if(this.zzGD + this.zzGC > v1) {
                return false;
            }
            this.zzGD = v1;
            return true;
        }
    }
}

