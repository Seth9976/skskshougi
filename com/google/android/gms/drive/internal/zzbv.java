package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzby(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdn(x0);
    }

    static void zza(UpdatePermissionRequest updatePermissionRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, updatePermissionRequest0.zzCY);
        zzb.zza(parcel0, 2, updatePermissionRequest0.zzacT, v, false);
        zzb.zza(parcel0, 3, updatePermissionRequest0.zzadz, false);
        zzb.zzc(parcel0, 4, updatePermissionRequest0.zzagx);
        zzb.zza(parcel0, 5, updatePermissionRequest0.zzaen);
        zzb.zza(parcel0, 6, updatePermissionRequest0.zzadn, false);
        zzb.zzH(parcel0, v1);
    }

    public UpdatePermissionRequest zzby(Parcel parcel0) {
        String s = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        DriveId driveId0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    driveId0 = (DriveId)zza.zza(parcel0, v3, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v3);
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
        return new UpdatePermissionRequest(v2, driveId0, s1, v1, z, s);
    }

    public UpdatePermissionRequest[] zzdn(int v) {
        return new UpdatePermissionRequest[v];
    }
}

