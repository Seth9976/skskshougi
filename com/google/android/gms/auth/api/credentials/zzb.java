package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzD(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzat(x0);
    }

    public CredentialRequest zzD(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        String[] arr_s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_s = zza.zzA(parcel0, v2);
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
        return new CredentialRequest(v1, z, arr_s);
    }

    static void zza(CredentialRequest credentialRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, credentialRequest0.getSupportsPasswordLogin());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, credentialRequest0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, credentialRequest0.getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public CredentialRequest[] zzat(int v) {
        return new CredentialRequest[v];
    }
}

