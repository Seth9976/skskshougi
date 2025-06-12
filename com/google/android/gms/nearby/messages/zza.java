package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfp(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzic(x0);
    }

    static void zza(Message message0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, message0.zzwV(), false);
        zzb.zzc(parcel0, 1000, message0.versionCode);
        zzb.zza(parcel0, 2, message0.getType(), false);
        zzb.zza(parcel0, 3, message0.getNamespace(), false);
        zzb.zzH(parcel0, v1);
    }

    public Message zzfp(Parcel parcel0) {
        String s = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arr_b = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel0, v2);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new Message(v1, arr_b, s1, s);
    }

    public Message[] zzic(int v) {
        return new Message[v];
    }
}

