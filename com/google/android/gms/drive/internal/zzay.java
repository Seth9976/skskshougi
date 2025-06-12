package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DrivePreferences;

public class zzay implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbd(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcS(x0);
    }

    static void zza(OnDrivePreferencesResponse onDrivePreferencesResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onDrivePreferencesResponse0.zzCY);
        zzb.zza(parcel0, 2, onDrivePreferencesResponse0.zzagi, v, false);
        zzb.zzH(parcel0, v1);
    }

    public OnDrivePreferencesResponse zzbd(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DrivePreferences drivePreferences0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    drivePreferences0 = (DrivePreferences)zza.zza(parcel0, v2, DrivePreferences.CREATOR);
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
        return new OnDrivePreferencesResponse(v1, drivePreferences0);
    }

    public OnDrivePreferencesResponse[] zzcS(int v) {
        return new OnDrivePreferencesResponse[v];
    }
}

