package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeu(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgS(x0);
    }

    static void zza(PlaceReport placeReport0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, placeReport0.zzCY);
        zzb.zza(parcel0, 2, placeReport0.getPlaceId(), false);
        zzb.zza(parcel0, 3, placeReport0.getTag(), false);
        zzb.zza(parcel0, 4, placeReport0.getSource(), false);
        zzb.zzH(parcel0, v1);
    }

    public PlaceReport zzeu(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v2);
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
        return new PlaceReport(v1, s2, s1, s);
    }

    public PlaceReport[] zzgS(int v) {
        return new PlaceReport[v];
    }
}

