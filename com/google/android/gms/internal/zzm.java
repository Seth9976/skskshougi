package com.google.android.gms.internal;

public class zzm {
    public interface zza {
        void zze(zzr arg1);
    }

    public interface zzb {
        void zzb(Object arg1);
    }

    public final Object result;
    public final com.google.android.gms.internal.zzb.zza zzag;
    public final zzr zzah;
    public boolean zzai;

    private zzm(zzr zzr0) {
        this.zzai = false;
        this.result = null;
        this.zzag = null;
        this.zzah = zzr0;
    }

    private zzm(Object object0, com.google.android.gms.internal.zzb.zza zzb$zza0) {
        this.zzai = false;
        this.result = object0;
        this.zzag = zzb$zza0;
        this.zzah = null;
    }

    public boolean isSuccess() {
        return this.zzah == null;
    }

    public static zzm zza(Object object0, com.google.android.gms.internal.zzb.zza zzb$zza0) {
        return new zzm(object0, zzb$zza0);
    }

    public static zzm zzd(zzr zzr0) {
        return new zzm(zzr0);
    }
}

