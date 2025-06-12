package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcx(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzer(x0);
    }

    static void zza(Subscription subscription0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, subscription0.getDataSource(), v, false);
        zzb.zzc(parcel0, 1000, subscription0.getVersionCode());
        zzb.zza(parcel0, 2, subscription0.getDataType(), v, false);
        zzb.zza(parcel0, 3, subscription0.zzqL());
        zzb.zzc(parcel0, 4, subscription0.getAccuracyMode());
        zzb.zzH(parcel0, v1);
    }

    public Subscription zzcx(Parcel parcel0) {
        DataType dataType0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        long v2 = 0L;
        DataSource dataSource0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)zza.zza(parcel0, v4, DataType.CREATOR);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v4);
                    break;
                }
                case 4: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 1000: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new Subscription(v3, dataSource0, dataType0, v2, v);
    }

    public Subscription[] zzer(int v) {
        return new Subscription[v];
    }
}

