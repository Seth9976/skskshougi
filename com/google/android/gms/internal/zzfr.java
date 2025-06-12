package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzgd
public class zzfr extends zzfp {
    zzfr(Context context0, zza zzha$zza0, zzid zzid0, com.google.android.gms.internal.zzft.zza zzft$zza0) {
        super(context0, zzha$zza0, zzid0, zzft$zza0);
    }

    @Override  // com.google.android.gms.internal.zzfs
    protected void zzh(long v) throws com.google.android.gms.internal.zzfs.zza {
        int v2;
        int v1;
        AdSizeParcel adSizeParcel0 = this.zzoA.zzaN();
        if(adSizeParcel0.zzsn) {
            v1 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            v2 = this.mContext.getResources().getDisplayMetrics().heightPixels;
        }
        else {
            v1 = adSizeParcel0.widthPixels;
            v2 = adSizeParcel0.heightPixels;
        }
        zzfq zzfq0 = new zzfq(this, this.zzoA, v1, v2);
        com.google.android.gms.internal.zzfr.1 zzfr$10 = new Runnable() {
            @Override
            public void run() {
                synchronized(zzfr.this.zzqt) {
                    if(zzfr.this.zzBt.errorCode != -2) {
                        return;
                    }
                    zzfr.this.zzoA.zzgF().zza(zzfr.this);
                    zzfq0.zza(zzfr.this.zzBt);
                }
            }
        };
        zzhl.zzGk.post(zzfr$10);
        this.zzg(v);
        if(zzfq0.zzfl()) {
            zzb.zzay("Ad-Network indicated no fill with passback URL.");
            throw new com.google.android.gms.internal.zzfs.zza("AdNetwork sent passback url", 3);
        }
        if(!zzfq0.zzfm()) {
            throw new com.google.android.gms.internal.zzfs.zza("AdNetwork timed out", 2);
        }
    }
}

