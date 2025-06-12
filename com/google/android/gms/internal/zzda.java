package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@zzgd
public class zzda extends zza {
    private final OnContentAdLoadedListener zzvR;

    public zzda(OnContentAdLoadedListener nativeContentAd$OnContentAdLoadedListener0) {
        this.zzvR = nativeContentAd$OnContentAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.zzcv
    public void zza(zzcq zzcq0) {
        zzcr zzcr0 = this.zzb(zzcq0);
        this.zzvR.onContentAdLoaded(zzcr0);
    }

    zzcr zzb(zzcq zzcq0) {
        return new zzcr(zzcq0);
    }
}

