package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class MilestoneEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdO(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfX(x0);
    }

    static void zza(MilestoneEntity milestoneEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, milestoneEntity0.getMilestoneId(), false);
        zzb.zzc(parcel0, 1000, milestoneEntity0.getVersionCode());
        zzb.zza(parcel0, 2, milestoneEntity0.getCurrentProgress());
        zzb.zza(parcel0, 3, milestoneEntity0.getTargetProgress());
        zzb.zza(parcel0, 4, milestoneEntity0.getCompletionRewardData(), false);
        zzb.zzc(parcel0, 5, milestoneEntity0.getState());
        zzb.zza(parcel0, 6, milestoneEntity0.getEventId(), false);
        zzb.zzH(parcel0, v1);
    }

    public MilestoneEntity zzdO(Parcel parcel0) {
        long v = 0L;
        int v1 = 0;
        String s = null;
        int v2 = zza.zzab(parcel0);
        byte[] arr_b = null;
        long v3 = 0L;
        String s1 = null;
        int v4 = 0;
        while(parcel0.dataPosition() < v2) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    v = zza.zzi(parcel0, v5);
                    break;
                }
                case 4: {
                    arr_b = zza.zzr(parcel0, v5);
                    break;
                }
                case 5: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 1000: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel0);
        }
        return new MilestoneEntity(v4, s1, v3, v, arr_b, v1, s);
    }

    public MilestoneEntity[] zzfX(int v) {
        return new MilestoneEntity[v];
    }
}

