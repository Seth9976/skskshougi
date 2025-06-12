package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzad implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdc(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeX(x0);
    }

    static void zza(UnclaimBleDeviceRequest unclaimBleDeviceRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, unclaimBleDeviceRequest0.getVersionCode());
        zzb.zza(parcel0, 2, unclaimBleDeviceRequest0.getDeviceAddress(), false);
        zzb.zza(parcel0, 3, unclaimBleDeviceRequest0.zzqU(), false);
        zzb.zza(parcel0, 4, unclaimBleDeviceRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public UnclaimBleDeviceRequest zzdc(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 2: {
                    s1 = zza.zzo(parcel0, v2);
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
        return new UnclaimBleDeviceRequest(v1, s1, iBinder0, s);
    }

    public UnclaimBleDeviceRequest[] zzeX(int v) {
        return new UnclaimBleDeviceRequest[v];
    }
}

