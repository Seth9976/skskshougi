package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcm(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzef(x0);
    }

    static void zza(DataSet dataSet0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataSet0.getDataSource(), v, false);
        zzb.zzc(parcel0, 1000, dataSet0.getVersionCode());
        zzb.zza(parcel0, 2, dataSet0.getDataType(), v, false);
        zzb.zzd(parcel0, 3, dataSet0.zzqz(), false);
        zzb.zzc(parcel0, 4, dataSet0.zzqA(), false);
        zzb.zza(parcel0, 5, dataSet0.zzqr());
        zzb.zzH(parcel0, v1);
    }

    public DataSet zzcm(Parcel parcel0) {
        boolean z = false;
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        ArrayList arrayList1 = new ArrayList();
        DataType dataType0 = null;
        DataSource dataSource0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)zza.zza(parcel0, v2, DataType.CREATOR);
                    break;
                }
                case 3: {
                    zza.zza(parcel0, v2, arrayList1, this.getClass().getClassLoader());
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v2);
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
        return new DataSet(v1, dataSource0, dataType0, arrayList1, arrayList0, z);
    }

    public DataSet[] zzef(int v) {
        return new DataSet[v];
    }
}

