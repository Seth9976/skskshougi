package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzn(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzH(x0);
    }

    public RewardedVideoAdRequestParcel[] zzH(int v) {
        return new RewardedVideoAdRequestParcel[v];
    }

    static void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, rewardedVideoAdRequestParcel0.versionCode);
        zzb.zza(parcel0, 2, rewardedVideoAdRequestParcel0.zzCm, v, false);
        zzb.zza(parcel0, 3, rewardedVideoAdRequestParcel0.zzpG, false);
        zzb.zzH(parcel0, v1);
    }

    public RewardedVideoAdRequestParcel zzn(Parcel parcel0) {
        int v3;
        AdRequestParcel adRequestParcel1;
        String s1;
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        AdRequestParcel adRequestParcel0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    adRequestParcel1 = adRequestParcel0;
                    v3 = zza.zzg(parcel0, v2);
                    s1 = s;
                    break;
                }
                case 2: {
                    v3 = v1;
                    s1 = s;
                    adRequestParcel1 = (AdRequestParcel)zza.zza(parcel0, v2, AdRequestParcel.CREATOR);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    adRequestParcel1 = adRequestParcel0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    s1 = s;
                    adRequestParcel1 = adRequestParcel0;
                    v3 = v1;
                }
            }
            v1 = v3;
            adRequestParcel0 = adRequestParcel1;
            s = s1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new RewardedVideoAdRequestParcel(v1, adRequestParcel0, s);
    }
}

