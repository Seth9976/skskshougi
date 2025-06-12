package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzef(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgx(x0);
    }

    static void zza(LocationSettingsRequest locationSettingsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, locationSettingsRequest0.zzrj(), false);
        zzb.zzc(parcel0, 1000, locationSettingsRequest0.getVersionCode());
        zzb.zza(parcel0, 2, locationSettingsRequest0.zzup());
        zzb.zza(parcel0, 3, locationSettingsRequest0.zzuq());
        zzb.zza(parcel0, 4, locationSettingsRequest0.zzur());
        zzb.zzH(parcel0, v1);
    }

    public LocationSettingsRequest zzef(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v2, LocationRequest.CREATOR);
                    break;
                }
                case 2: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
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
        return new LocationSettingsRequest(v1, arrayList0, z2, z1, z);
    }

    public LocationSettingsRequest[] zzgx(int v) {
        return new LocationSettingsRequest[v];
    }
}

