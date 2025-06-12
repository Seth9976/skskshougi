package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@zzgd
public final class zzhk {
    private static final ExecutorService zzGe;
    private static final ExecutorService zzGf;

    static {
        zzhk.zzGe = Executors.newFixedThreadPool(10, zzhk.zzas("Default"));
        zzhk.zzGf = Executors.newFixedThreadPool(5, zzhk.zzas("Loader"));
    }

    public static zzhv zza(int v, Runnable runnable0) {
        if(v == 1) {
            com.google.android.gms.internal.zzhk.1 zzhk$10 = new Callable() {
                public Void zzgk() {
                    runnable0.run();
                    return null;
                }
            };
            return zzhk.zza(zzhk.zzGf, zzhk$10);
        }
        com.google.android.gms.internal.zzhk.2 zzhk$20 = new Callable() {
            public Void zzgk() {
                runnable0.run();
                return null;
            }
        };
        return zzhk.zza(zzhk.zzGe, zzhk$20);
    }

    public static zzhv zza(Runnable runnable0) {
        return zzhk.zza(0, runnable0);
    }

    public static zzhv zza(Callable callable0) {
        return zzhk.zza(zzhk.zzGe, callable0);
    }

    public static zzhv zza(ExecutorService executorService0, Callable callable0) {
        zzhv zzhv0 = new zzhs();
        try {
            executorService0.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        Object object0 = callable0.call();
                        ((zzhs)zzhv0).zzf(object0);
                    }
                    catch(Exception exception0) {
                        zzo.zzby().zzc(exception0, true);
                        ((zzhs)zzhv0).cancel(true);
                    }
                }
            });
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            zzb.zzd("Thread execution is rejected.", rejectedExecutionException0);
            ((zzhs)zzhv0).cancel(true);
        }
        return zzhv0;
    }

    private static ThreadFactory zzas(String s) {
        return new ThreadFactory() {
            private final AtomicInteger zzGi;

            {
                String s = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.zzGi = new AtomicInteger(1);
            }

            @Override
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AdWorker(" + s + ") #" + this.zzGi.getAndIncrement());
            }
        };
    }
}

