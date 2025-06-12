package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzao implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzko(x0);
    }

    static void zza(GetFdForAssetResponse getFdForAssetResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getFdForAssetResponse0.versionCode);
        zzb.zzc(parcel0, 2, getFdForAssetResponse0.statusCode);
        zzb.zza(parcel0, 3, getFdForAssetResponse0.zzaUy, v, false);
        zzb.zzH(parcel0, v1);
    }

    public GetFdForAssetResponse zzhg(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        ParcelFileDescriptor parcelFileDescriptor0 = null;
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
                    parcelFileDescriptor0 = (ParcelFileDescriptor)zza.zza(parcel0, v3, ParcelFileDescriptor.CREATOR);
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
        return new GetFdForAssetResponse(v2, v, parcelFileDescriptor0);
    }

    public GetFdForAssetResponse[] zzko(int v) {
        return new GetFdForAssetResponse[v];
    }
}

