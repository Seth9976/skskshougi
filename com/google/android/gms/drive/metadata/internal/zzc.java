package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbB(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdq(x0);
    }

    static void zza(CustomProperty customProperty0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, customProperty0.zzCY);
        zzb.zza(parcel0, 2, customProperty0.zzagG, v, false);
        zzb.zza(parcel0, 3, customProperty0.mValue, false);
        zzb.zzH(parcel0, v1);
    }

    public CustomProperty zzbB(Parcel parcel0) {
        int v3;
        CustomPropertyKey customPropertyKey1;
        String s1;
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        CustomPropertyKey customPropertyKey0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    customPropertyKey1 = customPropertyKey0;
                    v3 = zza.zzg(parcel0, v2);
                    s1 = s;
                    break;
                }
                case 2: {
                    v3 = v1;
                    s1 = s;
                    customPropertyKey1 = (CustomPropertyKey)zza.zza(parcel0, v2, CustomPropertyKey.CREATOR);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    customPropertyKey1 = customPropertyKey0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    s1 = s;
                    customPropertyKey1 = customPropertyKey0;
                    v3 = v1;
                }
            }
            v1 = v3;
            customPropertyKey0 = customPropertyKey1;
            s = s1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CustomProperty(v1, customPropertyKey0, s);
    }

    public CustomProperty[] zzdq(int v) {
        return new CustomProperty[v];
    }
}

