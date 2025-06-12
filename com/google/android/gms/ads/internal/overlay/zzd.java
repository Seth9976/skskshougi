package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzo;

public class zzd {
    public void zza(Context context0, AdOverlayInfoParcel adOverlayInfoParcel0) {
        this.zza(context0, adOverlayInfoParcel0, true);
    }

    public void zza(Context context0, AdOverlayInfoParcel adOverlayInfoParcel0, boolean z) {
        if(adOverlayInfoParcel0.zzzK == 4 && adOverlayInfoParcel0.zzzD == null) {
            if(adOverlayInfoParcel0.zzzC != null) {
                adOverlayInfoParcel0.zzzC.onAdClicked();
            }
            zzo.zzbs().zza(context0, adOverlayInfoParcel0.zzzB, adOverlayInfoParcel0.zzzJ);
            return;
        }
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.ads.AdActivity");
        intent0.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel0.zzpJ.zzGJ);
        intent0.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent0, adOverlayInfoParcel0);
        if(!(context0 instanceof Activity)) {
            intent0.addFlags(0x10000000);
        }
        context0.startActivity(intent0);
    }
}

