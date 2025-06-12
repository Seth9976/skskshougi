package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzm;

@zzgd
public class zzft {
    public interface zza {
        void zzb(zzha arg1);
    }

    public zzhh zza(Context context0, com.google.android.gms.ads.internal.zza zza0, com.google.android.gms.internal.zzha.zza zzha$zza0, zzan zzan0, zzid zzid0, zzef zzef0, zza zzft$zza0) {
        zzhh zzhh0;
        AdResponseParcel adResponseParcel0 = zzha$zza0.zzFs;
        if(adResponseParcel0.zzsp) {
            if(!(zza0 instanceof zzm)) {
                throw new IllegalArgumentException("Invalid NativeAdManager type. Found: " + (zza0 == null ? "null" : zza0.getClass().getName()) + "; Required: NativeAdManager.");
            }
            zzhh0 = new zzfx(context0, ((zzm)zza0), new zzbc(), zzha$zza0, zzan0, zzft$zza0);
        }
        else if(adResponseParcel0.zzCK) {
            zzhh0 = new zzfw(context0, zzha$zza0, zzid0, zzef0, zzft$zza0);
        }
        else if(adResponseParcel0.zzCQ) {
            zzhh0 = new zzfr(context0, zzha$zza0, zzid0, zzft$zza0);
        }
        else if(!((Boolean)zzbz.zzuj.get()).booleanValue() || true || !zzid0.zzaN().zzsn) {
            zzhh0 = new zzfu(context0, zzha$zza0, zzid0, zzft$zza0);
        }
        else {
            zzhh0 = new zzfv(context0, zzha$zza0, zzid0, zzft$zza0);
        }
        zzhh0.zzgj();
        return zzhh0;
    }
}

