package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.query.Query;

public class zzbk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbo(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdd(x0);
    }

    static void zza(QueryRequest queryRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, queryRequest0.zzCY);
        zzb.zza(parcel0, 2, queryRequest0.zzagu, v, false);
        zzb.zzH(parcel0, v1);
    }

    public QueryRequest zzbo(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Query query0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    query0 = (Query)zza.zza(parcel0, v2, Query.CREATOR);
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
        return new QueryRequest(v1, query0);
    }

    public QueryRequest[] zzdd(int v) {
        return new QueryRequest[v];
    }
}

