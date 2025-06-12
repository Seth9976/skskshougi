package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

@zzgd
public class zzdc extends zza {
    private final OnCustomTemplateAdLoadedListener zzvT;

    public zzdc(OnCustomTemplateAdLoadedListener nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0) {
        this.zzvT = nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.zzcx
    public void zza(zzcs zzcs0) {
        zzct zzct0 = new zzct(zzcs0);
        this.zzvT.onCustomTemplateAdLoaded(zzct0);
    }
}

