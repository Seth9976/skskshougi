package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class QuestEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdP(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfY(x0);
    }

    static void zza(QuestEntity questEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, questEntity0.getGame(), v, false);
        zzb.zza(parcel0, 2, questEntity0.getQuestId(), false);
        zzb.zza(parcel0, 3, questEntity0.getAcceptedTimestamp());
        zzb.zza(parcel0, 4, questEntity0.getBannerImageUri(), v, false);
        zzb.zza(parcel0, 5, questEntity0.getBannerImageUrl(), false);
        zzb.zza(parcel0, 6, questEntity0.getDescription(), false);
        zzb.zza(parcel0, 7, questEntity0.getEndTimestamp());
        zzb.zza(parcel0, 8, questEntity0.getLastUpdatedTimestamp());
        zzb.zza(parcel0, 9, questEntity0.getIconImageUri(), v, false);
        zzb.zza(parcel0, 10, questEntity0.getIconImageUrl(), false);
        zzb.zza(parcel0, 12, questEntity0.getName(), false);
        zzb.zza(parcel0, 13, questEntity0.zztO());
        zzb.zza(parcel0, 14, questEntity0.getStartTimestamp());
        zzb.zzc(parcel0, 15, questEntity0.getState());
        zzb.zzc(parcel0, 17, questEntity0.zztN(), false);
        zzb.zzc(parcel0, 16, questEntity0.getType());
        zzb.zzc(parcel0, 1000, questEntity0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public QuestEntity zzdP(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        GameEntity gameEntity0 = null;
        String s = null;
        long v2 = 0L;
        Uri uri0 = null;
        String s1 = null;
        String s2 = null;
        long v3 = 0L;
        long v4 = 0L;
        Uri uri1 = null;
        String s3 = null;
        String s4 = null;
        long v5 = 0L;
        long v6 = 0L;
        int v7 = 0;
        int v8 = 0;
        ArrayList arrayList0 = null;
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
                    v2 = zza.zzi(parcel0, v9);
                    break;
                }
                case 4: {
                    uri0 = (Uri)zza.zza(parcel0, v9, Uri.CREATOR);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v9);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v9);
                    break;
                }
                case 7: {
                    v3 = zza.zzi(parcel0, v9);
                    break;
                }
                case 8: {
                    v4 = zza.zzi(parcel0, v9);
                    break;
                }
                case 9: {
                    uri1 = (Uri)zza.zza(parcel0, v9, Uri.CREATOR);
                    break;
                }
                case 10: {
                    s3 = zza.zzo(parcel0, v9);
                    break;
                }
                case 12: {
                    s4 = zza.zzo(parcel0, v9);
                    break;
                }
                case 13: {
                    v5 = zza.zzi(parcel0, v9);
                    break;
                }
                case 14: {
                    v6 = zza.zzi(parcel0, v9);
                    break;
                }
                case 15: {
                    v7 = zza.zzg(parcel0, v9);
                    break;
                }
                case 16: {
                    v8 = zza.zzg(parcel0, v9);
                    break;
                }
                case 17: {
                    arrayList0 = zza.zzc(parcel0, v9, MilestoneEntity.CREATOR);
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
        return new QuestEntity(v1, gameEntity0, s, v2, uri0, s1, s2, v3, v4, uri1, s3, s4, v5, v6, v7, v8, arrayList0);
    }

    public QuestEntity[] zzfY(int v) {
        return new QuestEntity[v];
    }
}

