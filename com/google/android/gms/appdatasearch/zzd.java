package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzt(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzae(x0);
    }

    static void zza(DocumentSection documentSection0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, documentSection0.zzNe, false);
        zzb.zzc(parcel0, 1000, documentSection0.zzCY);
        zzb.zza(parcel0, 3, documentSection0.zzNf, v, false);
        zzb.zzc(parcel0, 4, documentSection0.zzNg);
        zzb.zza(parcel0, 5, documentSection0.zzNh, false);
        zzb.zzH(parcel0, v1);
    }

    public DocumentSection[] zzae(int v) {
        return new DocumentSection[v];
    }

    public DocumentSection zzt(Parcel parcel0) {
        byte[] arr_b = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = -1;
        RegisterSectionInfo registerSectionInfo0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    registerSectionInfo0 = (RegisterSectionInfo)zza.zza(parcel0, v3, RegisterSectionInfo.CREATOR);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_b = zza.zzr(parcel0, v3);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new DocumentSection(v1, s, registerSectionInfo0, v2, arr_b);
    }
}

