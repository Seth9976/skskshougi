package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzgd
public class zzhy implements zzhx {
    class zza {
        public final zzc zzGW;
        public final com.google.android.gms.internal.zzhx.zza zzGX;
        final zzhy zzGY;

        public zza(zzc zzhx$zzc0, com.google.android.gms.internal.zzhx.zza zzhx$zza0) {
            this.zzGW = zzhx$zzc0;
            this.zzGX = zzhx$zza0;
        }
    }

    protected final BlockingQueue zzGU;
    protected Object zzGV;
    private final Object zzqt;
    protected int zzwS;

    public zzhy() {
        this.zzqt = new Object();
        this.zzwS = 0;
        this.zzGU = new LinkedBlockingQueue();
    }

    public int getStatus() {
        return this.zzwS;
    }

    public void reject() {
        synchronized(this.zzqt) {
            if(this.zzwS != 0) {
                throw new UnsupportedOperationException();
            }
            this.zzwS = -1;
            for(Object object1: this.zzGU) {
                ((zza)object1).zzGX.run();
            }
            this.zzGU.clear();
        }
    }

    public void zza(zzc zzhx$zzc0, com.google.android.gms.internal.zzhx.zza zzhx$zza0) {
        synchronized(this.zzqt) {
            switch(this.zzwS) {
                case -1: {
                    zzhx$zza0.run();
                    break;
                }
                case 0: {
                    zza zzhy$zza0 = new zza(this, zzhx$zzc0, zzhx$zza0);
                    this.zzGU.add(zzhy$zza0);
                    break;
                }
                case 1: {
                    zzhx$zzc0.zzc(this.zzGV);
                }
            }
        }
    }

    public void zzg(Object object0) {
        synchronized(this.zzqt) {
            if(this.zzwS != 0) {
                throw new UnsupportedOperationException();
            }
            this.zzGV = object0;
            this.zzwS = 1;
            for(Object object2: this.zzGU) {
                ((zza)object2).zzGW.zzc(object0);
            }
            this.zzGU.clear();
        }
    }
}

