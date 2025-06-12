package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzM(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaK(x0);
    }

    public ApplicationStatus zzM(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
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
        return new ApplicationStatus(v1, s);
    }

    static void zza(ApplicationStatus applicationStatus0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, applicationStatus0.getVersionCode());
        zzb.zza(parcel0, 2, applicationStatus0.zzlI(), false);
        zzb.zzH(parcel0, v1);
    }

    public ApplicationStatus[] zzaK(int v) {
        return new ApplicationStatus[v];
    }
}

