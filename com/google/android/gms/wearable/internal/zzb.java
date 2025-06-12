package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgK(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjP(x0);
    }

    static void zza(AddListenerRequest addListenerRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, addListenerRequest0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, addListenerRequest0.zzAT(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, addListenerRequest0.zzaTr, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, addListenerRequest0.zzaTs, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, addListenerRequest0.zzaTt, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AddListenerRequest zzgK(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        IntentFilter[] arr_intentFilter = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_intentFilter = (IntentFilter[])zza.zzb(parcel0, v2, IntentFilter.CREATOR);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v2);
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
        return new AddListenerRequest(v1, iBinder0, arr_intentFilter, s1, s);
    }

    public AddListenerRequest[] zzjP(int v) {
        return new AddListenerRequest[v];
    }
}

