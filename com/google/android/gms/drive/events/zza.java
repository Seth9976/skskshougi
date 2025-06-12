package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzav(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzce(x0);
    }

    static void zza(ChangeEvent changeEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, changeEvent0.zzCY);
        zzb.zza(parcel0, 2, changeEvent0.zzacT, v, false);
        zzb.zzc(parcel0, 3, changeEvent0.zzadN);
        zzb.zzH(parcel0, v1);
    }

    public ChangeEvent zzav(Parcel parcel0) {
        int v5;
        DriveId driveId1;
        int v4;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        DriveId driveId0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    driveId1 = driveId0;
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 2: {
                    v5 = v2;
                    v4 = v;
                    driveId1 = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    driveId1 = driveId0;
                    v5 = v2;
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                    v4 = v;
                    driveId1 = driveId0;
                    v5 = v2;
                }
            }
            v2 = v5;
            driveId0 = driveId1;
            v = v4;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ChangeEvent(v2, driveId0, v);
    }

    public ChangeEvent[] zzce(int v) {
        return new ChangeEvent[v];
    }
}

