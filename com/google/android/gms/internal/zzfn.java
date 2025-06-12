package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchase;

@zzgd
public class zzfn implements InAppPurchase {
    private final zzfe zzAN;

    public zzfn(zzfe zzfe0) {
        this.zzAN = zzfe0;
    }

    @Override  // com.google.android.gms.ads.purchase.InAppPurchase
    public String getProductId() {
        try {
            return this.zzAN.getProductId();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward getProductId to InAppPurchase", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.purchase.InAppPurchase
    public void recordPlayBillingResolution(int billingResponseCode) {
        try {
            this.zzAN.recordPlayBillingResolution(billingResponseCode);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.purchase.InAppPurchase
    public void recordResolution(int resolution) {
        try {
            this.zzAN.recordResolution(resolution);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward recordResolution to InAppPurchase", remoteException0);
        }
    }
}

