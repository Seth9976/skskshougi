package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;

public class zzat implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaY(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcN(x0);
    }

    static void zza(OnChangesResponse onChangesResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onChangesResponse0.zzCY);
        zzb.zza(parcel0, 2, onChangesResponse0.zzaga, v, false);
        zzb.zzc(parcel0, 3, onChangesResponse0.zzagb, false);
        zzb.zza(parcel0, 4, onChangesResponse0.zzagc, v, false);
        zzb.zza(parcel0, 5, onChangesResponse0.zzagd);
        zzb.zzH(parcel0, v1);
    }

    public OnChangesResponse zzaY(Parcel parcel0) {
        boolean z = false;
        ChangeSequenceNumber changeSequenceNumber0 = null;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        DataHolder dataHolder0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    dataHolder0 = (DataHolder)zza.zza(parcel0, v2, DataHolder.CREATOR);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v2, DriveId.CREATOR);
                    break;
                }
                case 4: {
                    changeSequenceNumber0 = (ChangeSequenceNumber)zza.zza(parcel0, v2, ChangeSequenceNumber.CREATOR);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v2);
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
        return new OnChangesResponse(v1, dataHolder0, arrayList0, changeSequenceNumber0, z);
    }

    public OnChangesResponse[] zzcN(int v) {
        return new OnChangesResponse[v];
    }
}

