package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzu;

public class CampaignTrackingService extends Service {
    private Handler mHandler;
    private static Boolean zzIe;

    private Handler getHandler() {
        Handler handler0 = this.mHandler;
        if(handler0 == null) {
            handler0 = new Handler(this.getMainLooper());
            this.mHandler = handler0;
        }
        return handler0;
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzf.zzV(this).zzhQ().zzaT("CampaignTrackingService is starting up");
    }

    @Override  // android.app.Service
    public void onDestroy() {
        zzf.zzV(this).zzhQ().zzaT("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.zzhd();
        zzf zzf0 = zzf.zzV(this);
        zzaf zzaf0 = zzf0.zzhQ();
        String s = intent.getStringExtra("referrer");
        Handler handler0 = this.getHandler();
        if(TextUtils.isEmpty(s)) {
            zzaf0.zzaW("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            zzf0.zzhS().zze(() -> {
                this.zzt.post(new Runnable() {
                    @Override
                    public void run() {
                        if(CampaignTrackingService.this.stopSelfResult(this.zzIf)) {
                            this.zzIh.zza("Install campaign broadcast processed", Boolean.TRUE);
                        }
                    }
                });
            });
            return 2;
        }
        int v2 = zzf0.zzhR().zzja();
        if(s.length() > v2) {
            zzaf0.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", s.length(), v2);
            s = s.substring(0, v2);
        }
        zzaf0.zza("CampaignTrackingService called. startId, campaign", startId, s);
        zzf0.zzhl().zza(s, () -> {
            this.zzt.post(new Runnable() {
                @Override
                public void run() {
                    if(CampaignTrackingService.this.stopSelfResult(this.zzIf)) {
                        this.zzIh.zza("Install campaign broadcast processed", Boolean.TRUE);
                    }
                }
            });
        });
        return 2;

        class com.google.android.gms.analytics.CampaignTrackingService.1 implements Runnable {
            com.google.android.gms.analytics.CampaignTrackingService.1(zzaf zzaf0, Handler handler0, int v) {
            }

            @Override
            public void run() {
                CampaignTrackingService.this.zza(this.zzIh, this.zzt, this.zzIf);
            }
        }


        class com.google.android.gms.analytics.CampaignTrackingService.2 implements Runnable {
            com.google.android.gms.analytics.CampaignTrackingService.2(zzaf zzaf0, Handler handler0, int v) {
            }

            @Override
            public void run() {
                CampaignTrackingService.this.zza(this.zzIh, this.zzt, this.zzIf);
            }
        }

    }

    public static boolean zzU(Context context0) {
        zzu.zzu(context0);
        if(CampaignTrackingService.zzIe != null) {
            return CampaignTrackingService.zzIe.booleanValue();
        }
        boolean z = zzam.zza(context0, CampaignTrackingService.class);
        CampaignTrackingService.zzIe = Boolean.valueOf(z);
        return z;
    }

    // 检测为 lambda 实现。
    protected void zza(zzaf zzaf0, Handler handler0, int v) {
        handler0.post(new Runnable() {
            @Override
            public void run() {
                if(CampaignTrackingService.this.stopSelfResult(v)) {
                    zzaf0.zza("Install campaign broadcast processed", Boolean.TRUE);
                }
            }
        });
    }

    private void zzhd() {
        try {
            Object object0 = CampaignTrackingReceiver.zzoW;
            synchronized(object0) {
                PowerManager.WakeLock powerManager$WakeLock0 = CampaignTrackingReceiver.zzIc;
                if(powerManager$WakeLock0 != null && powerManager$WakeLock0.isHeld()) {
                    powerManager$WakeLock0.release();
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
    }
}

