package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class AppContentActionEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdw(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfs(x0);
    }

    static void zza(AppContentActionEntity appContentActionEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, appContentActionEntity0.zzrO(), false);
        zzb.zzc(parcel0, 1000, appContentActionEntity0.getVersionCode());
        zzb.zza(parcel0, 2, appContentActionEntity0.zzrP(), false);
        zzb.zza(parcel0, 3, appContentActionEntity0.getExtras(), false);
        zzb.zza(parcel0, 6, appContentActionEntity0.getType(), false);
        zzb.zza(parcel0, 7, appContentActionEntity0.getId(), false);
        zzb.zza(parcel0, 8, appContentActionEntity0.zzrN(), v, false);
        zzb.zza(parcel0, 9, appContentActionEntity0.zzrQ(), false);
        zzb.zzH(parcel0, v1);
    }

    public AppContentActionEntity zzdw(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        AppContentAnnotationEntity appContentAnnotationEntity0 = null;
        String s1 = null;
        String s2 = null;
        Bundle bundle0 = null;
        String s3 = null;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v2, AppContentConditionEntity.CREATOR);
                    break;
                }
                case 2: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    bundle0 = zza.zzq(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    appContentAnnotationEntity0 = (AppContentAnnotationEntity)zza.zza(parcel0, v2, AppContentAnnotationEntity.CREATOR);
                    break;
                }
                case 9: {
                    s = zza.zzo(parcel0, v2);
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
        return new AppContentActionEntity(v1, arrayList0, s3, bundle0, s2, s1, appContentAnnotationEntity0, s);
    }

    public AppContentActionEntity[] zzfs(int v) {
        return new AppContentActionEntity[v];
    }
}

