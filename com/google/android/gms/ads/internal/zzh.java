package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzo.zza;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzkw;
import java.util.ArrayList;
import java.util.List;

@zzgd
public class zzh extends zza {
    private final Context mContext;
    private final zzn zzoE;
    private final zzcu zzoF;
    private final zzcv zzoG;
    private final zzkw zzoH;
    private final zzkw zzoI;
    private final NativeAdOptionsParcel zzoJ;
    private final List zzoK;
    private final String zzoL;
    private final VersionInfoParcel zzoM;
    private final zzef zzoq;

    zzh(Context context0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0, zzn zzn0, zzcu zzcu0, zzcv zzcv0, zzkw zzkw0, zzkw zzkw1, NativeAdOptionsParcel nativeAdOptionsParcel0) {
        this.mContext = context0;
        this.zzoL = s;
        this.zzoq = zzef0;
        this.zzoM = versionInfoParcel0;
        this.zzoE = zzn0;
        this.zzoG = zzcv0;
        this.zzoF = zzcu0;
        this.zzoH = zzkw0;
        this.zzoI = zzkw1;
        this.zzoJ = nativeAdOptionsParcel0;
        this.zzoK = this.zzbg();
    }

    protected void runOnUiThread(Runnable runnable) {
        zzhl.zzGk.post(runnable);
    }

    private List zzbg() {
        List list0 = new ArrayList();
        if(this.zzoG != null) {
            list0.add("1");
        }
        if(this.zzoF != null) {
            list0.add("2");
        }
        if(this.zzoH.size() > 0) {
            list0.add("3");
        }
        return list0;
    }

    protected zzm zzbh() {
        AdSizeParcel adSizeParcel0 = AdSizeParcel.zzs(this.mContext);
        return new zzm(this.mContext, adSizeParcel0, this.zzoL, this.zzoq, this.zzoM);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzo
    public void zze(AdRequestParcel adRequestParcel0) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzm zzm0 = zzh.this.zzbh();
                zzm0.zzb(zzh.this.zzoF);
                zzm0.zzb(zzh.this.zzoG);
                zzm0.zza(zzh.this.zzoH);
                zzm0.zza(zzh.this.zzoE);
                zzm0.zzb(zzh.this.zzoI);
                zzm0.zza(zzh.this.zzbg());
                zzm0.zzb(zzh.this.zzoJ);
                zzm0.zza(adRequestParcel0);
            }
        });
    }
}

