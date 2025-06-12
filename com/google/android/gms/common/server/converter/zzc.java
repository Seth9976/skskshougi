package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzag(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbG(x0);
    }

    static void zza(Entry stringToIntConverter$Entry0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, stringToIntConverter$Entry0.versionCode);
        zzb.zza(parcel0, 2, stringToIntConverter$Entry0.zzabE, false);
        zzb.zzc(parcel0, 3, stringToIntConverter$Entry0.zzabF);
        zzb.zzH(parcel0, v1);
    }

    public Entry zzag(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        String s = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new Entry(v2, s, v);
    }

    public Entry[] zzbG(int v) {
        return new Entry[v];
    }
}

