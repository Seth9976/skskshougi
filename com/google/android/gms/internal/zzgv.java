package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Future;

@zzgd
public class zzgv extends zzhh implements zzgu {
    private final Context mContext;
    private final zza zzBs;
    private final String zzEO;
    private final ArrayList zzFe;
    private final ArrayList zzFf;
    private final HashSet zzFg;
    private final zzgo zzFh;
    private final Object zzqt;

    public zzgv(Context context0, String s, zza zzha$zza0, zzgo zzgo0) {
        this.zzFe = new ArrayList();
        this.zzFf = new ArrayList();
        this.zzFg = new HashSet();
        this.zzqt = new Object();
        this.mContext = context0;
        this.zzEO = s;
        this.zzBs = zzha$zza0;
        this.zzFh = zzgo0;
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
    }

    @Override  // com.google.android.gms.internal.zzgu
    public void zzap(String s) {
        synchronized(this.zzqt) {
            this.zzFg.add(s);
        }
    }

    @Override  // com.google.android.gms.internal.zzgu
    public void zzb(String s, int v) {
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        for(Object object0: this.zzBs.zzFm.zzxD) {
            String s = ((zzdx)object0).zzxz;
            for(Object object1: ((zzdx)object0).zzxu) {
                this.zzj(((String)object1), s);
            }
        }
        int v = 0;
        while(v < this.zzFe.size()) {
            try {
                ((Future)this.zzFe.get(v)).get();
                goto label_15;
            }
            catch(InterruptedException unused_ex) {
                break;
            }
            catch(Exception unused_ex) {
            }
            goto label_26;
        label_15:
            synchronized(this.zzqt) {
                Object object3 = this.zzFf.get(v);
                if(this.zzFg.contains(object3)) {
                    String s1 = (String)this.zzFf.get(v);
                    zzdx zzdx0 = (zzdx)this.zzBs.zzFm.zzxD.get(v);
                    com.google.android.gms.internal.zzgv.1 zzgv$10 = new Runnable() {
                        @Override
                        public void run() {
                            zzgv.this.zzFh.zzb(new zzha(this.zzBs.zzFr.zzCm, null, this.zzBs.zzFs.zzxF, -2, this.zzBs.zzFs.zzxG, this.zzBs.zzFs.zzCM, this.zzBs.zzFs.orientation, this.zzBs.zzFs.zzxJ, this.zzBs.zzFr.zzCp, this.zzBs.zzFs.zzCK, zzdx0, null, s1, this.zzBs.zzFm, null, this.zzBs.zzFs.zzCL, this.zzBs.zzpN, this.zzBs.zzFs.zzCJ, this.zzBs.zzFo, this.zzBs.zzFs.zzCO, this.zzBs.zzFs.zzCP, this.zzBs.zzFl, null, this.zzBs.zzFr.zzCC));
                        }
                    };
                    com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzgv$10);
                    return;
                }
                goto label_26;
            }
            return;
        label_26:
            ++v;
        }
        com.google.android.gms.internal.zzgv.2 zzgv$20 = new Runnable() {
            @Override
            public void run() {
                zzgv.this.zzFh.zzb(new zzha(this.zzBs.zzFr.zzCm, null, this.zzBs.zzFs.zzxF, 3, this.zzBs.zzFs.zzxG, this.zzBs.zzFs.zzCM, this.zzBs.zzFs.orientation, this.zzBs.zzFs.zzxJ, this.zzBs.zzFr.zzCp, this.zzBs.zzFs.zzCK, null, null, null, this.zzBs.zzFm, null, this.zzBs.zzFs.zzCL, this.zzBs.zzpN, this.zzBs.zzFs.zzCJ, this.zzBs.zzFo, this.zzBs.zzFs.zzCO, this.zzBs.zzFs.zzCP, this.zzBs.zzFl, null, this.zzBs.zzFr.zzCC));
            }
        };
        com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzgv$20);
    }

    private void zzj(String s, String s1) {
        synchronized(this.zzqt) {
            zzgp zzgp0 = this.zzFh.zzao(s);
            if(zzgp0 == null || zzgp0.zzfN() == null || zzgp0.zzfM() == null) {
                return;
            }
            Future future0 = new zzgq(this.mContext, s, this.zzEO, s1, this.zzBs, zzgp0, this).zzgi();
            this.zzFe.add(future0);
            this.zzFf.add(s);
        }
    }
}

