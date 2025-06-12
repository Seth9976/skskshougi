package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class zzaa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcZ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeU(x0);
    }

    static void zza(StartBleScanRequest startBleScanRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, startBleScanRequest0.getDataTypes(), false);
        zzb.zzc(parcel0, 1000, startBleScanRequest0.getVersionCode());
        zzb.zza(parcel0, 2, startBleScanRequest0.zzrq(), false);
        zzb.zzc(parcel0, 3, startBleScanRequest0.getTimeoutSecs());
        zzb.zza(parcel0, 4, startBleScanRequest0.zzqU(), false);
        zzb.zza(parcel0, 5, startBleScanRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public StartBleScanRequest zzcZ(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        ArrayList arrayList0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v3, DataType.CREATOR);
                    break;
                }
                case 2: {
                    iBinder1 = zza.zzp(parcel0, v3);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 4: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 5: {
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
        return new StartBleScanRequest(v2, arrayList0, iBinder1, v, iBinder0, s);
    }

    public StartBleScanRequest[] zzeU(int v) {
        return new StartBleScanRequest[v];
    }
}

