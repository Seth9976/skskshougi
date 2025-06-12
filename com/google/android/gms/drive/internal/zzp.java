package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaN(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcy(x0);
    }

    static void zza(DisconnectRequest disconnectRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, disconnectRequest0.zzCY);
        zzb.zzH(parcel0, v1);
    }

    public DisconnectRequest zzaN(Parcel parcel0) {
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
        return new DisconnectRequest(v1);
    }

    public DisconnectRequest[] zzcy(int v) {
        return new DisconnectRequest[v];
    }
}

