package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzu;

public final class AnalyticsReceiver extends BroadcastReceiver {
    static PowerManager.WakeLock zzIc;
    static Boolean zzId;
    static Object zzoW;

    static {
        AnalyticsReceiver.zzoW = new Object();
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zzaf zzaf0 = zzf.zzV(context).zzhQ();
        String s = intent.getAction();
        zzaf0.zza("Local AnalyticsReceiver got", s);
        if("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(s)) {
            boolean z = AnalyticsService.zzU(context);
            Intent intent1 = new Intent(context, AnalyticsService.class);
            intent1.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized(AnalyticsReceiver.zzoW) {
                context.startService(intent1);
                if(!z) {
                    return;
                }
                try {
                    PowerManager powerManager0 = (PowerManager)context.getSystemService("power");
                    if(AnalyticsReceiver.zzIc == null) {
                        AnalyticsReceiver.zzIc = powerManager0.newWakeLock(1, "Analytics WakeLock");
                        AnalyticsReceiver.zzIc.setReferenceCounted(false);
                    }
                    AnalyticsReceiver.zzIc.acquire(1000L);
                }
                catch(SecurityException unused_ex) {
                    zzaf0.zzaW("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }

    public static boolean zzT(Context context0) {
        zzu.zzu(context0);
        if(AnalyticsReceiver.zzId != null) {
            return AnalyticsReceiver.zzId.booleanValue();
        }
        boolean z = zzam.zza(context0, AnalyticsReceiver.class, false);
        AnalyticsReceiver.zzId = Boolean.valueOf(z);
        return z;
    }
}

