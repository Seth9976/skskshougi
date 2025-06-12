package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgy(x0);
    }

    static void zza(LocationSettingsResult locationSettingsResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, locationSettingsResult0.getStatus(), v, false);
        zzb.zzc(parcel0, 1000, locationSettingsResult0.getVersionCode());
        zzb.zza(parcel0, 2, locationSettingsResult0.getLocationSettingsStates(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public LocationSettingsResult zzeg(Parcel parcel0) {
        int v3;
        Status status1;
        LocationSettingsStates locationSettingsStates1;
        LocationSettingsStates locationSettingsStates0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Status status0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    locationSettingsStates1 = locationSettingsStates0;
                    status1 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 2: {
                    locationSettingsStates1 = (LocationSettingsStates)zza.zza(parcel0, v2, LocationSettingsStates.CREATOR);
                    status1 = status0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    status1 = status0;
                    v3 = zza.zzg(parcel0, v2);
                    locationSettingsStates1 = locationSettingsStates0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    locationSettingsStates1 = locationSettingsStates0;
                    status1 = status0;
                    v3 = v1;
                }
            }
            v1 = v3;
            status0 = status1;
            locationSettingsStates0 = locationSettingsStates1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new LocationSettingsResult(v1, status0, locationSettingsStates0);
    }

    public LocationSettingsResult[] zzgy(int v) {
        return new LocationSettingsResult[v];
    }
}

