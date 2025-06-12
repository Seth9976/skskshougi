package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzu;

class zzag extends BroadcastReceiver {
    private final zzf zzJy;
    static final String zzMo;
    private boolean zzMp;
    private boolean zzMq;

    static {
        zzag.zzMo = "com.google.android.gms.analytics.internal.zzag";
    }

    zzag(zzf zzf0) {
        zzu.zzu(zzf0);
        this.zzJy = zzf0;
    }

    private Context getContext() {
        return this.zzJy.getContext();
    }

    public boolean isConnected() {
        if(!this.zzMp) {
            this.zzJy.zzhQ().zzaW("Connectivity unknown. Receiver not registered");
        }
        return this.zzMq;
    }

    public boolean isRegistered() {
        return this.zzMp;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context ctx, Intent intent) {
        this.zzke();
        String s = intent.getAction();
        this.zzJy.zzhQ().zza("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = this.zzkg();
            if(this.zzMq == z) {
                return;
            }
            this.zzMq = z;
            this.zzhl().zzG(z);
            return;
        }
        if("com.google.analytics.RADIO_POWERED".equals(s)) {
            if(!intent.hasExtra("com.google.android.gms.analytics.internal.zzag")) {
                this.zzhl().zzhK();
                return;
            }
            return;
        }
        this.zzJy.zzhQ().zzd("NetworkBroadcastReceiver received unknown action", s);
    }

    public void unregister() {
        if(!this.isRegistered()) {
            return;
        }
        this.zzJy.zzhQ().zzaT("Unregistering connectivity change receiver");
        this.zzMp = false;
        this.zzMq = false;
        Context context0 = this.getContext();
        try {
            context0.unregisterReceiver(this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.zzhQ().zze("Failed to unregister the network broadcast receiver", illegalArgumentException0);
        }
    }

    private zzaf zzhQ() {
        return this.zzJy.zzhQ();
    }

    private zzb zzhl() {
        return this.zzJy.zzhl();
    }

    public void zzkd() {
        this.zzke();
        if(this.zzMp) {
            return;
        }
        Context context0 = this.getContext();
        context0.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter0 = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter0.addCategory("org.dyndns.vivi.SkskShogi");
        context0.registerReceiver(this, intentFilter0);
        this.zzMq = this.zzkg();
        this.zzJy.zzhQ().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzMq));
        this.zzMp = true;
    }

    private void zzke() {
        this.zzhQ();
        this.zzhl();
    }

    public void zzkf() {
        if(Build.VERSION.SDK_INT <= 10) {
            return;
        }
        Context context0 = this.getContext();
        Intent intent0 = new Intent("com.google.analytics.RADIO_POWERED");
        intent0.addCategory("org.dyndns.vivi.SkskShogi");
        intent0.putExtra("com.google.android.gms.analytics.internal.zzag", true);
        context0.sendOrderedBroadcast(intent0, null);
    }

    protected boolean zzkg() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.getContext().getSystemService("connectivity");
        try {
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                return true;
            }
        }
        catch(SecurityException unused_ex) {
        }
        return false;
    }
}

