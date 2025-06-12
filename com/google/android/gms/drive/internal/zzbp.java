package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class zzbp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbt(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdi(x0);
    }

    static void zza(SetResourceParentsRequest setResourceParentsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, setResourceParentsRequest0.zzCY);
        zzb.zza(parcel0, 2, setResourceParentsRequest0.zzagv, v, false);
        zzb.zzc(parcel0, 3, setResourceParentsRequest0.zzagw, false);
        zzb.zzH(parcel0, v1);
    }

    public SetResourceParentsRequest zzbt(Parcel parcel0) {
        int v3;
        DriveId driveId1;
        List list1;
        List list0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DriveId driveId0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    driveId1 = driveId0;
                    v3 = zza.zzg(parcel0, v2);
                    list1 = list0;
                    break;
                }
                case 2: {
                    v3 = v1;
                    list1 = list0;
                    driveId1 = (DriveId)zza.zza(parcel0, v2, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    list1 = zza.zzc(parcel0, v2, DriveId.CREATOR);
                    driveId1 = driveId0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    list1 = list0;
                    driveId1 = driveId0;
                    v3 = v1;
                }
            }
            v1 = v3;
            driveId0 = driveId1;
            list0 = list1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SetResourceParentsRequest(v1, driveId0, list0);
    }

    public SetResourceParentsRequest[] zzdi(int v) {
        return new SetResourceParentsRequest[v];
    }
}

