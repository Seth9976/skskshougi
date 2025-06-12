package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhh;

@zzgd
public final class zzc {
    public interface zza {
        void zzb(AdResponseParcel arg1);
    }

    interface zzb {
        boolean zzd(AdRequestInfoParcel arg1);
    }

    public static zzhh zza(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0) {
        return zzc.zza(context0, adRequestInfoParcel0, zzc$zza0, new zzb() {
            // 去混淆评级： 低(20)
            @Override  // com.google.android.gms.ads.internal.request.zzc$zzb
            public boolean zzd(AdRequestInfoParcel adRequestInfoParcel0) {
                return adRequestInfoParcel0.zzpJ.zzGJ || GooglePlayServicesUtil.zzae(context0);
            }
        });
    }

    // 去混淆评级： 低(20)
    static zzhh zza(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0, zzb zzc$zzb0) {
        return zzc$zzb0.zzd(adRequestInfoParcel0) ? zzc.zzb(context0, adRequestInfoParcel0, zzc$zza0) : zzc.zzc(context0, adRequestInfoParcel0, zzc$zza0);
    }

    private static zzhh zzb(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0) {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Fetching ad response from local ad request service.");
        zzhh zzhh0 = new com.google.android.gms.ads.internal.request.zzd.zza(context0, adRequestInfoParcel0, zzc$zza0);
        ((com.google.android.gms.ads.internal.request.zzd.zza)zzhh0).zzgi();
        return zzhh0;
    }

    private static zzhh zzc(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0) {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Fetching ad response from remote ad request service.");
        if(!zzk.zzcA().zzP(context0)) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Failed to connect to remote ad request service.");
            return null;
        }
        return new com.google.android.gms.ads.internal.request.zzd.zzb(context0, adRequestInfoParcel0, zzc$zza0);
    }
}

