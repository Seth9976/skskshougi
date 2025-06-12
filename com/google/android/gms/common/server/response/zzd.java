package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzak(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbK(x0);
    }

    static void zza(Entry fieldMappingDictionary$Entry0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, fieldMappingDictionary$Entry0.versionCode);
        zzb.zza(parcel0, 2, fieldMappingDictionary$Entry0.className, false);
        zzb.zzc(parcel0, 3, fieldMappingDictionary$Entry0.zzabT, false);
        zzb.zzH(parcel0, v1);
    }

    public Entry zzak(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
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
                    arrayList0 = zza.zzc(parcel0, v2, FieldMapPair.CREATOR);
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
        return new Entry(v1, s, arrayList0);
    }

    public Entry[] zzbK(int v) {
        return new Entry[v];
    }
}

