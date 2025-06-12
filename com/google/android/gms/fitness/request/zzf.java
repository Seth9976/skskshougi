package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import java.util.ArrayList;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcF(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzez(x0);
    }

    static void zza(DataReadRequest dataReadRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, dataReadRequest0.getDataTypes(), false);
        zzb.zzc(parcel0, 2, dataReadRequest0.getDataSources(), false);
        zzb.zza(parcel0, 3, dataReadRequest0.zzkt());
        zzb.zza(parcel0, 4, dataReadRequest0.zzqs());
        zzb.zzc(parcel0, 5, dataReadRequest0.getAggregatedDataTypes(), false);
        zzb.zzc(parcel0, 6, dataReadRequest0.getAggregatedDataSources(), false);
        zzb.zzc(parcel0, 7, dataReadRequest0.getBucketType());
        zzb.zza(parcel0, 8, dataReadRequest0.zzrb());
        zzb.zza(parcel0, 9, dataReadRequest0.getActivityDataSource(), v, false);
        zzb.zzc(parcel0, 10, dataReadRequest0.getLimit());
        zzb.zza(parcel0, 12, dataReadRequest0.zzra());
        zzb.zza(parcel0, 13, dataReadRequest0.zzqZ());
        zzb.zza(parcel0, 14, dataReadRequest0.zzqU(), false);
        zzb.zza(parcel0, 15, dataReadRequest0.getPackageName(), false);
        zzb.zzc(parcel0, 16, dataReadRequest0.zzrc(), false);
        zzb.zzc(parcel0, 1000, dataReadRequest0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public DataReadRequest zzcF(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        long v2 = 0L;
        long v3 = 0L;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int v4 = 0;
        long v5 = 0L;
        DataSource dataSource0 = null;
        int v6 = 0;
        boolean z = false;
        boolean z1 = false;
        IBinder iBinder0 = null;
        String s = null;
        ArrayList arrayList4 = null;
        while(parcel0.dataPosition() < v) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v7, DataType.CREATOR);
                    break;
                }
                case 2: {
                    arrayList1 = zza.zzc(parcel0, v7, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v7);
                    break;
                }
                case 4: {
                    v3 = zza.zzi(parcel0, v7);
                    break;
                }
                case 5: {
                    arrayList2 = zza.zzc(parcel0, v7, DataType.CREATOR);
                    break;
                }
                case 6: {
                    arrayList3 = zza.zzc(parcel0, v7, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    v4 = zza.zzg(parcel0, v7);
                    break;
                }
                case 8: {
                    v5 = zza.zzi(parcel0, v7);
                    break;
                }
                case 9: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v7, DataSource.CREATOR);
                    break;
                }
                case 10: {
                    v6 = zza.zzg(parcel0, v7);
                    break;
                }
                case 12: {
                    z = zza.zzc(parcel0, v7);
                    break;
                }
                case 13: {
                    z1 = zza.zzc(parcel0, v7);
                    break;
                }
                case 14: {
                    iBinder0 = zza.zzp(parcel0, v7);
                    break;
                }
                case 15: {
                    s = zza.zzo(parcel0, v7);
                    break;
                }
                case 16: {
                    arrayList4 = zza.zzc(parcel0, v7, Device.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new DataReadRequest(v1, arrayList0, arrayList1, v2, v3, arrayList2, arrayList3, v4, v5, dataSource0, v6, z, z1, iBinder0, s, arrayList4);
    }

    public DataReadRequest[] zzez(int v) {
        return new DataReadRequest[v];
    }
}

