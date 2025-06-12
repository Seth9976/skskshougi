package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfi(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhQ(x0);
    }

    static void zza(DisconnectRequest disconnectRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, disconnectRequest0.zzwM(), v, false);
        zzb.zzc(parcel0, 1000, disconnectRequest0.versionCode);
        zzb.zza(parcel0, 2, disconnectRequest0.zzqU(), false);
        zzb.zzH(parcel0, v1);
    }

    public DisconnectRequest zzfi(Parcel parcel0) {
        int v3;
        Device device1;
        IBinder iBinder1;
        IBinder iBinder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Device device0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    iBinder1 = iBinder0;
                    device1 = (Device)zza.zza(parcel0, v2, Device.CREATOR);
                    break;
                }
                case 2: {
                    iBinder1 = zza.zzp(parcel0, v2);
                    device1 = device0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    device1 = device0;
                    v3 = zza.zzg(parcel0, v2);
                    iBinder1 = iBinder0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    iBinder1 = iBinder0;
                    device1 = device0;
                    v3 = v1;
                }
            }
            v1 = v3;
            device0 = device1;
            iBinder0 = iBinder1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new DisconnectRequest(v1, device0, iBinder0);
    }

    public DisconnectRequest[] zzhQ(int v) {
        return new DisconnectRequest[v];
    }
}

