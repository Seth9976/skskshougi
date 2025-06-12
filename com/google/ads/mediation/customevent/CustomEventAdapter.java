package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzaY;
        private final MediationBannerListener zzaZ;

        public zza(CustomEventAdapter customEventAdapter0, MediationBannerListener mediationBannerListener0) {
            this.zzaY = customEventAdapter0;
            this.zzaZ = mediationBannerListener0;
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventBannerListener
        public void onClick() {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzaZ.onClick(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onDismissScreen() {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzaZ.onDismissScreen(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onFailedToReceiveAd() {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzaZ.onFailedToReceiveAd(this.zzaY, ErrorCode.NO_FILL);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onLeaveApplication() {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzaZ.onLeaveApplication(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onPresentScreen() {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzaZ.onPresentScreen(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventBannerListener
        public void onReceivedAd(View view) {
            zzb.zzay("Custom event adapter called onReceivedAd.");
            this.zzaY.zza(view);
            this.zzaZ.onReceivedAd(this.zzaY);
        }
    }

    class com.google.ads.mediation.customevent.CustomEventAdapter.zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzaY;
        private final MediationInterstitialListener zzba;
        final CustomEventAdapter zzbb;

        public com.google.ads.mediation.customevent.CustomEventAdapter.zzb(CustomEventAdapter customEventAdapter1, MediationInterstitialListener mediationInterstitialListener0) {
            this.zzaY = customEventAdapter1;
            this.zzba = mediationInterstitialListener0;
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onDismissScreen() {
            zzb.zzay("Custom event adapter called onDismissScreen.");
            this.zzba.onDismissScreen(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onFailedToReceiveAd() {
            zzb.zzay("Custom event adapter called onFailedToReceiveAd.");
            this.zzba.onFailedToReceiveAd(this.zzaY, ErrorCode.NO_FILL);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onLeaveApplication() {
            zzb.zzay("Custom event adapter called onLeaveApplication.");
            this.zzba.onLeaveApplication(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventListener
        public void onPresentScreen() {
            zzb.zzay("Custom event adapter called onPresentScreen.");
            this.zzba.onPresentScreen(this.zzaY);
        }

        @Override  // com.google.ads.mediation.customevent.CustomEventInterstitialListener
        public void onReceivedAd() {
            zzb.zzay("Custom event adapter called onReceivedAd.");
            this.zzba.onReceivedAd(CustomEventAdapter.this);
        }
    }

    private View zzaV;
    CustomEventBanner zzaW;
    CustomEventInterstitial zzaX;

    @Override  // com.google.ads.mediation.MediationAdapter
    public void destroy() {
        if(this.zzaW != null) {
            this.zzaW.destroy();
        }
        if(this.zzaX != null) {
            this.zzaX.destroy();
        }
    }

    @Override  // com.google.ads.mediation.MediationAdapter
    public Class getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override  // com.google.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzaV;
    }

    @Override  // com.google.ads.mediation.MediationAdapter
    public Class getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    @Override  // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(MediationBannerListener x0, Activity x1, MediationServerParameters x2, AdSize x3, MediationAdRequest x4, NetworkExtras x5) {
        this.requestBannerAd(x0, x1, ((CustomEventServerParameters)x2), x3, x4, ((CustomEventExtras)x5));
    }

    public void requestBannerAd(MediationBannerListener listener, Activity activity, CustomEventServerParameters serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.zzaW = (CustomEventBanner)CustomEventAdapter.zzj(serverParameters.className);
        if(this.zzaW == null) {
            listener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
            return;
        }
        Object object0 = customEventExtras == null ? null : customEventExtras.getExtra(serverParameters.label);
        this.zzaW.requestBannerAd(new zza(this, listener), activity, serverParameters.label, serverParameters.parameter, adSize, mediationAdRequest, object0);
    }

    @Override  // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(MediationInterstitialListener x0, Activity x1, MediationServerParameters x2, MediationAdRequest x3, NetworkExtras x4) {
        this.requestInterstitialAd(x0, x1, ((CustomEventServerParameters)x2), x3, ((CustomEventExtras)x4));
    }

    public void requestInterstitialAd(MediationInterstitialListener listener, Activity activity, CustomEventServerParameters serverParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.zzaX = (CustomEventInterstitial)CustomEventAdapter.zzj(serverParameters.className);
        if(this.zzaX == null) {
            listener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
            return;
        }
        Object object0 = customEventExtras == null ? null : customEventExtras.getExtra(serverParameters.label);
        this.zzaX.requestInterstitialAd(this.zza(listener), activity, serverParameters.label, serverParameters.parameter, mediationAdRequest, object0);
    }

    @Override  // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzaX.showInterstitial();
    }

    private void zza(View view0) {
        this.zzaV = view0;
    }

    com.google.ads.mediation.customevent.CustomEventAdapter.zzb zza(MediationInterstitialListener mediationInterstitialListener0) {
        return new com.google.ads.mediation.customevent.CustomEventAdapter.zzb(this, this, mediationInterstitialListener0);
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

