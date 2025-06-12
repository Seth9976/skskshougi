package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfb(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhB(x0);
    }

    static void zza(CameraUpdateParcelable cameraUpdateParcelable0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, cameraUpdateParcelable0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, cameraUpdateParcelable0.getType());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, cameraUpdateParcelable0.getParameters(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public CameraUpdateParcelable zzfb(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        Bundle bundle0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    bundle0 = zza.zzq(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CameraUpdateParcelable(v2, v, bundle0);
    }

    public CameraUpdateParcelable[] zzhB(int v) {
        return new CameraUpdateParcelable[v];
    }
}

