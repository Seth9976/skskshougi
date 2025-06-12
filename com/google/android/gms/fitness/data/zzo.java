package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcu(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzen(x0);
    }

    static void zza(RawDataSet rawDataSet0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, rawDataSet0.zzakH);
        zzb.zzc(parcel0, 1000, rawDataSet0.zzCY);
        zzb.zzc(parcel0, 2, rawDataSet0.zzakJ);
        zzb.zzc(parcel0, 3, rawDataSet0.zzakK, false);
        zzb.zza(parcel0, 4, rawDataSet0.zzajU);
        zzb.zzH(parcel0, v1);
    }

    public RawDataSet zzcu(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v4, RawDataPoint.CREATOR);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v4);
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
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new RawDataSet(v3, v2, v1, arrayList0, z);
    }

    public RawDataSet[] zzen(int v) {
        return new RawDataSet[v];
    }
}

