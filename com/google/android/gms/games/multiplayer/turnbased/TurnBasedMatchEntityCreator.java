package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class TurnBasedMatchEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdN(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfW(x0);
    }

    static void zza(TurnBasedMatchEntity turnBasedMatchEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, turnBasedMatchEntity0.getGame(), v, false);
        zzb.zza(parcel0, 2, turnBasedMatchEntity0.getMatchId(), false);
        zzb.zza(parcel0, 3, turnBasedMatchEntity0.getCreatorId(), false);
        zzb.zza(parcel0, 4, turnBasedMatchEntity0.getCreationTimestamp());
        zzb.zza(parcel0, 5, turnBasedMatchEntity0.getLastUpdaterId(), false);
        zzb.zza(parcel0, 6, turnBasedMatchEntity0.getLastUpdatedTimestamp());
        zzb.zza(parcel0, 7, turnBasedMatchEntity0.getPendingParticipantId(), false);
        zzb.zzc(parcel0, 8, turnBasedMatchEntity0.getStatus());
        zzb.zzc(parcel0, 10, turnBasedMatchEntity0.getVariant());
        zzb.zzc(parcel0, 11, turnBasedMatchEntity0.getVersion());
        zzb.zza(parcel0, 12, turnBasedMatchEntity0.getData(), false);
        zzb.zzc(parcel0, 13, turnBasedMatchEntity0.getParticipants(), false);
        zzb.zza(parcel0, 14, turnBasedMatchEntity0.getRematchId(), false);
        zzb.zza(parcel0, 15, turnBasedMatchEntity0.getPreviousMatchData(), false);
        zzb.zza(parcel0, 17, turnBasedMatchEntity0.getAutoMatchCriteria(), false);
        zzb.zzc(parcel0, 16, turnBasedMatchEntity0.getMatchNumber());
        zzb.zzc(parcel0, 1000, turnBasedMatchEntity0.getVersionCode());
        zzb.zza(parcel0, 19, turnBasedMatchEntity0.isLocallyModified());
        zzb.zzc(parcel0, 18, turnBasedMatchEntity0.getTurnStatus());
        zzb.zza(parcel0, 21, turnBasedMatchEntity0.getDescriptionParticipantId(), false);
        zzb.zza(parcel0, 20, turnBasedMatchEntity0.getDescription(), false);
        zzb.zzH(parcel0, v1);
    }

    public TurnBasedMatchEntity zzdN(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        GameEntity gameEntity0 = null;
        String s = null;
        String s1 = null;
        long v2 = 0L;
        String s2 = null;
        long v3 = 0L;
        String s3 = null;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        byte[] arr_b = null;
        ArrayList arrayList0 = null;
        String s4 = null;
        byte[] arr_b1 = null;
        int v7 = 0;
        Bundle bundle0 = null;
        int v8 = 0;
        boolean z = false;
        String s5 = null;
        String s6 = null;
        while(parcel0.dataPosition() < v) {
            int v9 = zza.zzaa(parcel0);
            switch(0xFFFF & v9) {
                case 1: {
                    gameEntity0 = (GameEntity)zza.zza(parcel0, v9, GameEntity.CREATOR);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v9);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v9);
                    break;
                }
                case 4: {
                    v2 = zza.zzi(parcel0, v9);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v9);
                    break;
                }
                case 6: {
                    v3 = zza.zzi(parcel0, v9);
                    break;
                }
                case 7: {
                    s3 = zza.zzo(parcel0, v9);
                    break;
                }
                case 8: {
                    v4 = zza.zzg(parcel0, v9);
                    break;
                }
                case 10: {
                    v5 = zza.zzg(parcel0, v9);
                    break;
                }
                case 11: {
                    v6 = zza.zzg(parcel0, v9);
                    break;
                }
                case 12: {
                    arr_b = zza.zzr(parcel0, v9);
                    break;
                }
                case 13: {
                    arrayList0 = zza.zzc(parcel0, v9, ParticipantEntity.CREATOR);
                    break;
                }
                case 14: {
                    s4 = zza.zzo(parcel0, v9);
                    break;
                }
                case 15: {
                    arr_b1 = zza.zzr(parcel0, v9);
                    break;
                }
                case 16: {
                    v7 = zza.zzg(parcel0, v9);
                    break;
                }
                case 17: {
                    bundle0 = zza.zzq(parcel0, v9);
                    break;
                }
                case 18: {
                    v8 = zza.zzg(parcel0, v9);
                    break;
                }
                case 19: {
                    z = zza.zzc(parcel0, v9);
                    break;
                }
                case 20: {
                    s5 = zza.zzo(parcel0, v9);
                    break;
                }
                case 21: {
                    s6 = zza.zzo(parcel0, v9);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v9);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v9);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new TurnBasedMatchEntity(v1, gameEntity0, s, s1, v2, s2, v3, s3, v4, v5, v6, arr_b, arrayList0, s4, arr_b1, v7, bundle0, v8, z, s5, s6);
    }

    public TurnBasedMatchEntity[] zzfW(int v) {
        return new TurnBasedMatchEntity[v];
    }
}

