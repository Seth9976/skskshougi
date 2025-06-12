package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgo(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjq(x0);
    }

    static void zza(PaymentMethodToken paymentMethodToken0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, paymentMethodToken0.getVersionCode());
        zzb.zzc(parcel0, 2, paymentMethodToken0.zzaRz);
        zzb.zza(parcel0, 3, paymentMethodToken0.zzaFl, false);
        zzb.zzH(parcel0, v1);
    }

    public PaymentMethodToken zzgo(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        String s = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
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
        return new PaymentMethodToken(v2, v, s);
    }

    public PaymentMethodToken[] zzjq(int v) {
        return new PaymentMethodToken[v];
    }
}

