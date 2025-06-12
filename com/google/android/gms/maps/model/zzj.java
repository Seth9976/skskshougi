package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeU(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhu(x0);
    }

    static void zza(StreetViewPanoramaLink streetViewPanoramaLink0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, streetViewPanoramaLink0.getVersionCode());
        zzb.zza(parcel0, 2, streetViewPanoramaLink0.panoId, false);
        zzb.zza(parcel0, 3, streetViewPanoramaLink0.bearing);
        zzb.zzH(parcel0, v1);
    }

    public StreetViewPanoramaLink zzeU(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        float f = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    f = zza.zzl(parcel0, v2);
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
        return new StreetViewPanoramaLink(v1, s, f);
    }

    public StreetViewPanoramaLink[] zzhu(int v) {
        return new StreetViewPanoramaLink[v];
    }
}

