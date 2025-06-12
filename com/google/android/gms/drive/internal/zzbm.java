package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbq(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdf(x0);
    }

    static void zza(RemovePermissionRequest removePermissionRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, removePermissionRequest0.zzCY);
        zzb.zza(parcel0, 2, removePermissionRequest0.zzacT, v, false);
        zzb.zza(parcel0, 3, removePermissionRequest0.zzadz, false);
        zzb.zza(parcel0, 4, removePermissionRequest0.zzaen);
        zzb.zza(parcel0, 5, removePermissionRequest0.zzadn, false);
        zzb.zzH(parcel0, v1);
    }

    public RemovePermissionRequest zzbq(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        String s1 = null;
        DriveId driveId0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    driveId0 = (DriveId)zza.zza(parcel0, v2, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v2);
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
        return new RemovePermissionRequest(v1, driveId0, s1, z, s);
    }

    public RemovePermissionRequest[] zzdf(int v) {
        return new RemovePermissionRequest[v];
    }
}

