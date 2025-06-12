package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzns {
    class zza extends ThreadPoolExecutor {
        final zzns zzaEn;

        public zza() {
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            this.setThreadFactory(new zzb(null));
        }

        @Override
        protected RunnableFuture newTaskFor(Runnable runnable, Object object0) {
            return new FutureTask(runnable, object0) {
                @Override
                protected void setException(Throwable error) {
                    Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = zzns.this.zzaEl;
                    if(thread$UncaughtExceptionHandler0 != null) {
                        thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), error);
                    }
                    else if(Log.isLoggable("GAv4", 6)) {
                        Log.e("GAv4", "MeasurementExecutor: job failed with " + error);
                    }
                    super.setException(error);
                }
            };
        }
    }

    static class zzb implements ThreadFactory {
        private static final AtomicInteger zzaEp;

        static {
            zzb.zzaEp = new AtomicInteger();
        }

        private zzb() {
        }

        zzb(com.google.android.gms.internal.zzns.1 zzns$10) {
        }

        @Override
        public Thread newThread(Runnable target) {
            return new zzc(target, "measurement-" + zzb.zzaEp.incrementAndGet());
        }
    }

    static class zzc extends Thread {
        zzc(Runnable runnable0, String s) {
            super(runnable0, s);
        }

        @Override
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private final Context mContext;
    private volatile zznx zzKm;
    private static volatile zzns zzaEh;
    private final List zzaEi;
    private final zznn zzaEj;
    private final zza zzaEk;
    private Thread.UncaughtExceptionHandler zzaEl;

    zzns(Context context0) {
        Context context1 = context0.getApplicationContext();
        zzu.zzu(context1);
        this.mContext = context1;
        this.zzaEk = new zza(this);
        this.zzaEi = new CopyOnWriteArrayList();
        this.zzaEj = new zznn();
    }

    public Context getContext() {
        return this.mContext;
    }

    public void zza(Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.zzaEl = thread$UncaughtExceptionHandler0;
    }

    public static zzns zzaB(Context context0) {
        zzu.zzu(context0);
        if(zzns.zzaEh == null) {
            synchronized(zzns.class) {
                if(zzns.zzaEh == null) {
                    zzns.zzaEh = new zzns(context0);
                }
            }
        }
        return zzns.zzaEh;
    }

    private void zzb(zzno zzno0) {
        zzu.zzbZ("deliver should be called from worker thread");
        zzu.zzb(zzno0.zzvU(), "Measurement must be submitted");
        List list0 = zzno0.zzvR();
        if(!list0.isEmpty()) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                zznu zznu0 = (zznu)object0;
                Uri uri0 = zznu0.zzhe();
                if(!hashSet0.contains(uri0)) {
                    hashSet0.add(uri0);
                    zznu0.zzb(zzno0);
                }
            }
        }
    }

    public Future zzb(Callable callable0) {
        zzu.zzu(callable0);
        if(Thread.currentThread() instanceof zzc) {
            Future future0 = new FutureTask(callable0);
            ((FutureTask)future0).run();
            return future0;
        }
        return this.zzaEk.submit(callable0);
    }

    void zze(zzno zzno0) {
        if(zzno0.zzvY()) {
            throw new IllegalStateException("Measurement prototype can\'t be submitted");
        }
        if(zzno0.zzvU()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        zzno zzno1 = zzno0.zzvP();
        zzno1.zzvV();
        com.google.android.gms.internal.zzns.1 zzns$10 = new Runnable() {
            @Override
            public void run() {
                zzno1.zzvW().zza(zzno1);
                for(Object object0: zzns.this.zzaEi) {
                    ((zznt)object0).zza(zzno1);
                }
                zzns.this.zzb(zzno1);
            }
        };
        this.zzaEk.execute(zzns$10);
    }

    public void zze(Runnable runnable0) {
        zzu.zzu(runnable0);
        this.zzaEk.submit(runnable0);
    }

    public static void zzhO() {
        if(!(Thread.currentThread() instanceof zzc)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public zznx zzwc() {
        if(this.zzKm == null) {
            synchronized(this) {
                if(this.zzKm == null) {
                    zznx zznx0 = new zznx();
                    PackageManager packageManager0 = this.mContext.getPackageManager();
                    String s = "org.dyndns.vivi.SkskShogi";
                    zznx0.setAppId("org.dyndns.vivi.SkskShogi");
                    zznx0.setAppInstallerId(packageManager0.getInstallerPackageName("org.dyndns.vivi.SkskShogi"));
                    String s1 = null;
                    try {
                        PackageInfo packageInfo0 = packageManager0.getPackageInfo("org.dyndns.vivi.SkskShogi", 0);
                        if(packageInfo0 != null) {
                            CharSequence charSequence0 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo);
                            if(!TextUtils.isEmpty(charSequence0)) {
                                s = charSequence0.toString();
                            }
                            s1 = packageInfo0.versionName;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        Log.e("GAv4", "Error retrieving package info: appName set to org.dyndns.vivi.SkskShogi");
                    }
                    zznx0.setAppName(s);
                    zznx0.setAppVersion(s1);
                    this.zzKm = zznx0;
                }
            }
        }
        return this.zzKm;
    }

    public zznz zzwd() {
        DisplayMetrics displayMetrics0 = this.mContext.getResources().getDisplayMetrics();
        zznz zznz0 = new zznz();
        zznz0.setLanguage(zzam.zza(Locale.getDefault()));
        zznz0.zzhG(displayMetrics0.widthPixels);
        zznz0.zzhH(displayMetrics0.heightPixels);
        return zznz0;
    }
}

