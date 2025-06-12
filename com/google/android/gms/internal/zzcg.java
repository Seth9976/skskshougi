package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzgd
public class zzcg implements CustomRenderedAd {
    private final zzch zzuV;

    public zzcg(zzch zzch0) {
        this.zzuV = zzch0;
    }

    @Override  // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public String getBaseUrl() {
        try {
            return this.zzuV.zzdt();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not delegate getBaseURL to CustomRenderedAd", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public String getContent() {
        try {
            return this.zzuV.getContent();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not delegate getContent to CustomRenderedAd", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public void onAdRendered(View view) {
        try {
            zzd zzd0 = view == null ? null : zze.zzw(view);
            this.zzuV.zza(zzd0);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not delegate onAdRendered to CustomRenderedAd", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public void recordClick() {
        try {
            this.zzuV.recordClick();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not delegate recordClick to CustomRenderedAd", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public void recordImpression() {
        try {
            this.zzuV.recordImpression();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not delegate recordImpression to CustomRenderedAd", remoteException0);
        }
    }
}

