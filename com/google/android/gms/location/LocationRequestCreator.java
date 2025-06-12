package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class LocationRequestCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public LocationRequest createFromParcel(Parcel parcel) {
        int v = zza.zzab(parcel);
        int v1 = 0;
        int v2 = 102;
        long v3 = 3600000L;
        long v4 = 600000L;
        boolean z = false;
        long v5 = 0x7FFFFFFFFFFFFFFFL;
        int v6 = 0x7FFFFFFF;
        float f = 0.0f;
        long v7 = 0L;
        while(parcel.dataPosition() < v) {
            int v8 = zza.zzaa(parcel);
            switch(0xFFFF & v8) {
                case 1: {
                    v2 = zza.zzg(parcel, v8);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel, v8);
                    break;
                }
                case 3: {
                    v4 = zza.zzi(parcel, v8);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel, v8);
                    break;
                }
                case 5: {
                    v5 = zza.zzi(parcel, v8);
                    break;
                }
                case 6: {
                    v6 = zza.zzg(parcel, v8);
                    break;
                }
                case 7: {
                    f = zza.zzl(parcel, v8);
                    break;
                }
                case 8: {
                    v7 = zza.zzi(parcel, v8);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel, v8);
                    break;
                }
                default: {
                    zza.zzb(parcel, v8);
                }
            }
        }
        if(parcel.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel);
        }
        return new LocationRequest(v1, v2, v3, v4, z, v5, v6, f, v7);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.createFromParcel(x0);
    }

    public LocationRequest[] newArray(int size) {
        return new LocationRequest[size];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.newArray(x0);
    }

    static void zza(LocationRequest locationRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, locationRequest0.mPriority);
        zzb.zzc(parcel0, 1000, locationRequest0.getVersionCode());
        zzb.zza(parcel0, 2, locationRequest0.zzaxU);
        zzb.zza(parcel0, 3, locationRequest0.zzaxV);
        zzb.zza(parcel0, 4, locationRequest0.zzamB);
        zzb.zza(parcel0, 5, locationRequest0.zzaxz);
        zzb.zzc(parcel0, 6, locationRequest0.zzaxW);
        zzb.zza(parcel0, 7, locationRequest0.zzaxX);
        zzb.zza(parcel0, 8, locationRequest0.zzaxY);
        zzb.zzH(parcel0, v1);
    }
}

