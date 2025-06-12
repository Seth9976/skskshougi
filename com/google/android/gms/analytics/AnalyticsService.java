package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzw;
import com.google.android.gms.common.internal.zzu;

public final class AnalyticsService extends Service {
    private final Handler mHandler;
    private static Boolean zzIe;

    public AnalyticsService() {
        this.mHandler = new Handler();
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzf.zzV(this).zzhQ().zzaT("Local AnalyticsService is starting up");
    }

    @Override  // android.app.Service
    public void onDestroy() {
        zzf.zzV(this).zzhQ().zzaT("Local AnalyticsService is shutting down");
        super.onDestroy();
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.zzhd();
        zzf zzf0 = zzf.zzV(this);
        zzaf zzaf0 = zzf0.zzhQ();
        String s = intent.getAction();
        zzaf0.zza("Local AnalyticsService called. startId, action", startId, s);
        if("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(s)) {
            zzf0.zzhl().zza(new zzw() {
                @Override  // com.google.android.gms.analytics.internal.zzw
                public void zzc(Throwable throwable0) {
                    AnalyticsService.this.mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            if(!AnalyticsService.this.stopSelfResult(com.google.android.gms.analytics.AnalyticsService.1.this.zzIf)) {
                                return;
                            }
                            com.google.android.gms.analytics.AnalyticsService.1.this.zzIh.zzaT("Local AnalyticsService processed last dispatch request");
                        }
                    });
                }
            });
        }
        return 2;
    }

    public static boolean zzU(Context context0) {
        zzu.zzu(context0);
        if(AnalyticsService.zzIe != null) {
            return AnalyticsService.zzIe.booleanValue();
        }
        boolean z = zzam.zza(context0, AnalyticsService.class);
        AnalyticsService.zzIe = Boolean.valueOf(z);
        return z;
    }

    private void zzhd() {
        try {
            Object object0 = AnalyticsReceiver.zzoW;
            synchronized(object0) {
                PowerManager.WakeLock powerManager$WakeLock0 = AnalyticsReceiver.zzIc;
                if(powerManager$WakeLock0 != null && powerManager$WakeLock0.isHeld()) {
                    powerManager$WakeLock0.release();
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
    }
}

