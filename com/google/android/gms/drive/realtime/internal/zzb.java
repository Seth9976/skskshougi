package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbU(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdJ(x0);
    }

    static void zza(EndCompoundOperationRequest endCompoundOperationRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, endCompoundOperationRequest0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public EndCompoundOperationRequest zzbU(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            if((0xFFFF & v2) == 1) {
                v1 = zza.zzg(parcel0, v2);
            }
            else {
                zza.zzb(parcel0, v2);
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new EndCompoundOperationRequest(v1);
    }

    public EndCompoundOperationRequest[] zzdJ(int v) {
        return new EndCompoundOperationRequest[v];
    }
}

