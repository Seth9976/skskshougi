package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class zzi extends zza {
    private final AppEventListener zzsq;

    public zzi(AppEventListener appEventListener0) {
        this.zzsq = appEventListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzt
    public void onAppEvent(String name, String info) {
        this.zzsq.onAppEvent(name, info);
    }
}

