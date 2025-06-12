package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;

public class GameRequestEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdQ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfZ(x0);
    }

    static void zza(GameRequestEntity gameRequestEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, gameRequestEntity0.getGame(), v, false);
        zzb.zzc(parcel0, 1000, gameRequestEntity0.getVersionCode());
        zzb.zza(parcel0, 2, gameRequestEntity0.getSender(), v, false);
        zzb.zza(parcel0, 3, gameRequestEntity0.getData(), false);
        zzb.zza(parcel0, 4, gameRequestEntity0.getRequestId(), false);
        zzb.zzc(parcel0, 5, gameRequestEntity0.getRecipients(), false);
        zzb.zzc(parcel0, 7, gameRequestEntity0.getType());
        zzb.zza(parcel0, 9, gameRequestEntity0.getCreationTimestamp());
        zzb.zza(parcel0, 10, gameRequestEntity0.getExpirationTimestamp());
        zzb.zza(parcel0, 11, gameRequestEntity0.zztP(), false);
        zzb.zzc(parcel0, 12, gameRequestEntity0.getStatus());
        zzb.zzH(parcel0, v1);
    }

    public GameRequestEntity zzdQ(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        GameEntity gameEntity0 = null;
        PlayerEntity playerEntity0 = null;
        byte[] arr_b = null;
        String s = null;
        ArrayList arrayList0 = null;
        int v2 = 0;
        long v3 = 0L;
        long v4 = 0L;
        Bundle bundle0 = null;
        int v5 = 0;
        while(parcel0.dataPosition() < v) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    gameEntity0 = (GameEntity)zza.zza(parcel0, v6, GameEntity.CREATOR);
                    break;
                }
                case 2: {
                    playerEntity0 = (PlayerEntity)zza.zza(parcel0, v6, PlayerEntity.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = zza.zzr(parcel0, v6);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v6);
                    break;
                }
                case 5: {
                    arrayList0 = zza.zzc(parcel0, v6, PlayerEntity.CREATOR);
                    break;
                }
                case 7: {
                    v2 = zza.zzg(parcel0, v6);
                    break;
                }
                case 9: {
                    v3 = zza.zzi(parcel0, v6);
                    break;
                }
                case 10: {
                    v4 = zza.zzi(parcel0, v6);
                    break;
                }
                case 11: {
                    bundle0 = zza.zzq(parcel0, v6);
                    break;
                }
                case 12: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new GameRequestEntity(v1, gameEntity0, playerEntity0, arr_b, s, arrayList0, v2, v3, v4, bundle0, v5);
    }

    public GameRequestEntity[] zzfZ(int v) {
        return new GameRequestEntity[v];
    }
}

