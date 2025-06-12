package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.BleDevice;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcB(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzev(x0);
    }

    static void zza(ClaimBleDeviceRequest claimBleDeviceRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, claimBleDeviceRequest0.getDeviceAddress(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, claimBleDeviceRequest0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, claimBleDeviceRequest0.zzqT(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, claimBleDeviceRequest0.zzqU(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, claimBleDeviceRequest0.getPackageName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public ClaimBleDeviceRequest zzcB(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        BleDevice bleDevice0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    bleDevice0 = (BleDevice)zza.zza(parcel0, v2, BleDevice.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v2);
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
        return new ClaimBleDeviceRequest(v1, s1, bleDevice0, iBinder0, s);
    }

    public ClaimBleDeviceRequest[] zzev(int v) {
        return new ClaimBleDeviceRequest[v];
    }
}

