package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.request.zza;
import com.google.android.gms.internal.zzbw;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzdq;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgl;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;

@zzgd
public class zzo {
    private static final Object zzoW;
    private final zzbw zzpA;
    private final zzby zzpB;
    private final zzi zzpC;
    private final zzed zzpD;
    private final zzdq zzpE;
    private static zzo zzpn;
    private final zza zzpo;
    private final com.google.android.gms.ads.internal.overlay.zza zzpp;
    private final zzd zzpq;
    private final zzft zzpr;
    private final zzhl zzps;
    private final zzif zzpt;
    private final zzhm zzpu;
    private final zzhc zzpv;
    private final zzlb zzpw;
    private final zzcc zzpx;
    private final zzgl zzpy;
    private final zzbx zzpz;

    static {
        zzo.zzoW = new Object();
        zzo.zza(new zzo());
    }

    protected zzo() {
        this.zzpo = new zza();
        this.zzpp = new com.google.android.gms.ads.internal.overlay.zza();
        this.zzpq = new zzd();
        this.zzpr = new zzft();
        this.zzps = new zzhl();
        this.zzpt = new zzif();
        this.zzpu = zzhm.zzK(Build.VERSION.SDK_INT);
        this.zzpv = new zzhc(this.zzps);
        this.zzpw = new zzld();
        this.zzpx = new zzcc();
        this.zzpy = new zzgl();
        this.zzpz = new zzbx();
        this.zzpA = new zzbw();
        this.zzpB = new zzby();
        this.zzpC = new zzi();
        this.zzpD = new zzed();
        this.zzpE = new zzdq();
    }

    protected static void zza(zzo zzo0) {
        synchronized(zzo.zzoW) {
            zzo.zzpn = zzo0;
        }
    }

    public static zzcc zzbA() {
        return zzo.zzbq().zzpx;
    }

    public static zzgl zzbB() {
        return zzo.zzbq().zzpy;
    }

    public static zzbx zzbC() {
        return zzo.zzbq().zzpz;
    }

    public static zzbw zzbD() {
        return zzo.zzbq().zzpA;
    }

    public static zzby zzbE() {
        return zzo.zzbq().zzpB;
    }

    public static zzi zzbF() {
        return zzo.zzbq().zzpC;
    }

    public static zzed zzbG() {
        return zzo.zzbq().zzpD;
    }

    public static zzdq zzbH() {
        return zzo.zzbq().zzpE;
    }

    private static zzo zzbq() {
        synchronized(zzo.zzoW) {
        }
        return zzo.zzpn;
    }

    public static zza zzbr() {
        return zzo.zzbq().zzpo;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzbs() {
        return zzo.zzbq().zzpp;
    }

    public static zzd zzbt() {
        return zzo.zzbq().zzpq;
    }

    public static zzft zzbu() {
        return zzo.zzbq().zzpr;
    }

    public static zzhl zzbv() {
        return zzo.zzbq().zzps;
    }

    public static zzif zzbw() {
        return zzo.zzbq().zzpt;
    }

    public static zzhm zzbx() {
        return zzo.zzbq().zzpu;
    }

    public static zzhc zzby() {
        return zzo.zzbq().zzpv;
    }

    public static zzlb zzbz() {
        return zzo.zzbq().zzpw;
    }
}

