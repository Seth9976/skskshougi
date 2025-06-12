package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzv(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzag(x0);
    }

    static void zza(Request getRecentContextCall$Request0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, getRecentContextCall$Request0.zzNj, v, false);
        zzb.zzc(parcel0, 1000, getRecentContextCall$Request0.zzCY);
        zzb.zza(parcel0, 2, getRecentContextCall$Request0.zzNk);
        zzb.zza(parcel0, 3, getRecentContextCall$Request0.zzNl);
        zzb.zza(parcel0, 4, getRecentContextCall$Request0.zzNm);
        zzb.zzH(parcel0, v1);
    }

    public Request[] zzag(int v) {
        return new Request[v];
    }

    public Request zzv(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        Account account0 = null;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    account0 = (Account)zza.zza(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 2: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
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
        return new Request(v1, account0, z2, z1, z);
    }
}

