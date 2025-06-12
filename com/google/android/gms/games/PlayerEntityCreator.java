package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public class PlayerEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzds(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfo(x0);
    }

    static void zza(PlayerEntity playerEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, playerEntity0.getPlayerId(), false);
        zzb.zza(parcel0, 2, playerEntity0.getDisplayName(), false);
        zzb.zza(parcel0, 3, playerEntity0.getIconImageUri(), v, false);
        zzb.zza(parcel0, 4, playerEntity0.getHiResImageUri(), v, false);
        zzb.zza(parcel0, 5, playerEntity0.getRetrievedTimestamp());
        zzb.zzc(parcel0, 6, playerEntity0.zzrK());
        zzb.zza(parcel0, 7, playerEntity0.getLastPlayedWithTimestamp());
        zzb.zza(parcel0, 8, playerEntity0.getIconImageUrl(), false);
        zzb.zza(parcel0, 9, playerEntity0.getHiResImageUrl(), false);
        zzb.zza(parcel0, 14, playerEntity0.getTitle(), false);
        zzb.zza(parcel0, 15, playerEntity0.zzrL(), v, false);
        zzb.zza(parcel0, 16, playerEntity0.getLevelInfo(), v, false);
        zzb.zzc(parcel0, 1000, playerEntity0.getVersionCode());
        zzb.zza(parcel0, 19, playerEntity0.zzrJ());
        zzb.zza(parcel0, 18, playerEntity0.isProfileVisible());
        zzb.zzH(parcel0, v1);
    }

    public PlayerEntity zzds(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        Uri uri0 = null;
        Uri uri1 = null;
        long v2 = 0L;
        int v3 = 0;
        long v4 = 0L;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity0 = null;
        PlayerLevelInfo playerLevelInfo0 = null;
        boolean z = false;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 3: {
                    uri0 = (Uri)zza.zza(parcel0, v5, Uri.CREATOR);
                    break;
                }
                case 4: {
                    uri1 = (Uri)zza.zza(parcel0, v5, Uri.CREATOR);
                    break;
                }
                case 5: {
                    v2 = zza.zzi(parcel0, v5);
                    break;
                }
                case 6: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 7: {
                    v4 = zza.zzi(parcel0, v5);
                    break;
                }
                case 8: {
                    s2 = zza.zzo(parcel0, v5);
                    break;
                }
                case 9: {
                    s3 = zza.zzo(parcel0, v5);
                    break;
                }
                case 14: {
                    s4 = zza.zzo(parcel0, v5);
                    break;
                }
                case 15: {
                    mostRecentGameInfoEntity0 = (MostRecentGameInfoEntity)zza.zza(parcel0, v5, MostRecentGameInfoEntity.CREATOR);
                    break;
                }
                case 16: {
                    playerLevelInfo0 = (PlayerLevelInfo)zza.zza(parcel0, v5, PlayerLevelInfo.CREATOR);
                    break;
                }
                case 18: {
                    z = zza.zzc(parcel0, v5);
                    break;
                }
                case 19: {
                    z1 = zza.zzc(parcel0, v5);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PlayerEntity(v1, s, s1, uri0, uri1, v2, v3, v4, s2, s3, s4, mostRecentGameInfoEntity0, playerLevelInfo0, z, z1);
    }

    public PlayerEntity[] zzfo(int v) {
        return new PlayerEntity[v];
    }
}

