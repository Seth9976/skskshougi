package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzgd
public final class zzcf extends zza {
    private final zzf zzuS;
    private final String zzuT;
    private final String zzuU;

    public zzcf(zzf zzf0, String s, String s1) {
        this.zzuS = zzf0;
        this.zzuT = s;
        this.zzuU = s1;
    }

    @Override  // com.google.android.gms.internal.zzch
    public String getContent() {
        return this.zzuU;
    }

    @Override  // com.google.android.gms.internal.zzch
    public void recordClick() {
        this.zzuS.recordClick();
    }

    @Override  // com.google.android.gms.internal.zzch
    public void recordImpression() {
        this.zzuS.recordImpression();
    }

    @Override  // com.google.android.gms.internal.zzch
    public void zza(zzd zzd0) {
        if(zzd0 == null) {
            return;
        }
        View view0 = (View)zze.zzn(zzd0);
        this.zzuS.zzc(view0);
    }

    @Override  // com.google.android.gms.internal.zzch
    public String zzdt() {
        return this.zzuT;
    }
}

