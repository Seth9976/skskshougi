package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzkw;
import java.util.List;

@zzgd
public class zzm extends zzb {
    public zzm(Context context0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        super(context0, adSizeParcel0, s, zzef0, versionInfoParcel0);
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    private void zza(zzha zzha0, String s) {
        com.google.android.gms.ads.internal.zzm.3 zzm$30 = new Runnable() {
            @Override
            public void run() {
                try {
                    ((zzcx)zzm.this.zzon.zzqa.get(s)).zza(((zzf)zzha0.zzFq));
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteException0);
                }
            }
        };
        zzhl.zzGk.post(zzm$30);
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void zza(zzci zzci0) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void zza(zzff zzff0) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void zza(zzkw zzkw0) {
        zzu.zzbY("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.zzon.zzqa = zzkw0;
    }

    public void zza(List list0) {
        zzu.zzbY("setNativeTemplates must be called on the main UI thread.");
        this.zzon.zzqd = list0;
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    protected boolean zza(AdRequestParcel adRequestParcel0, zzha zzha0, boolean z) {
        return this.zzom.zzbp();
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    protected boolean zza(zzha zzha0, zzha zzha1) {
        this.zza(null);
        if(!this.zzon.zzbM()) {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        zza zzg$zza0 = zzha1.zzFq;
        if(zzg$zza0 instanceof zze && this.zzon.zzpY != null) {
            this.zze(zzha1);
            return super.zza(zzha0, zzha1);
        }
        if(zzg$zza0 instanceof zzd && this.zzon.zzpX != null) {
            this.zzd(zzha1);
            return super.zza(zzha0, zzha1);
        }
        if(zzg$zza0 instanceof zzf && this.zzon.zzqa != null && this.zzon.zzqa.get(((zzf)zzg$zza0).getCustomTemplateId()) != null) {
            this.zza(zzha1, ((zzf)zzg$zza0).getCustomTemplateId());
            return super.zza(zzha0, zzha1);
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("No matching listener for retrieved native ad template.");
        this.zze(0);
        return false;
    }

    public void zzb(NativeAdOptionsParcel nativeAdOptionsParcel0) {
        zzu.zzbY("setNativeAdOptions must be called on the main UI thread.");
        this.zzon.zzqb = nativeAdOptionsParcel0;
    }

    public void zzb(zzcu zzcu0) {
        zzu.zzbY("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.zzon.zzpX = zzcu0;
    }

    public void zzb(zzcv zzcv0) {
        zzu.zzbY("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.zzon.zzpY = zzcv0;
    }

    public void zzb(zzkw zzkw0) {
        zzu.zzbY("setOnCustomClickListener must be called on the main UI thread.");
        this.zzon.zzpZ = zzkw0;
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public boolean zzb(com.google.android.gms.internal.zzha.zza zzha$zza0) {
        if(zzha$zza0.zzpN != null) {
            this.zzon.zzpN = zzha$zza0.zzpN;
        }
        if(zzha$zza0.errorCode != -2) {
            this.zzb(new zzha(zzha$zza0, null, null, null, null, null, null));
            return false;
        }
        this.zzon.zzqh = 0;
        zzp zzp0 = this.zzon;
        zzp0.zzpM = zzo.zzbu().zza(this.zzon.zzpH, this, zzha$zza0, this.zzon.zzpI, null, this.zzoq, this);
        return true;
    }

    public zzkw zzbo() {
        zzu.zzbY("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzon.zzqa;
    }

    private void zzd(zzha zzha0) {
        com.google.android.gms.ads.internal.zzm.1 zzm$10 = new Runnable() {
            @Override
            public void run() {
                try {
                    zzm.this.zzon.zzpX.zza(((zzd)zzha0.zzFq));
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteException0);
                }
            }
        };
        zzhl.zzGk.post(zzm$10);
    }

    private void zze(zzha zzha0) {
        com.google.android.gms.ads.internal.zzm.2 zzm$20 = new Runnable() {
            @Override
            public void run() {
                try {
                    zzm.this.zzon.zzpY.zza(((zze)zzha0.zzFq));
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteException0);
                }
            }
        };
        zzhl.zzGk.post(zzm$20);
    }

    public zzcw zzq(String s) {
        zzu.zzbY("getOnCustomClickListener must be called on the main UI thread.");
        return (zzcw)this.zzon.zzpZ.get(s);
    }
}

