package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgv(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjy(x0);
    }

    static void zza(WalletFragmentInitParams walletFragmentInitParams0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, walletFragmentInitParams0.zzCY);
        zzb.zza(parcel0, 2, walletFragmentInitParams0.getAccountName(), false);
        zzb.zza(parcel0, 3, walletFragmentInitParams0.getMaskedWalletRequest(), v, false);
        zzb.zzc(parcel0, 4, walletFragmentInitParams0.getMaskedWalletRequestCode());
        zzb.zza(parcel0, 5, walletFragmentInitParams0.getMaskedWallet(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public WalletFragmentInitParams zzgv(Parcel parcel0) {
        MaskedWallet maskedWallet0 = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        int v2 = -1;
        MaskedWalletRequest maskedWalletRequest0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    maskedWalletRequest0 = (MaskedWalletRequest)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, MaskedWalletRequest.CREATOR);
                    break;
                }
                case 4: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 5: {
                    maskedWallet0 = (MaskedWallet)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, MaskedWallet.CREATOR);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new WalletFragmentInitParams(v1, s, maskedWalletRequest0, v2, maskedWallet0);
    }

    public WalletFragmentInitParams[] zzjy(int v) {
        return new WalletFragmentInitParams[v];
    }
}

