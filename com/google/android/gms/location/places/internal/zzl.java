package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzez(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgZ(x0);
    }

    static void zza(PlaceLikelihoodEntity placeLikelihoodEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placeLikelihoodEntity0.zzaAK, v, false);
        zzb.zzc(parcel0, 1000, placeLikelihoodEntity0.zzCY);
        zzb.zza(parcel0, 2, placeLikelihoodEntity0.zzaAL);
        zzb.zzH(parcel0, v1);
    }

    public PlaceLikelihoodEntity zzez(Parcel parcel0) {
        int v3;
        PlaceImpl placeImpl1;
        float f1;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        PlaceImpl placeImpl0 = null;
        float f;
        for(f = 0.0f; parcel0.dataPosition() < v; f = f1) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    f1 = f;
                    placeImpl1 = (PlaceImpl)zza.zza(parcel0, v2, PlaceImpl.CREATOR);
                    break;
                }
                case 2: {
                    f1 = zza.zzl(parcel0, v2);
                    placeImpl1 = placeImpl0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    placeImpl1 = placeImpl0;
                    v3 = zza.zzg(parcel0, v2);
                    f1 = f;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    f1 = f;
                    placeImpl1 = placeImpl0;
                    v3 = v1;
                }
            }
            v1 = v3;
            placeImpl0 = placeImpl1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PlaceLikelihoodEntity(v1, placeImpl0, f);
    }

    public PlaceLikelihoodEntity[] zzgZ(int v) {
        return new PlaceLikelihoodEntity[v];
    }
}

