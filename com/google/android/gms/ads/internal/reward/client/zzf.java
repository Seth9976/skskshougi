package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgn;

@zzgd
public class zzf extends zzg {
    public zzf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public zzb zza(Context context0, zzee zzee0) {
        if(zzk.zzcA().zzP(context0)) {
            zzb zzb0 = this.zzb(context0, zzee0);
            if(zzb0 != null) {
                return zzb0;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Using RewardedVideoAd from the client jar.");
        return new zzgn(context0, zzee0, new VersionInfoParcel(7571000, 7571000, true));
    }

    protected zzc zzaa(IBinder iBinder0) {
        return zza.zzY(iBinder0);
    }

    private zzb zzb(Context context0, zzee zzee0) {
        try {
            zzd zzd0 = zze.zzw(context0);
            return com.google.android.gms.ads.internal.reward.client.zzb.zza.zzX(((zzc)this.zzak(context0)).zza(zzd0, zzee0, 7571000));
        }
        catch(RemoteException | com.google.android.gms.dynamic.zzg.zza remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get remote RewardedVideoAd.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzaa(iBinder0);
    }
}

