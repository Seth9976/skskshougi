package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzfo;

public class zzz {
    private final Context mContext;
    private final zzg zznH;
    private String zzoL;
    private zza zzrU;
    private AdListener zzrV;
    private final zzee zzsR;
    private zzr zzsT;
    private String zzsU;
    private InAppPurchaseListener zzsW;
    private PlayStorePurchaseListener zzsX;
    private OnCustomRenderedAdLoadedListener zzsY;
    private PublisherInterstitialAd zzsZ;
    private AppEventListener zzsq;

    public zzz(Context context0) {
        this(context0, zzg.zzcw(), null);
    }

    public zzz(Context context0, PublisherInterstitialAd publisherInterstitialAd0) {
        this(context0, zzg.zzcw(), publisherInterstitialAd0);
    }

    public zzz(Context context0, zzg zzg0, PublisherInterstitialAd publisherInterstitialAd0) {
        this.zzsR = new zzee();
        this.mContext = context0;
        this.zznH = zzg0;
        this.zzsZ = publisherInterstitialAd0;
    }

    public AdListener getAdListener() {
        return this.zzrV;
    }

    public String getAdUnitId() {
        return this.zzoL;
    }

    public AppEventListener getAppEventListener() {
        return this.zzsq;
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.zzsW;
    }

    public String getMediationAdapterClassName() {
        if(this.zzsT != null) {
            try {
                return this.zzsT.getMediationAdapterClassName();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to get the mediation adapter class name.", remoteException0);
            }
        }
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzsY;
    }

    public boolean isLoaded() {
        try {
            return this.zzsT == null ? false : this.zzsT.isReady();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to check if ad is ready.", remoteException0);
            return false;
        }
    }

    public void setAdListener(AdListener adListener) {
        try {
            this.zzrV = adListener;
            if(this.zzsT != null) {
                this.zzsT.zza((adListener == null ? null : new zzc(adListener)));
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to set the AdListener.", remoteException0);
        }
    }

    public void setAdUnitId(String adUnitId) {
        if(this.zzoL != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzoL = adUnitId;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzsq = appEventListener;
            if(this.zzsT != null) {
                this.zzsT.zza((appEventListener == null ? null : new zzi(appEventListener)));
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to set the AppEventListener.", remoteException0);
        }
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        if(this.zzsX != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.zzsW = inAppPurchaseListener;
            if(this.zzsT != null) {
                this.zzsT.zza((inAppPurchaseListener == null ? null : new zzfk(inAppPurchaseListener)));
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to set the InAppPurchaseListener.", remoteException0);
        }
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzsY = onCustomRenderedAdLoadedListener;
            if(this.zzsT != null) {
                this.zzsT.zza((onCustomRenderedAdLoadedListener == null ? null : new zzcj(onCustomRenderedAdLoadedListener)));
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to set the OnCustomRenderedAdLoadedListener.", remoteException0);
        }
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey) {
        if(this.zzsW != null) {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        try {
            this.zzsX = playStorePurchaseListener;
            this.zzsU = publicKey;
            if(this.zzsT != null) {
                this.zzsT.zza((playStorePurchaseListener == null ? null : new zzfo(playStorePurchaseListener)), publicKey);
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to set the play store purchase parameter.", remoteException0);
        }
    }

    public void show() {
        try {
            this.zzM("show");
            this.zzsT.showInterstitial();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to show interstitial.", remoteException0);
        }
    }

    private void zzL(String s) throws RemoteException {
        if(this.zzoL == null) {
            this.zzM(s);
        }
        zze zze0 = zzk.zzcB();
        AdSizeParcel adSizeParcel0 = new AdSizeParcel();
        this.zzsT = zze0.zzb(this.mContext, adSizeParcel0, this.zzoL, this.zzsR);
        if(this.zzrV != null) {
            this.zzsT.zza(new zzc(this.zzrV));
        }
        if(this.zzrU != null) {
            this.zzsT.zza(new com.google.android.gms.ads.internal.client.zzb(this.zzrU));
        }
        if(this.zzsq != null) {
            this.zzsT.zza(new zzi(this.zzsq));
        }
        if(this.zzsW != null) {
            this.zzsT.zza(new zzfk(this.zzsW));
        }
        if(this.zzsX != null) {
            this.zzsT.zza(new zzfo(this.zzsX), this.zzsU);
        }
        if(this.zzsY != null) {
            this.zzsT.zza(new zzcj(this.zzsY));
        }
    }

    private void zzM(String s) {
        if(this.zzsT == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + s + " is called.");
        }
    }

    public void zza(zza zza0) {
        try {
            this.zzrU = zza0;
            if(this.zzsT != null) {
                this.zzsT.zza((zza0 == null ? null : new com.google.android.gms.ads.internal.client.zzb(zza0)));
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to set the AdClickListener.", remoteException0);
        }
    }

    public void zza(zzx zzx0) {
        try {
            if(this.zzsT == null) {
                this.zzL("loadAd");
            }
            if(this.zzsT.zza(this.zznH.zza(this.mContext, zzx0))) {
                this.zzsR.zzf(zzx0.zzcJ());
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to load ad.", remoteException0);
        }
    }
}

