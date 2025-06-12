package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcn(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeg(x0);
    }

    static void zza(DataSource dataSource0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataSource0.getDataType(), v, false);
        zzb.zzc(parcel0, 1000, dataSource0.getVersionCode());
        zzb.zza(parcel0, 2, dataSource0.getName(), false);
        zzb.zzc(parcel0, 3, dataSource0.getType());
        zzb.zza(parcel0, 4, dataSource0.getDevice(), v, false);
        zzb.zza(parcel0, 5, dataSource0.zzqB(), v, false);
        zzb.zza(parcel0, 6, dataSource0.getStreamName(), false);
        zzb.zzH(parcel0, v1);
    }

    public DataSource zzcn(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        Application application0 = null;
        Device device0 = null;
        String s1 = null;
        DataType dataType0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    dataType0 = (DataType)zza.zza(parcel0, v3, DataType.CREATOR);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 4: {
                    device0 = (Device)zza.zza(parcel0, v3, Device.CREATOR);
                    break;
                }
                case 5: {
                    application0 = (Application)zza.zza(parcel0, v3, Application.CREATOR);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new DataSource(v2, dataType0, s1, v, device0, application0, s);
    }

    public DataSource[] zzeg(int v) {
        return new DataSource[v];
    }
}

