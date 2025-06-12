package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgH(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjM(x0);
    }

    static void zza(Asset asset0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, asset0.zzCY);
        zzb.zza(parcel0, 2, asset0.getData(), false);
        zzb.zza(parcel0, 3, asset0.getDigest(), false);
        zzb.zza(parcel0, 4, asset0.zzaSN, v, false);
        zzb.zza(parcel0, 5, asset0.uri, v, false);
        zzb.zzH(parcel0, v1);
    }

    public Asset zzgH(Parcel parcel0) {
        Uri uri0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        String s = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_b = zza.zzr(parcel0, v2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)zza.zza(parcel0, v2, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 5: {
                    uri0 = (Uri)zza.zza(parcel0, v2, Uri.CREATOR);
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
        return new Asset(v1, arr_b, s, parcelFileDescriptor0, uri0);
    }

    public Asset[] zzjM(int v) {
        return new Asset[v];
    }
}

