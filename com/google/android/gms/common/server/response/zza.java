package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzah(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbH(x0);
    }

    static void zza(Field fastJsonResponse$Field0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, fastJsonResponse$Field0.getVersionCode());
        zzb.zzc(parcel0, 2, fastJsonResponse$Field0.zzok());
        zzb.zza(parcel0, 3, fastJsonResponse$Field0.zzoq());
        zzb.zzc(parcel0, 4, fastJsonResponse$Field0.zzol());
        zzb.zza(parcel0, 5, fastJsonResponse$Field0.zzor());
        zzb.zza(parcel0, 6, fastJsonResponse$Field0.zzos(), false);
        zzb.zzc(parcel0, 7, fastJsonResponse$Field0.zzot());
        zzb.zza(parcel0, 8, fastJsonResponse$Field0.zzov(), false);
        zzb.zza(parcel0, 9, fastJsonResponse$Field0.zzox(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public Field zzah(Parcel parcel0) {
        ConverterWrapper converterWrapper0 = null;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        String s = null;
        String s1 = null;
        boolean z = false;
        int v2 = 0;
        boolean z1 = false;
        int v3 = 0;
        int v4 = 0;
        while(parcel0.dataPosition() < v1) {
            int v5 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 3: {
                    z1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 5: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v5);
                    break;
                }
                case 6: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v5);
                    break;
                }
                case 7: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 8: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v5);
                    break;
                }
                case 9: {
                    converterWrapper0 = (ConverterWrapper)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v5, ConverterWrapper.CREATOR);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new Field(v4, v3, z1, v2, z, s1, v, s, converterWrapper0);
    }

    public Field[] zzbH(int v) {
        return new Field[v];
    }
}

