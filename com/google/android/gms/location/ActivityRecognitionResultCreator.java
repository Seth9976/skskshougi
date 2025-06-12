package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class ActivityRecognitionResultCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long v = 0L;
        int v1 = 0;
        int v2 = zza.zzab(parcel);
        ArrayList arrayList0 = null;
        long v3 = 0L;
        int v4 = 0;
        while(parcel.dataPosition() < v2) {
            int v5 = zza.zzaa(parcel);
            switch(0xFFFF & v5) {
                case 1: {
                    arrayList0 = zza.zzc(parcel, v5, DetectedActivity.CREATOR);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel, v5);
                    break;
                }
                case 3: {
                    v = zza.zzi(parcel, v5);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel, v5);
                    break;
                }
                case 1000: {
                    v4 = zza.zzg(parcel, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel, v5);
                }
            }
        }
        if(parcel.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel);
        }
        return new ActivityRecognitionResult(v4, arrayList0, v3, v, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.createFromParcel(x0);
    }

    public ActivityRecognitionResult[] newArray(int size) {
        return new ActivityRecognitionResult[size];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.newArray(x0);
    }

    static void zza(ActivityRecognitionResult activityRecognitionResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, activityRecognitionResult0.zzaxr, false);
        zzb.zzc(parcel0, 1000, activityRecognitionResult0.getVersionCode());
        zzb.zza(parcel0, 2, activityRecognitionResult0.zzaxs);
        zzb.zza(parcel0, 3, activityRecognitionResult0.zzaxt);
        zzb.zzc(parcel0, 4, activityRecognitionResult0.zzaxu);
        zzb.zzH(parcel0, v1);
    }
}

