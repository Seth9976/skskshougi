package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeA(x0);
    }

    static void zza(DataSourceQueryParams dataSourceQueryParams0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataSourceQueryParams0.zzajG, v, false);
        zzb.zzc(parcel0, 1000, dataSourceQueryParams0.zzCY);
        zzb.zza(parcel0, 2, dataSourceQueryParams0.zzOw);
        zzb.zza(parcel0, 3, dataSourceQueryParams0.zzajW);
        zzb.zza(parcel0, 4, dataSourceQueryParams0.zzamd);
        zzb.zzc(parcel0, 5, dataSourceQueryParams0.zzalY);
        zzb.zzc(parcel0, 6, dataSourceQueryParams0.zzame);
        zzb.zzH(parcel0, v1);
    }

    public DataSourceQueryParams zzcG(Parcel parcel0) {
        long v = 0L;
        int v1 = 0;
        int v2 = zza.zzab(parcel0);
        DataSource dataSource0 = null;
        int v3 = 0;
        long v4 = 0L;
        long v5 = 0L;
        int v6 = 0;
        while(parcel0.dataPosition() < v2) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v7, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    v5 = zza.zzi(parcel0, v7);
                    break;
                }
                case 3: {
                    v4 = zza.zzi(parcel0, v7);
                    break;
                }
                case 4: {
                    v = zza.zzi(parcel0, v7);
                    break;
                }
                case 5: {
                    v3 = zza.zzg(parcel0, v7);
                    break;
                }
                case 6: {
                    v1 = zza.zzg(parcel0, v7);
                    break;
                }
                case 1000: {
                    v6 = zza.zzg(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel0);
        }
        return new DataSourceQueryParams(v6, dataSource0, v5, v4, v, v3, v1);
    }

    public DataSourceQueryParams[] zzeA(int v) {
        return new DataSourceQueryParams[v];
    }
}

