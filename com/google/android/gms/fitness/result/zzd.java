package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdh(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfc(x0);
    }

    static void zza(DataSourceStatsResult dataSourceStatsResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataSourceStatsResult0.zzajG, v, false);
        zzb.zzc(parcel0, 1000, dataSourceStatsResult0.zzCY);
        zzb.zza(parcel0, 2, dataSourceStatsResult0.zzOw);
        zzb.zza(parcel0, 3, dataSourceStatsResult0.zzamS);
        zzb.zza(parcel0, 4, dataSourceStatsResult0.zzamT);
        zzb.zza(parcel0, 5, dataSourceStatsResult0.zzamU);
        zzb.zzH(parcel0, v1);
    }

    public DataSourceStatsResult zzdh(Parcel parcel0) {
        boolean z = false;
        long v = 0L;
        int v1 = zza.zzab(parcel0);
        DataSource dataSource0 = null;
        long v2 = 0L;
        long v3 = 0L;
        int v4 = 0;
        while(parcel0.dataPosition() < v1) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v5, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = zza.zzi(parcel0, v5);
                    break;
                }
                case 5: {
                    v = zza.zzi(parcel0, v5);
                    break;
                }
                case 1000: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new DataSourceStatsResult(v4, dataSource0, v3, z, v2, v);
    }

    public DataSourceStatsResult[] zzfc(int v) {
        return new DataSourceStatsResult[v];
    }
}

