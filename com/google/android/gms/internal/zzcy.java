package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

public class zzcy extends zzg {
    public zzcy() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    protected zzcn zzD(IBinder iBinder0) {
        return zza.zzv(iBinder0);
    }

    public zzcm zza(Context context0, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        if(zzk.zzcA().zzP(context0)) {
            zzcm zzcm0 = this.zzb(context0, frameLayout0, frameLayout1);
            if(zzcm0 != null) {
                return zzcm0;
            }
        }
        zzb.zzay("Using NativeAdViewDelegate from the client jar.");
        return new zzi(frameLayout0, frameLayout1);
    }

    private zzcm zzb(Context context0, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        try {
            zzd zzd0 = zze.zzw(context0);
            zzd zzd1 = zze.zzw(frameLayout0);
            zzd zzd2 = zze.zzw(frameLayout1);
            return com.google.android.gms.internal.zzcm.zza.zzu(((zzcn)this.zzak(context0)).zza(zzd0, zzd1, zzd2, 7571000));
        }
        catch(RemoteException | com.google.android.gms.dynamic.zzg.zza remoteException0) {
            zzb.zzd("Could not create remote NativeAdViewDelegate.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzD(iBinder0);
    }
}

