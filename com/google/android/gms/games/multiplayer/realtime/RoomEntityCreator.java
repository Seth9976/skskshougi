package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class RoomEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdM(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfV(x0);
    }

    static void zza(RoomEntity roomEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, roomEntity0.getRoomId(), false);
        zzb.zzc(parcel0, 1000, roomEntity0.getVersionCode());
        zzb.zza(parcel0, 2, roomEntity0.getCreatorId(), false);
        zzb.zza(parcel0, 3, roomEntity0.getCreationTimestamp());
        zzb.zzc(parcel0, 4, roomEntity0.getStatus());
        zzb.zza(parcel0, 5, roomEntity0.getDescription(), false);
        zzb.zzc(parcel0, 6, roomEntity0.getVariant());
        zzb.zza(parcel0, 7, roomEntity0.getAutoMatchCriteria(), false);
        zzb.zzc(parcel0, 8, roomEntity0.getParticipants(), false);
        zzb.zzc(parcel0, 9, roomEntity0.getAutoMatchWaitEstimateSeconds());
        zzb.zzH(parcel0, v1);
    }

    public RoomEntity zzdM(Parcel parcel0) {
        int v = 0;
        ArrayList arrayList0 = null;
        int v1 = zza.zzab(parcel0);
        long v2 = 0L;
        Bundle bundle0 = null;
        int v3 = 0;
        String s = null;
        int v4 = 0;
        String s1 = null;
        String s2 = null;
        int v5 = 0;
        while(parcel0.dataPosition() < v1) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    s2 = zza.zzo(parcel0, v6);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v6);
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
                    s = zza.zzo(parcel0, v6);
                    break;
                }
                case 6: {
                    v3 = zza.zzg(parcel0, v6);
                    break;
                }
                case 7: {
                    bundle0 = zza.zzq(parcel0, v6);
                    break;
                }
                case 8: {
                    arrayList0 = zza.zzc(parcel0, v6, ParticipantEntity.CREATOR);
                    break;
                }
                case 9: {
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
        return new RoomEntity(v5, s2, s1, v2, v4, s, v3, bundle0, arrayList0, v);
    }

    public RoomEntity[] zzfV(int v) {
        return new RoomEntity[v];
    }
}

