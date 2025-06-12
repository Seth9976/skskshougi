package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzei(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgC(x0);
    }

    static void zza(CopresenceApiOptions copresenceApiOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, copresenceApiOptions0.zzCY);
        zzb.zza(parcel0, 2, copresenceApiOptions0.zzayo);
        zzb.zza(parcel0, 3, copresenceApiOptions0.zzayp, false);
        zzb.zzH(parcel0, v1);
    }

    public CopresenceApiOptions zzei(Parcel parcel0) {
        boolean z = false;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        String s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
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
        return new CopresenceApiOptions(v1, z, s);
    }

    public CopresenceApiOptions[] zzgC(int v) {
        return new CopresenceApiOptions[v];
    }
}

