package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzad implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgV(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkd(x0);
    }

    static void zza(DeleteDataItemsResponse deleteDataItemsResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, deleteDataItemsResponse0.versionCode);
        zzb.zzc(parcel0, 2, deleteDataItemsResponse0.statusCode);
        zzb.zzc(parcel0, 3, deleteDataItemsResponse0.zzaUp);
        zzb.zzH(parcel0, v1);
    }

    public DeleteDataItemsResponse zzgV(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new DeleteDataItemsResponse(v3, v2, v);
    }

    public DeleteDataItemsResponse[] zzkd(int v) {
        return new DeleteDataItemsResponse[v];
    }
}

