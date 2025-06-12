package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

@zzgd
public final class zzfo extends zza {
    private final PlayStorePurchaseListener zzsX;

    public zzfo(PlayStorePurchaseListener playStorePurchaseListener0) {
        this.zzsX = playStorePurchaseListener0;
    }

    @Override  // com.google.android.gms.internal.zzfj
    public boolean isValidPurchase(String productId) {
        return this.zzsX.isValidPurchase(productId);
    }

    @Override  // com.google.android.gms.internal.zzfj
    public void zza(zzfi zzfi0) {
        zzfm zzfm0 = new zzfm(zzfi0);
        this.zzsX.onInAppPurchaseFinished(zzfm0);
    }
}

