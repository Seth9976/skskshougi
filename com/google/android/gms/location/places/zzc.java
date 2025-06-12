package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeo(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgK(x0);
    }

    static void zza(AutocompleteFilter autocompleteFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, autocompleteFilter0.zzuE());
        zzb.zzc(parcel0, 1000, autocompleteFilter0.zzCY);
        zzb.zza(parcel0, 2, autocompleteFilter0.zzazs, false);
        zzb.zzH(parcel0, v1);
    }

    public AutocompleteFilter zzeo(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzB(parcel0, v2);
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
        return new AutocompleteFilter(v1, z, arrayList0);
    }

    public AutocompleteFilter[] zzgK(int v) {
        return new AutocompleteFilter[v];
    }
}

