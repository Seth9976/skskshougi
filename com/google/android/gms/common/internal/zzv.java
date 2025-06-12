package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzX(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbx(x0);
    }

    public ResolveAccountRequest zzX(Parcel parcel0) {
        int v5;
        Account account1;
        int v4;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        Account account0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    account1 = account0;
                    v5 = zza.zzg(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 2: {
                    v5 = v2;
                    v4 = v;
                    account1 = (Account)zza.zza(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 3: {
                    v4 = zza.zzg(parcel0, v3);
                    account1 = account0;
                    v5 = v2;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                    v4 = v;
                    account1 = account0;
                    v5 = v2;
                }
            }
            v2 = v5;
            account0 = account1;
            v = v4;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ResolveAccountRequest(v2, account0, v);
    }

    static void zza(ResolveAccountRequest resolveAccountRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, resolveAccountRequest0.zzCY);
        zzb.zza(parcel0, 2, resolveAccountRequest0.getAccount(), v, false);
        zzb.zzc(parcel0, 3, resolveAccountRequest0.getSessionId());
        zzb.zzH(parcel0, v1);
    }

    public ResolveAccountRequest[] zzbx(int v) {
        return new ResolveAccountRequest[v];
    }
}

