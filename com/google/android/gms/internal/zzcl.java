package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzgd
public class zzcl implements Image {
    private final Uri mUri;
    private final zzck zzvI;
    private final Drawable zzvJ;

    public zzcl(zzck zzck0) {
        Drawable drawable0;
        Uri uri0 = null;
        super();
        this.zzvI = zzck0;
        try {
            zzd zzd0 = this.zzvI.zzdw();
            if(zzd0 == null) {
                goto label_11;
            }
            else {
                drawable0 = (Drawable)zze.zzn(zzd0);
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get drawable.", remoteException0);
            drawable0 = null;
        }
        this.zzvJ = drawable0;
        uri0 = this.zzvI.getUri();
        this.mUri = uri0;
        return;
    label_11:
        drawable0 = null;
        try {
            this.zzvJ = drawable0;
            uri0 = this.zzvI.getUri();
        }
        catch(RemoteException remoteException1) {
            zzb.zzb("Failed to get uri.", remoteException1);
        }
        this.mUri = uri0;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public Drawable getDrawable() {
        return this.zzvJ;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public Uri getUri() {
        return this.mUri;
    }
}

