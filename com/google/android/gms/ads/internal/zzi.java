package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.client.zzp.zza;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzkw;

@zzgd
public class zzi extends zza {
    private final Context mContext;
    private zzn zzoE;
    private NativeAdOptionsParcel zzoJ;
    private final String zzoL;
    private final VersionInfoParcel zzoM;
    private zzcu zzoP;
    private zzcv zzoQ;
    private zzkw zzoR;
    private zzkw zzoS;
    private final zzef zzoq;

    public zzi(Context context0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        this.mContext = context0;
        this.zzoL = s;
        this.zzoq = zzef0;
        this.zzoM = versionInfoParcel0;
        this.zzoS = new zzkw();
        this.zzoR = new zzkw();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzp
    public void zza(NativeAdOptionsParcel nativeAdOptionsParcel0) {
        this.zzoJ = nativeAdOptionsParcel0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzp
    public void zza(zzcu zzcu0) {
        this.zzoP = zzcu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzp
    public void zza(zzcv zzcv0) {
        this.zzoQ = zzcv0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzp
    public void zza(String s, zzcx zzcx0, zzcw zzcw0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.zzoS.put(s, zzcx0);
        this.zzoR.put(s, zzcw0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzp
    public void zzb(zzn zzn0) {
        this.zzoE = zzn0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzp
    public zzo zzbi() {
        return new zzh(this.mContext, this.zzoL, this.zzoq, this.zzoM, this.zzoE, this.zzoP, this.zzoQ, this.zzoS, this.zzoR, this.zzoJ);
    }
}

