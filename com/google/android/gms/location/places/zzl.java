package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzev(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgT(x0);
    }

    static void zza(PlaceRequest placeRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, placeRequest0.zzCY);
        zzb.zza(parcel0, 2, placeRequest0.zzuG(), v, false);
        zzb.zza(parcel0, 3, placeRequest0.getInterval());
        zzb.zzc(parcel0, 4, placeRequest0.getPriority());
        zzb.zza(parcel0, 5, placeRequest0.getExpirationTime());
        zzb.zzH(parcel0, v1);
    }

    public PlaceRequest zzev(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        PlaceFilter placeFilter0 = null;
        long v2 = PlaceRequest.zzazM;
        int v3 = 102;
        long v4 = 0x7FFFFFFFFFFFFFFFL;
        while(parcel0.dataPosition() < v) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 2: {
                    placeFilter0 = (PlaceFilter)zza.zza(parcel0, v5, PlaceFilter.CREATOR);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v5);
                    break;
                }
                case 4: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 5: {
                    v4 = zza.zzi(parcel0, v5);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PlaceRequest(v1, placeFilter0, v2, v3, v4);
    }

    public PlaceRequest[] zzgT(int v) {
        return new PlaceRequest[v];
    }
}

