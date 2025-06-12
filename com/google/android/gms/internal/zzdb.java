package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@zzgd
public class zzdb extends zza {
    private final OnCustomClickListener zzvS;

    public zzdb(OnCustomClickListener nativeCustomTemplateAd$OnCustomClickListener0) {
        this.zzvS = nativeCustomTemplateAd$OnCustomClickListener0;
    }

    @Override  // com.google.android.gms.internal.zzcw
    public void zza(zzcs zzcs0, String s) {
        zzct zzct0 = new zzct(zzcs0);
        this.zzvS.onCustomClick(zzct0, s);
    }
}

