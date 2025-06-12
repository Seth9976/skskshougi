package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

class zzbl extends BroadcastReceiver {
    static final String zzMo;
    private final zzct zzaMo;

    static {
        zzbl.zzMo = "com.google.android.gms.tagmanager.zzbl";
    }

    zzbl(zzct zzct0) {
        this.zzaMo = zzct0;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context ctx, Intent intent) {
        String s = intent.getAction();
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            Boolean boolean0 = intent.getExtras() == null ? Boolean.FALSE : Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            this.zzaMo.zzao(!boolean0.booleanValue());
            return;
        }
        if("com.google.analytics.RADIO_POWERED".equals(s) && !intent.hasExtra("com.google.android.gms.tagmanager.zzbl")) {
            this.zzaMo.zzhK();
        }
    }

    public void zzaI(Context context0) {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context0.registerReceiver(this, intentFilter0);
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("com.google.analytics.RADIO_POWERED");
        intentFilter1.addCategory("org.dyndns.vivi.SkskShogi");
        context0.registerReceiver(this, intentFilter1);
    }

    public static void zzaJ(Context context0) {
        Intent intent0 = new Intent("com.google.analytics.RADIO_POWERED");
        intent0.addCategory("org.dyndns.vivi.SkskShogi");
        intent0.putExtra("com.google.android.gms.tagmanager.zzbl", true);
        context0.sendBroadcast(intent0);
    }
}

