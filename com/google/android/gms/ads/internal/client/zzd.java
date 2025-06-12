package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class zzd extends zzg {
    private static final zzd zzrW;

    static {
        zzd.zzrW = new zzd();
    }

    private zzd() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public static zzp zza(Context context0, String s, zzee zzee0) {
        if(zzk.zzcA().zzP(context0)) {
            zzp zzp0 = zzd.zzrW.zzb(context0, s, zzee0);
            if(zzp0 != null) {
                return zzp0;
            }
        }
        zzb.zzay("Using AdLoader from the client jar.");
        return new zzi(context0, s, zzee0, new VersionInfoParcel(7571000, 7571000, true));
    }

    private zzp zzb(Context context0, String s, zzee zzee0) {
        try {
            com.google.android.gms.dynamic.zzd zzd0 = zze.zzw(context0);
            return zza.zzi(((zzq)this.zzak(context0)).zza(zzd0, s, zzee0, 7571000));
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not create remote builder for AdLoader.", remoteException0);
            return null;
        }
        catch(com.google.android.gms.dynamic.zzg.zza zzg$zza0) {
            zzb.zzd("Could not create remote builder for AdLoader.", zzg$zza0);
            return null;
        }
    }

    protected zzq zzc(IBinder iBinder0) {
        return com.google.android.gms.ads.internal.client.zzq.zza.zzj(iBinder0);
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzc(iBinder0);
    }
}

