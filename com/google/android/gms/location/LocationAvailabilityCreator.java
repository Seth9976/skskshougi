package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class LocationAvailabilityCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public LocationAvailability createFromParcel(Parcel parcel) {
        int v = 1;
        int v1 = zza.zzab(parcel);
        int v2 = 0;
        int v3 = 1000;
        long v4 = 0L;
        int v5 = 1;
        while(parcel.dataPosition() < v1) {
            int v6 = zza.zzaa(parcel);
            switch(0xFFFF & v6) {
                case 1: {
                    v5 = zza.zzg(parcel, v6);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel, v6);
                    break;
                }
                case 3: {
                    v4 = zza.zzi(parcel, v6);
                    break;
                }
                case 4: {
                    v3 = zza.zzg(parcel, v6);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel, v6);
                }
            }
        }
        if(parcel.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel);
        }
        return new LocationAvailability(v2, v3, v5, v, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.createFromParcel(x0);
    }

    public LocationAvailability[] newArray(int size) {
        return new LocationAvailability[size];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.newArray(x0);
    }

    static void zza(LocationAvailability locationAvailability0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, locationAvailability0.zzaxQ);
        zzb.zzc(parcel0, 1000, locationAvailability0.getVersionCode());
        zzb.zzc(parcel0, 2, locationAvailability0.zzaxR);
        zzb.zza(parcel0, 3, locationAvailability0.zzaxS);
        zzb.zzc(parcel0, 4, locationAvailability0.zzaxT);
        zzb.zzH(parcel0, v1);
    }
}

