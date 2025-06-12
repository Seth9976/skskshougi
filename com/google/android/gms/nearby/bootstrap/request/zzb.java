package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhO(x0);
    }

    static void zza(ContinueConnectRequest continueConnectRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, continueConnectRequest0.getToken(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, continueConnectRequest0.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, continueConnectRequest0.zzqU(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public ContinueConnectRequest zzfg(Parcel parcel0) {
        IBinder iBinder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
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
        return new ContinueConnectRequest(v1, s, iBinder0);
    }

    public ContinueConnectRequest[] zzhO(int v) {
        return new ContinueConnectRequest[v];
    }
}

