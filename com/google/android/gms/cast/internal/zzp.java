package com.google.android.gms.cast.internal;

import android.os.SystemClock;

public final class zzp {
    private static final zzl zzQW;
    private long zzTM;
    private long zzVo;
    private long zzVp;
    private zzo zzVq;
    public static final Object zzVr;

    static {
        zzp.zzQW = new zzl("RequestTracker");
        zzp.zzVr = new Object();
    }

    public zzp(long v) {
        this.zzVo = v;
        this.zzTM = -1L;
        this.zzVp = 0L;
    }

    public void clear() {
        synchronized(zzp.zzVr) {
            if(this.zzTM != -1L) {
                this.zzmd();
            }
        }
    }

    public boolean zzB(long v) {
        synchronized(zzp.zzVr) {
        }
        return this.zzTM != -1L && this.zzTM == v;
    }

    public void zza(long v, zzo zzo0) {
        long v2;
        zzo zzo1;
        synchronized(zzp.zzVr) {
            zzo1 = this.zzVq;
            v2 = this.zzTM;
            this.zzTM = v;
            this.zzVq = zzo0;
            this.zzVp = SystemClock.elapsedRealtime();
        }
        if(zzo1 != null) {
            zzo1.zzy(v2);
        }
    }

    public boolean zzc(long v, int v1) {
        return this.zzc(v, v1, null);
    }

    public boolean zzc(long v, int v1, Object object0) {
        boolean z = true;
        zzo zzo0 = null;
        synchronized(zzp.zzVr) {
            if(this.zzTM == -1L || this.zzTM != v) {
                z = false;
            }
            else {
                zzp.zzQW.zzb("request %d completed", new Object[]{this.zzTM});
                zzo0 = this.zzVq;
                this.zzmd();
            }
        }
        if(zzo0 != null) {
            zzo0.zza(v, v1, object0);
        }
        return z;
    }

    public boolean zzd(long v, int v1) {
        zzo zzo0;
        boolean z = true;
        long v2 = 0L;
        synchronized(zzp.zzVr) {
            if(this.zzTM == -1L || v - this.zzVp < this.zzVo) {
                z = false;
                zzo0 = null;
            }
            else {
                zzp.zzQW.zzb("request %d timed out", new Object[]{this.zzTM});
                v2 = this.zzTM;
                zzo0 = this.zzVq;
                this.zzmd();
            }
        }
        if(zzo0 != null) {
            zzo0.zza(v2, v1, null);
        }
        return z;
    }

    private void zzmd() {
        this.zzTM = -1L;
        this.zzVq = null;
        this.zzVp = 0L;
    }

    public boolean zzme() {
        synchronized(zzp.zzVr) {
        }
        return this.zzTM != -1L;
    }
}

