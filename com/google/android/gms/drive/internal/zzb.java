package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaC(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcm(x0);
    }

    static void zza(AddPermissionRequest addPermissionRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, addPermissionRequest0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, addPermissionRequest0.zzacT, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, addPermissionRequest0.zzaek, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, addPermissionRequest0.zzael);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, addPermissionRequest0.zzaem, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, addPermissionRequest0.zzaen);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, addPermissionRequest0.zzadn, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AddPermissionRequest zzaC(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        String s1 = null;
        boolean z1 = false;
        Permission permission0 = null;
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
                    permission0 = (Permission)zza.zza(parcel0, v2, Permission.CREATOR);
                    break;
                }
                case 4: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 7: {
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
        return new AddPermissionRequest(v1, driveId0, permission0, z1, s1, z, s);
    }

    public AddPermissionRequest[] zzcm(int v) {
        return new AddPermissionRequest[v];
    }
}

