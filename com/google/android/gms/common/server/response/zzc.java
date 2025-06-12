package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbJ(x0);
    }

    static void zza(FieldMappingDictionary fieldMappingDictionary0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, fieldMappingDictionary0.getVersionCode());
        zzb.zzc(parcel0, 2, fieldMappingDictionary0.zzoB(), false);
        zzb.zza(parcel0, 3, fieldMappingDictionary0.zzoC(), false);
        zzb.zzH(parcel0, v1);
    }

    public FieldMappingDictionary zzaj(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzc(parcel0, v2, Entry.CREATOR);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
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
        return new FieldMappingDictionary(v1, arrayList0, s);
    }

    public FieldMappingDictionary[] zzbJ(int v) {
        return new FieldMappingDictionary[v];
    }
}

