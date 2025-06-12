package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfh(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhP(x0);
    }

    static void zza(DisableTargetRequest disableTargetRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, disableTargetRequest0.zzqU(), false);
        zzb.zzc(parcel0, 1000, disableTargetRequest0.versionCode);
        zzb.zzH(parcel0, v1);
    }

    public DisableTargetRequest zzfh(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new DisableTargetRequest(v1, iBinder0);
    }

    public DisableTargetRequest[] zzhP(int v) {
        return new DisableTargetRequest[v];
    }
}

