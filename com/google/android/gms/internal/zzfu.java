package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzfu extends zzfp {
    zzfu(Context context0, zza zzha$zza0, zzid zzid0, com.google.android.gms.internal.zzft.zza zzft$zza0) {
        super(context0, zzha$zza0, zzid0, zzft$zza0);
    }

    protected void zzfn() {
    }

    @Override  // com.google.android.gms.internal.zzfs
    protected void zzh(long v) throws com.google.android.gms.internal.zzfs.zza {
        com.google.android.gms.internal.zzfu.1 zzfu$10 = new Runnable() {
            @Override
            public void run() {
                synchronized(zzfu.this.zzqt) {
                    if(zzfu.this.zzBt.errorCode != -2) {
                        return;
                    }
                    zzfu.this.zzoA.zzgF().zza(zzfu.this);
                    zzfu.this.zzfn();
                    zzb.zzaB("Loading HTML in WebView.");
                    zzfu.this.zzoA.loadDataWithBaseURL(zzo.zzbv().zzat(zzfu.this.zzBt.zzzG), zzfu.this.zzBt.zzCI, "text/html", "UTF-8", null);
                }
            }
        };
        zzhl.zzGk.post(zzfu$10);
        this.zzg(v);
    }
}

