package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaq(x0);
    }

    public AccountChangeEventsRequest zzA(Parcel parcel0) {
        Account account0 = null;
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
                case 4: {
                    account0 = (Account)zza.zza(parcel0, v3, Account.CREATOR);
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
        return new AccountChangeEventsRequest(v2, v, s, account0);
    }

    static void zza(AccountChangeEventsRequest accountChangeEventsRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, accountChangeEventsRequest0.mVersion);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, accountChangeEventsRequest0.zzOz);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, accountChangeEventsRequest0.zzOx, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, accountChangeEventsRequest0.zzMY, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AccountChangeEventsRequest[] zzaq(int v) {
        return new AccountChangeEventsRequest[v];
    }
}

