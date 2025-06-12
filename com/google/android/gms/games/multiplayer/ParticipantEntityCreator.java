package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

public class ParticipantEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdJ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfS(x0);
    }

    static void zza(ParticipantEntity participantEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, participantEntity0.getParticipantId(), false);
        zzb.zzc(parcel0, 1000, participantEntity0.getVersionCode());
        zzb.zza(parcel0, 2, participantEntity0.getDisplayName(), false);
        zzb.zza(parcel0, 3, participantEntity0.getIconImageUri(), v, false);
        zzb.zza(parcel0, 4, participantEntity0.getHiResImageUri(), v, false);
        zzb.zzc(parcel0, 5, participantEntity0.getStatus());
        zzb.zza(parcel0, 6, participantEntity0.zzsr(), false);
        zzb.zza(parcel0, 7, participantEntity0.isConnectedToRoom());
        zzb.zza(parcel0, 8, participantEntity0.getPlayer(), v, false);
        zzb.zzc(parcel0, 9, participantEntity0.getCapabilities());
        zzb.zza(parcel0, 10, participantEntity0.getResult(), v, false);
        zzb.zza(parcel0, 11, participantEntity0.getIconImageUrl(), false);
        zzb.zza(parcel0, 12, participantEntity0.getHiResImageUrl(), false);
        zzb.zzH(parcel0, v1);
    }

    public ParticipantEntity zzdJ(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        Uri uri0 = null;
        Uri uri1 = null;
        int v2 = 0;
        String s2 = null;
        boolean z = false;
        PlayerEntity playerEntity0 = null;
        int v3 = 0;
        ParticipantResult participantResult0 = null;
        String s3 = null;
        String s4 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    uri0 = (Uri)zza.zza(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 4: {
                    uri1 = (Uri)zza.zza(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 5: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 8: {
                    playerEntity0 = (PlayerEntity)zza.zza(parcel0, v4, PlayerEntity.CREATOR);
                    break;
                }
                case 9: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 10: {
                    participantResult0 = (ParticipantResult)zza.zza(parcel0, v4, ParticipantResult.CREATOR);
                    break;
                }
                case 11: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 12: {
                    s4 = zza.zzo(parcel0, v4);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ParticipantEntity(v1, s, s1, uri0, uri1, v2, s2, z, playerEntity0, v3, participantResult0, s3, s4);
    }

    public ParticipantEntity[] zzfS(int v) {
        return new ParticipantEntity[v];
    }
}

