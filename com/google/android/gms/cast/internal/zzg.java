package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzN(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaQ(x0);
    }

    public DeviceStatus zzN(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        double f = 0.0;
        ApplicationMetadata applicationMetadata0 = null;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    f = zza.zzm(parcel0, v4);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 5: {
                    applicationMetadata0 = (ApplicationMetadata)zza.zza(parcel0, v4, ApplicationMetadata.CREATOR);
                    break;
                }
                case 6: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new DeviceStatus(v3, f, z, v2, applicationMetadata0, v);
    }

    static void zza(DeviceStatus deviceStatus0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, deviceStatus0.getVersionCode());
        zzb.zza(parcel0, 2, deviceStatus0.zzlO());
        zzb.zza(parcel0, 3, deviceStatus0.zzlX());
        zzb.zzc(parcel0, 4, deviceStatus0.zzlP());
        zzb.zza(parcel0, 5, deviceStatus0.getApplicationMetadata(), v, false);
        zzb.zzc(parcel0, 6, deviceStatus0.zzlQ());
        zzb.zzH(parcel0, v1);
    }

    public DeviceStatus[] zzaQ(int v) {
        return new DeviceStatus[v];
    }
}

