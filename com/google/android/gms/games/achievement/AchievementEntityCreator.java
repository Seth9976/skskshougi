package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

public class AchievementEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdv(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfr(x0);
    }

    static void zza(AchievementEntity achievementEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, achievementEntity0.getAchievementId(), false);
        zzb.zzc(parcel0, 2, achievementEntity0.getType());
        zzb.zza(parcel0, 3, achievementEntity0.getName(), false);
        zzb.zza(parcel0, 4, achievementEntity0.getDescription(), false);
        zzb.zza(parcel0, 5, achievementEntity0.getUnlockedImageUri(), v, false);
        zzb.zza(parcel0, 6, achievementEntity0.getUnlockedImageUrl(), false);
        zzb.zza(parcel0, 7, achievementEntity0.getRevealedImageUri(), v, false);
        zzb.zza(parcel0, 8, achievementEntity0.getRevealedImageUrl(), false);
        zzb.zzc(parcel0, 9, achievementEntity0.getTotalSteps());
        zzb.zza(parcel0, 10, achievementEntity0.getFormattedTotalSteps(), false);
        zzb.zza(parcel0, 11, achievementEntity0.getPlayer(), v, false);
        zzb.zzc(parcel0, 12, achievementEntity0.getState());
        zzb.zzc(parcel0, 13, achievementEntity0.getCurrentSteps());
        zzb.zza(parcel0, 14, achievementEntity0.getFormattedCurrentSteps(), false);
        zzb.zza(parcel0, 15, achievementEntity0.getLastUpdatedTimestamp());
        zzb.zza(parcel0, 16, achievementEntity0.getXpValue());
        zzb.zzc(parcel0, 1000, achievementEntity0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public AchievementEntity zzdv(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        int v2 = 0;
        String s1 = null;
        String s2 = null;
        Uri uri0 = null;
        String s3 = null;
        Uri uri1 = null;
        String s4 = null;
        int v3 = 0;
        String s5 = null;
        PlayerEntity playerEntity0 = null;
        int v4 = 0;
        int v5 = 0;
        String s6 = null;
        long v6 = 0L;
        long v7 = 0L;
        while(parcel0.dataPosition() < v) {
            int v8 = zza.zzaa(parcel0);
            switch(0xFFFF & v8) {
                case 1: {
                    s = zza.zzo(parcel0, v8);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v8);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v8);
                    break;
                }
                case 4: {
                    s2 = zza.zzo(parcel0, v8);
                    break;
                }
                case 5: {
                    uri0 = (Uri)zza.zza(parcel0, v8, Uri.CREATOR);
                    break;
                }
                case 6: {
                    s3 = zza.zzo(parcel0, v8);
                    break;
                }
                case 7: {
                    uri1 = (Uri)zza.zza(parcel0, v8, Uri.CREATOR);
                    break;
                }
                case 8: {
                    s4 = zza.zzo(parcel0, v8);
                    break;
                }
                case 9: {
                    v3 = zza.zzg(parcel0, v8);
                    break;
                }
                case 10: {
                    s5 = zza.zzo(parcel0, v8);
                    break;
                }
                case 11: {
                    playerEntity0 = (PlayerEntity)zza.zza(parcel0, v8, PlayerEntity.CREATOR);
                    break;
                }
                case 12: {
                    v4 = zza.zzg(parcel0, v8);
                    break;
                }
                case 13: {
                    v5 = zza.zzg(parcel0, v8);
                    break;
                }
                case 14: {
                    s6 = zza.zzo(parcel0, v8);
                    break;
                }
                case 15: {
                    v6 = zza.zzi(parcel0, v8);
                    break;
                }
                case 16: {
                    v7 = zza.zzi(parcel0, v8);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v8);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v8);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AchievementEntity(v1, s, v2, s1, s2, uri0, s3, uri1, s4, v3, s5, playerEntity0, v4, v5, s6, v6, v7);
    }

    public AchievementEntity[] zzfr(int v) {
        return new AchievementEntity[v];
    }
}

