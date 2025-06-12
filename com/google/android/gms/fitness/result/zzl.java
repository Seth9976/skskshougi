package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdp(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfk(x0);
    }

    static void zza(SyncInfoResult syncInfoResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, syncInfoResult0.getStatus(), v, false);
        zzb.zzc(parcel0, 1000, syncInfoResult0.getVersionCode());
        zzb.zza(parcel0, 2, syncInfoResult0.zzrz());
        zzb.zzH(parcel0, v1);
    }

    public SyncInfoResult zzdp(Parcel parcel0) {
        int v5;
        Status status1;
        long v4;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Status status0 = null;
        long v2;
        for(v2 = 0L; parcel0.dataPosition() < v; v2 = v4) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    status1 = (Status)zza.zza(parcel0, v3, Status.CREATOR);
                    v5 = v1;
                    v4 = v2;
                    break;
                }
                case 2: {
                    v4 = zza.zzi(parcel0, v3);
                    status1 = status0;
                    v5 = v1;
                    break;
                }
                case 1000: {
                    status1 = status0;
                    v5 = zza.zzg(parcel0, v3);
                    v4 = v2;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                    v4 = v2;
                    status1 = status0;
                    v5 = v1;
                }
            }
            status0 = status1;
            v1 = v5;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SyncInfoResult(v1, status0, v2);
    }

    public SyncInfoResult[] zzfk(int v) {
        return new SyncInfoResult[v];
    }
}

