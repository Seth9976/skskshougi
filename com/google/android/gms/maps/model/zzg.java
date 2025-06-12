package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhr(x0);
    }

    static void zza(PolygonOptions polygonOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, polygonOptions0.getVersionCode());
        zzb.zzc(parcel0, 2, polygonOptions0.getPoints(), false);
        zzb.zzd(parcel0, 3, polygonOptions0.zzvK(), false);
        zzb.zza(parcel0, 4, polygonOptions0.getStrokeWidth());
        zzb.zzc(parcel0, 5, polygonOptions0.getStrokeColor());
        zzb.zzc(parcel0, 6, polygonOptions0.getFillColor());
        zzb.zza(parcel0, 7, polygonOptions0.getZIndex());
        zzb.zza(parcel0, 8, polygonOptions0.isVisible());
        zzb.zza(parcel0, 9, polygonOptions0.isGeodesic());
        zzb.zzH(parcel0, v1);
    }

    public PolygonOptions zzeR(Parcel parcel0) {
        float f = 0.0f;
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = new ArrayList();
        boolean z1 = false;
        int v1 = 0;
        int v2 = 0;
        float f1 = 0.0f;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzc(parcel0, v4, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    zza.zza(parcel0, v4, arrayList1, this.getClass().getClassLoader());
                    break;
                }
                case 4: {
                    f1 = zza.zzl(parcel0, v4);
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
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 9: {
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
        return new PolygonOptions(v3, arrayList0, arrayList1, f1, v2, v1, f, z1, z);
    }

    public PolygonOptions[] zzhr(int v) {
        return new PolygonOptions[v];
    }
}

