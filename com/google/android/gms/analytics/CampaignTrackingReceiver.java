package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzu;

public class CampaignTrackingReceiver extends BroadcastReceiver {
    static PowerManager.WakeLock zzIc;
    static Boolean zzId;
    static Object zzoW;

    static {
        CampaignTrackingReceiver.zzoW = new Object();
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zzaf zzaf0 = zzf.zzV(context).zzhQ();
        String s = intent.getStringExtra("referrer");
        String s1 = intent.getAction();
        zzaf0.zza("CampaignTrackingReceiver received", s1);
        if(!"com.android.vending.INSTALL_REFERRER".equals(s1) || TextUtils.isEmpty(s)) {
            zzaf0.zzaW("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        boolean z = CampaignTrackingService.zzU(context);
        if(!z) {
            zzaf0.zzaW("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        this.zzaL(s);
        Class class0 = this.zzhf();
        zzu.zzu(class0);
        Intent intent1 = new Intent(context, class0);
        intent1.putExtra("referrer", s);
        synchronized(CampaignTrackingReceiver.zzoW) {
            context.startService(intent1);
            if(!z) {
                return;
            }
            try {
                PowerManager powerManager0 = (PowerManager)context.getSystemService("power");
                if(CampaignTrackingReceiver.zzIc == null) {
                    CampaignTrackingReceiver.zzIc = powerManager0.newWakeLock(1, "Analytics campaign WakeLock");
                    CampaignTrackingReceiver.zzIc.setReferenceCounted(false);
                }
                CampaignTrackingReceiver.zzIc.acquire(1000L);
            }
            catch(SecurityException unused_ex) {
                zzaf0.zzaW("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
            }
        }
    }

    public static boolean zzT(Context context0) {
        zzu.zzu(context0);
        if(CampaignTrackingReceiver.zzId != null) {
            return CampaignTrackingReceiver.zzId.booleanValue();
        }
        boolean z = zzam.zza(context0, CampaignTrackingReceiver.class, true);
        CampaignTrackingReceiver.zzId = Boolean.valueOf(z);
        return z;
    }

    protected void zzaL(String s) {
    }

    protected Class zzhf() {
        return CampaignTrackingService.class;
    }
}

