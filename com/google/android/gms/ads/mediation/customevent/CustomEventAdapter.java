package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzHJ;
        private final MediationBannerListener zzaO;

        public zza(CustomEventAdapter customEventAdapter0, MediationBannerListener mediationBannerListener0) {
            this.zzHJ = customEventAdapter0;
            this.zzaO = mediationBannerListener0;
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdClicked() {
            zzb.zzay("Custom event adapter called onAdClicked.");
            this.zzaO.onAdClicked(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdClosed() {
            zzb.zzay("Custom event adapter called onAdClosed.");
            this.zzaO.onAdClosed(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdFailedToLoad(int errorCode) {
            zzb.zzay("Custom event adapter called onAdFailedToLoad.");
            this.zzaO.onAdFailedToLoad(this.zzHJ, errorCode);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdLeftApplication() {
            zzb.zzay("Custom event adapter called onAdLeftApplication.");
            this.zzaO.onAdLeftApplication(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
        public void onAdLoaded(View view) {
            zzb.zzay("Custom event adapter called onAdLoaded.");
            this.zzHJ.zza(view);
            this.zzaO.onAdLoaded(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdOpened() {
            zzb.zzay("Custom event adapter called onAdOpened.");
            this.zzaO.onAdOpened(this.zzHJ);
        }
    }

    class com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzHJ;
        final CustomEventAdapter zzHK;
        private final MediationInterstitialListener zzaP;

        public com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zzb(CustomEventAdapter customEventAdapter1, MediationInterstitialListener mediationInterstitialListener0) {
            this.zzHJ = customEventAdapter1;
            this.zzaP = mediationInterstitialListener0;
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdClicked() {
            zzb.zzay("Custom event adapter called onAdClicked.");
            this.zzaP.onAdClicked(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdClosed() {
            zzb.zzay("Custom event adapter called onAdClosed.");
            this.zzaP.onAdClosed(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdFailedToLoad(int errorCode) {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzaP.onAdFailedToLoad(this.zzHJ, errorCode);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdLeftApplication() {
            zzb.zzay("Custom event adapter called onAdLeftApplication.");
            this.zzaP.onAdLeftApplication(this.zzHJ);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
        public void onAdLoaded() {
            zzb.zzay("Custom event adapter called onReceivedAd.");
            this.zzaP.onAdLoaded(CustomEventAdapter.this);
        }

        @Override  // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public void onAdOpened() {
            zzb.zzay("Custom event adapter called onAdOpened.");
            this.zzaP.onAdOpened(this.zzHJ);
        }
    }

    CustomEventBanner zzHH;
    CustomEventInterstitial zzHI;
    private View zzaV;

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzaV;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        if(this.zzHH != null) {
            this.zzHH.onDestroy();
        }
        if(this.zzHI != null) {
            this.zzHI.onDestroy();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        if(this.zzHH != null) {
            this.zzHH.onPause();
        }
        if(this.zzHI != null) {
            this.zzHI.onPause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        if(this.zzHH != null) {
            this.zzHH.onResume();
        }
        if(this.zzHI != null) {
            this.zzHI.onResume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener listener, Bundle serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle customEventExtras) {
        this.zzHH = (CustomEventBanner)CustomEventAdapter.zzj(serverParameters.getString("class_name"));
        if(this.zzHH == null) {
            listener.onAdFailedToLoad(this, 0);
            return;
        }
        Bundle bundle2 = customEventExtras == null ? null : customEventExtras.getBundle(serverParameters.getString("class_name"));
        this.zzHH.requestBannerAd(context, new zza(this, listener), serverParameters.getString("parameter"), adSize, mediationAdRequest, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener listener, Bundle serverParameters, MediationAdRequest mediationAdRequest, Bundle customEventExtras) {
        this.zzHI = (CustomEventInterstitial)CustomEventAdapter.zzj(serverParameters.getString("class_name"));
        if(this.zzHI == null) {
            listener.onAdFailedToLoad(this, 0);
            return;
        }
        Bundle bundle2 = customEventExtras == null ? null : customEventExtras.getBundle(serverParameters.getString("class_name"));
        this.zzHI.requestInterstitialAd(context, this.zza(listener), serverParameters.getString("parameter"), mediationAdRequest, bundle2);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzHI.showInterstitial();
    }

    private void zza(View view0) {
        this.zzaV = view0;
    }

    com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zzb zza(MediationInterstitialListener mediationInterstitialListener0) {
        return new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zzb(this, this, mediationInterstitialListener0);
    }

    private static Object zzj(String s) {
        try {
            return Class.forName(s).newInstance();
        }
        catch(Throwable throwable0) {
            zzb.zzaC(("Could not instantiate custom event adapter: " + s + ". " + throwable0.getMessage()));
            return null;
        }
    }
}

