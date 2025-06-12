package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzah implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaT(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcI(x0);
    }

    static void zza(GetMetadataRequest getMetadataRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getMetadataRequest0.zzCY);
        zzb.zza(parcel0, 2, getMetadataRequest0.zzaeq, v, false);
        zzb.zza(parcel0, 3, getMetadataRequest0.zzafN);
        zzb.zzH(parcel0, v1);
    }

    public GetMetadataRequest zzaT(Parcel parcel0) {
        int v3;
        DriveId driveId1;
        boolean z1;
        boolean z = false;
        int v = zza.zzab(parcel0);
        DriveId driveId0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    driveId1 = driveId0;
                    v3 = zza.zzg(parcel0, v2);
                    z1 = z;
                    break;
                }
                case 2: {
                    v3 = v1;
                    z1 = z;
                    driveId1 = (DriveId)zza.zza(parcel0, v2, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    z1 = zza.zzc(parcel0, v2);
                    driveId1 = driveId0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    z1 = z;
                    driveId1 = driveId0;
                    v3 = v1;
                }
            }
            v1 = v3;
            driveId0 = driveId1;
            z = z1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new GetMetadataRequest(v1, driveId0, z);
    }

    public GetMetadataRequest[] zzcI(int v) {
        return new GetMetadataRequest[v];
    }
}

