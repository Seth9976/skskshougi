package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;

public class zzap implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaX(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcM(x0);
    }

    static void zza(LoadRealtimeRequest loadRealtimeRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, loadRealtimeRequest0.zzCY);
        zzb.zza(parcel0, 2, loadRealtimeRequest0.zzacT, v, false);
        zzb.zza(parcel0, 3, loadRealtimeRequest0.zzafQ);
        zzb.zzb(parcel0, 4, loadRealtimeRequest0.zzafR, false);
        zzb.zza(parcel0, 5, loadRealtimeRequest0.zzafS);
        zzb.zza(parcel0, 6, loadRealtimeRequest0.zzafT, v, false);
        zzb.zzH(parcel0, v1);
    }

    public LoadRealtimeRequest zzaX(Parcel parcel0) {
        DataHolder dataHolder0 = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        boolean z1 = false;
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
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzC(parcel0, v2);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 6: {
                    dataHolder0 = (DataHolder)zza.zza(parcel0, v2, DataHolder.CREATOR);
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
        return new LoadRealtimeRequest(v1, driveId0, z1, arrayList0, z, dataHolder0);
    }

    public LoadRealtimeRequest[] zzcM(int v) {
        return new LoadRealtimeRequest[v];
    }
}

