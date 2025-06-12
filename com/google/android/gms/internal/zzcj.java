package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzgd
public final class zzcj extends zza {
    private final OnCustomRenderedAdLoadedListener zzsY;

    public zzcj(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener0) {
        this.zzsY = onCustomRenderedAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.zzci
    public void zza(zzch zzch0) {
        zzcg zzcg0 = new zzcg(zzch0);
        this.zzsY.onCustomRenderedAdLoaded(zzcg0);
    }
}

