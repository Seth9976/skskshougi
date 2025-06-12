package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgw(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjz(x0);
    }

    static void zza(WalletFragmentOptions walletFragmentOptions0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, walletFragmentOptions0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, walletFragmentOptions0.getEnvironment());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 3, walletFragmentOptions0.getTheme());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, walletFragmentOptions0.getFragmentStyle(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 5, walletFragmentOptions0.getMode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public WalletFragmentOptions zzgw(Parcel parcel0) {
        int v = 1;
        int v1 = 0;
        int v2 = zza.zzab(parcel0);
        WalletFragmentStyle walletFragmentStyle0 = null;
        int v3 = 1;
        int v4 = 0;
        while(parcel0.dataPosition() < v2) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 3: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                case 4: {
                    walletFragmentStyle0 = (WalletFragmentStyle)zza.zza(parcel0, v5, WalletFragmentStyle.CREATOR);
                    break;
                }
                case 5: {
                    v = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel0);
        }
        return new WalletFragmentOptions(v4, v3, v1, walletFragmentStyle0, v);
    }

    public WalletFragmentOptions[] zzjz(int v) {
        return new WalletFragmentOptions[v];
    }
}

