package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfd(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhE(x0);
    }

    static void zza(MarkerOptionsParcelable markerOptionsParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, markerOptionsParcelable0.getVersionCode());
        zzb.zza(parcel0, 2, markerOptionsParcelable0.zzvO(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public MarkerOptionsParcelable zzfd(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        BitmapDescriptorParcelable bitmapDescriptorParcelable0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    bitmapDescriptorParcelable0 = (BitmapDescriptorParcelable)zza.zza(parcel0, v2, BitmapDescriptorParcelable.CREATOR);
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
        return new MarkerOptionsParcelable(v1, bitmapDescriptorParcelable0);
    }

    public MarkerOptionsParcelable[] zzhE(int v) {
        return new MarkerOptionsParcelable[v];
    }
}

