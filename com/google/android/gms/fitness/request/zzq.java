package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcP(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeJ(x0);
    }

    static void zza(ReadRawRequest readRawRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, readRawRequest0.zzqU(), false);
        zzb.zzc(parcel0, 1000, readRawRequest0.getVersionCode());
        zzb.zza(parcel0, 2, readRawRequest0.getPackageName(), false);
        zzb.zzc(parcel0, 3, readRawRequest0.zzrf(), false);
        zzb.zza(parcel0, 4, readRawRequest0.zzra());
        zzb.zza(parcel0, 5, readRawRequest0.zzqZ());
        zzb.zzH(parcel0, v1);
    }

    public ReadRawRequest zzcP(Parcel parcel0) {
        ArrayList arrayList0 = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        boolean z1 = false;
        String s = null;
        IBinder iBinder0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v2, DataSourceQueryParams.CREATOR);
                    break;
                }
                case 4: {
                    z1 = zza.zzc(parcel0, v2);
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
        return new ReadRawRequest(v1, iBinder0, s, arrayList0, z1, z);
    }

    public ReadRawRequest[] zzeJ(int v) {
        return new ReadRawRequest[v];
    }
}

