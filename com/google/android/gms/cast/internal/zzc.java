package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public abstract class zzc extends zzd {
    class zza implements Runnable {
        final zzc zzUh;

        private zza() {
        }

        zza(com.google.android.gms.cast.internal.zzc.1 zzc$10) {
        }

        @Override
        public void run() {
            zzc.this.zzUg = false;
            long v = SystemClock.elapsedRealtime();
            boolean z = zzc.this.zzz(v);
            zzc.this.zzQ(z);
        }
    }

    protected final Handler mHandler;
    protected final long zzUe;
    protected final Runnable zzUf;
    protected boolean zzUg;

    public zzc(String s, String s1, String s2) {
        this(s, s1, s2, 1000L);
    }

    public zzc(String s, String s1, String s2, long v) {
        super(s, s1, s2);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.zzUf = new zza(this, null);
        this.zzUe = v;
        this.zzQ(false);
    }

    protected final void zzQ(boolean z) {
        if(this.zzUg != z) {
            this.zzUg = z;
            if(z) {
                this.mHandler.postDelayed(this.zzUf, this.zzUe);
                return;
            }
            this.mHandler.removeCallbacks(this.zzUf);
        }
    }

    @Override  // com.google.android.gms.cast.internal.zzd
    public void zzlJ() {
        this.zzQ(false);
    }

    protected abstract boolean zzz(long arg1);

    class com.google.android.gms.cast.internal.zzc.1 {
    }

}

