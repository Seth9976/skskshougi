package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcq(x0);
    }

    static void zza(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, closeContentsAndUpdateMetadataRequest0.zzCY);
        zzb.zza(parcel0, 2, closeContentsAndUpdateMetadataRequest0.zzaeq, v, false);
        zzb.zza(parcel0, 3, closeContentsAndUpdateMetadataRequest0.zzaer, v, false);
        zzb.zza(parcel0, 4, closeContentsAndUpdateMetadataRequest0.zzaes, v, false);
        zzb.zza(parcel0, 5, closeContentsAndUpdateMetadataRequest0.zzado);
        zzb.zza(parcel0, 6, closeContentsAndUpdateMetadataRequest0.zzadn, false);
        zzb.zzc(parcel0, 7, closeContentsAndUpdateMetadataRequest0.zzaet);
        zzb.zzc(parcel0, 8, closeContentsAndUpdateMetadataRequest0.zzaeu);
        zzb.zza(parcel0, 9, closeContentsAndUpdateMetadataRequest0.zzaev);
        zzb.zzH(parcel0, v1);
    }

    public CloseContentsAndUpdateMetadataRequest zzaG(Parcel parcel0) {
        String s = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        boolean z1 = false;
        Contents contents0 = null;
        MetadataBundle metadataBundle0 = null;
        DriveId driveId0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
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
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 7: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 8: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CloseContentsAndUpdateMetadataRequest(v3, driveId0, metadataBundle0, contents0, z1, s, v2, v1, z);
    }

    public CloseContentsAndUpdateMetadataRequest[] zzcq(int v) {
        return new CloseContentsAndUpdateMetadataRequest[v];
    }
}

