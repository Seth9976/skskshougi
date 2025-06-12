package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PlayerLevelCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdt(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfp(x0);
    }

    static void zza(PlayerLevel playerLevel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, playerLevel0.getLevelNumber());
        zzb.zzc(parcel0, 1000, playerLevel0.getVersionCode());
        zzb.zza(parcel0, 2, playerLevel0.getMinXp());
        zzb.zza(parcel0, 3, playerLevel0.getMaxXp());
        zzb.zzH(parcel0, v1);
    }

    public PlayerLevel zzdt(Parcel parcel0) {
        long v = 0L;
        int v1 = 0;
        int v2 = zza.zzab(parcel0);
        long v3 = 0L;
        int v4 = 0;
        while(parcel0.dataPosition() < v2) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    v = zza.zzi(parcel0, v5);
                    break;
                }
                case 1000: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel0);
        }
        return new PlayerLevel(v4, v1, v3, v);
    }

    public PlayerLevel[] zzfp(int v) {
        return new PlayerLevel[v];
    }
}

