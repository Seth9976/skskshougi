package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzck.zza;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzc extends zza {
    private final Uri mUri;
    private final Drawable zzvg;

    public zzc(Drawable drawable0, Uri uri0) {
        this.zzvg = drawable0;
        this.mUri = uri0;
    }

    @Override  // com.google.android.gms.internal.zzck
    public Uri getUri() throws RemoteException {
        return this.mUri;
    }

    @Override  // com.google.android.gms.internal.zzck
    public zzd zzdw() throws RemoteException {
        return zze.zzw(this.zzvg);
    }
}

