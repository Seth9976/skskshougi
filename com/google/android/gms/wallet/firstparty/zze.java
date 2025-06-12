package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgu(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjw(x0);
    }

    static void zza(GetInstrumentsResponse getInstrumentsResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getInstrumentsResponse0.getVersionCode());
        zzb.zza(parcel0, 2, getInstrumentsResponse0.zzaRM, false);
        zzb.zza(parcel0, 3, getInstrumentsResponse0.zzaRN, false);
        zzb.zzH(parcel0, v1);
    }

    public GetInstrumentsResponse zzgu(Parcel parcel0) {
        String[] arr_s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        byte[][] arr2_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_s = zza.zzA(parcel0, v2);
                    break;
                }
                case 3: {
                    arr2_b = zza.zzs(parcel0, v2);
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
        return new GetInstrumentsResponse(v1, arr_s, arr2_b);
    }

    public GetInstrumentsResponse[] zzjw(int v) {
        return new GetInstrumentsResponse[v];
    }
}

