package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdi(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfd(x0);
    }

    static void zza(DataSourcesResult dataSourcesResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, dataSourcesResult0.getDataSources(), false);
        zzb.zzc(parcel0, 1000, dataSourcesResult0.getVersionCode());
        zzb.zza(parcel0, 2, dataSourcesResult0.getStatus(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public DataSourcesResult zzdi(Parcel parcel0) {
        Status status0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    status0 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new DataSourcesResult(v1, arrayList0, status0);
    }

    public DataSourcesResult[] zzfd(int v) {
        return new DataSourcesResult[v];
    }
}

