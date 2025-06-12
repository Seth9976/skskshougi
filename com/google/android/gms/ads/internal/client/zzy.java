package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzfo;
import java.util.concurrent.atomic.AtomicBoolean;

public class zzy {
    private final zzg zznH;
    private String zzoL;
    private zza zzrU;
    private AdListener zzrV;
    private final zzee zzsR;
    private final AtomicBoolean zzsS;
    private zzr zzsT;
    private String zzsU;
    private ViewGroup zzsV;
    private InAppPurchaseListener zzsW;
    private PlayStorePurchaseListener zzsX;
    private OnCustomRenderedAdLoadedListener zzsY;
    private AppEventListener zzsq;
    private AdSize[] zzsr;

    public zzy(ViewGroup viewGroup0) {
        this(viewGroup0, null, false, zzg.zzcw());
    }

    public zzy(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z) {
        this(viewGroup0, attributeSet0, z, zzg.zzcw());
    }

    zzy(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, zzg zzg0) {
        this(viewGroup0, attributeSet0, z, zzg0, null);
    }

    zzy(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, zzg zzg0, zzr zzr0) {
        this.zzsR = new zzee();
        this.zzsV = viewGroup0;
        this.zznH = zzg0;
        this.zzsT = zzr0;
        this.zzsS = new AtomicBoolean(false);
        if(attributeSet0 != null) {
            Context context0 = viewGroup0.getContext();
            try {
                zzj zzj0 = new zzj(context0, attributeSet0);
                this.zzsr = zzj0.zzi(z);
                this.zzoL = zzj0.getAdUnitId();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzk.zzcA().zza(viewGroup0, new AdSizeParcel(context0, AdSize.BANNER), illegalArgumentException0.getMessage(), illegalArgumentException0.getMessage());
                return;
            }
            if(viewGroup0.isInEditMode()) {
                zzk.zzcA().zza(viewGroup0, new AdSizeParcel(context0, this.zzsr[0]), "Ads by Google");
            }
        }
    }

    public void destroy() {
        try {
            if(this.zzsT != null) {
                this.zzsT.destroy();
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to destroy AdView.", remoteException0);
        }
    }

    public AdListener getAdListener() {
        return this.zzrV;
    }

    public AdSize getAdSize() {
        if(this.zzsT != null) {
            try {
                AdSizeParcel adSizeParcel0 = this.zzsT.zzaN();
                if(adSizeParcel0 != null) {
                    return adSizeParcel0.zzcy();
                }
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to get the current AdSize.", remoteException0);
            }
        }
        return this.zzsr == null ? null : this.zzsr[0];
    }

    public AdSize[] getAdSizes() {
        return this.zzsr;
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

    public void pause() {
        try {
            if(this.zzsT != null) {
                this.zzsT.pause();
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to call pause.", remoteException0);
        }
    }

    public void recordManualImpression() {
        if(this.zzsS.getAndSet(true)) {
            return;
        }
        else {
            try {
                if(this.zzsT != null) {
                    this.zzsT.zzaP();
                    return;
                }
                return;
            }
            catch(RemoteException remoteException0) {
            }
        }
        zzb.zzd("Failed to record impression.", remoteException0);
    }

    public void resume() {
        try {
            if(this.zzsT != null) {
                this.zzsT.resume();
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to call resume.", remoteException0);
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

    public void setAdSizes(AdSize[] adSizes) {
        if(this.zzsr != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        this.zza(adSizes);
    }

    public void setAdUnitId(String adUnitId) {
        if(this.zzoL != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
            zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", remoteException0);
        }
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey) {
        if(this.zzsW != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
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
                this.zzcO();
            }
            zzr zzr0 = this.zzsT;
            Context context0 = this.zzsV.getContext();
            if(zzr0.zza(this.zznH.zza(context0, zzx0))) {
                this.zzsR.zzf(zzx0.zzcJ());
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to load ad.", remoteException0);
        }
    }

    public void zza(AdSize[] arr_adSize) {
        this.zzsr = arr_adSize;
        if(this.zzsT != null) {
            try {
                this.zzsT.zza(new AdSizeParcel(this.zzsV.getContext(), this.zzsr));
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to set the ad size.", remoteException0);
            }
        }
        this.zzsV.requestLayout();
    }

    private void zzcN() {
        try {
            zzd zzd0 = this.zzsT.zzaM();
            if(zzd0 == null) {
                return;
            }
            this.zzsV.addView(((View)zze.zzn(zzd0)));
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Failed to get an ad frame.", remoteException0);
        }
    }

    private void zzcO() throws RemoteException {
        if((this.zzsr == null || this.zzoL == null) && this.zzsT == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        Context context0 = this.zzsV.getContext();
        this.zzsT = zzk.zzcB().zza(context0, new AdSizeParcel(context0, this.zzsr), this.zzoL, this.zzsR);
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
        this.zzsT.zza(zzk.zzcC());
        this.zzcN();
    }
}

