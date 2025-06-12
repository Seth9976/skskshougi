package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfn(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhV(x0);
    }

    static void zza(AppIdentifier appIdentifier0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, appIdentifier0.getIdentifier(), false);
        zzb.zzc(parcel0, 1000, appIdentifier0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public AppIdentifier zzfn(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AppIdentifier(v1, s);
    }

    public AppIdentifier[] zzhV(int v) {
        return new AppIdentifier[v];
    }
}

