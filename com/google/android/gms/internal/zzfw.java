package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.List;

@zzgd
public class zzfw extends zzfs {
    private zzdw zzBA;
    protected zzec zzBB;
    private zzef zzoq;
    private zzdy zzxn;

    zzfw(Context context0, zza zzha$zza0, zzid zzid0, zzef zzef0, com.google.android.gms.internal.zzft.zza zzft$zza0) {
        super(context0, zzha$zza0, zzid0, zzft$zza0);
        this.zzoq = zzef0;
        this.zzxn = zzha$zza0.zzFm;
    }

    @Override  // com.google.android.gms.internal.zzfs
    public void onStop() {
        synchronized(this.zzBr) {
            super.onStop();
            if(this.zzBA != null) {
                this.zzBA.cancel();
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzfs
    protected void zzh(long v) throws com.google.android.gms.internal.zzfs.zza {
        synchronized(this.zzBr) {
            this.zzBA = new zzdw(this.mContext, this.zzBs.zzFr, this.zzoq, this.zzxn);
        }
        this.zzBB = this.zzBA.zza(v, 60000L);
        switch(this.zzBB.zzxY) {
            case 0: {
                return;
            }
            case 1: {
                throw new com.google.android.gms.internal.zzfs.zza("No fill from any mediation ad networks.", 3);
            }
            default: {
                throw new com.google.android.gms.internal.zzfs.zza("Unexpected mediation result: " + this.zzBB.zzxY, 0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzfs
    protected zzha zzz(int v) {
        AdRequestInfoParcel adRequestInfoParcel0 = this.zzBs.zzFr;
        zzid zzid0 = this.zzoA;
        List list0 = this.zzBt.zzxF;
        List list1 = this.zzBt.zzxG;
        List list2 = this.zzBt.zzCM;
        int v1 = this.zzBt.orientation;
        long v2 = this.zzBt.zzxJ;
        boolean z = this.zzBt.zzCK;
        zzdx zzdx0 = this.zzBB == null ? null : this.zzBB.zzxZ;
        zzeg zzeg0 = this.zzBB == null ? null : this.zzBB.zzya;
        String s = this.zzBB == null ? "com.google.ads.mediation.admob.AdMobAdapter" : this.zzBB.zzyb;
        zzdy zzdy0 = this.zzxn;
        return this.zzBB == null ? new zzha(adRequestInfoParcel0.zzCm, zzid0, list0, v, list1, list2, v1, v2, adRequestInfoParcel0.zzCp, z, zzdx0, zzeg0, s, zzdy0, null, this.zzBt.zzCL, this.zzBs.zzpN, this.zzBt.zzCJ, this.zzBs.zzFo, this.zzBt.zzCO, this.zzBt.zzCP, this.zzBs.zzFl, null, adRequestInfoParcel0.zzCC) : new zzha(adRequestInfoParcel0.zzCm, zzid0, list0, v, list1, list2, v1, v2, adRequestInfoParcel0.zzCp, z, zzdx0, zzeg0, s, zzdy0, this.zzBB.zzyc, this.zzBt.zzCL, this.zzBs.zzpN, this.zzBt.zzCJ, this.zzBs.zzFo, this.zzBt.zzCO, this.zzBt.zzCP, this.zzBs.zzFl, null, adRequestInfoParcel0.zzCC);
    }
}

