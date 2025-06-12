package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.client.zza.zza;

public class zzgm extends zza {
    private final int zzEL;
    private final String zzEl;

    public zzgm(String s, int v) {
        this.zzEl = s;
        this.zzEL = v;
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zza
    public int getAmount() {
        return this.zzEL;
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zza
    public String getType() {
        return this.zzEl;
    }
}

