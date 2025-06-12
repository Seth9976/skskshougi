package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class AppContentSectionEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfw(x0);
    }

    static void zza(AppContentSectionEntity appContentSectionEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, appContentSectionEntity0.getActions(), false);
        zzb.zzc(parcel0, 1000, appContentSectionEntity0.getVersionCode());
        zzb.zzc(parcel0, 3, appContentSectionEntity0.zzsj(), false);
        zzb.zza(parcel0, 4, appContentSectionEntity0.zzrP(), false);
        zzb.zza(parcel0, 5, appContentSectionEntity0.getExtras(), false);
        zzb.zza(parcel0, 6, appContentSectionEntity0.zzsb(), false);
        zzb.zza(parcel0, 7, appContentSectionEntity0.getTitle(), false);
        zzb.zza(parcel0, 8, appContentSectionEntity0.getType(), false);
        zzb.zza(parcel0, 9, appContentSectionEntity0.getId(), false);
        zzb.zza(parcel0, 10, appContentSectionEntity0.zzsk(), false);
        zzb.zzc(parcel0, 14, appContentSectionEntity0.zzrZ(), false);
        zzb.zzH(parcel0, v1);
    }

    public AppContentSectionEntity zzdA(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        Bundle bundle0 = null;
        String s5 = null;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList2 = zza.zzc(parcel0, v2, AppContentActionEntity.CREATOR);
                    break;
                }
                case 3: {
                    arrayList1 = zza.zzc(parcel0, v2, AppContentCardEntity.CREATOR);
                    break;
                }
                case 4: {
                    s5 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    bundle0 = zza.zzq(parcel0, v2);
                    break;
                }
                case 6: {
                    s4 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 9: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 10: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 14: {
                    arrayList0 = zza.zzc(parcel0, v2, AppContentAnnotationEntity.CREATOR);
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
        return new AppContentSectionEntity(v1, arrayList2, arrayList1, s5, bundle0, s4, s3, s2, s1, s, arrayList0);
    }

    public AppContentSectionEntity[] zzfw(int v) {
        return new AppContentSectionEntity[v];
    }
}

