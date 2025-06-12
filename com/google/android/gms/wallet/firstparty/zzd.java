package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgt(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjv(x0);
    }

    static void zza(GetInstrumentsRequest getInstrumentsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getInstrumentsRequest0.getVersionCode());
        zzb.zza(parcel0, 2, getInstrumentsRequest0.zzaRL, false);
        zzb.zzH(parcel0, v1);
    }

    public GetInstrumentsRequest zzgt(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int[] arr_v = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_v = zza.zzu(parcel0, v2);
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
        return new GetInstrumentsRequest(v1, arr_v);
    }

    public GetInstrumentsRequest[] zzjv(int v) {
        return new GetInstrumentsRequest[v];
    }
}

