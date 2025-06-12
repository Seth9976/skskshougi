package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfb(x0);
    }

    static void zza(DataReadResult dataReadResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzd(parcel0, 1, dataReadResult0.zzrv(), false);
        zzb.zzc(parcel0, 1000, dataReadResult0.getVersionCode());
        zzb.zza(parcel0, 2, dataReadResult0.getStatus(), v, false);
        zzb.zzd(parcel0, 3, dataReadResult0.zzru(), false);
        zzb.zzc(parcel0, 5, dataReadResult0.zzrt());
        zzb.zzc(parcel0, 6, dataReadResult0.zzqA(), false);
        zzb.zzc(parcel0, 7, dataReadResult0.zzrw(), false);
        zzb.zzH(parcel0, v1);
    }

    public DataReadResult zzdg(Parcel parcel0) {
        int v = 0;
        ArrayList arrayList0 = null;
        int v1 = zza.zzab(parcel0);
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        Status status0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    zza.zza(parcel0, v3, arrayList1, this.getClass().getClassLoader());
                    break;
                }
                case 2: {
                    status0 = (Status)zza.zza(parcel0, v3, Status.CREATOR);
                    break;
                }
                case 3: {
                    zza.zza(parcel0, v3, arrayList2, this.getClass().getClassLoader());
                    break;
                }
                case 5: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 6: {
                    arrayList3 = zza.zzc(parcel0, v3, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    arrayList0 = zza.zzc(parcel0, v3, DataType.CREATOR);
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
        return new DataReadResult(v2, arrayList1, status0, arrayList2, v, arrayList3, arrayList0);
    }

    public DataReadResult[] zzfb(int v) {
        return new DataReadResult[v];
    }
}

