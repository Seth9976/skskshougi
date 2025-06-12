package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeP(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhp(x0);
    }

    static void zza(LatLng latLng0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, latLng0.getVersionCode());
        zzb.zza(parcel0, 2, latLng0.latitude);
        zzb.zza(parcel0, 3, latLng0.longitude);
        zzb.zzH(parcel0, v1);
    }

    public LatLng zzeP(Parcel parcel0) {
        double f = 0.0;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        double f1 = 0.0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    f1 = zza.zzm(parcel0, v2);
                    break;
                }
                case 3: {
                    f = zza.zzm(parcel0, v2);
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
        return new LatLng(v1, f1, f);
    }

    public LatLng[] zzhp(int v) {
        return new LatLng[v];
    }
}

