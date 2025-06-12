package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfa(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhA(x0);
    }

    static void zza(BitmapDescriptorParcelable bitmapDescriptorParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, bitmapDescriptorParcelable0.getVersionCode());
        zzb.zza(parcel0, 2, bitmapDescriptorParcelable0.getType());
        zzb.zza(parcel0, 3, bitmapDescriptorParcelable0.getParameters(), false);
        zzb.zza(parcel0, 4, bitmapDescriptorParcelable0.getBitmap(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public BitmapDescriptorParcelable zzfa(Parcel parcel0) {
        Bitmap bitmap0 = null;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        Bundle bundle0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v3);
                    break;
                }
                case 3: {
                    bundle0 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel0, v3);
                    break;
                }
                case 4: {
                    bitmap0 = (Bitmap)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, Bitmap.CREATOR);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new BitmapDescriptorParcelable(v2, ((byte)v), bundle0, bitmap0);
    }

    public BitmapDescriptorParcelable[] zzhA(int v) {
        return new BitmapDescriptorParcelable[v];
    }
}

