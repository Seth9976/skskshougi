package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzW(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbr(x0);
    }

    public GetServiceRequest zzW(Parcel parcel0) {
        int v = 0;
        Account account0 = null;
        int v1 = zza.zzab(parcel0);
        Bundle bundle0 = null;
        Scope[] arr_scope = null;
        IBinder iBinder0 = null;
        String s = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 5: {
                    iBinder0 = zza.zzp(parcel0, v4);
                    break;
                }
                case 6: {
                    arr_scope = (Scope[])zza.zzb(parcel0, v4, Scope.CREATOR);
                    break;
                }
                case 7: {
                    bundle0 = zza.zzq(parcel0, v4);
                    break;
                }
                case 8: {
                    account0 = (Account)zza.zza(parcel0, v4, Account.CREATOR);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GetServiceRequest(v3, v2, v, s, iBinder0, arr_scope, bundle0, account0);
    }

    static void zza(GetServiceRequest getServiceRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getServiceRequest0.version);
        zzb.zzc(parcel0, 2, getServiceRequest0.zzaad);
        zzb.zzc(parcel0, 3, getServiceRequest0.zzaae);
        zzb.zza(parcel0, 4, getServiceRequest0.zzaaf, false);
        zzb.zza(parcel0, 5, getServiceRequest0.zzaag, false);
        zzb.zza(parcel0, 6, getServiceRequest0.zzaah, v, false);
        zzb.zza(parcel0, 7, getServiceRequest0.zzaai, false);
        zzb.zza(parcel0, 8, getServiceRequest0.zzaaj, v, false);
        zzb.zzH(parcel0, v1);
    }

    public GetServiceRequest[] zzbr(int v) {
        return new GetServiceRequest[v];
    }
}

