package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcr(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzek(x0);
    }

    static void zza(MapValue mapValue0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, mapValue0.getFormat());
        zzb.zzc(parcel0, 1000, mapValue0.getVersionCode());
        zzb.zza(parcel0, 2, mapValue0.zzqI());
        zzb.zzH(parcel0, v1);
    }

    public MapValue zzcr(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        float f = 0.0f;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    f = zza.zzl(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel0, v3);
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
        return new MapValue(v2, v, f);
    }

    public MapValue[] zzek(int v) {
        return new MapValue[v];
    }
}

