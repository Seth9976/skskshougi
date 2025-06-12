package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zze extends zzg {
    public zze() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private zzr zza(Context context0, AdSizeParcel adSizeParcel0, String s, zzee zzee0, int v) {
        try {
            zzd zzd0 = com.google.android.gms.dynamic.zze.zzw(context0);
            return zza.zzk(((zzs)this.zzak(context0)).zza(zzd0, adSizeParcel0, s, zzee0, 7571000, v));
        }
        catch(RemoteException | com.google.android.gms.dynamic.zzg.zza remoteException0) {
            zzb.zzd("Could not create remote AdManager.", remoteException0);
            return null;
        }
    }

    public zzr zza(Context context0, AdSizeParcel adSizeParcel0, String s, zzee zzee0) {
        if(zzk.zzcA().zzP(context0)) {
            zzr zzr0 = this.zza(context0, adSizeParcel0, s, zzee0, 1);
            if(zzr0 != null) {
                return zzr0;
            }
        }
        zzb.zzay("Using BannerAdManager from the client jar.");
        return new com.google.android.gms.ads.internal.zze(context0, adSizeParcel0, s, zzee0, new VersionInfoParcel(7571000, 7571000, true));
    }

    public zzr zzb(Context context0, AdSizeParcel adSizeParcel0, String s, zzee zzee0) {
        if(zzk.zzcA().zzP(context0)) {
            zzr zzr0 = this.zza(context0, adSizeParcel0, s, zzee0, 2);
            if(zzr0 != null) {
                return zzr0;
            }
        }
        zzb.zzaC("Using InterstitialAdManager from the client jar.");
        return new zzj(context0, adSizeParcel0, s, zzee0, new VersionInfoParcel(7571000, 7571000, true));
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zze(iBinder0);
    }

    protected zzs zze(IBinder iBinder0) {
        return com.google.android.gms.ads.internal.client.zzs.zza.zzl(iBinder0);
    }
}

