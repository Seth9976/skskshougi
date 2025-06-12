package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbP(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdE(x0);
    }

    static void zza(MatchAllFilter matchAllFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, matchAllFilter0.zzCY);
        zzb.zzH(parcel0, v1);
    }

    public MatchAllFilter zzbP(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            if((0xFFFF & v2) == 1000) {
                v1 = zza.zzg(parcel0, v2);
            }
            else {
                zza.zzb(parcel0, v2);
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new MatchAllFilter(v1);
    }

    public MatchAllFilter[] zzdE(int v) {
        return new MatchAllFilter[v];
    }
}

