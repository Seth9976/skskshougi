package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaL(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcw(x0);
    }

    static void zza(CreateFolderRequest createFolderRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, createFolderRequest0.zzCY);
        zzb.zza(parcel0, 2, createFolderRequest0.zzaeC, v, false);
        zzb.zza(parcel0, 3, createFolderRequest0.zzaeA, v, false);
        zzb.zzH(parcel0, v1);
    }

    public CreateFolderRequest zzaL(Parcel parcel0) {
        int v3;
        DriveId driveId1;
        MetadataBundle metadataBundle1;
        MetadataBundle metadataBundle0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DriveId driveId0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    driveId1 = driveId0;
                    v3 = zza.zzg(parcel0, v2);
                    metadataBundle1 = metadataBundle0;
                    break;
                }
                case 2: {
                    v3 = v1;
                    metadataBundle1 = metadataBundle0;
                    driveId1 = (DriveId)zza.zza(parcel0, v2, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    metadataBundle1 = (MetadataBundle)zza.zza(parcel0, v2, MetadataBundle.CREATOR);
                    driveId1 = driveId0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    metadataBundle1 = metadataBundle0;
                    driveId1 = driveId0;
                    v3 = v1;
                }
            }
            v1 = v3;
            driveId0 = driveId1;
            metadataBundle0 = metadataBundle1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CreateFolderRequest(v1, driveId0, metadataBundle0);
    }

    public CreateFolderRequest[] zzcw(int v) {
        return new CreateFolderRequest[v];
    }
}

