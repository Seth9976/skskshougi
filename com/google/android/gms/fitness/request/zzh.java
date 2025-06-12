package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcH(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeB(x0);
    }

    static void zza(DataSourcesRequest dataSourcesRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, dataSourcesRequest0.getDataTypes(), false);
        zzb.zzc(parcel0, 1000, dataSourcesRequest0.getVersionCode());
        zzb.zza(parcel0, 2, dataSourcesRequest0.zzrd(), false);
        zzb.zza(parcel0, 3, dataSourcesRequest0.zzre());
        zzb.zza(parcel0, 4, dataSourcesRequest0.zzqU(), false);
        zzb.zza(parcel0, 5, dataSourcesRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public DataSourcesRequest zzcH(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        IBinder iBinder0 = null;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList1 = zza.zzc(parcel0, v2, DataType.CREATOR);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzB(parcel0, v2);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v2);
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
        return new DataSourcesRequest(v1, arrayList1, arrayList0, z, iBinder0, s);
    }

    public DataSourcesRequest[] zzeB(int v) {
        return new DataSourcesRequest[v];
    }
}

