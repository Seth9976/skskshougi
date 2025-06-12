package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzcy;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzk {
    private static final Object zzoW;
    private static zzk zzss;
    private final zza zzst;
    private final zze zzsu;
    private final zzl zzsv;
    private final zzac zzsw;
    private final zzcy zzsx;
    private final zzf zzsy;

    static {
        zzk.zzoW = new Object();
        zzk.zza(new zzk());
    }

    protected zzk() {
        this.zzst = new zza();
        this.zzsu = new zze();
        this.zzsv = new zzl();
        this.zzsw = new zzac();
        this.zzsx = new zzcy();
        this.zzsy = new zzf();
    }

    protected static void zza(zzk zzk0) {
        synchronized(zzk.zzoW) {
            zzk.zzss = zzk0;
        }
    }

    public static zza zzcA() {
        return zzk.zzcz().zzst;
    }

    public static zze zzcB() {
        return zzk.zzcz().zzsu;
    }

    public static zzl zzcC() {
        return zzk.zzcz().zzsv;
    }

    public static zzac zzcD() {
        return zzk.zzcz().zzsw;
    }

    public static zzcy zzcE() {
        return zzk.zzcz().zzsx;
    }

    public static zzf zzcF() {
        return zzk.zzcz().zzsy;
    }

    private static zzk zzcz() {
        synchronized(zzk.zzoW) {
        }
        return zzk.zzss;
    }
}

