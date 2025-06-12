package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbm(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdb(x0);
    }

    static void zza(OpenContentsRequest openContentsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, openContentsRequest0.zzCY);
        zzb.zza(parcel0, 2, openContentsRequest0.zzaeq, v, false);
        zzb.zzc(parcel0, 3, openContentsRequest0.zzacS);
        zzb.zzc(parcel0, 4, openContentsRequest0.zzagr);
        zzb.zzH(parcel0, v1);
    }

    public OpenContentsRequest zzbm(Parcel parcel0) {
        int v7;
        DriveId driveId1;
        int v6;
        int v5;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        DriveId driveId0 = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v6 = v2;
                    driveId1 = driveId0;
                    v7 = zza.zzg(parcel0, v4);
                    v5 = v;
                    break;
                }
                case 2: {
                    v7 = v3;
                    driveId1 = (DriveId)zza.zza(parcel0, v4, DriveId.CREATOR);
                    v5 = v;
                    v6 = v2;
                    break;
                }
                case 3: {
                    driveId1 = driveId0;
                    v7 = v3;
                    v6 = zza.zzg(parcel0, v4);
                    v5 = v;
                    break;
                }
                case 4: {
                    v5 = zza.zzg(parcel0, v4);
                    v6 = v2;
                    driveId1 = driveId0;
                    v7 = v3;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                    v5 = v;
                    v6 = v2;
                    driveId1 = driveId0;
                    v7 = v3;
                }
            }
            v3 = v7;
            driveId0 = driveId1;
            v2 = v6;
            v = v5;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new OpenContentsRequest(v3, driveId0, v2, v);
    }

    public OpenContentsRequest[] zzdb(int v) {
        return new OpenContentsRequest[v];
    }
}

