package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzba implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhl(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkt(x0);
    }

    static void zza(PackageStorageInfo packageStorageInfo0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, packageStorageInfo0.versionCode);
        zzb.zza(parcel0, 2, packageStorageInfo0.packageName, false);
        zzb.zza(parcel0, 3, packageStorageInfo0.label, false);
        zzb.zza(parcel0, 4, packageStorageInfo0.zzaUN);
        zzb.zzH(parcel0, v1);
    }

    public PackageStorageInfo zzhl(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    v2 = zza.zzi(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PackageStorageInfo(v1, s1, s, v2);
    }

    public PackageStorageInfo[] zzkt(int v) {
        return new PackageStorageInfo[v];
    }
}

