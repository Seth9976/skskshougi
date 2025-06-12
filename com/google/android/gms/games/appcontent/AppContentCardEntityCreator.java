package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class AppContentCardEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdy(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfu(x0);
    }

    static void zza(AppContentCardEntity appContentCardEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, appContentCardEntity0.getActions(), false);
        zzb.zzc(parcel0, 1000, appContentCardEntity0.getVersionCode());
        zzb.zzc(parcel0, 2, appContentCardEntity0.zzrZ(), false);
        zzb.zzc(parcel0, 3, appContentCardEntity0.zzrO(), false);
        zzb.zza(parcel0, 4, appContentCardEntity0.zzrP(), false);
        zzb.zzc(parcel0, 5, appContentCardEntity0.zzsa());
        zzb.zza(parcel0, 6, appContentCardEntity0.getDescription(), false);
        zzb.zza(parcel0, 7, appContentCardEntity0.getExtras(), false);
        zzb.zza(parcel0, 10, appContentCardEntity0.zzsb(), false);
        zzb.zza(parcel0, 11, appContentCardEntity0.getTitle(), false);
        zzb.zzc(parcel0, 12, appContentCardEntity0.zzsc());
        zzb.zza(parcel0, 13, appContentCardEntity0.getType(), false);
        zzb.zza(parcel0, 14, appContentCardEntity0.getId(), false);
        zzb.zzH(parcel0, v1);
    }

    public AppContentCardEntity zzdy(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        String s = null;
        int v2 = 0;
        String s1 = null;
        Bundle bundle0 = null;
        String s2 = null;
        String s3 = null;
        int v3 = 0;
        String s4 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v4, AppContentActionEntity.CREATOR);
                    break;
                }
                case 2: {
                    arrayList1 = zza.zzc(parcel0, v4, AppContentAnnotationEntity.CREATOR);
                    break;
                }
                case 3: {
                    arrayList2 = zza.zzc(parcel0, v4, AppContentConditionEntity.CREATOR);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 7: {
                    bundle0 = zza.zzq(parcel0, v4);
                    break;
                }
                case 10: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 11: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 12: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 13: {
                    s4 = zza.zzo(parcel0, v4);
                    break;
                }
                case 14: {
                    s5 = zza.zzo(parcel0, v4);
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
        return new AppContentCardEntity(v1, arrayList0, arrayList1, arrayList2, s, v2, s1, bundle0, s2, s3, v3, s4, s5);
    }

    public AppContentCardEntity[] zzfu(int v) {
        return new AppContentCardEntity[v];
    }
}

