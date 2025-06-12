package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzns;

public class zzf {
    private final Context mContext;
    private static zzf zzJC;
    private final Context zzJD;
    private final zzr zzJE;
    private final zzaf zzJF;
    private final zzns zzJG;
    private final zzb zzJH;
    private final zzv zzJI;
    private final zzan zzJJ;
    private final zzai zzJK;
    private final GoogleAnalytics zzJL;
    private final zzn zzJM;
    private final zza zzJN;
    private final zzk zzJO;
    private final zzu zzJP;
    private final zzlb zzpw;

    protected zzf(zzg zzg0) {
        Context context0 = zzg0.getApplicationContext();
        com.google.android.gms.common.internal.zzu.zzb(context0, "Application context can\'t be null");
        com.google.android.gms.common.internal.zzu.zzb(context0 instanceof Application, "getApplicationContext didn\'t return the application");
        Context context1 = zzg0.zzic();
        com.google.android.gms.common.internal.zzu.zzu(context1);
        this.mContext = context0;
        this.zzJD = context1;
        this.zzpw = zzg0.zzh(this);
        this.zzJE = zzg0.zzg(this);
        zzaf zzaf0 = zzg0.zzf(this);
        zzaf0.zza();
        this.zzJF = zzaf0;
        this.zzhQ().zzaV("Google Analytics 7.5.71 is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzai zzai0 = zzg0.zzq(this);
        zzai0.zza();
        this.zzJK = zzai0;
        zzan zzan0 = zzg0.zze(this);
        zzan0.zza();
        this.zzJJ = zzan0;
        zzb zzb0 = zzg0.zzl(this);
        zzn zzn0 = zzg0.zzd(this);
        zza zza0 = zzg0.zzc(this);
        zzk zzk0 = zzg0.zzb(this);
        zzu zzu0 = zzg0.zza(this);
        zzns zzns0 = zzg0.zzW(context0);
        zzns0.zza(this.zzib());
        this.zzJG = zzns0;
        GoogleAnalytics googleAnalytics0 = zzg0.zzi(this);
        zzn0.zza();
        this.zzJM = zzn0;
        zza0.zza();
        this.zzJN = zza0;
        zzk0.zza();
        this.zzJO = zzk0;
        zzu0.zza();
        this.zzJP = zzu0;
        zzv zzv0 = zzg0.zzp(this);
        zzv0.zza();
        this.zzJI = zzv0;
        zzb0.zza();
        this.zzJH = zzb0;
        googleAnalytics0.zza();
        this.zzJL = googleAnalytics0;
        zzb0.start();
    }

    public Context getContext() {
        return this.mContext;
    }

    public static zzf zzV(Context context0) {
        com.google.android.gms.common.internal.zzu.zzu(context0);
        if(zzf.zzJC == null) {
            synchronized(zzf.class) {
                if(zzf.zzJC == null) {
                    zzlb zzlb0 = zzld.zzoQ();
                    long v1 = zzlb0.elapsedRealtime();
                    zzf zzf0 = new zzf(new zzg(context0.getApplicationContext()));
                    zzf.zzJC = zzf0;
                    GoogleAnalytics.zzhj();
                    long v2 = zzlb0.elapsedRealtime() - v1;
                    long v3 = (long)(((Long)zzy.zzLP.get()));
                    if(v2 > v3) {
                        zzf0.zzhQ().zzc("Slow initialization (ms)", v2, v3);
                    }
                }
            }
        }
        return zzf.zzJC;
    }

    private void zza(zzd zzd0) {
        com.google.android.gms.common.internal.zzu.zzb(zzd0, "Analytics service not created/initialized");
        com.google.android.gms.common.internal.zzu.zzb(zzd0.isInitialized(), "Analytics service not initialized");
    }

    public void zzhO() {
        zzns.zzhO();
    }

    public zzlb zzhP() {
        return this.zzpw;
    }

    public zzaf zzhQ() {
        this.zza(this.zzJF);
        return this.zzJF;
    }

    public zzr zzhR() {
        return this.zzJE;
    }

    public zzns zzhS() {
        com.google.android.gms.common.internal.zzu.zzu(this.zzJG);
        return this.zzJG;
    }

    public zzv zzhT() {
        this.zza(this.zzJI);
        return this.zzJI;
    }

    public zzai zzhU() {
        this.zza(this.zzJK);
        return this.zzJK;
    }

    public zzk zzhX() {
        this.zza(this.zzJO);
        return this.zzJO;
    }

    public zzu zzhY() {
        return this.zzJP;
    }

    public zzb zzhl() {
        this.zza(this.zzJH);
        return this.zzJH;
    }

    public zzan zzhm() {
        this.zza(this.zzJJ);
        return this.zzJJ;
    }

    protected Thread.UncaughtExceptionHandler zzib() {
        return new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable error) {
                zzaf zzaf0 = zzf.this.zzid();
                if(zzaf0 != null) {
                    zzaf0.zze("Job execution failed", error);
                }
            }
        };
    }

    public Context zzic() {
        return this.zzJD;
    }

    public zzaf zzid() {
        return this.zzJF;
    }

    public GoogleAnalytics zzie() {
        com.google.android.gms.common.internal.zzu.zzu(this.zzJL);
        com.google.android.gms.common.internal.zzu.zzb(this.zzJL.isInitialized(), "Analytics instance not initialized");
        return this.zzJL;
    }

    // 去混淆评级： 低(20)
    public zzai zzif() {
        return this.zzJK != null && this.zzJK.isInitialized() ? this.zzJK : null;
    }

    public zza zzig() {
        this.zza(this.zzJN);
        return this.zzJN;
    }

    public zzn zzih() {
        this.zza(this.zzJM);
        return this.zzJM;
    }
}

