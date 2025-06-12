package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@zzgd
public final class zzej extends zza {
    private final MediationAdapter zzyf;

    public zzej(MediationAdapter mediationAdapter0) {
        this.zzyf = mediationAdapter0;
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void destroy() throws RemoteException {
        try {
            this.zzyf.onDestroy();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not destroy adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public zzd getView() throws RemoteException {
        if(!(this.zzyf instanceof MediationBannerAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationBannerAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        try {
            return zze.zzw(((MediationBannerAdapter)this.zzyf).getBannerView());
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not get banner view from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public boolean isInitialized() throws RemoteException {
        if(!(this.zzyf instanceof MediationRewardedVideoAdAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter)this.zzyf).isInitialized();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not check if adapter is initialized.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void pause() throws RemoteException {
        try {
            this.zzyf.onPause();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not pause adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void resume() throws RemoteException {
        try {
            this.zzyf.onResume();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not resume adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void showInterstitial() throws RemoteException {
        if(!(this.zzyf instanceof MediationInterstitialAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter)this.zzyf).showInterstitial();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not show interstitial from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void showVideo() throws RemoteException {
        if(!(this.zzyf instanceof MediationRewardedVideoAdAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter)this.zzyf).showVideo();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not show rewarded video ad from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    private Bundle zza(String s, int v, String s1) throws RemoteException {
        zzb.zzaC(("Server parameters: " + s));
        try {
            Bundle bundle0 = new Bundle();
            if(s != null) {
                JSONObject jSONObject0 = new JSONObject(s);
                Bundle bundle1 = new Bundle();
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    bundle1.putString(((String)object0), jSONObject0.getString(((String)object0)));
                }
                bundle0 = bundle1;
            }
            if(this.zzyf instanceof AdMobAdapter) {
                bundle0.putString("adJson", s1);
                bundle0.putInt("tagForChildDirectedTreatment", v);
            }
            return bundle0;
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not get Server Parameters Bundle.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(AdRequestParcel adRequestParcel0, String s) throws RemoteException {
        Bundle bundle0;
        if(!(this.zzyf instanceof MediationRewardedVideoAdAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter0 = (MediationRewardedVideoAdAdapter)this.zzyf;
            HashSet hashSet0 = adRequestParcel0.zzrZ == null ? null : new HashSet(adRequestParcel0.zzrZ);
            zzei zzei0 = new zzei((adRequestParcel0.zzrX == -1L ? null : new Date(adRequestParcel0.zzrX)), adRequestParcel0.zzrY, hashSet0, adRequestParcel0.zzsf, adRequestParcel0.zzsa, adRequestParcel0.zzsb);
            if(adRequestParcel0.zzsh == null) {
                bundle0 = null;
            }
            else {
                String s1 = mediationRewardedVideoAdAdapter0.getClass().getName();
                bundle0 = adRequestParcel0.zzsh.getBundle(s1);
            }
            mediationRewardedVideoAdAdapter0.loadAd(zzei0, this.zza(s, adRequestParcel0.zzsb, null), bundle0);
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not load rewarded video ad from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza0, String s1) throws RemoteException {
        Bundle bundle0;
        if(!(this.zzyf instanceof MediationRewardedVideoAdAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter0 = (MediationRewardedVideoAdAdapter)this.zzyf;
            HashSet hashSet0 = adRequestParcel0.zzrZ == null ? null : new HashSet(adRequestParcel0.zzrZ);
            zzei zzei0 = new zzei((adRequestParcel0.zzrX == -1L ? null : new Date(adRequestParcel0.zzrX)), adRequestParcel0.zzrY, hashSet0, adRequestParcel0.zzsf, adRequestParcel0.zzsa, adRequestParcel0.zzsb);
            if(adRequestParcel0.zzsh == null) {
                bundle0 = null;
            }
            else {
                String s2 = mediationRewardedVideoAdAdapter0.getClass().getName();
                bundle0 = adRequestParcel0.zzsh.getBundle(s2);
            }
            mediationRewardedVideoAdAdapter0.initialize(((Context)zze.zzn(zzd0)), zzei0, s, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(zza0), this.zza(s1, adRequestParcel0.zzsb, null), bundle0);
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not initialize rewarded video adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, zzeh zzeh0) throws RemoteException {
        this.zza(zzd0, adRequestParcel0, s, null, zzeh0);
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, String s1, zzeh zzeh0) throws RemoteException {
        Bundle bundle0;
        if(!(this.zzyf instanceof MediationInterstitialAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter0 = (MediationInterstitialAdapter)this.zzyf;
            HashSet hashSet0 = adRequestParcel0.zzrZ == null ? null : new HashSet(adRequestParcel0.zzrZ);
            zzei zzei0 = new zzei((adRequestParcel0.zzrX == -1L ? null : new Date(adRequestParcel0.zzrX)), adRequestParcel0.zzrY, hashSet0, adRequestParcel0.zzsf, adRequestParcel0.zzsa, adRequestParcel0.zzsb);
            if(adRequestParcel0.zzsh == null) {
                bundle0 = null;
            }
            else {
                String s2 = mediationInterstitialAdapter0.getClass().getName();
                bundle0 = adRequestParcel0.zzsh.getBundle(s2);
            }
            mediationInterstitialAdapter0.requestInterstitialAd(((Context)zze.zzn(zzd0)), new zzek(zzeh0), this.zza(s, adRequestParcel0.zzsb, s1), zzei0, bundle0);
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not request interstitial ad from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdSizeParcel adSizeParcel0, AdRequestParcel adRequestParcel0, String s, zzeh zzeh0) throws RemoteException {
        this.zza(zzd0, adSizeParcel0, adRequestParcel0, s, null, zzeh0);
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdSizeParcel adSizeParcel0, AdRequestParcel adRequestParcel0, String s, String s1, zzeh zzeh0) throws RemoteException {
        Bundle bundle0;
        if(!(this.zzyf instanceof MediationBannerAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationBannerAdapter: " + this.zzyf.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter0 = (MediationBannerAdapter)this.zzyf;
            HashSet hashSet0 = adRequestParcel0.zzrZ == null ? null : new HashSet(adRequestParcel0.zzrZ);
            zzei zzei0 = new zzei((adRequestParcel0.zzrX == -1L ? null : new Date(adRequestParcel0.zzrX)), adRequestParcel0.zzrY, hashSet0, adRequestParcel0.zzsf, adRequestParcel0.zzsa, adRequestParcel0.zzsb);
            if(adRequestParcel0.zzsh == null) {
                bundle0 = null;
            }
            else {
                String s2 = mediationBannerAdapter0.getClass().getName();
                bundle0 = adRequestParcel0.zzsh.getBundle(s2);
            }
            mediationBannerAdapter0.requestBannerAd(((Context)zze.zzn(zzd0)), new zzek(zzeh0), this.zza(s, adRequestParcel0.zzsb, s1), com.google.android.gms.ads.zza.zza(adSizeParcel0.width, adSizeParcel0.height, adSizeParcel0.zzsm), zzei0, bundle0);
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not request banner ad from adapter.", throwable0);
            throw new RemoteException();
        }
    }
}

