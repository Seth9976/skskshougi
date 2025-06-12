package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzae(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbE(x0);
    }

    static void zza(ConverterWrapper converterWrapper0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, converterWrapper0.getVersionCode());
        zzb.zza(parcel0, 2, converterWrapper0.zzoh(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public ConverterWrapper zzae(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        StringToIntConverter stringToIntConverter0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    stringToIntConverter0 = (StringToIntConverter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, StringToIntConverter.CREATOR);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ConverterWrapper(v1, stringToIntConverter0);
    }

    public ConverterWrapper[] zzbE(int v) {
        return new ConverterWrapper[v];
    }
}

