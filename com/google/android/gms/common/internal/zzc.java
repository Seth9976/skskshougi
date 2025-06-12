package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzU(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbp(x0);
    }

    public AuthAccountRequest zzU(Parcel parcel0) {
        Scope[] arr_scope = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_scope = (Scope[])zza.zzb(parcel0, v2, Scope.CREATOR);
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
        return new AuthAccountRequest(v1, iBinder0, arr_scope);
    }

    static void zza(AuthAccountRequest authAccountRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, authAccountRequest0.zzCY);
        zzb.zza(parcel0, 2, authAccountRequest0.zzZO, false);
        zzb.zza(parcel0, 3, authAccountRequest0.zzZP, v, false);
        zzb.zzH(parcel0, v1);
    }

    public AuthAccountRequest[] zzbp(int v) {
        return new AuthAccountRequest[v];
    }
}

