package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcy(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzes(x0);
    }

    static void zza(Value value0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, value0.getFormat());
        zzb.zzc(parcel0, 1000, value0.getVersionCode());
        zzb.zza(parcel0, 2, value0.isSet());
        zzb.zza(parcel0, 3, value0.zzqI());
        zzb.zza(parcel0, 4, value0.zzqO(), false);
        zzb.zza(parcel0, 5, value0.zzqP(), false);
        zzb.zzH(parcel0, v1);
    }

    public Value zzcy(Parcel parcel0) {
        Bundle bundle0 = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        float f = 0.0f;
        String s = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                case 3: {
                    f = zza.zzl(parcel0, v3);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 5: {
                    bundle0 = zza.zzq(parcel0, v3);
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
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new Value(v2, v1, z, f, s, bundle0);
    }

    public Value[] zzes(int v) {
        return new Value[v];
    }
}

