package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;

@zzgd
public class zzct implements NativeCustomTemplateAd {
    private final zzcs zzvP;

    public zzct(zzcs zzcs0) {
        this.zzvP = zzcs0;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public List getAvailableAssetNames() {
        try {
            return this.zzvP.getAvailableAssetNames();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get available asset names.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public String getCustomTemplateId() {
        try {
            return this.zzvP.getCustomTemplateId();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get custom template id.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public Image getImage(String assetName) {
        try {
            zzck zzck0 = this.zzvP.zzR(assetName);
            if(zzck0 != null) {
                return new zzcl(zzck0);
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get image.", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public CharSequence getText(String assetName) {
        try {
            return this.zzvP.zzQ(assetName);
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get string.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public void performClick(String assetName) {
        try {
            this.zzvP.performClick(assetName);
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to perform click.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public void recordImpression() {
        try {
            this.zzvP.recordImpression();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to record impression.", remoteException0);
        }
    }
}

