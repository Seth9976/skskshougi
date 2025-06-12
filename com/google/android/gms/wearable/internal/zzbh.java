package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzbh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhq(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzky(x0);
    }

    static void zza(StorageInfoResponse storageInfoResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, storageInfoResponse0.versionCode);
        zzb.zzc(parcel0, 2, storageInfoResponse0.statusCode);
        zzb.zza(parcel0, 3, storageInfoResponse0.zzaUN);
        zzb.zzc(parcel0, 4, storageInfoResponse0.zzaUP, false);
        zzb.zzH(parcel0, v1);
    }

    public StorageInfoResponse zzhq(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        long v2 = 0L;
        ArrayList arrayList0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v4);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v4, PackageStorageInfo.CREATOR);
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
        return new StorageInfoResponse(v3, v, v2, arrayList0);
    }

    public StorageInfoResponse[] zzky(int v) {
        return new StorageInfoResponse[v];
    }
}

