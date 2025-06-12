package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcN(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeH(x0);
    }

    static void zza(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, listClaimedBleDevicesRequest0.zzqU(), false);
        zzb.zzc(parcel0, 1000, listClaimedBleDevicesRequest0.getVersionCode());
        zzb.zza(parcel0, 2, listClaimedBleDevicesRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public ListClaimedBleDevicesRequest zzcN(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 2: {
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
        return new ListClaimedBleDevicesRequest(v1, iBinder0, s);
    }

    public ListClaimedBleDevicesRequest[] zzeH(int v) {
        return new ListClaimedBleDevicesRequest[v];
    }
}

