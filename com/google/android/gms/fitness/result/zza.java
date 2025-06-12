package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzde(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeZ(x0);
    }

    static void zza(BleDevicesResult bleDevicesResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, bleDevicesResult0.getClaimedBleDevices(), false);
        zzb.zzc(parcel0, 1000, bleDevicesResult0.getVersionCode());
        zzb.zza(parcel0, 2, bleDevicesResult0.getStatus(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public BleDevicesResult zzde(Parcel parcel0) {
        Status status0 = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2, BleDevice.CREATOR);
                    break;
                }
                case 2: {
                    status0 = (Status)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, Status.CREATOR);
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
        return new BleDevicesResult(v1, arrayList0, status0);
    }

    public BleDevicesResult[] zzeZ(int v) {
        return new BleDevicesResult[v];
    }
}

