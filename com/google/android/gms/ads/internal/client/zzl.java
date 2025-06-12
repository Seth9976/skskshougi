package com.google.android.gms.ads.internal.client;

import java.util.Random;

public class zzl extends zza {
    private Object zzqt;
    private long zzsA;
    private final Random zzsz;

    public zzl() {
        this.zzqt = new Object();
        this.zzsz = new Random();
        this.zzcG();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzu
    public long getValue() {
        return this.zzsA;
    }

    public void zzcG() {
        Object object0 = this.zzqt;
        __monitor_enter(object0);
        int v = 3;
        long v1 = 0L;
        try {
            do {
                --v;
                if(v <= 0) {
                    break;
                }
                v1 = ((long)this.zzsz.nextInt()) + 0x80000000L;
            }
            while(v1 == this.zzsA || v1 == 0L);
            this.zzsA = v1;
        }
        finally {
            __monitor_exit(object0);
        }
    }
}

