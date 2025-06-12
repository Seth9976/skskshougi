package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzet(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgR(x0);
    }

    static void zza(PlacePhotoResult placePhotoResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placePhotoResult0.getStatus(), v, false);
        zzb.zzc(parcel0, 1000, placePhotoResult0.zzCY);
        zzb.zza(parcel0, 2, placePhotoResult0.zzazJ, v, false);
        zzb.zzH(parcel0, v1);
    }

    public PlacePhotoResult zzet(Parcel parcel0) {
        int v3;
        Status status1;
        BitmapTeleporter bitmapTeleporter1;
        BitmapTeleporter bitmapTeleporter0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Status status0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    bitmapTeleporter1 = bitmapTeleporter0;
                    status1 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 2: {
                    bitmapTeleporter1 = (BitmapTeleporter)zza.zza(parcel0, v2, BitmapTeleporter.CREATOR);
                    status1 = status0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    status1 = status0;
                    v3 = zza.zzg(parcel0, v2);
                    bitmapTeleporter1 = bitmapTeleporter0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    bitmapTeleporter1 = bitmapTeleporter0;
                    status1 = status0;
                    v3 = v1;
                }
            }
            v1 = v3;
            status0 = status1;
            bitmapTeleporter0 = bitmapTeleporter1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PlacePhotoResult(v1, status0, bitmapTeleporter0);
    }

    public PlacePhotoResult[] zzgR(int v) {
        return new PlacePhotoResult[v];
    }
}

