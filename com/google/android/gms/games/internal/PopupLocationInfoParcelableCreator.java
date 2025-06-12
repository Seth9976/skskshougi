package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PopupLocationInfoParcelableCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdD(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfE(x0);
    }

    static void zza(PopupLocationInfoParcelable popupLocationInfoParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, popupLocationInfoParcelable0.zztc(), false);
        zzb.zzc(parcel0, 1000, popupLocationInfoParcelable0.getVersionCode());
        zzb.zza(parcel0, 2, popupLocationInfoParcelable0.getWindowToken(), false);
        zzb.zzH(parcel0, v1);
    }

    public PopupLocationInfoParcelable zzdD(Parcel parcel0) {
        IBinder iBinder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    bundle0 = zza.zzq(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
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
        return new PopupLocationInfoParcelable(v1, bundle0, iBinder0);
    }

    public PopupLocationInfoParcelable[] zzfE(int v) {
        return new PopupLocationInfoParcelable[v];
    }
}

