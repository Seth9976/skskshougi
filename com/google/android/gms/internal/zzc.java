package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public class zzc extends Thread {
    private static final boolean DEBUG;
    private final BlockingQueue zzh;
    private final BlockingQueue zzi;
    private final zzb zzj;
    private final zzn zzk;
    private volatile boolean zzl;

    static {
        zzc.DEBUG = zzs.DEBUG;
    }

    public zzc(BlockingQueue blockingQueue0, BlockingQueue blockingQueue1, zzb zzb0, zzn zzn0) {
        this.zzl = false;
        this.zzh = blockingQueue0;
        this.zzi = blockingQueue1;
        this.zzj = zzb0;
        this.zzk = zzn0;
    }

    public void quit() {
        this.zzl = true;
        this.interrupt();
    }

    @Override
    public void run() {
        if(zzc.DEBUG) {
            zzs.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzj.zza();
        while(true) {
            try {
            label_4:
                zzk zzk0 = (zzk)this.zzh.take();
                zzk0.zzc("cache-queue-take");
                if(zzk0.isCanceled()) {
                    zzk0.zzd("cache-discard-canceled");
                    goto label_4;
                }
                String s = zzk0.zzh();
                zza zzb$zza0 = this.zzj.zza(s);
                if(zzb$zza0 == null) {
                    zzk0.zzc("cache-miss");
                    this.zzi.put(zzk0);
                    goto label_4;
                }
                if(zzb$zza0.zzb()) {
                    zzk0.zzc("cache-hit-expired");
                    zzk0.zza(zzb$zza0);
                    this.zzi.put(zzk0);
                    goto label_4;
                }
                zzk0.zzc("cache-hit");
                zzm zzm0 = zzk0.zza(new zzi(zzb$zza0.data, zzb$zza0.zzg));
                zzk0.zzc("cache-hit-parsed");
                if(!zzb$zza0.zzc()) {
                    this.zzk.zza(zzk0, zzm0);
                    goto label_4;
                }
                zzk0.zzc("cache-hit-refresh-needed");
                zzk0.zza(zzb$zza0);
                zzm0.zzai = true;
                com.google.android.gms.internal.zzc.1 zzc$10 = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            zzc.this.zzi.put(zzk0);
                        }
                        catch(InterruptedException unused_ex) {
                        }
                    }
                };
                this.zzk.zza(zzk0, zzm0, zzc$10);
                goto label_4;
            }
            catch(InterruptedException unused_ex) {
            }
            if(!this.zzl) {
                goto label_4;
            }
            break;
        }
    }
}

