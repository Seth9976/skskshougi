package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.zzhl;

class zzm implements Runnable {
    private boolean zzAq;
    private zzh zzzl;

    zzm(zzh zzh0) {
        this.zzAq = false;
        this.zzzl = zzh0;
    }

    public void cancel() {
        this.zzAq = true;
        zzhl.zzGk.removeCallbacks(this);
    }

    @Override
    public void run() {
        if(!this.zzAq) {
            this.zzzl.zzeL();
            this.zzeY();
        }
    }

    public void zzeY() {
        zzhl.zzGk.postDelayed(this, 0xFAL);
    }
}

