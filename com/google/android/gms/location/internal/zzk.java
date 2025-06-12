package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzek(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgE(x0);
    }

    static void zza(LocationRequestInternal locationRequestInternal0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, locationRequestInternal0.zzamz, v, false);
        zzb.zzc(parcel0, 1000, locationRequestInternal0.getVersionCode());
        zzb.zza(parcel0, 2, locationRequestInternal0.zzazb);
        zzb.zza(parcel0, 3, locationRequestInternal0.zzazc);
        zzb.zza(parcel0, 4, locationRequestInternal0.zzazd);
        zzb.zzc(parcel0, 5, locationRequestInternal0.zzaze, false);
        zzb.zza(parcel0, 6, locationRequestInternal0.mTag, false);
        zzb.zzH(parcel0, v1);
    }

    public LocationRequestInternal zzek(Parcel parcel0) {
        String s = null;
        boolean z = true;
        boolean z1 = false;
        int v = zza.zzab(parcel0);
        List list0 = LocationRequestInternal.zzaza;
        boolean z2 = true;
        LocationRequest locationRequest0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    locationRequest0 = (LocationRequest)zza.zza(parcel0, v2, LocationRequest.CREATOR);
                    break;
                }
                case 2: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    list0 = zza.zzc(parcel0, v2, ClientIdentity.CREATOR);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v2);
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
        return new LocationRequestInternal(v1, locationRequest0, z1, z2, z, list0, s);
    }

    public LocationRequestInternal[] zzgE(int v) {
        return new LocationRequestInternal[v];
    }
}

