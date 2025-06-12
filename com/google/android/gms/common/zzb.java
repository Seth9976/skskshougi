package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzO(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaS(x0);
    }

    public ConnectionResult zzO(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        PendingIntent pendingIntent0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v3, PendingIntent.CREATOR);
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
        return new ConnectionResult(v2, v, pendingIntent0);
    }

    static void zza(ConnectionResult connectionResult0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, connectionResult0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, connectionResult0.getErrorCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, connectionResult0.getResolution(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public ConnectionResult[] zzaS(int v) {
        return new ConnectionResult[v];
    }
}

