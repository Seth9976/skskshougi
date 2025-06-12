package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzdp extends zzhh {
    final zzid zzoA;
    final zzdr zzwB;
    private final String zzwC;

    zzdp(zzid zzid0, String s) {
        this.zzoA = zzid0;
        this.zzwB = new zzdr(zzid0);
        this.zzwC = s;
        zzo.zzbH().zza(this);
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
        this.zzwB.abort();
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        try {
            this.zzwB.zzW(this.zzwC);
        }
        finally {
            com.google.android.gms.internal.zzdp.1 zzdp$10 = new Runnable() {
                @Override
                public void run() {
                    zzo.zzbH().zzb(zzdp.this);
                }
            };
            zzhl.zzGk.post(zzdp$10);
        }
    }
}

