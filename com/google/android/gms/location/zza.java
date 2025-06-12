package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzec(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgs(x0);
    }

    static void zza(GeofencingRequest geofencingRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, geofencingRequest0.zzun(), false);
        zzb.zzc(parcel0, 1000, geofencingRequest0.getVersionCode());
        zzb.zzc(parcel0, 2, geofencingRequest0.getInitialTrigger());
        zzb.zzH(parcel0, v1);
    }

    public GeofencingRequest zzec(Parcel parcel0) {
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, ParcelableGeofence.CREATOR);
                    break;
                }
                case 2: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GeofencingRequest(v2, arrayList0, v);
    }

    public GeofencingRequest[] zzgs(int v) {
        return new GeofencingRequest[v];
    }
}

