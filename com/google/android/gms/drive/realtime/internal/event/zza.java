package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbX(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdN(x0);
    }

    static void zza(FieldChangedDetails fieldChangedDetails0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, fieldChangedDetails0.zzCY);
        zzb.zzc(parcel0, 2, fieldChangedDetails0.zzaiz);
        zzb.zzH(parcel0, v1);
    }

    public FieldChangedDetails zzbX(Parcel parcel0) {
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new FieldChangedDetails(v2, v);
    }

    public FieldChangedDetails[] zzdN(int v) {
        return new FieldChangedDetails[v];
    }
}

