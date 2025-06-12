package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfB(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziq(x0);
    }

    static void zza(ViewableItem viewableItem0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, viewableItem0.getVersionCode());
        zzb.zza(parcel0, 2, viewableItem0.zzxg(), false);
        zzb.zzH(parcel0, v1);
    }

    public ViewableItem zzfB(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String[] arr_s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_s = zza.zzA(parcel0, v2);
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
        return new ViewableItem(v1, arr_s);
    }

    public ViewableItem[] zziq(int v) {
        return new ViewableItem[v];
    }
}

