package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class zzaf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcG(x0);
    }

    static void zza(GetChangesRequest getChangesRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getChangesRequest0.zzCY);
        zzb.zza(parcel0, 2, getChangesRequest0.zzafJ, v, false);
        zzb.zzc(parcel0, 3, getChangesRequest0.zzafK);
        zzb.zzc(parcel0, 4, getChangesRequest0.zzadR, false);
        zzb.zzH(parcel0, v1);
    }

    public GetChangesRequest zzaR(Parcel parcel0) {
        int v5;
        ChangeSequenceNumber changeSequenceNumber1;
        int v4;
        List list1;
        List list0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        ChangeSequenceNumber changeSequenceNumber0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v4 = v;
                    changeSequenceNumber1 = changeSequenceNumber0;
                    v5 = zza.zzg(parcel0, v3);
                    list1 = list0;
                    break;
                }
                case 2: {
                    v5 = v2;
                    changeSequenceNumber1 = (ChangeSequenceNumber)zza.zza(parcel0, v3, ChangeSequenceNumber.CREATOR);
                    list1 = list0;
                    v4 = v;
                    break;
                }
                case 3: {
                    changeSequenceNumber1 = changeSequenceNumber0;
                    v5 = v2;
                    v4 = zza.zzg(parcel0, v3);
                    list1 = list0;
                    break;
                }
                case 4: {
                    list1 = zza.zzc(parcel0, v3, DriveSpace.CREATOR);
                    v4 = v;
                    changeSequenceNumber1 = changeSequenceNumber0;
                    v5 = v2;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                    list1 = list0;
                    v4 = v;
                    changeSequenceNumber1 = changeSequenceNumber0;
                    v5 = v2;
                }
            }
            v2 = v5;
            changeSequenceNumber0 = changeSequenceNumber1;
            v = v4;
            list0 = list1;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GetChangesRequest(v2, changeSequenceNumber0, v, list0);
    }

    public GetChangesRequest[] zzcG(int v) {
        return new GetChangesRequest[v];
    }
}

