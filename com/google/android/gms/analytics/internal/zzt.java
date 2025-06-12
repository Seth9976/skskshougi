package com.google.android.gms.analytics.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzu;

abstract class zzt {
    private final zzf zzJy;
    private static volatile Handler zzKS;
    private volatile long zzKT;
    private boolean zzKU;
    private final Runnable zzx;

    zzt(zzf zzf0) {
        zzu.zzu(zzf0);
        this.zzJy = zzf0;
        this.zzx = new Runnable() {
            @Override
            public void run() {
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    zzt.this.zzJy.zzhS().zze(this);
                    return;
                }
                boolean z = zzt.this.zzbp();
                zzt.this.zzKT = 0L;
                if(z && !zzt.this.zzKU) {
                    zzt.this.run();
                }
            }
        };
    }

    public void cancel() {
        this.zzKT = 0L;
        this.getHandler().removeCallbacks(this.zzx);
    }

    private Handler getHandler() {
        if(zzt.zzKS != null) {
            return zzt.zzKS;
        }
        synchronized(zzt.class) {
            if(zzt.zzKS == null) {
                zzt.zzKS = new Handler(this.zzJy.getContext().getMainLooper());
            }
            return zzt.zzKS;
        }
    }

    public abstract void run();

    public boolean zzbp() {
        return this.zzKT != 0L;
    }

    public long zzjD() {
        return this.zzKT == 0L ? 0L : Math.abs(this.zzJy.zzhP().currentTimeMillis() - this.zzKT);
    }

    public void zzt(long v) {
        this.cancel();
        if(v >= 0L) {
            this.zzKT = this.zzJy.zzhP().currentTimeMillis();
            if(!this.getHandler().postDelayed(this.zzx, v)) {
                this.zzJy.zzhQ().zze("Failed to schedule delayed post. time", v);
            }
        }
    }

    public void zzu(long v) {
        long v1 = 0L;
        if(this.zzbp()) {
            if(v < 0L) {
                this.cancel();
                return;
            }
            long v2 = v - Math.abs(this.zzJy.zzhP().currentTimeMillis() - this.zzKT);
            if(v2 >= 0L) {
                v1 = v2;
            }
            this.getHandler().removeCallbacks(this.zzx);
            if(!this.getHandler().postDelayed(this.zzx, v1)) {
                this.zzJy.zzhQ().zze("Failed to adjust delayed post. time", v1);
            }
        }
    }
}

