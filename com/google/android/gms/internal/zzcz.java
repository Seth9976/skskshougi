package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@zzgd
public class zzcz extends zza {
    private final OnAppInstallAdLoadedListener zzvQ;

    public zzcz(OnAppInstallAdLoadedListener nativeAppInstallAd$OnAppInstallAdLoadedListener0) {
        this.zzvQ = nativeAppInstallAd$OnAppInstallAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.zzcu
    public void zza(zzco zzco0) {
        zzcp zzcp0 = this.zzb(zzco0);
        this.zzvQ.onAppInstallAdLoaded(zzcp0);
    }

    zzcp zzb(zzco zzco0) {
        return new zzcp(zzco0);
    }
}

