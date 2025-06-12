package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcj(x0);
    }

    static void zza(QueryResultEventParcelable queryResultEventParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, queryResultEventParcelable0.zzCY);
        zzb.zza(parcel0, 2, queryResultEventParcelable0.zzWu, v, false);
        zzb.zza(parcel0, 3, queryResultEventParcelable0.zzaei);
        zzb.zzc(parcel0, 4, queryResultEventParcelable0.zzaej);
        zzb.zzH(parcel0, v1);
    }

    public QueryResultEventParcelable zzaA(Parcel parcel0) {
        int v5;
        DataHolder dataHolder1;
        boolean z1;
        int v4;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        DataHolder dataHolder0 = null;
        boolean z = false;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    z1 = z;
                    dataHolder1 = dataHolder0;
                    v5 = zza.zzg(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 2: {
                    v5 = v2;
                    dataHolder1 = (DataHolder)zza.zza(parcel0, v3, DataHolder.CREATOR);
                    v4 = v;
                    z1 = z;
                    break;
                }
                case 3: {
                    dataHolder1 = dataHolder0;
                    v5 = v2;
                    z1 = zza.zzc(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 4: {
                    v4 = zza.zzg(parcel0, v3);
                    z1 = z;
                    dataHolder1 = dataHolder0;
                    v5 = v2;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                    v4 = v;
                    z1 = z;
                    dataHolder1 = dataHolder0;
                    v5 = v2;
                }
            }
            v2 = v5;
            dataHolder0 = dataHolder1;
            z = z1;
            v = v4;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new QueryResultEventParcelable(v2, dataHolder0, z, v);
    }

    public QueryResultEventParcelable[] zzcj(int v) {
        return new QueryResultEventParcelable[v];
    }
}

