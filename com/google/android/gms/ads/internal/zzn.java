package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhl;
import java.lang.ref.WeakReference;

@zzgd
public class zzn {
    public static class zza {
        private final Handler mHandler;

        public zza(Handler handler0) {
            this.mHandler = handler0;
        }

        public boolean postDelayed(Runnable runnable, long timeFromNowInMillis) {
            return this.mHandler.postDelayed(runnable, timeFromNowInMillis);
        }

        public void removeCallbacks(Runnable runnable) {
            this.mHandler.removeCallbacks(runnable);
        }
    }

    private final zza zzpg;
    private AdRequestParcel zzph;
    private boolean zzpi;
    private boolean zzpj;
    private long zzpk;
    private final Runnable zzx;

    public zzn(com.google.android.gms.ads.internal.zza zza0) {
        this(zza0, new zza(zzhl.zzGk));
    }

    zzn(com.google.android.gms.ads.internal.zza zza0, zza zzn$zza0) {
        this.zzpi = false;
        this.zzpj = false;
        this.zzpk = 0L;
        this.zzpg = zzn$zza0;
        this.zzx = new Runnable() {
            @Override
            public void run() {
                zzn.this.zzpi = false;
                com.google.android.gms.ads.internal.zza zza0 = (com.google.android.gms.ads.internal.zza)new WeakReference(zza0).get();
                if(zza0 != null) {
                    zza0.zzd(zzn.this.zzph);
                }
            }
        };
    }

    public void cancel() {
        this.zzpi = false;
        this.zzpg.removeCallbacks(this.zzx);
    }

    public void pause() {
        this.zzpj = true;
        if(this.zzpi) {
            this.zzpg.removeCallbacks(this.zzx);
        }
    }

    public void resume() {
        this.zzpj = false;
        if(this.zzpi) {
            this.zzpi = false;
            this.zza(this.zzph, this.zzpk);
        }
    }

    public void zza(AdRequestParcel adRequestParcel0, long v) {
        if(this.zzpi) {
            zzb.zzaC("An ad refresh is already scheduled.");
            return;
        }
        this.zzph = adRequestParcel0;
        this.zzpi = true;
        this.zzpk = v;
        if(!this.zzpj) {
            zzb.zzaA(("Scheduling ad refresh " + v + " milliseconds from now."));
            this.zzpg.postDelayed(this.zzx, v);
        }
    }

    public boolean zzbp() {
        return this.zzpi;
    }

    public void zzf(AdRequestParcel adRequestParcel0) {
        this.zza(adRequestParcel0, 60000L);
    }
}

