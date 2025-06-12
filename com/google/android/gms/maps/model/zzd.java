package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeO(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzho(x0);
    }

    static void zza(LatLngBounds latLngBounds0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, latLngBounds0.getVersionCode());
        zzb.zza(parcel0, 2, latLngBounds0.southwest, v, false);
        zzb.zza(parcel0, 3, latLngBounds0.northeast, v, false);
        zzb.zzH(parcel0, v1);
    }

    public LatLngBounds zzeO(Parcel parcel0) {
        int v3;
        LatLng latLng3;
        LatLng latLng2;
        LatLng latLng0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        LatLng latLng1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    latLng3 = latLng1;
                    v3 = zza.zzg(parcel0, v2);
                    latLng2 = latLng0;
                    break;
                }
                case 2: {
                    v3 = v1;
                    latLng2 = latLng0;
                    latLng3 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    latLng2 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    latLng3 = latLng1;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    latLng2 = latLng0;
                    latLng3 = latLng1;
                    v3 = v1;
                }
            }
            v1 = v3;
            latLng1 = latLng3;
            latLng0 = latLng2;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new LatLngBounds(v1, latLng1, latLng0);
    }

    public LatLngBounds[] zzho(int v) {
        return new LatLngBounds[v];
    }
}

