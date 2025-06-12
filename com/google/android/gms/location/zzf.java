package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzee(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgw(x0);
    }

    static void zza(LocationResult locationResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, locationResult0.getLocations(), false);
        zzb.zzc(parcel0, 1000, locationResult0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public LocationResult zzee(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        List list0 = LocationResult.zzaxZ;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    list0 = zza.zzc(parcel0, v2, Location.CREATOR);
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
        return new LocationResult(v1, list0);
    }

    public LocationResult[] zzgw(int v) {
        return new LocationResult[v];
    }
}

