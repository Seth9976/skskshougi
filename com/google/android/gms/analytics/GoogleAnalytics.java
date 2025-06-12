package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GoogleAnalytics extends zza {
    interface com.google.android.gms.analytics.GoogleAnalytics.zza {
        void zzn(Activity arg1);

        void zzo(Activity arg1);
    }

    class zzb implements Application.ActivityLifecycleCallbacks {
        final GoogleAnalytics zzIA;

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            GoogleAnalytics.this.zzl(activity);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            GoogleAnalytics.this.zzm(activity);
        }
    }

    private static List zzIt;
    private boolean zzIu;
    private Set zzIv;
    private boolean zzIw;
    private boolean zzIx;
    private volatile boolean zzIy;
    private boolean zzIz;
    private boolean zzpb;

    static {
        GoogleAnalytics.zzIt = new ArrayList();
    }

    public GoogleAnalytics(zzf context) {
        super(context);
        this.zzIv = new HashSet();
    }

    public void dispatchLocalHits() {
        this.zzhl().zzhH();
    }

    public void enableAutoActivityReports(Application application) {
        if(Build.VERSION.SDK_INT >= 14 && !this.zzIw) {
            application.registerActivityLifecycleCallbacks(new zzb(this));
            this.zzIw = true;
        }
    }

    public boolean getAppOptOut() {
        return this.zzIy;
    }

    public String getClientId() {
        zzu.zzbZ("getClientId can not be called from the main thread");
        return this.zzhb().zzih().zziP();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzf.zzV(context).zzie();
    }

    @Deprecated
    public Logger getLogger() {
        return zzae.getLogger();
    }

    public boolean isDryRunEnabled() {
        return this.zzIx;
    }

    // 去混淆评级： 低(20)
    public boolean isInitialized() {
        return this.zzpb && !this.zzIu;
    }

    public Tracker newTracker(int configResId) {
        synchronized(this) {
            Tracker tracker0 = new Tracker(this.zzhb(), null, null);
            if(configResId > 0) {
                zzal zzal0 = (zzal)new zzak(this.zzhb()).zzab(configResId);
                if(zzal0 != null) {
                    tracker0.zza(zzal0);
                }
            }
            tracker0.zza();
            return tracker0;
        }
    }

    public Tracker newTracker(String trackingId) {
        synchronized(this) {
            Tracker tracker0 = new Tracker(this.zzhb(), trackingId, null);
            tracker0.zza();
            return tracker0;
        }
    }

    public void reportActivityStart(Activity activity) {
        if(!this.zzIw) {
            this.zzl(activity);
        }
    }

    public void reportActivityStop(Activity activity) {
        if(!this.zzIw) {
            this.zzm(activity);
        }
    }

    public void setAppOptOut(boolean optOut) {
        this.zzIy = optOut;
        if(this.zzIy) {
            this.zzhl().zzhG();
        }
    }

    public void setDryRun(boolean dryRun) {
        this.zzIx = dryRun;
    }

    public void setLocalDispatchPeriod(int dispatchPeriodInSeconds) {
        this.zzhl().setLocalDispatchPeriod(dispatchPeriodInSeconds);
    }

    @Deprecated
    public void setLogger(Logger logger) {
        zzae.setLogger(logger);
        if(!this.zzIz) {
            Log.i("GAv4", "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.GAv4 DEBUG");
            this.zzIz = true;
        }
    }

    public void zza() {
        this.zzhi();
        this.zzpb = true;
    }

    void zza(com.google.android.gms.analytics.GoogleAnalytics.zza googleAnalytics$zza0) {
        this.zzIv.add(googleAnalytics$zza0);
        Context context0 = this.zzhb().getContext();
        if(context0 instanceof Application) {
            this.enableAutoActivityReports(((Application)context0));
        }
    }

    void zzb(com.google.android.gms.analytics.GoogleAnalytics.zza googleAnalytics$zza0) {
        this.zzIv.remove(googleAnalytics$zza0);
    }

    void zzhi() {
        zzan zzan0 = this.zzhm();
        if(zzan0.zzjO()) {
            this.getLogger().setLogLevel(zzan0.getLogLevel());
        }
        if(zzan0.zzjS()) {
            this.setDryRun(zzan0.zzjT());
        }
        if(zzan0.zzjO()) {
            Logger logger0 = zzae.getLogger();
            if(logger0 != null) {
                logger0.setLogLevel(zzan0.getLogLevel());
            }
        }
    }

    public static void zzhj() {
        synchronized(GoogleAnalytics.class) {
            if(GoogleAnalytics.zzIt != null) {
                for(Object object0: GoogleAnalytics.zzIt) {
                    ((Runnable)object0).run();
                }
                GoogleAnalytics.zzIt = null;
            }
        }
    }

    void zzhk() {
        this.zzhl().zzhI();
    }

    private com.google.android.gms.analytics.internal.zzb zzhl() {
        return this.zzhb().zzhl();
    }

    private zzan zzhm() {
        return this.zzhb().zzhm();
    }

    void zzl(Activity activity0) {
        for(Object object0: this.zzIv) {
            ((com.google.android.gms.analytics.GoogleAnalytics.zza)object0).zzn(activity0);
        }
    }

    void zzm(Activity activity0) {
        for(Object object0: this.zzIv) {
            ((com.google.android.gms.analytics.GoogleAnalytics.zza)object0).zzo(activity0);
        }
    }
}

