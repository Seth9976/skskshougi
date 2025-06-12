package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzf(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzr(x0);
    }

    static void zza(NativeAdOptionsParcel nativeAdOptionsParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, nativeAdOptionsParcel0.versionCode);
        zzb.zza(parcel0, 2, nativeAdOptionsParcel0.zzvC);
        zzb.zzc(parcel0, 3, nativeAdOptionsParcel0.zzvD);
        zzb.zza(parcel0, 4, nativeAdOptionsParcel0.zzvE);
        zzb.zzH(parcel0, v1);
    }

    public NativeAdOptionsParcel zzf(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        boolean z1 = false;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    z1 = zza.zzc(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v3);
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
        return new NativeAdOptionsParcel(v2, z1, v1, z);
    }

    public NativeAdOptionsParcel[] zzr(int v) {
        return new NativeAdOptionsParcel[v];
    }
}

