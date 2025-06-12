package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class InvitationEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdI(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfR(x0);
    }

    static void zza(InvitationEntity invitationEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, invitationEntity0.getGame(), v, false);
        zzb.zzc(parcel0, 1000, invitationEntity0.getVersionCode());
        zzb.zza(parcel0, 2, invitationEntity0.getInvitationId(), false);
        zzb.zza(parcel0, 3, invitationEntity0.getCreationTimestamp());
        zzb.zzc(parcel0, 4, invitationEntity0.getInvitationType());
        zzb.zza(parcel0, 5, invitationEntity0.getInviter(), v, false);
        zzb.zzc(parcel0, 6, invitationEntity0.getParticipants(), false);
        zzb.zzc(parcel0, 7, invitationEntity0.getVariant());
        zzb.zzc(parcel0, 8, invitationEntity0.getAvailableAutoMatchSlots());
        zzb.zzH(parcel0, v1);
    }

    public InvitationEntity zzdI(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        long v2 = 0L;
        int v3 = 0;
        ParticipantEntity participantEntity0 = null;
        int v4 = 0;
        String s = null;
        GameEntity gameEntity0 = null;
        int v5 = 0;
        while(parcel0.dataPosition() < v1) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    gameEntity0 = (GameEntity)zza.zza(parcel0, v6, GameEntity.CREATOR);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v6);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v6);
                    break;
                }
                case 4: {
                    v4 = zza.zzg(parcel0, v6);
                    break;
                }
                case 5: {
                    participantEntity0 = (ParticipantEntity)zza.zza(parcel0, v6, ParticipantEntity.CREATOR);
                    break;
                }
                case 6: {
                    arrayList0 = zza.zzc(parcel0, v6, ParticipantEntity.CREATOR);
                    break;
                }
                case 7: {
                    v3 = zza.zzg(parcel0, v6);
                    break;
                }
                case 8: {
                    v = zza.zzg(parcel0, v6);
                    break;
                }
                case 1000: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new InvitationEntity(v5, gameEntity0, s, v2, v4, participantEntity0, arrayList0, v3, v);
    }

    public InvitationEntity[] zzfR(int v) {
        return new InvitationEntity[v];
    }
}

