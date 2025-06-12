package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfZ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziP(x0);
    }

    static void zza(CheckServerAuthResult checkServerAuthResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, checkServerAuthResult0.zzCY);
        zzb.zza(parcel0, 2, checkServerAuthResult0.zzaJY);
        zzb.zzc(parcel0, 3, checkServerAuthResult0.zzaJZ, false);
        zzb.zzH(parcel0, v1);
    }

    public CheckServerAuthResult zzfZ(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v2, Scope.CREATOR);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CheckServerAuthResult(v1, z, arrayList0);
    }

    public CheckServerAuthResult[] zziP(int v) {
        return new CheckServerAuthResult[v];
    }
}

