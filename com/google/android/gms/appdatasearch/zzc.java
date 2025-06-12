package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzs(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzad(x0);
    }

    static void zza(DocumentId documentId0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, documentId0.zzMZ, false);
        zzb.zzc(parcel0, 1000, documentId0.zzCY);
        zzb.zza(parcel0, 2, documentId0.zzNa, false);
        zzb.zza(parcel0, 3, documentId0.zzNb, false);
        zzb.zzH(parcel0, v1);
    }

    public DocumentId[] zzad(int v) {
        return new DocumentId[v];
    }

    public DocumentId zzs(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
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
        return new DocumentId(v1, s2, s1, s);
    }
}

