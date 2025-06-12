package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;

public class zzcc {
    private boolean zzuy;

    public zzcc() {
        this.zzuy = false;
    }

    public zzcb zza(zzca zzca0) {
        return this.zza(zzca0, 1);
    }

    public zzcb zza(zzca zzca0, int v) {
        if(zzca0 == null) {
            throw new IllegalArgumentException("CSI configuration can\'t be null. ");
        }
        if(!zzca0.zzdc()) {
            zzb.zzaA("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if(zzca0.getContext() == null) {
            throw new IllegalArgumentException("Context can\'t be null. Please set up context in CsiConfiguration.");
        }
        if(TextUtils.isEmpty(zzca0.zzbR())) {
            throw new IllegalArgumentException("AfmaVersion can\'t be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        return this.zzb(zzca0, v);
    }

    private zzcb zzb(zzca zzca0, int v) {
        zzcb zzcb0 = new zzcb(zzca0.getContext(), zzca0.zzbR(), zzca0.zzdd(), zzca0.zzde(), zzca0.zzdf(), zzca0.zzdg(), zzca0.zzdh(), zzca0.zzdi(), v);
        this.zzuy = true;
        return zzcb0;
    }

    public zzcb zzb(zzca zzca0) {
        return this.zza(zzca0, 2);
    }

    public boolean zzdc() {
        return this.zzuy;
    }
}

