package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzco(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeh(x0);
    }

    static void zza(DataType dataType0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataType0.getName(), false);
        zzb.zzc(parcel0, 1000, dataType0.getVersionCode());
        zzb.zzc(parcel0, 2, dataType0.getFields(), false);
        zzb.zzH(parcel0, v1);
    }

    public DataType zzco(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzc(parcel0, v2, Field.CREATOR);
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
        return new DataType(v1, s, arrayList0);
    }

    public DataType[] zzeh(int v) {
        return new DataType[v];
    }
}

