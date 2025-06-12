package com.google.android.gms.internal;

import java.util.Map;

@zzgd
public class zzdj implements zzdg {
    private final zzdk zzwu;

    public zzdj(zzdk zzdk0) {
        this.zzwu = zzdk0;
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        boolean z = "1".equals(map0.get("transparentBackground"));
        this.zzwu.zzd(z);
    }
}

