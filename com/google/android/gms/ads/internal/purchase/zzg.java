package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzfi.zza;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class zzg extends zza implements ServiceConnection {
    private Context mContext;
    zzb zzAE;
    private String zzAK;
    private zzf zzAO;
    private boolean zzAU;
    private int zzAV;
    private Intent zzAW;

    public zzg(Context context0, String s, boolean z, int v, Intent intent0, zzf zzf0) {
        this.zzAK = s;
        this.zzAV = v;
        this.zzAW = intent0;
        this.zzAU = z;
        this.mContext = context0;
        this.zzAO = zzf0;
    }

    @Override  // com.google.android.gms.internal.zzfi
    public void finishPurchase() {
        int v = zzo.zzbF().zzd(this.zzAW);
        if(this.zzAV != -1 || v != 0) {
            return;
        }
        this.zzAE = new zzb(this.mContext);
        Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent0.setPackage("com.android.vending");
        com.google.android.gms.common.stats.zzb.zzoO().zza(this.mContext, intent0, this, 1);
    }

    @Override  // com.google.android.gms.internal.zzfi
    public String getProductId() {
        return this.zzAK;
    }

    @Override  // com.google.android.gms.internal.zzfi
    public Intent getPurchaseData() {
        return this.zzAW;
    }

    @Override  // com.google.android.gms.internal.zzfi
    public int getResultCode() {
        return this.zzAV;
    }

    @Override  // com.google.android.gms.internal.zzfi
    public boolean isVerified() {
        return this.zzAU;
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service connected.");
        this.zzAE.zzK(service);
        String s = zzo.zzbF().zze(this.zzAW);
        String s1 = zzo.zzbF().zzaj(s);
        if(s1 == null) {
            return;
        }
        if(this.zzAE.zzh("org.dyndns.vivi.SkskShogi", s1) == 0) {
            zzh.zzy(this.mContext).zza(this.zzAO);
        }
        com.google.android.gms.common.stats.zzb.zzoO().zza(this.mContext, this);
        this.zzAE.destroy();
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service disconnected.");
        this.zzAE.destroy();
    }
}

