package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeh(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgz(x0);
    }

    static void zza(LocationSettingsStates locationSettingsStates0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, locationSettingsStates0.isGpsUsable());
        zzb.zzc(parcel0, 1000, locationSettingsStates0.getVersionCode());
        zzb.zza(parcel0, 2, locationSettingsStates0.isNetworkLocationUsable());
        zzb.zza(parcel0, 3, locationSettingsStates0.isBleUsable());
        zzb.zza(parcel0, 4, locationSettingsStates0.isGpsPresent());
        zzb.zza(parcel0, 5, locationSettingsStates0.isNetworkLocationPresent());
        zzb.zza(parcel0, 6, locationSettingsStates0.isBlePresent());
        zzb.zza(parcel0, 7, locationSettingsStates0.zzus());
        zzb.zzH(parcel0, v1);
    }

    public LocationSettingsStates zzeh(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    z6 = zza.zzc(parcel0, v2);
                    break;
                }
                case 2: {
                    z5 = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    z4 = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    z3 = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 6: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v2);
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
        return new LocationSettingsStates(v1, z6, z5, z4, z3, z2, z1, z);
    }

    public LocationSettingsStates[] zzgz(int v) {
        return new LocationSettingsStates[v];
    }
}

