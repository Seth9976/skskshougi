package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzl(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzE(x0);
    }

    public LargeParcelTeleporter[] zzE(int v) {
        return new LargeParcelTeleporter[v];
    }

    static void zza(LargeParcelTeleporter largeParcelTeleporter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, largeParcelTeleporter0.zzCY);
        zzb.zza(parcel0, 2, largeParcelTeleporter0.zzCZ, v, false);
        zzb.zzH(parcel0, v1);
    }

    public LargeParcelTeleporter zzl(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)zza.zza(parcel0, v2, ParcelFileDescriptor.CREATOR);
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
        return new LargeParcelTeleporter(v1, parcelFileDescriptor0);
    }
}

