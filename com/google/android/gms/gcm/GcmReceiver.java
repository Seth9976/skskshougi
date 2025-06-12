package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;

public class GcmReceiver extends WakefulBroadcastReceiver {
    private static String zzavK;

    static {
        GcmReceiver.zzavK = "google.com/iid";
    }

    public void onReceive(Context context, Intent intent) {
        intent.setComponent(null);
        intent.setPackage("org.dyndns.vivi.SkskShogi");
        if(Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory("org.dyndns.vivi.SkskShogi");
        }
        if("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()) || "google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String s = intent.getStringExtra("gcm.rawData64");
        if(s != null) {
            intent.putExtra("rawData", Base64.decode(s, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            this.zzc(context, intent);
        }
        else {
            GcmReceiver.startWakefulService(context, intent);
        }
        if(this.isOrderedBroadcast()) {
            this.setResultCode(-1);
        }
    }

    public void zzc(Context context0, Intent intent0) {
        GcmReceiver.startWakefulService(context0, intent0);
    }
}

