package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeM(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhm(x0);
    }

    static void zza(CircleOptions circleOptions0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, circleOptions0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, circleOptions0.getCenter(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, circleOptions0.getRadius());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, circleOptions0.getStrokeWidth());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 5, circleOptions0.getStrokeColor());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 6, circleOptions0.getFillColor());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, circleOptions0.getZIndex());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 8, circleOptions0.isVisible());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public CircleOptions zzeM(Parcel parcel0) {
        float f = 0.0f;
        boolean z = false;
        int v = zza.zzab(parcel0);
        LatLng latLng0 = null;
        double f1 = 0.0;
        int v1 = 0;
        int v2 = 0;
        float f2 = 0.0f;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)zza.zza(parcel0, v4, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f1 = zza.zzm(parcel0, v4);
                    break;
                }
                case 4: {
                    f2 = zza.zzl(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 7: {
                    f = zza.zzl(parcel0, v4);
                    break;
                }
                case 8: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CircleOptions(v3, latLng0, f1, f2, v2, v1, f, z);
    }

    public CircleOptions[] zzhm(int v) {
        return new CircleOptions[v];
    }
}

