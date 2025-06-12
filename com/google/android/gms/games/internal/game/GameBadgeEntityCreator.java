package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class GameBadgeEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdE(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfJ(x0);
    }

    static void zza(GameBadgeEntity gameBadgeEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, gameBadgeEntity0.getType());
        zzb.zzc(parcel0, 1000, gameBadgeEntity0.getVersionCode());
        zzb.zza(parcel0, 2, gameBadgeEntity0.getTitle(), false);
        zzb.zza(parcel0, 3, gameBadgeEntity0.getDescription(), false);
        zzb.zza(parcel0, 4, gameBadgeEntity0.getIconImageUri(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public GameBadgeEntity zzdE(Parcel parcel0) {
        int v = 0;
        Uri uri0 = null;
        int v1 = zza.zzab(parcel0);
        String s = null;
        String s1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    uri0 = (Uri)zza.zza(parcel0, v3, Uri.CREATOR);
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
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GameBadgeEntity(v2, v, s1, s, uri0);
    }

    public GameBadgeEntity[] zzfJ(int v) {
        return new GameBadgeEntity[v];
    }
}

