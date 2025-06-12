package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeV(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhv(x0);
    }

    static void zza(StreetViewPanoramaLocation streetViewPanoramaLocation0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, streetViewPanoramaLocation0.getVersionCode());
        zzb.zza(parcel0, 2, streetViewPanoramaLocation0.links, v, false);
        zzb.zza(parcel0, 3, streetViewPanoramaLocation0.position, v, false);
        zzb.zza(parcel0, 4, streetViewPanoramaLocation0.panoId, false);
        zzb.zzH(parcel0, v1);
    }

    public StreetViewPanoramaLocation zzeV(Parcel parcel0) {
        int v3;
        StreetViewPanoramaLink[] arr_streetViewPanoramaLink1;
        LatLng latLng1;
        String s1;
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        LatLng latLng0 = null;
        StreetViewPanoramaLink[] arr_streetViewPanoramaLink = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    latLng1 = latLng0;
                    arr_streetViewPanoramaLink1 = arr_streetViewPanoramaLink;
                    v3 = zza.zzg(parcel0, v2);
                    s1 = s;
                    break;
                }
                case 2: {
                    v3 = v1;
                    arr_streetViewPanoramaLink1 = (StreetViewPanoramaLink[])zza.zzb(parcel0, v2, StreetViewPanoramaLink.CREATOR);
                    s1 = s;
                    latLng1 = latLng0;
                    break;
                }
                case 3: {
                    arr_streetViewPanoramaLink1 = arr_streetViewPanoramaLink;
                    v3 = v1;
                    latLng1 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    s1 = s;
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v2);
                    latLng1 = latLng0;
                    arr_streetViewPanoramaLink1 = arr_streetViewPanoramaLink;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    s1 = s;
                    latLng1 = latLng0;
                    arr_streetViewPanoramaLink1 = arr_streetViewPanoramaLink;
                    v3 = v1;
                }
            }
            v1 = v3;
            arr_streetViewPanoramaLink = arr_streetViewPanoramaLink1;
            latLng0 = latLng1;
            s = s1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new StreetViewPanoramaLocation(v1, arr_streetViewPanoramaLink, latLng0, s);
    }

    public StreetViewPanoramaLocation[] zzhv(int v) {
        return new StreetViewPanoramaLocation[v];
    }
}

