package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzgd
public class zzha {
    @zzgd
    public static final class zza {
        public final int errorCode;
        public final JSONObject zzFl;
        public final zzdy zzFm;
        public final long zzFo;
        public final long zzFp;
        public final AdRequestInfoParcel zzFr;
        public final AdResponseParcel zzFs;
        public final AdSizeParcel zzpN;

        public zza(AdRequestInfoParcel adRequestInfoParcel0, AdResponseParcel adResponseParcel0, zzdy zzdy0, AdSizeParcel adSizeParcel0, int v, long v1, long v2, JSONObject jSONObject0) {
            this.zzFr = adRequestInfoParcel0;
            this.zzFs = adResponseParcel0;
            this.zzFm = zzdy0;
            this.zzpN = adSizeParcel0;
            this.errorCode = v;
            this.zzFo = v1;
            this.zzFp = v2;
            this.zzFl = jSONObject0;
        }
    }

    public final int errorCode;
    public final int orientation;
    public final String zzCC;
    public final long zzCJ;
    public final boolean zzCK;
    public final long zzCL;
    public final List zzCM;
    public final String zzCP;
    public final AdRequestParcel zzCm;
    public final String zzCp;
    public final JSONObject zzFl;
    public final zzdy zzFm;
    public final AdSizeParcel zzFn;
    public final long zzFo;
    public final long zzFp;
    public final com.google.android.gms.ads.internal.formats.zzg.zza zzFq;
    public final List zzxF;
    public final List zzxG;
    public final long zzxJ;
    public final zzdx zzxZ;
    public final zzeg zzya;
    public final String zzyb;
    public final zzea zzyc;
    public final zzid zzzE;

    public zzha(AdRequestParcel adRequestParcel0, zzid zzid0, List list0, int v, List list1, List list2, int v1, long v2, String s, boolean z, zzdx zzdx0, zzeg zzeg0, String s1, zzdy zzdy0, zzea zzea0, long v3, AdSizeParcel adSizeParcel0, long v4, long v5, long v6, String s2, JSONObject jSONObject0, com.google.android.gms.ads.internal.formats.zzg.zza zzg$zza0, String s3) {
        this.zzCm = adRequestParcel0;
        this.zzzE = zzid0;
        this.zzxF = list0 == null ? null : Collections.unmodifiableList(list0);
        this.errorCode = v;
        this.zzxG = list1 == null ? null : Collections.unmodifiableList(list1);
        this.zzCM = list2 == null ? null : Collections.unmodifiableList(list2);
        this.orientation = v1;
        this.zzxJ = v2;
        this.zzCp = s;
        this.zzCK = z;
        this.zzxZ = zzdx0;
        this.zzya = zzeg0;
        this.zzyb = s1;
        this.zzFm = zzdy0;
        this.zzyc = zzea0;
        this.zzCL = v3;
        this.zzFn = adSizeParcel0;
        this.zzCJ = v4;
        this.zzFo = v5;
        this.zzFp = v6;
        this.zzCP = s2;
        this.zzFl = jSONObject0;
        this.zzFq = zzg$zza0;
        this.zzCC = s3;
    }

    public zzha(zza zzha$zza0, zzid zzid0, zzdx zzdx0, zzeg zzeg0, String s, zzea zzea0, com.google.android.gms.ads.internal.formats.zzg.zza zzg$zza0) {
        this(zzha$zza0.zzFr.zzCm, zzid0, zzha$zza0.zzFs.zzxF, zzha$zza0.errorCode, zzha$zza0.zzFs.zzxG, zzha$zza0.zzFs.zzCM, zzha$zza0.zzFs.orientation, zzha$zza0.zzFs.zzxJ, zzha$zza0.zzFr.zzCp, zzha$zza0.zzFs.zzCK, zzdx0, zzeg0, s, zzha$zza0.zzFm, zzea0, zzha$zza0.zzFs.zzCL, zzha$zza0.zzpN, zzha$zza0.zzFs.zzCJ, zzha$zza0.zzFo, zzha$zza0.zzFp, zzha$zza0.zzFs.zzCP, zzha$zza0.zzFl, zzg$zza0, zzha$zza0.zzFr.zzCC);
    }

    public boolean zzbU() {
        return this.zzzE != null && this.zzzE.zzgF() != null ? this.zzzE.zzgF().zzbU() : false;
    }
}

