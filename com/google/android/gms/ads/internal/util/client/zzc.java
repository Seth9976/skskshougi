package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzp(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzM(x0);
    }

    public VersionInfoParcel[] zzM(int v) {
        return new VersionInfoParcel[v];
    }

    static void zza(VersionInfoParcel versionInfoParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, versionInfoParcel0.versionCode);
        zzb.zza(parcel0, 2, versionInfoParcel0.zzGG, false);
        zzb.zzc(parcel0, 3, versionInfoParcel0.zzGH);
        zzb.zzc(parcel0, 4, versionInfoParcel0.zzGI);
        zzb.zza(parcel0, 5, versionInfoParcel0.zzGJ);
        zzb.zzH(parcel0, v1);
    }

    public VersionInfoParcel zzp(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        String s = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new VersionInfoParcel(v3, s, v2, v1, z);
    }
}

