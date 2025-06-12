package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaK(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcv(x0);
    }

    static void zza(CreateFileRequest createFileRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, createFileRequest0.zzCY);
        zzb.zza(parcel0, 2, createFileRequest0.zzaeC, v, false);
        zzb.zza(parcel0, 3, createFileRequest0.zzaeA, v, false);
        zzb.zza(parcel0, 4, createFileRequest0.zzaes, v, false);
        zzb.zza(parcel0, 5, createFileRequest0.zzaeB, false);
        zzb.zza(parcel0, 6, createFileRequest0.zzaen);
        zzb.zza(parcel0, 7, createFileRequest0.zzadn, false);
        zzb.zzc(parcel0, 8, createFileRequest0.zzaeD);
        zzb.zzc(parcel0, 9, createFileRequest0.zzaeE);
        zzb.zzH(parcel0, v1);
    }

    public CreateFileRequest zzaK(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        boolean z = false;
        Integer integer0 = null;
        Contents contents0 = null;
        MetadataBundle metadataBundle0 = null;
        DriveId driveId0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    driveId0 = (DriveId)zza.zza(parcel0, v4, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    metadataBundle0 = (MetadataBundle)zza.zza(parcel0, v4, MetadataBundle.CREATOR);
                    break;
                }
                case 4: {
                    contents0 = (Contents)zza.zza(parcel0, v4, Contents.CREATOR);
                    break;
                }
                case 5: {
                    integer0 = zza.zzh(parcel0, v4);
                    break;
                }
                case 6: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 7: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 8: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 9: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CreateFileRequest(v3, driveId0, metadataBundle0, contents0, integer0, z, s, v2, v);
    }

    public CreateFileRequest[] zzcv(int v) {
        return new CreateFileRequest[v];
    }
}

