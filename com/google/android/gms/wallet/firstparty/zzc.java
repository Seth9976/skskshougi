package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgs(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzju(x0);
    }

    static void zza(GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getBuyFlowInitializationTokenResponse0.getVersionCode());
        zzb.zza(parcel0, 2, getBuyFlowInitializationTokenResponse0.zzaRK, false);
        zzb.zzH(parcel0, v1);
    }

    public GetBuyFlowInitializationTokenResponse zzgs(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_b = zza.zzr(parcel0, v2);
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
        return new GetBuyFlowInitializationTokenResponse(v1, arr_b);
    }

    public GetBuyFlowInitializationTokenResponse[] zzju(int v) {
        return new GetBuyFlowInitializationTokenResponse[v];
    }
}

