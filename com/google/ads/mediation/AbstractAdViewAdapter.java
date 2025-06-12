package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzgd;
import java.util.Date;
import java.util.Set;

@zzgd
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    static final class zza extends AdListener implements com.google.android.gms.ads.internal.client.zza {
        final AbstractAdViewAdapter zzaN;
        final MediationBannerListener zzaO;

        public zza(AbstractAdViewAdapter abstractAdViewAdapter0, MediationBannerListener mediationBannerListener0) {
            this.zzaN = abstractAdViewAdapter0;
            this.zzaO = mediationBannerListener0;
        }

        @Override  // com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            this.zzaO.onAdClicked(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            this.zzaO.onAdClosed(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int errorCode) {
            this.zzaO.onAdFailedToLoad(this.zzaN, errorCode);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
            this.zzaO.onAdLeftApplication(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.zzaO.onAdLoaded(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            this.zzaO.onAdOpened(this.zzaN);
        }
    }

    static final class zzb extends AdListener implements com.google.android.gms.ads.internal.client.zza {
        final AbstractAdViewAdapter zzaN;
        final MediationInterstitialListener zzaP;

        public zzb(AbstractAdViewAdapter abstractAdViewAdapter0, MediationInterstitialListener mediationInterstitialListener0) {
            this.zzaN = abstractAdViewAdapter0;
            this.zzaP = mediationInterstitialListener0;
        }

        @Override  // com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            this.zzaP.onAdClicked(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            this.zzaP.onAdClosed(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int errorCode) {
            this.zzaP.onAdFailedToLoad(this.zzaN, errorCode);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
            this.zzaP.onAdLeftApplication(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.zzaP.onAdLoaded(this.zzaN);
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            this.zzaP.onAdOpened(this.zzaN);
        }
    }

    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzaL;
    private InterstitialAd zzaM;

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzaL;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        if(this.zzaL != null) {
            this.zzaL.destroy();
            this.zzaL = null;
        }
        if(this.zzaM != null) {
            this.zzaM = null;
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        if(this.zzaL != null) {
            this.zzaL.pause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        if(this.zzaL != null) {
            this.zzaL.resume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener bannerListener, Bundle serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle extras) {
        this.zzaL = new AdView(context);
        this.zzaL.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzaL.setAdUnitId(serverParameters.getString("pubid"));
        this.zzaL.setAdListener(new zza(this, bannerListener));
        this.zzaL.loadAd(this.zza(context, mediationAdRequest, extras, serverParameters));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener interstitialListener, Bundle serverParameters, MediationAdRequest mediationAdRequest, Bundle extras) {
        this.zzaM = new InterstitialAd(context);
        this.zzaM.setAdUnitId(serverParameters.getString("pubid"));
        this.zzaM.setAdListener(new zzb(this, interstitialListener));
        this.zzaM.loadAd(this.zza(context, mediationAdRequest, extras, serverParameters));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzaM.show();
    }

    protected abstract Bundle zza(Bundle arg1, Bundle arg2);

    AdRequest zza(Context context0, MediationAdRequest mediationAdRequest0, Bundle bundle0, Bundle bundle1) {
        Builder adRequest$Builder0 = new Builder();
        Date date0 = mediationAdRequest0.getBirthday();
        if(date0 != null) {
            adRequest$Builder0.setBirthday(date0);
        }
        int v = mediationAdRequest0.getGender();
        if(v != 0) {
            adRequest$Builder0.setGender(v);
        }
        Set set0 = mediationAdRequest0.getKeywords();
        if(set0 != null) {
            for(Object object0: set0) {
                adRequest$Builder0.addKeyword(((String)object0));
            }
        }
        Location location0 = mediationAdRequest0.getLocation();
        if(location0 != null) {
            adRequest$Builder0.setLocation(location0);
        }
        if(mediationAdRequest0.isTesting()) {
            adRequest$Builder0.addTestDevice(zzk.zzcA().zzO(context0));
        }
        if(mediationAdRequest0.taggedForChildDirectedTreatment() != -1) {
            adRequest$Builder0.tagForChildDirectedTreatment(mediationAdRequest0.taggedForChildDirectedTreatment() == 1);
        }
        Bundle bundle2 = this.zza(bundle0, bundle1);
        adRequest$Builder0.addNetworkExtrasBundle(AdMobAdapter.class, bundle2);
        return adRequest$Builder0.build();
    }
}

