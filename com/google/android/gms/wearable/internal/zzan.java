package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzan implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhf(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkn(x0);
    }

    static void zza(GetDataItemResponse getDataItemResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getDataItemResponse0.versionCode);
        zzb.zzc(parcel0, 2, getDataItemResponse0.statusCode);
        zzb.zza(parcel0, 3, getDataItemResponse0.zzaUx, v, false);
        zzb.zzH(parcel0, v1);
    }

    public GetDataItemResponse zzhf(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        DataItemParcelable dataItemParcelable0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    dataItemParcelable0 = (DataItemParcelable)zza.zza(parcel0, v3, DataItemParcelable.CREATOR);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GetDataItemResponse(v2, v, dataItemParcelable0);
    }

    public GetDataItemResponse[] zzkn(int v) {
        return new GetDataItemResponse[v];
    }
}

