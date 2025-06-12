package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeK(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhk(x0);
    }

    static void zza(Point point0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, point0.getVersionCode());
        zzb.zza(parcel0, 2, point0.zzvG(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public Point zzeK(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        android.graphics.Point point0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    point0 = (android.graphics.Point)zza.zza(parcel0, v2, android.graphics.Point.CREATOR);
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
        return new Point(v1, point0);
    }

    public Point[] zzhk(int v) {
        return new Point[v];
    }
}

