package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzQ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzba(x0);
    }

    public Status zzQ(Parcel parcel0) {
        PendingIntent pendingIntent0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        String s = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v3, PendingIntent.CREATOR);
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
        return new Status(v2, v, s, pendingIntent0);
    }

    static void zza(Status status0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, status0.getStatusCode());
        zzb.zzc(parcel0, 1000, status0.getVersionCode());
        zzb.zza(parcel0, 2, status0.getStatusMessage(), false);
        zzb.zza(parcel0, 3, status0.zzmT(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public Status[] zzba(int v) {
        return new Status[v];
    }
}

