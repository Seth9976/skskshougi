package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgm(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjo(x0);
    }

    static void zza(NotifyTransactionStatusRequest notifyTransactionStatusRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, notifyTransactionStatusRequest0.zzCY);
        zzb.zza(parcel0, 2, notifyTransactionStatusRequest0.zzaQm, false);
        zzb.zzc(parcel0, 3, notifyTransactionStatusRequest0.status);
        zzb.zza(parcel0, 4, notifyTransactionStatusRequest0.zzaRw, false);
        zzb.zzH(parcel0, v1);
    }

    public NotifyTransactionStatusRequest zzgm(Parcel parcel0) {
        String s = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        String s1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
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
        return new NotifyTransactionStatusRequest(v2, s1, v, s);
    }

    public NotifyTransactionStatusRequest[] zzjo(int v) {
        return new NotifyTransactionStatusRequest[v];
    }
}

