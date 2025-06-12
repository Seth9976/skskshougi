package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeJ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhj(x0);
    }

    static void zza(StreetViewPanoramaOptions streetViewPanoramaOptions0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, streetViewPanoramaOptions0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, streetViewPanoramaOptions0.getStreetViewPanoramaCamera(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, streetViewPanoramaOptions0.getPanoramaId(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, streetViewPanoramaOptions0.getPosition(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, streetViewPanoramaOptions0.getRadius(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, streetViewPanoramaOptions0.zzvy());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, streetViewPanoramaOptions0.zzvo());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 8, streetViewPanoramaOptions0.zzvz());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 9, streetViewPanoramaOptions0.zzvA());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 10, streetViewPanoramaOptions0.zzvk());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public StreetViewPanoramaOptions zzeJ(Parcel parcel0) {
        Integer integer0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        LatLng latLng0 = null;
        String s = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera0 = null;
        int v6 = 0;
        while(parcel0.dataPosition() < v1) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    v6 = zza.zzg(parcel0, v7);
                    break;
                }
                case 2: {
                    streetViewPanoramaCamera0 = (StreetViewPanoramaCamera)zza.zza(parcel0, v7, StreetViewPanoramaCamera.CREATOR);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v7);
                    break;
                }
                case 4: {
                    latLng0 = (LatLng)zza.zza(parcel0, v7, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    integer0 = zza.zzh(parcel0, v7);
                    break;
                }
                case 6: {
                    v5 = zza.zze(parcel0, v7);
                    break;
                }
                case 7: {
                    v4 = zza.zze(parcel0, v7);
                    break;
                }
                case 8: {
                    v3 = zza.zze(parcel0, v7);
                    break;
                }
                case 9: {
                    v2 = zza.zze(parcel0, v7);
                    break;
                }
                case 10: {
                    v = zza.zze(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new StreetViewPanoramaOptions(v6, streetViewPanoramaCamera0, s, latLng0, integer0, ((byte)v5), ((byte)v4), ((byte)v3), ((byte)v2), ((byte)v));
    }

    public StreetViewPanoramaOptions[] zzhj(int v) {
        return new StreetViewPanoramaOptions[v];
    }
}

