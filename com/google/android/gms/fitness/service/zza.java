package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdq(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfl(x0);
    }

    static void zza(FitnessSensorServiceRequest fitnessSensorServiceRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, fitnessSensorServiceRequest0.getDataSource(), v, false);
        zzb.zzc(parcel0, 1000, fitnessSensorServiceRequest0.getVersionCode());
        zzb.zza(parcel0, 2, fitnessSensorServiceRequest0.zzrl(), false);
        zzb.zza(parcel0, 3, fitnessSensorServiceRequest0.zzqL());
        zzb.zza(parcel0, 4, fitnessSensorServiceRequest0.zzrB());
        zzb.zzH(parcel0, v1);
    }

    public FitnessSensorServiceRequest zzdq(Parcel parcel0) {
        long v = 0L;
        IBinder iBinder0 = null;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v2 = 0;
        long v3 = 0L;
        DataSource dataSource0 = null;
        while(parcel0.dataPosition() < v1) {
            int v4 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    dataSource0 = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel0, v4);
                    break;
                }
                case 3: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v4);
                    break;
                }
                case 4: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v4);
                    break;
                }
                case 1000: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new FitnessSensorServiceRequest(v2, dataSource0, iBinder0, v3, v);
    }

    public FitnessSensorServiceRequest[] zzfl(int v) {
        return new FitnessSensorServiceRequest[v];
    }
}

