package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfg;
import com.google.android.gms.internal.zzfl;

public class InAppPurchaseActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
    private zzfg zzHM;

    @Override  // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(this.zzHM != null) {
            try {
                this.zzHM.onActivityResult(requestCode, resultCode, data);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onActivityResult to in-app purchase manager:", remoteException0);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.zzHM = zzfl.zze(this);
        if(this.zzHM == null) {
            zzb.zzaC("Could not create in-app purchase manager.");
            this.finish();
            return;
        }
        try {
            this.zzHM.onCreate();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward onCreate to in-app purchase manager:", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        if(this.zzHM != null) {
            try {
                this.zzHM.onDestroy();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onDestroy to in-app purchase manager:", remoteException0);
            }
        }
        super.onDestroy();
    }
}

