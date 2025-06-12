package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzac extends zzg {
    public zzac() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzq(iBinder0);
    }

    protected zzw zzq(IBinder iBinder0) {
        return zza.zzp(iBinder0);
    }

    public zzv zzt(Context context0) {
        if(zzk.zzcA().zzP(context0)) {
            zzv zzv0 = this.zzu(context0);
            if(zzv0 != null) {
                return zzv0;
            }
        }
        zzb.zzay("Using MobileAdsSettingManager from the client jar.");
        new VersionInfoParcel(7571000, 7571000, true);
        return zzl.zzq(context0);
    }

    private zzv zzu(Context context0) {
        try {
            zzd zzd0 = zze.zzw(context0);
            return com.google.android.gms.ads.internal.client.zzv.zza.zzo(((zzw)this.zzak(context0)).zza(zzd0, 7571000));
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not get remote MobileAdsSettingManager.", remoteException0);
            return null;
        }
        catch(com.google.android.gms.dynamic.zzg.zza zzg$zza0) {
            zzb.zzd("Could not get remote MobileAdsSettingManager.", zzg$zza0);
            return null;
        }
    }
}

