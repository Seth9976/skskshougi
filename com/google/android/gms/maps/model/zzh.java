package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeS(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhs(x0);
    }

    static void zza(PolylineOptions polylineOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, polylineOptions0.getVersionCode());
        zzb.zzc(parcel0, 2, polylineOptions0.getPoints(), false);
        zzb.zza(parcel0, 3, polylineOptions0.getWidth());
        zzb.zzc(parcel0, 4, polylineOptions0.getColor());
        zzb.zza(parcel0, 5, polylineOptions0.getZIndex());
        zzb.zza(parcel0, 6, polylineOptions0.isVisible());
        zzb.zza(parcel0, 7, polylineOptions0.isGeodesic());
        zzb.zzH(parcel0, v1);
    }

    public PolylineOptions zzeS(Parcel parcel0) {
        float f = 0.0f;
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        boolean z1 = false;
        int v1 = 0;
        float f1 = 0.0f;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzc(parcel0, v3, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f1 = zza.zzl(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 5: {
                    f = zza.zzl(parcel0, v3);
                    break;
                }
                case 6: {
                    z1 = zza.zzc(parcel0, v3);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PolylineOptions(v2, arrayList0, f1, v1, f, z1, z);
    }

    public PolylineOptions[] zzhs(int v) {
        return new PolylineOptions[v];
    }
}

