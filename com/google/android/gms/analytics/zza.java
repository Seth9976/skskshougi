package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznr;
import com.google.android.gms.internal.zznu;
import java.util.ListIterator;

public class zza extends zznr {
    private final zzf zzIa;
    private boolean zzIb;

    public zza(zzf zzf0) {
        super(zzf0.zzhS(), zzf0.zzhP());
        this.zzIa = zzf0;
    }

    public void enableAdvertisingIdCollection(boolean enable) {
        this.zzIb = enable;
    }

    @Override  // com.google.android.gms.internal.zznr
    protected void zza(zzno zzno0) {
        zzip zzip0 = (zzip)zzno0.zze(zzip.class);
        if(TextUtils.isEmpty(zzip0.getClientId())) {
            zzip0.setClientId(this.zzIa.zzih().zziP());
        }
        if(this.zzIb && TextUtils.isEmpty(zzip0.zzhx())) {
            com.google.android.gms.analytics.internal.zza zza0 = this.zzIa.zzig();
            zzip0.zzaO(zza0.zzhC());
            zzip0.zzE(zza0.zzhy());
        }
    }

    public void zzaI(String s) {
        zzu.zzcj(s);
        this.zzaJ(s);
        this.zzwb().add(new zzb(this.zzIa, s));
    }

    public void zzaJ(String s) {
        Uri uri0 = zzb.zzaK(s);
        ListIterator listIterator0 = this.zzwb().listIterator();
        while(listIterator0.hasNext()) {
            if(uri0.equals(((zznu)listIterator0.next()).zzhe())) {
                listIterator0.remove();
            }
        }
    }

    zzf zzhb() {
        return this.zzIa;
    }

    @Override  // com.google.android.gms.internal.zznr
    public zzno zzhc() {
        zzno zzno0 = this.zzwa().zzvP();
        zzno0.zzb(this.zzIa.zzhX().zzix());
        zzno0.zzb(this.zzIa.zzhY().zzjE());
        this.zzd(zzno0);
        return zzno0;
    }
}

