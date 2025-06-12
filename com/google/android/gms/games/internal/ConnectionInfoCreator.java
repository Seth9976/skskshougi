package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class ConnectionInfoCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdC(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfB(x0);
    }

    static void zza(ConnectionInfo connectionInfo0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, connectionInfo0.zzsr(), false);
        zzb.zzc(parcel0, 1000, connectionInfo0.getVersionCode());
        zzb.zzc(parcel0, 2, connectionInfo0.zzss());
        zzb.zzH(parcel0, v1);
    }

    public ConnectionInfo zzdC(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        String s = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ConnectionInfo(v2, s, v);
    }

    public ConnectionInfo[] zzfB(int v) {
        return new ConnectionInfo[v];
    }
}

