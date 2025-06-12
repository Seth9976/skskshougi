package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdk(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzff(x0);
    }

    static void zza(DataTypeResult dataTypeResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataTypeResult0.getStatus(), v, false);
        zzb.zzc(parcel0, 1000, dataTypeResult0.getVersionCode());
        zzb.zza(parcel0, 3, dataTypeResult0.getDataType(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public DataTypeResult zzdk(Parcel parcel0) {
        int v3;
        Status status1;
        DataType dataType1;
        DataType dataType0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Status status0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    dataType1 = dataType0;
                    status1 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 3: {
                    dataType1 = (DataType)zza.zza(parcel0, v2, DataType.CREATOR);
                    status1 = status0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    status1 = status0;
                    v3 = zza.zzg(parcel0, v2);
                    dataType1 = dataType0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    dataType1 = dataType0;
                    status1 = status0;
                    v3 = v1;
                }
            }
            v1 = v3;
            status0 = status1;
            dataType0 = dataType1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new DataTypeResult(v1, status0, dataType0);
    }

    public DataTypeResult[] zzff(int v) {
        return new DataTypeResult[v];
    }
}

