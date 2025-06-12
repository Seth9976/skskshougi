package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.DataSource;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeu(x0);
    }

    static void zza(FitnessUnregistrationRequest fitnessUnregistrationRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, fitnessUnregistrationRequest0.getDataSource(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, fitnessUnregistrationRequest0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public FitnessUnregistrationRequest zzcA(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DataSource dataSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v2, DataSource.CREATOR);
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
        return new FitnessUnregistrationRequest(v1, dataSource0);
    }

    public FitnessUnregistrationRequest[] zzeu(int v) {
        return new FitnessUnregistrationRequest[v];
    }
}

