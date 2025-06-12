package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeX(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhx(x0);
    }

    static void zza(Tile tile0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, tile0.getVersionCode());
        zzb.zzc(parcel0, 2, tile0.width);
        zzb.zzc(parcel0, 3, tile0.height);
        zzb.zza(parcel0, 4, tile0.data, false);
        zzb.zzH(parcel0, v1);
    }

    public Tile zzeX(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        byte[] arr_b = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    arr_b = zza.zzr(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new Tile(v3, v2, v, arr_b);
    }

    public Tile[] zzhx(int v) {
        return new Tile[v];
    }
}

