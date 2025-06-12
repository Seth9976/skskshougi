package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgJ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjO(x0);
    }

    static void zza(PutDataRequest putDataRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, putDataRequest0.zzCY);
        zzb.zza(parcel0, 2, putDataRequest0.getUri(), v, false);
        zzb.zza(parcel0, 4, putDataRequest0.zzAR(), false);
        zzb.zza(parcel0, 5, putDataRequest0.getData(), false);
        zzb.zzH(parcel0, v1);
    }

    public PutDataRequest zzgJ(Parcel parcel0) {
        int v3;
        Uri uri1;
        Bundle bundle1;
        byte[] arr_b1;
        byte[] arr_b = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Bundle bundle0 = null;
        Uri uri0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    bundle1 = bundle0;
                    uri1 = uri0;
                    v3 = zza.zzg(parcel0, v2);
                    arr_b1 = arr_b;
                    break;
                }
                case 2: {
                    v3 = v1;
                    uri1 = (Uri)zza.zza(parcel0, v2, Uri.CREATOR);
                    arr_b1 = arr_b;
                    bundle1 = bundle0;
                    break;
                }
                case 4: {
                    uri1 = uri0;
                    v3 = v1;
                    bundle1 = zza.zzq(parcel0, v2);
                    arr_b1 = arr_b;
                    break;
                }
                case 5: {
                    arr_b1 = zza.zzr(parcel0, v2);
                    bundle1 = bundle0;
                    uri1 = uri0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    arr_b1 = arr_b;
                    bundle1 = bundle0;
                    uri1 = uri0;
                    v3 = v1;
                }
            }
            v1 = v3;
            uri0 = uri1;
            bundle0 = bundle1;
            arr_b = arr_b1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PutDataRequest(v1, uri0, bundle0, arr_b);
    }

    public PutDataRequest[] zzjO(int v) {
        return new PutDataRequest[v];
    }
}

