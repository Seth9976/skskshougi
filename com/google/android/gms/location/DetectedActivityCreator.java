package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class DetectedActivityCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public DetectedActivity createFromParcel(Parcel parcel) {
        int v = 0;
        int v1 = zza.zzab(parcel);
        int v2 = 0;
        int v3 = 0;
        while(parcel.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzg(parcel, v4);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel, v4);
                    break;
                }
                case 1000: {
                    v3 = zza.zzg(parcel, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel, v4);
                }
            }
        }
        if(parcel.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel);
        }
        return new DetectedActivity(v3, v2, v);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.createFromParcel(x0);
    }

    public DetectedActivity[] newArray(int size) {
        return new DetectedActivity[size];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.newArray(x0);
    }

    static void zza(DetectedActivity detectedActivity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, detectedActivity0.zzaxw);
        zzb.zzc(parcel0, 1000, detectedActivity0.getVersionCode());
        zzb.zzc(parcel0, 2, detectedActivity0.zzaxx);
        zzb.zzH(parcel0, v1);
    }
}

