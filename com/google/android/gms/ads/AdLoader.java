package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzd;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcz;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzee;

public class AdLoader {
    public static class Builder {
        private final Context mContext;
        private final zzp zznJ;

        Builder(Context context, zzp builder) {
            this.mContext = context;
            this.zznJ = builder;
        }

        public Builder(Context context, String adUnitID) {
            this(context, zzd.zza(context, adUnitID, new zzee()));
        }

        public AdLoader build() {
            try {
                zzo zzo0 = this.zznJ.zzbi();
                return new AdLoader(this.mContext, zzo0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzb("Failed to build AdLoader.", remoteException0);
                return null;
            }
        }

        public Builder forAppInstallAd(OnAppInstallAdLoadedListener listener) {
            try {
                zzcz zzcz0 = new zzcz(listener);
                this.zznJ.zza(zzcz0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to add app install ad listener", remoteException0);
            }
            return this;
        }

        public Builder forContentAd(OnContentAdLoadedListener listener) {
            try {
                zzda zzda0 = new zzda(listener);
                this.zznJ.zza(zzda0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to add content ad listener", remoteException0);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String templateId, OnCustomTemplateAdLoadedListener adLoadedListener, OnCustomClickListener customClickListener) {
            try {
                zzdc zzdc0 = new zzdc(adLoadedListener);
                zzdb zzdb0 = customClickListener == null ? null : new zzdb(customClickListener);
                this.zznJ.zza(templateId, zzdc0, zzdb0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to add custom template ad listener", remoteException0);
            }
            return this;
        }

        public Builder withAdListener(AdListener listener) {
            try {
                zzc zzc0 = new zzc(listener);
                this.zznJ.zzb(zzc0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to set AdListener.", remoteException0);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions options) {
            try {
                NativeAdOptionsParcel nativeAdOptionsParcel0 = new NativeAdOptionsParcel(options);
                this.zznJ.zza(nativeAdOptionsParcel0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Failed to specify native ad options", remoteException0);
            }
            return this;
        }
    }

    private final Context mContext;
    private final zzg zznH;
    private final zzo zznI;

    AdLoader(Context context, zzo adLoader) {
        this(context, adLoader, zzg.zzcw());
    }

    AdLoader(Context context, zzo adLoader, zzg parcelFactory) {
        this.mContext = context;
        this.zznI = adLoader;
        this.zznH = parcelFactory;
    }

    public void loadAd(AdRequest adRequest) {
        this.zza(adRequest.zzaF());
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zza(publisherAdRequest.zzaF());
    }

    private void zza(zzx zzx0) {
        try {
            AdRequestParcel adRequestParcel0 = this.zznH.zza(this.mContext, zzx0);
            this.zznI.zze(adRequestParcel0);
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to load ad.", remoteException0);
        }
    }
}

