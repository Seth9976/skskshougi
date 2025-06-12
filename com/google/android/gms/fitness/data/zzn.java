package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzct(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzem(x0);
    }

    static void zza(RawDataPoint rawDataPoint0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, rawDataPoint0.zzajV);
        zzb.zzc(parcel0, 1000, rawDataPoint0.zzCY);
        zzb.zza(parcel0, 2, rawDataPoint0.zzajW);
        zzb.zza(parcel0, 3, rawDataPoint0.zzajX, v, false);
        zzb.zzc(parcel0, 4, rawDataPoint0.zzakH);
        zzb.zzc(parcel0, 5, rawDataPoint0.zzakI);
        zzb.zza(parcel0, 6, rawDataPoint0.zzajZ);
        zzb.zza(parcel0, 7, rawDataPoint0.zzaka);
        zzb.zzH(parcel0, v1);
    }

    public RawDataPoint zzct(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        Value[] arr_value = null;
        int v4 = 0;
        int v5 = 0;
        long v6 = 0L;
        long v7 = 0L;
        while(parcel0.dataPosition() < v) {
            int v8 = zza.zzaa(parcel0);
            switch(0xFFFF & v8) {
                case 1: {
                    v2 = zza.zzi(parcel0, v8);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v8);
                    break;
                }
                case 3: {
                    arr_value = (Value[])zza.zzb(parcel0, v8, Value.CREATOR);
                    break;
                }
                case 4: {
                    v4 = zza.zzg(parcel0, v8);
                    break;
                }
                case 5: {
                    v5 = zza.zzg(parcel0, v8);
                    break;
                }
                case 6: {
                    v6 = zza.zzi(parcel0, v8);
                    break;
                }
                case 7: {
                    v7 = zza.zzi(parcel0, v8);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v8);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v8);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new RawDataPoint(v1, v2, v3, arr_value, v4, v5, v6, v7);
    }

    public RawDataPoint[] zzem(int v) {
        return new RawDataPoint[v];
    }
}

