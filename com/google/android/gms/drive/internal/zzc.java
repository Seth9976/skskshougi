package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaD(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcn(x0);
    }

    static void zza(AuthorizeAccessRequest authorizeAccessRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, authorizeAccessRequest0.zzCY);
        zzb.zza(parcel0, 2, authorizeAccessRequest0.zzaeo);
        zzb.zza(parcel0, 3, authorizeAccessRequest0.zzacT, v, false);
        zzb.zzH(parcel0, v1);
    }

    public AuthorizeAccessRequest zzaD(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        DriveId driveId0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = zza.zzi(parcel0, v3);
                    break;
                }
                case 3: {
                    driveId0 = (DriveId)zza.zza(parcel0, v3, DriveId.CREATOR);
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
        return new AuthorizeAccessRequest(v1, v2, driveId0);
    }

    public AuthorizeAccessRequest[] zzcn(int v) {
        return new AuthorizeAccessRequest[v];
    }
}

