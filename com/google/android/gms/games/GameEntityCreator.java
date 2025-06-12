package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class GameEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdr(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfm(x0);
    }

    static void zza(GameEntity gameEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, gameEntity0.getApplicationId(), false);
        zzb.zza(parcel0, 2, gameEntity0.getDisplayName(), false);
        zzb.zza(parcel0, 3, gameEntity0.getPrimaryCategory(), false);
        zzb.zza(parcel0, 4, gameEntity0.getSecondaryCategory(), false);
        zzb.zza(parcel0, 5, gameEntity0.getDescription(), false);
        zzb.zza(parcel0, 6, gameEntity0.getDeveloperName(), false);
        zzb.zza(parcel0, 7, gameEntity0.getIconImageUri(), v, false);
        zzb.zza(parcel0, 8, gameEntity0.getHiResImageUri(), v, false);
        zzb.zza(parcel0, 9, gameEntity0.getFeaturedImageUri(), v, false);
        zzb.zza(parcel0, 10, gameEntity0.zzrC());
        zzb.zza(parcel0, 11, gameEntity0.zzrE());
        zzb.zza(parcel0, 12, gameEntity0.zzrF(), false);
        zzb.zzc(parcel0, 13, gameEntity0.zzrG());
        zzb.zzc(parcel0, 14, gameEntity0.getAchievementTotalCount());
        zzb.zzc(parcel0, 15, gameEntity0.getLeaderboardCount());
        zzb.zza(parcel0, 17, gameEntity0.isTurnBasedMultiplayerEnabled());
        zzb.zza(parcel0, 16, gameEntity0.isRealTimeMultiplayerEnabled());
        zzb.zzc(parcel0, 1000, gameEntity0.getVersionCode());
        zzb.zza(parcel0, 19, gameEntity0.getHiResImageUrl(), false);
        zzb.zza(parcel0, 18, gameEntity0.getIconImageUrl(), false);
        zzb.zza(parcel0, 21, gameEntity0.isMuted());
        zzb.zza(parcel0, 20, gameEntity0.getFeaturedImageUrl(), false);
        zzb.zza(parcel0, 23, gameEntity0.areSnapshotsEnabled());
        zzb.zza(parcel0, 22, gameEntity0.zzrD());
        zzb.zza(parcel0, 25, gameEntity0.hasGamepadSupport());
        zzb.zza(parcel0, 24, gameEntity0.getThemeColor(), false);
        zzb.zzH(parcel0, v1);
    }

    public GameEntity zzdr(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        Uri uri0 = null;
        Uri uri1 = null;
        Uri uri2 = null;
        boolean z = false;
        boolean z1 = false;
        String s6 = null;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String s10 = null;
        boolean z7 = false;
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
                    s2 = zza.zzo(parcel0, v5);
                    break;
                }
                case 4: {
                    s3 = zza.zzo(parcel0, v5);
                    break;
                }
                case 5: {
                    s4 = zza.zzo(parcel0, v5);
                    break;
                }
                case 6: {
                    s5 = zza.zzo(parcel0, v5);
                    break;
                }
                case 7: {
                    uri0 = (Uri)zza.zza(parcel0, v5, Uri.CREATOR);
                    break;
                }
                case 8: {
                    uri1 = (Uri)zza.zza(parcel0, v5, Uri.CREATOR);
                    break;
                }
                case 9: {
                    uri2 = (Uri)zza.zza(parcel0, v5, Uri.CREATOR);
                    break;
                }
                case 10: {
                    z = zza.zzc(parcel0, v5);
                    break;
                }
                case 11: {
                    z1 = zza.zzc(parcel0, v5);
                    break;
                }
                case 12: {
                    s6 = zza.zzo(parcel0, v5);
                    break;
                }
                case 13: {
                    v2 = zza.zzg(parcel0, v5);
                    break;
                }
                case 14: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 15: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                case 16: {
                    z2 = zza.zzc(parcel0, v5);
                    break;
                }
                case 17: {
                    z3 = zza.zzc(parcel0, v5);
                    break;
                }
                case 18: {
                    s7 = zza.zzo(parcel0, v5);
                    break;
                }
                case 19: {
                    s8 = zza.zzo(parcel0, v5);
                    break;
                }
                case 20: {
                    s9 = zza.zzo(parcel0, v5);
                    break;
                }
                case 21: {
                    z4 = zza.zzc(parcel0, v5);
                    break;
                }
                case 22: {
                    z5 = zza.zzc(parcel0, v5);
                    break;
                }
                case 23: {
                    z6 = zza.zzc(parcel0, v5);
                    break;
                }
                case 24: {
                    s10 = zza.zzo(parcel0, v5);
                    break;
                }
                case 25: {
                    z7 = zza.zzc(parcel0, v5);
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
        return new GameEntity(v1, s, s1, s2, s3, s4, s5, uri0, uri1, uri2, z, z1, s6, v2, v3, v4, z2, z3, s7, s8, s9, z4, z5, z6, s10, z7);
    }

    public GameEntity[] zzfm(int v) {
        return new GameEntity[v];
    }
}

