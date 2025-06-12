package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbe(x0);
    }

    public BitmapTeleporter zzR(Parcel parcel0) {
        int v5;
        ParcelFileDescriptor parcelFileDescriptor1;
        int v4;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    parcelFileDescriptor1 = parcelFileDescriptor0;
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 2: {
                    v5 = v2;
                    v4 = v;
                    parcelFileDescriptor1 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 3: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    parcelFileDescriptor1 = parcelFileDescriptor0;
                    v5 = v2;
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                    v4 = v;
                    parcelFileDescriptor1 = parcelFileDescriptor0;
                    v5 = v2;
                }
            }
            v2 = v5;
            parcelFileDescriptor0 = parcelFileDescriptor1;
            v = v4;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new BitmapTeleporter(v2, parcelFileDescriptor0, v);
    }

    static void zza(BitmapTeleporter bitmapTeleporter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, bitmapTeleporter0.zzCY);
        zzb.zza(parcel0, 2, bitmapTeleporter0.zzCZ, v, false);
        zzb.zzc(parcel0, 3, bitmapTeleporter0.zzSq);
        zzb.zzH(parcel0, v1);
    }

    public BitmapTeleporter[] zzbe(int v) {
        return new BitmapTeleporter[v];
    }
}

