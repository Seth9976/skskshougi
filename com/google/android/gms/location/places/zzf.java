package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzer(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgN(x0);
    }

    static void zza(PlaceFilter placeFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placeFilter0.zzazs, false);
        zzb.zzc(parcel0, 1000, placeFilter0.zzCY);
        zzb.zza(parcel0, 3, placeFilter0.zzazC);
        zzb.zzc(parcel0, 4, placeFilter0.zzazv, false);
        zzb.zzb(parcel0, 6, placeFilter0.zzazu, false);
        zzb.zzH(parcel0, v1);
    }

    public PlaceFilter zzer(Parcel parcel0) {
        boolean z = false;
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList2 = zza.zzB(parcel0, v2);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v2, UserDataType.CREATOR);
                    break;
                }
                case 6: {
                    arrayList1 = zza.zzC(parcel0, v2);
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
        return new PlaceFilter(v1, arrayList2, z, arrayList1, arrayList0);
    }

    public PlaceFilter[] zzgN(int v) {
        return new PlaceFilter[v];
    }
}

