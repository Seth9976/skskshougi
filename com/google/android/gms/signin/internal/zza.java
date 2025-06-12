package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfY(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziO(x0);
    }

    static void zza(AuthAccountResult authAccountResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, authAccountResult0.zzCY);
        zzb.zzH(parcel0, v1);
    }

    public AuthAccountResult zzfY(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            if((0xFFFF & v2) == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
            }
            else {
                com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AuthAccountResult(v1);
    }

    public AuthAccountResult[] zziO(int v) {
        return new AuthAccountResult[v];
    }
}

