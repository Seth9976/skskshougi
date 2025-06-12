package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzel(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgF(x0);
    }

    static void zza(LocationRequestUpdateData locationRequestUpdateData0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, locationRequestUpdateData0.zzazf);
        zzb.zzc(parcel0, 1000, locationRequestUpdateData0.getVersionCode());
        zzb.zza(parcel0, 2, locationRequestUpdateData0.zzazg, v, false);
        zzb.zza(parcel0, 3, locationRequestUpdateData0.zzuy(), false);
        zzb.zza(parcel0, 4, locationRequestUpdateData0.mPendingIntent, v, false);
        zzb.zza(parcel0, 5, locationRequestUpdateData0.zzuz(), false);
        zzb.zzH(parcel0, v1);
    }

    public LocationRequestUpdateData zzel(Parcel parcel0) {
        IBinder iBinder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 1;
        PendingIntent pendingIntent0 = null;
        IBinder iBinder1 = null;
        LocationRequestInternal locationRequestInternal0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    locationRequestInternal0 = (LocationRequestInternal)zza.zza(parcel0, v3, LocationRequestInternal.CREATOR);
                    break;
                }
                case 3: {
                    iBinder1 = zza.zzp(parcel0, v3);
                    break;
                }
                case 4: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v3, PendingIntent.CREATOR);
                    break;
                }
                case 5: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new LocationRequestUpdateData(v1, v2, locationRequestInternal0, iBinder1, pendingIntent0, iBinder0);
    }

    public LocationRequestUpdateData[] zzgF(int v) {
        return new LocationRequestUpdateData[v];
    }
}

