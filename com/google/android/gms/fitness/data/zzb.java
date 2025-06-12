package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzea(x0);
    }

    static void zza(BleDevice bleDevice0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, bleDevice0.getAddress(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, bleDevice0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, bleDevice0.getName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzb(parcel0, 3, bleDevice0.getSupportedProfiles(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 4, bleDevice0.getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public BleDevice zzcj(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList1 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    arrayList1 = zza.zzC(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v2, DataType.CREATOR);
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
        return new BleDevice(v1, s1, s, arrayList1, arrayList0);
    }

    public BleDevice[] zzea(int v) {
        return new BleDevice[v];
    }
}

