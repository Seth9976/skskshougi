package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class zzg extends Thread {
    private final zzb zzj;
    private final zzn zzk;
    private volatile boolean zzl;
    private final BlockingQueue zzy;
    private final zzf zzz;

    public zzg(BlockingQueue blockingQueue0, zzf zzf0, zzb zzb0, zzn zzn0) {
        this.zzl = false;
        this.zzy = blockingQueue0;
        this.zzz = zzf0;
        this.zzj = zzb0;
        this.zzk = zzn0;
    }

    public void quit() {
        this.zzl = true;
        this.interrupt();
    }

    @Override
    public void run() {
        zzk zzk0;
        Process.setThreadPriority(10);
        while(true) {
            long v = SystemClock.elapsedRealtime();
            try {
                zzk0 = (zzk)this.zzy.take();
            }
            catch(InterruptedException unused_ex) {
                if(!this.zzl) {
                    continue;
                }
                return;
            }
            try {
                zzk0.zzc("network-queue-take");
                if(!zzk0.isCanceled()) {
                    this.zzb(zzk0);
                    zzi zzi0 = this.zzz.zza(zzk0);
                    zzk0.zzc("network-http-complete");
                    if(!zzi0.zzB || !zzk0.zzw()) {
                        zzm zzm0 = zzk0.zza(zzi0);
                        zzk0.zzc("network-parse-complete");
                        if(zzk0.zzr() && zzm0.zzag != null) {
                            String s = zzk0.zzh();
                            this.zzj.zza(s, zzm0.zzag);
                            zzk0.zzc("network-cache-written");
                        }
                        zzk0.zzv();
                        this.zzk.zza(zzk0, zzm0);
                    }
                    else {
                        zzk0.zzd("not-modified");
                    }
                    continue;
                }
                zzk0.zzd("network-discard-cancelled");
            }
            catch(zzr zzr0) {
                zzr0.zza(SystemClock.elapsedRealtime() - v);
                this.zzb(zzk0, zzr0);
            }
            catch(Exception exception0) {
                zzs.zza(exception0, "Unhandled exception %s", new Object[]{exception0.toString()});
                zzr zzr1 = new zzr(exception0);
                zzr1.zza(SystemClock.elapsedRealtime() - v);
                this.zzk.zza(zzk0, zzr1);
            }
        }
    }

    private void zzb(zzk zzk0) {
        if(Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(zzk0.zzg());
        }
    }

    private void zzb(zzk zzk0, zzr zzr0) {
        this.zzk.zza(zzk0, zzr0);
    }
}

