package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class zzae implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdd(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeY(x0);
    }

    static void zza(UnsubscribeRequest unsubscribeRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, unsubscribeRequest0.getDataType(), v, false);
        zzb.zzc(parcel0, 1000, unsubscribeRequest0.getVersionCode());
        zzb.zza(parcel0, 2, unsubscribeRequest0.getDataSource(), v, false);
        zzb.zza(parcel0, 3, unsubscribeRequest0.zzqU(), false);
        zzb.zza(parcel0, 4, unsubscribeRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public UnsubscribeRequest zzdd(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    dataType0 = (DataType)zza.zza(parcel0, v2, DataType.CREATOR);
                    break;
                }
                case 2: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v2, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 4: {
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
        return new UnsubscribeRequest(v1, dataType0, dataSource0, iBinder0, s);
    }

    public UnsubscribeRequest[] zzeY(int v) {
        return new UnsubscribeRequest[v];
    }
}

