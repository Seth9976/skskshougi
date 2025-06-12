package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzex(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgW(x0);
    }

    static void zza(AutocompletePredictionEntity autocompletePredictionEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, autocompletePredictionEntity0.zzakM, false);
        zzb.zzc(parcel0, 1000, autocompletePredictionEntity0.zzCY);
        zzb.zza(parcel0, 2, autocompletePredictionEntity0.zzazK, false);
        zzb.zza(parcel0, 3, autocompletePredictionEntity0.zzazo, false);
        zzb.zzc(parcel0, 4, autocompletePredictionEntity0.zzaAe, false);
        zzb.zzc(parcel0, 5, autocompletePredictionEntity0.zzaAf);
        zzb.zzH(parcel0, v1);
    }

    public AutocompletePredictionEntity zzex(Parcel parcel0) {
        int v = 0;
        ArrayList arrayList0 = null;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        ArrayList arrayList1 = null;
        String s = null;
        String s1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    arrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzB(parcel0, v3);
                    break;
                }
                case 4: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, SubstringEntity.CREATOR);
                    break;
                }
                case 5: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
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
        return new AutocompletePredictionEntity(v2, s1, s, arrayList1, arrayList0, v);
    }

    public AutocompletePredictionEntity[] zzgW(int v) {
        return new AutocompletePredictionEntity[v];
    }
}

