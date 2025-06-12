package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcl(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzee(x0);
    }

    static void zza(DataPoint dataPoint0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataPoint0.getDataSource(), v, false);
        zzb.zzc(parcel0, 1000, dataPoint0.getVersionCode());
        zzb.zza(parcel0, 3, dataPoint0.getTimestampNanos());
        zzb.zza(parcel0, 4, dataPoint0.zzqy());
        zzb.zza(parcel0, 5, dataPoint0.zzqu(), v, false);
        zzb.zza(parcel0, 6, dataPoint0.getOriginalDataSource(), v, false);
        zzb.zza(parcel0, 7, dataPoint0.zzqv());
        zzb.zza(parcel0, 8, dataPoint0.zzqw());
        zzb.zzH(parcel0, v1);
    }

    public DataPoint zzcl(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DataSource dataSource0 = null;
        long v2 = 0L;
        long v3 = 0L;
        Value[] arr_value = null;
        DataSource dataSource1 = null;
        long v4 = 0L;
        long v5 = 0L;
        while(parcel0.dataPosition() < v) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v6, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v6);
                    break;
                }
                case 4: {
                    v3 = zza.zzi(parcel0, v6);
                    break;
                }
                case 5: {
                    arr_value = (Value[])zza.zzb(parcel0, v6, Value.CREATOR);
                    break;
                }
                case 6: {
                    dataSource1 = (DataSource)zza.zza(parcel0, v6, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    v4 = zza.zzi(parcel0, v6);
                    break;
                }
                case 8: {
                    v5 = zza.zzi(parcel0, v6);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new DataPoint(v1, dataSource0, v2, v3, arr_value, dataSource1, v4, v5);
    }

    public DataPoint[] zzee(int v) {
        return new DataPoint[v];
    }
}

