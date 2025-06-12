package com.google.android.gms.ads.purchase;

public interface PlayStorePurchaseListener {
    boolean isValidPurchase(String arg1);

    void onInAppPurchaseFinished(InAppPurchaseResult arg1);
}

