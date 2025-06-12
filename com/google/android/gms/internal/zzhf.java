package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzhf {
    private int zzFV;
    private int zzFW;
    private final String zzFv;
    private final zzhc zzpv;
    private final Object zzqt;

    zzhf(zzhc zzhc0, String s) {
        this.zzqt = new Object();
        this.zzpv = zzhc0;
        this.zzFv = s;
    }

    public zzhf(String s) {
        this(zzo.zzby(), s);
    }

    public Bundle toBundle() {
        synchronized(this.zzqt) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("pmnli", this.zzFV);
            bundle0.putInt("pmnll", this.zzFW);
            return bundle0;
        }
    }

    public void zzf(int v, int v1) {
        synchronized(this.zzqt) {
            this.zzFV = v;
            this.zzFW = v1;
            this.zzpv.zza(this.zzFv, this);
        }
    }
}

