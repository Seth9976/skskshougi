package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzfg.zza;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zze extends zza implements ServiceConnection {
    private final Activity mActivity;
    private zzb zzAE;
    zzh zzAF;
    private zzk zzAH;
    private Context zzAM;
    private zzfe zzAN;
    private zzf zzAO;
    private zzj zzAP;
    private String zzAQ;

    public zze(Activity activity0) {
        this.zzAQ = null;
        this.mActivity = activity0;
        this.zzAF = zzh.zzy(this.mActivity.getApplicationContext());
    }

    @Override  // com.google.android.gms.internal.zzfg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1001) {
            try {
                try {
                    boolean z = false;
                    int v2 = zzo.zzbF().zzd(data);
                    if(resultCode == -1) {
                        zzo.zzbF();
                        if(v2 != 0) {
                            this.zzAF.zza(this.zzAO);
                        }
                        else if(this.zzAH.zza(this.zzAQ, -1, data)) {
                            z = true;
                        }
                    }
                    else {
                        this.zzAF.zza(this.zzAO);
                    }
                    this.zzAN.recordPlayBillingResolution(v2);
                    this.mActivity.finish();
                    this.zza(this.zzAN.getProductId(), z, resultCode, data);
                }
                catch(RemoteException unused_ex) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to process purchase result.");
                    this.mActivity.finish();
                }
                this.zzAQ = null;
            }
            catch(Throwable throwable0) {
                this.zzAQ = null;
                throw throwable0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzfg
    public void onCreate() {
        GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel0 = GInAppPurchaseManagerInfoParcel.zzc(this.mActivity.getIntent());
        this.zzAP = gInAppPurchaseManagerInfoParcel0.zzAA;
        this.zzAH = gInAppPurchaseManagerInfoParcel0.zzqe;
        this.zzAN = gInAppPurchaseManagerInfoParcel0.zzAy;
        this.zzAE = new zzb(this.mActivity.getApplicationContext());
        this.zzAM = gInAppPurchaseManagerInfoParcel0.zzAz;
        if(this.mActivity.getResources().getConfiguration().orientation == 2) {
            int v = zzo.zzbx().zzgq();
            this.mActivity.setRequestedOrientation(v);
        }
        else {
            int v1 = zzo.zzbx().zzgr();
            this.mActivity.setRequestedOrientation(v1);
        }
        Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent0.setPackage("com.android.vending");
        this.mActivity.bindService(intent0, this, 1);
    }

    @Override  // com.google.android.gms.internal.zzfg
    public void onDestroy() {
        this.mActivity.unbindService(this);
        this.zzAE.destroy();
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        this.zzAE.zzK(service);
        try {
            this.zzAQ = this.zzAH.zzfi();
            Bundle bundle0 = this.zzAE.zzb("org.dyndns.vivi.SkskShogi", this.zzAN.getProductId(), this.zzAQ);
            Parcelable parcelable0 = bundle0.getParcelable("BUY_INTENT");
            if(((PendingIntent)parcelable0) == null) {
                int v = zzo.zzbF().zzb(bundle0);
                this.zzAN.recordPlayBillingResolution(v);
                this.zza(this.zzAN.getProductId(), false, v, null);
                this.mActivity.finish();
                return;
            }
            this.zzAO = new zzf(this.zzAN.getProductId(), this.zzAQ);
            this.zzAF.zzb(this.zzAO);
            IntentSender intentSender0 = ((PendingIntent)parcelable0).getIntentSender();
            Intent intent0 = new Intent();
            this.mActivity.startIntentSenderForResult(intentSender0, 1001, intent0, 0, 0, 0);
        }
        catch(RemoteException | IntentSender.SendIntentException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Error when connecting in-app billing service", remoteException0);
            this.mActivity.finish();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service disconnected.");
        this.zzAE.destroy();
    }

    protected void zza(String s, boolean z, int v, Intent intent0) {
        if(this.zzAP != null) {
            this.zzAP.zza(s, z, v, intent0, this.zzAO);
        }
    }
}

