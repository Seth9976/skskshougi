package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzep(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgL(x0);
    }

    static void zza(NearbyAlertFilter nearbyAlertFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzb(parcel0, 1, nearbyAlertFilter0.zzazu, false);
        zzb.zzc(parcel0, 1000, nearbyAlertFilter0.zzCY);
        zzb.zza(parcel0, 2, nearbyAlertFilter0.zzazs, false);
        zzb.zzc(parcel0, 3, nearbyAlertFilter0.zzazv, false);
        zzb.zzH(parcel0, v1);
    }

    public NearbyAlertFilter zzep(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList2 = zza.zzC(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList1 = zza.zzB(parcel0, v2);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v2, UserDataType.CREATOR);
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
        return new NearbyAlertFilter(v1, arrayList2, arrayList1, arrayList0);
    }

    public NearbyAlertFilter[] zzgL(int v) {
        return new NearbyAlertFilter[v];
    }
}

