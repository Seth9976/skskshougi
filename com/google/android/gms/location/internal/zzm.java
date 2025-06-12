package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzem(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgI(x0);
    }

    static void zza(ParcelableGeofence parcelableGeofence0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, parcelableGeofence0.getRequestId(), false);
        zzb.zzc(parcel0, 1000, parcelableGeofence0.getVersionCode());
        zzb.zza(parcel0, 2, parcelableGeofence0.getExpirationTime());
        zzb.zza(parcel0, 3, parcelableGeofence0.zzuA());
        zzb.zza(parcel0, 4, parcelableGeofence0.getLatitude());
        zzb.zza(parcel0, 5, parcelableGeofence0.getLongitude());
        zzb.zza(parcel0, 6, parcelableGeofence0.zzuB());
        zzb.zzc(parcel0, 7, parcelableGeofence0.zzuC());
        zzb.zzc(parcel0, 8, parcelableGeofence0.getNotificationResponsiveness());
        zzb.zzc(parcel0, 9, parcelableGeofence0.zzuD());
        zzb.zzH(parcel0, v1);
    }

    public ParcelableGeofence zzem(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        int v2 = 0;
        int v3 = 0;
        double f = 0.0;
        double f1 = 0.0;
        float f2 = 0.0f;
        long v4 = 0L;
        int v5 = 0;
        int v6 = -1;
        while(parcel0.dataPosition() < v) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    s = zza.zzo(parcel0, v7);
                    break;
                }
                case 2: {
                    v4 = zza.zzi(parcel0, v7);
                    break;
                }
                case 3: {
                    v3 = zza.zzf(parcel0, v7);
                    break;
                }
                case 4: {
                    f = zza.zzm(parcel0, v7);
                    break;
                }
                case 5: {
                    f1 = zza.zzm(parcel0, v7);
                    break;
                }
                case 6: {
                    f2 = zza.zzl(parcel0, v7);
                    break;
                }
                case 7: {
                    v2 = zza.zzg(parcel0, v7);
                    break;
                }
                case 8: {
                    v5 = zza.zzg(parcel0, v7);
                    break;
                }
                case 9: {
                    v6 = zza.zzg(parcel0, v7);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ParcelableGeofence(v1, s, v2, ((short)v3), f, f1, f2, v4, v5, v6);
    }

    public ParcelableGeofence[] zzgI(int v) {
        return new ParcelableGeofence[v];
    }
}

