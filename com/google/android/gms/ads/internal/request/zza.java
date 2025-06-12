package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhh;

@zzgd
public class zza {
    public interface com.google.android.gms.ads.internal.request.zza.zza {
        void zza(com.google.android.gms.internal.zzha.zza arg1);
    }

    public zzhh zza(Context context0, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza adRequestInfoParcel$zza0, zzan zzan0, com.google.android.gms.ads.internal.request.zza.zza zza$zza0) {
        zzhh zzhh0 = !((Boolean)zzbz.zzuu.get()).booleanValue() || adRequestInfoParcel$zza0.zzCm.extras.getBundle("sdk_less_server_data") == null ? new zzb(context0, adRequestInfoParcel$zza0, zzan0, zza$zza0) : new zzl(context0, adRequestInfoParcel$zza0, zza$zza0);
        zzhh0.zzgj();
        return zzhh0;
    }
}

