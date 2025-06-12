package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PlayerLevelInfoCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdu(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfq(x0);
    }

    static void zza(PlayerLevelInfo playerLevelInfo0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, playerLevelInfo0.getCurrentXpTotal());
        zzb.zzc(parcel0, 1000, playerLevelInfo0.getVersionCode());
        zzb.zza(parcel0, 2, playerLevelInfo0.getLastLevelUpTimestamp());
        zzb.zza(parcel0, 3, playerLevelInfo0.getCurrentLevel(), v, false);
        zzb.zza(parcel0, 4, playerLevelInfo0.getNextLevel(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public PlayerLevelInfo zzdu(Parcel parcel0) {
        long v = 0L;
        PlayerLevel playerLevel0 = null;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        PlayerLevel playerLevel1 = null;
        long v3 = 0L;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 2: {
                    v = zza.zzi(parcel0, v4);
                    break;
                }
                case 3: {
                    playerLevel1 = (PlayerLevel)zza.zza(parcel0, v4, PlayerLevel.CREATOR);
                    break;
                }
                case 4: {
                    playerLevel0 = (PlayerLevel)zza.zza(parcel0, v4, PlayerLevel.CREATOR);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel0, v4);
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
        return new PlayerLevelInfo(v2, v3, v, playerLevel1, playerLevel0);
    }

    public PlayerLevelInfo[] zzfq(int v) {
        return new PlayerLevelInfo[v];
    }
}

