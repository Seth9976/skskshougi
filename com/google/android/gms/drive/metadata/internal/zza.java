package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdp(x0);
    }

    static void zza(AppVisibleCustomProperties appVisibleCustomProperties0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, appVisibleCustomProperties0.zzCY);
        zzb.zzc(parcel0, 2, appVisibleCustomProperties0.zzagE, false);
        zzb.zzH(parcel0, v1);
    }

    public AppVisibleCustomProperties zzbA(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2, CustomProperty.CREATOR);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AppVisibleCustomProperties(v1, arrayList0);
    }

    public AppVisibleCustomProperties[] zzdp(int v) {
        return new AppVisibleCustomProperties[v];
    }
}

