package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

@zzgd
public final class zzfk extends zza {
    private final InAppPurchaseListener zzsW;

    public zzfk(InAppPurchaseListener inAppPurchaseListener0) {
        this.zzsW = inAppPurchaseListener0;
    }

    @Override  // com.google.android.gms.internal.zzff
    public void zza(zzfe zzfe0) {
        zzfn zzfn0 = new zzfn(zzfe0);
        this.zzsW.onInAppPurchaseRequested(zzfn0);
    }
}

