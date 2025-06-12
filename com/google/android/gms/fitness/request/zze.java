package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSet;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcE(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzey(x0);
    }

    static void zza(DataInsertRequest dataInsertRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataInsertRequest0.zzqK(), v, false);
        zzb.zzc(parcel0, 1000, dataInsertRequest0.getVersionCode());
        zzb.zza(parcel0, 2, dataInsertRequest0.zzqU(), false);
        zzb.zza(parcel0, 3, dataInsertRequest0.getPackageName(), false);
        zzb.zza(parcel0, 4, dataInsertRequest0.zzqY());
        zzb.zzH(parcel0, v1);
    }

    public DataInsertRequest zzcE(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        IBinder iBinder0 = null;
        DataSet dataSet0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    dataSet0 = (DataSet)zza.zza(parcel0, v2, DataSet.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
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
        return new DataInsertRequest(v1, dataSet0, iBinder0, s, z);
    }

    public DataInsertRequest[] zzey(int v) {
        return new DataInsertRequest[v];
    }
}

