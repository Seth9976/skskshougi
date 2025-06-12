package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.List;

class zzhw {
    private final Object zzGQ;
    private final List zzGR;
    private final List zzGS;
    private boolean zzGT;

    public zzhw() {
        this.zzGQ = new Object();
        this.zzGR = new ArrayList();
        this.zzGS = new ArrayList();
        this.zzGT = false;
    }

    public void zzb(Runnable runnable0) {
        synchronized(this.zzGQ) {
            if(this.zzGT) {
                this.zzc(runnable0);
            }
            else {
                this.zzGR.add(runnable0);
            }
        }
    }

    private void zzc(Runnable runnable0) {
        zzhk.zza(runnable0);
    }

    private void zzd(Runnable runnable0) {
        zza.zzGF.post(runnable0);
    }

    public void zzgy() {
        synchronized(this.zzGQ) {
            if(this.zzGT) {
                return;
            }
            for(Object object1: this.zzGR) {
                this.zzc(((Runnable)object1));
            }
            for(Object object2: this.zzGS) {
                this.zzd(((Runnable)object2));
            }
            this.zzGR.clear();
            this.zzGS.clear();
            this.zzGT = true;
        }
    }
}

