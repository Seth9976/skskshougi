package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

@zzgd
public final class zzel extends zza {
    private final MediationAdapter zzyh;
    private final NetworkExtras zzyi;

    public zzel(MediationAdapter mediationAdapter0, NetworkExtras networkExtras0) {
        this.zzyh = mediationAdapter0;
        this.zzyi = networkExtras0;
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void destroy() throws RemoteException {
        try {
            this.zzyh.destroy();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not destroy adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public zzd getView() throws RemoteException {
        if(!(this.zzyh instanceof MediationBannerAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationBannerAdapter: " + this.zzyh.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        try {
            return zze.zzw(((MediationBannerAdapter)this.zzyh).getBannerView());
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not get banner view from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public boolean isInitialized() {
        return true;
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void resume() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void showInterstitial() throws RemoteException {
        if(!(this.zzyh instanceof MediationInterstitialAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzyh.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter)this.zzyh).showInterstitial();
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not show interstitial from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void showVideo() {
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(AdRequestParcel adRequestParcel0, String s) {
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza0, String s1) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, zzeh zzeh0) throws RemoteException {
        this.zza(zzd0, adRequestParcel0, s, null, zzeh0);
    }

    @Override  // com.google.android.gms.internal.zzeg
    public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, String s1, zzeh zzeh0) throws RemoteException {
        if(!(this.zzyh instanceof MediationInterstitialAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzyh.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Requesting interstitial ad from adapter.");
        try {
            zzem zzem0 = new zzem(zzeh0);
            Activity activity0 = (Activity)zze.zzn(zzd0);
            MediationServerParameters mediationServerParameters0 = this.zzb(s, adRequestParcel0.zzsb, s1);
            MediationAdRequest mediationAdRequest0 = zzen.zzg(adRequestParcel0);
            ((MediationInterstitialAdapter)this.zzyh).requestInterstitialAd(zzem0, activity0, mediationServerParameters0, mediationAdRequest0, this.zzyi);
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
        if(!(this.zzyh instanceof MediationBannerAdapter)) {
            zzb.zzaC(("MediationAdapter is not a MediationBannerAdapter: " + this.zzyh.getClass().getCanonicalName()));
            throw new RemoteException();
        }
        zzb.zzay("Requesting banner ad from adapter.");
        try {
            zzem zzem0 = new zzem(zzeh0);
            Activity activity0 = (Activity)zze.zzn(zzd0);
            MediationServerParameters mediationServerParameters0 = this.zzb(s, adRequestParcel0.zzsb, s1);
            AdSize adSize0 = zzen.zzb(adSizeParcel0);
            MediationAdRequest mediationAdRequest0 = zzen.zzg(adRequestParcel0);
            ((MediationBannerAdapter)this.zzyh).requestBannerAd(zzem0, activity0, mediationServerParameters0, adSize0, mediationAdRequest0, this.zzyi);
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not request banner ad from adapter.", throwable0);
            throw new RemoteException();
        }
    }

    private MediationServerParameters zzb(String s, int v, String s1) throws RemoteException {
        HashMap hashMap0;
        try {
            if(s == null) {
                hashMap0 = new HashMap(0);
            }
            else {
                JSONObject jSONObject0 = new JSONObject(s);
                hashMap0 = new HashMap(jSONObject0.length());
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    hashMap0.put(((String)object0), jSONObject0.getString(((String)object0)));
                }
            }
            Class class0 = this.zzyh.getServerParametersType();
            MediationServerParameters mediationServerParameters0 = null;
            if(class0 != null) {
                mediationServerParameters0 = (MediationServerParameters)class0.newInstance();
                mediationServerParameters0.load(hashMap0);
            }
            return mediationServerParameters0;
        }
        catch(Throwable throwable0) {
            zzb.zzd("Could not get MediationServerParameters.", throwable0);
            throw new RemoteException();
        }
    }
}

