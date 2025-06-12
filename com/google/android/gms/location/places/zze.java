package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeq(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgM(x0);
    }

    static void zza(NearbyAlertRequest nearbyAlertRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, nearbyAlertRequest0.zzuC());
        zzb.zzc(parcel0, 1000, nearbyAlertRequest0.getVersionCode());
        zzb.zzc(parcel0, 2, nearbyAlertRequest0.zzuF());
        zzb.zza(parcel0, 3, nearbyAlertRequest0.zzuG(), v, false);
        zzb.zza(parcel0, 4, nearbyAlertRequest0.zzuH(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public NearbyAlertRequest zzeq(Parcel parcel0) {
        NearbyAlertFilter nearbyAlertFilter0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        int v2 = -1;
        PlaceFilter placeFilter0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    placeFilter0 = (PlaceFilter)zza.zza(parcel0, v4, PlaceFilter.CREATOR);
                    break;
                }
                case 4: {
                    nearbyAlertFilter0 = (NearbyAlertFilter)zza.zza(parcel0, v4, NearbyAlertFilter.CREATOR);
                    break;
                }
                case 1000: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new NearbyAlertRequest(v3, v, v2, placeFilter0, nearbyAlertFilter0);
    }

    public NearbyAlertRequest[] zzgM(int v) {
        return new NearbyAlertRequest[v];
    }
}

