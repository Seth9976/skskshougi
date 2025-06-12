package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdm(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfh(x0);
    }

    static void zza(ReadRawResult readRawResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, readRawResult0.zzpx(), v, false);
        zzb.zzc(parcel0, 1000, readRawResult0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public ReadRawResult zzdm(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DataHolder dataHolder0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    dataHolder0 = (DataHolder)zza.zza(parcel0, v2, DataHolder.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ReadRawResult(v1, dataHolder0);
    }

    public ReadRawResult[] zzfh(int v) {
        return new ReadRawResult[v];
    }
}

