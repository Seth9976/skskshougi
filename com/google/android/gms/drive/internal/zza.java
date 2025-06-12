package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaB(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcl(x0);
    }

    static void zza(AddEventListenerRequest addEventListenerRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, addEventListenerRequest0.zzCY);
        zzb.zza(parcel0, 2, addEventListenerRequest0.zzacT, v, false);
        zzb.zzc(parcel0, 3, addEventListenerRequest0.zzaca);
        zzb.zza(parcel0, 4, addEventListenerRequest0.zzadO, v, false);
        zzb.zzH(parcel0, v1);
    }

    public AddEventListenerRequest zzaB(Parcel parcel0) {
        int v5;
        DriveId driveId1;
        int v4;
        ChangesAvailableOptions changesAvailableOptions1;
        ChangesAvailableOptions changesAvailableOptions0 = null;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        DriveId driveId0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v4 = v;
                    driveId1 = driveId0;
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    changesAvailableOptions1 = changesAvailableOptions0;
                    break;
                }
                case 2: {
                    v5 = v2;
                    driveId1 = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, DriveId.CREATOR);
                    changesAvailableOptions1 = changesAvailableOptions0;
                    v4 = v;
                    break;
                }
                case 3: {
                    driveId1 = driveId0;
                    v5 = v2;
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    changesAvailableOptions1 = changesAvailableOptions0;
                    break;
                }
                case 4: {
                    changesAvailableOptions1 = (ChangesAvailableOptions)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ChangesAvailableOptions.CREATOR);
                    v4 = v;
                    driveId1 = driveId0;
                    v5 = v2;
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                    changesAvailableOptions1 = changesAvailableOptions0;
                    v4 = v;
                    driveId1 = driveId0;
                    v5 = v2;
                }
            }
            v2 = v5;
            driveId0 = driveId1;
            v = v4;
            changesAvailableOptions0 = changesAvailableOptions1;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new AddEventListenerRequest(v2, driveId0, v, changesAvailableOptions0);
    }

    public AddEventListenerRequest[] zzcl(int v) {
        return new AddEventListenerRequest[v];
    }
}

