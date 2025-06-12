package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeZ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhz(x0);
    }

    static void zza(VisibleRegion visibleRegion0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, visibleRegion0.getVersionCode());
        zzb.zza(parcel0, 2, visibleRegion0.nearLeft, v, false);
        zzb.zza(parcel0, 3, visibleRegion0.nearRight, v, false);
        zzb.zza(parcel0, 4, visibleRegion0.farLeft, v, false);
        zzb.zza(parcel0, 5, visibleRegion0.farRight, v, false);
        zzb.zza(parcel0, 6, visibleRegion0.latLngBounds, v, false);
        zzb.zzH(parcel0, v1);
    }

    public VisibleRegion zzeZ(Parcel parcel0) {
        LatLngBounds latLngBounds0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        LatLng latLng0 = null;
        LatLng latLng1 = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    latLng3 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    latLng2 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 4: {
                    latLng1 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    latLng0 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 6: {
                    latLngBounds0 = (LatLngBounds)zza.zza(parcel0, v2, LatLngBounds.CREATOR);
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
        return new VisibleRegion(v1, latLng3, latLng2, latLng1, latLng0, latLngBounds0);
    }

    public VisibleRegion[] zzhz(int v) {
        return new VisibleRegion[v];
    }
}

