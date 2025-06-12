package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public class zze implements zzn {
    class zza implements Runnable {
        final zze zzu;
        private final zzk zzv;
        private final zzm zzw;
        private final Runnable zzx;

        public zza(zzk zzk0, zzm zzm0, Runnable runnable0) {
            this.zzv = zzk0;
            this.zzw = zzm0;
            this.zzx = runnable0;
        }

        @Override
        public void run() {
            if(this.zzv.isCanceled()) {
                this.zzv.zzd("canceled-at-delivery");
                return;
            }
            if(this.zzw.isSuccess()) {
                this.zzv.zza(this.zzw.result);
            }
            else {
                this.zzv.zzc(this.zzw.zzah);
            }
            if(this.zzw.zzai) {
                this.zzv.zzc("intermediate-response");
            }
            else {
                this.zzv.zzd("done");
            }
            if(this.zzx != null) {
                this.zzx.run();
            }
        }
    }

    private final Executor zzs;

    public zze(Handler handler0) {
        this.zzs = new Executor() {
            @Override
            public void execute(Runnable command) {
                handler0.post(command);
            }
        };
    }

    @Override  // com.google.android.gms.internal.zzn
    public void zza(zzk zzk0, zzm zzm0) {
        this.zza(zzk0, zzm0, null);
    }

    @Override  // com.google.android.gms.internal.zzn
    public void zza(zzk zzk0, zzm zzm0, Runnable runnable0) {
        zzk0.zzv();
        zzk0.zzc("post-response");
        zza zze$zza0 = new zza(this, zzk0, zzm0, runnable0);
        this.zzs.execute(zze$zza0);
    }

    @Override  // com.google.android.gms.internal.zzn
    public void zza(zzk zzk0, zzr zzr0) {
        zzk0.zzc("post-error");
        zza zze$zza0 = new zza(this, zzk0, zzm.zzd(zzr0), null);
        this.zzs.execute(zze$zza0);
    }
}

