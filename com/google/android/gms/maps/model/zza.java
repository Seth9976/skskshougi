package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeL(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhl(x0);
    }

    static void zza(CameraPosition cameraPosition0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, cameraPosition0.getVersionCode());
        zzb.zza(parcel0, 2, cameraPosition0.target, v, false);
        zzb.zza(parcel0, 3, cameraPosition0.zoom);
        zzb.zza(parcel0, 4, cameraPosition0.tilt);
        zzb.zza(parcel0, 5, cameraPosition0.bearing);
        zzb.zzH(parcel0, v1);
    }

    public CameraPosition zzeL(Parcel parcel0) {
        float f = 0.0f;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        LatLng latLng0 = null;
        float f1 = 0.0f;
        float f2 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel0, v2);
                    break;
                }
                case 4: {
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel0, v2);
                    break;
                }
                case 5: {
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel0, v2);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CameraPosition(v1, latLng0, f2, f1, f);
    }

    public CameraPosition[] zzhl(int v) {
        return new CameraPosition[v];
    }
}

