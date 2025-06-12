package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaJ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcu(x0);
    }

    static void zza(CreateFileIntentSenderRequest createFileIntentSenderRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, createFileIntentSenderRequest0.zzCY);
        zzb.zza(parcel0, 2, createFileIntentSenderRequest0.zzaeA, v, false);
        zzb.zzc(parcel0, 3, createFileIntentSenderRequest0.zzacR);
        zzb.zza(parcel0, 4, createFileIntentSenderRequest0.zzadv, false);
        zzb.zza(parcel0, 5, createFileIntentSenderRequest0.zzady, v, false);
        zzb.zza(parcel0, 6, createFileIntentSenderRequest0.zzaeB, false);
        zzb.zzH(parcel0, v1);
    }

    public CreateFileIntentSenderRequest zzaJ(Parcel parcel0) {
        int v = 0;
        Integer integer0 = null;
        int v1 = zza.zzab(parcel0);
        DriveId driveId0 = null;
        String s = null;
        MetadataBundle metadataBundle0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    metadataBundle0 = (MetadataBundle)zza.zza(parcel0, v3, MetadataBundle.CREATOR);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 5: {
                    driveId0 = (DriveId)zza.zza(parcel0, v3, DriveId.CREATOR);
                    break;
                }
                case 6: {
                    integer0 = zza.zzh(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CreateFileIntentSenderRequest(v2, metadataBundle0, v, s, driveId0, integer0);
    }

    public CreateFileIntentSenderRequest[] zzcu(int v) {
        return new CreateFileIntentSenderRequest[v];
    }
}

