package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class AppContentConditionEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdz(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfv(x0);
    }

    static void zza(AppContentConditionEntity appContentConditionEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, appContentConditionEntity0.zzse(), false);
        zzb.zzc(parcel0, 1000, appContentConditionEntity0.getVersionCode());
        zzb.zza(parcel0, 2, appContentConditionEntity0.zzsf(), false);
        zzb.zza(parcel0, 3, appContentConditionEntity0.zzsg(), false);
        zzb.zza(parcel0, 4, appContentConditionEntity0.zzsh(), false);
        zzb.zzH(parcel0, v1);
    }

    public AppContentConditionEntity zzdz(Parcel parcel0) {
        Bundle bundle0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    bundle0 = zza.zzq(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AppContentConditionEntity(v1, s2, s1, s, bundle0);
    }

    public AppContentConditionEntity[] zzfv(int v) {
        return new AppContentConditionEntity[v];
    }
}

