package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgE(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjJ(x0);
    }

    static void zza(TimeInterval timeInterval0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, timeInterval0.getVersionCode());
        zzb.zza(parcel0, 2, timeInterval0.zzaSH);
        zzb.zza(parcel0, 3, timeInterval0.zzaSI);
        zzb.zzH(parcel0, v1);
    }

    public TimeInterval zzgE(Parcel parcel0) {
        long v = 0L;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        long v3 = 0L;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 3: {
                    v = zza.zzi(parcel0, v4);
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
        return new TimeInterval(v2, v3, v);
    }

    public TimeInterval[] zzjJ(int v) {
        return new TimeInterval[v];
    }
}

