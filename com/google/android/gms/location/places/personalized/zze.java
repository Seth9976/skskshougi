package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.places.personalized.internal.TestDataImpl;
import java.util.ArrayList;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhg(x0);
    }

    static void zza(PlaceUserData placeUserData0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placeUserData0.zzvb(), false);
        zzb.zzc(parcel0, 1000, placeUserData0.zzCY);
        zzb.zza(parcel0, 2, placeUserData0.getPlaceId(), false);
        zzb.zzc(parcel0, 5, placeUserData0.zzve(), false);
        zzb.zzc(parcel0, 6, placeUserData0.zzvc(), false);
        zzb.zzc(parcel0, 7, placeUserData0.zzvd(), false);
        zzb.zzH(parcel0, v1);
    }

    public PlaceUserData zzeG(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    arrayList2 = zza.zzc(parcel0, v2, TestDataImpl.CREATOR);
                    break;
                }
                case 6: {
                    arrayList1 = zza.zzc(parcel0, v2, PlaceAlias.CREATOR);
                    break;
                }
                case 7: {
                    arrayList0 = zza.zzc(parcel0, v2, HereContent.CREATOR);
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
        return new PlaceUserData(v1, s1, s, arrayList2, arrayList1, arrayList0);
    }

    public PlaceUserData[] zzhg(int v) {
        return new PlaceUserData[v];
    }
}

