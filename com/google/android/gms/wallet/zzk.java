package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgk(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjm(x0);
    }

    static void zza(MaskedWallet maskedWallet0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, maskedWallet0.getVersionCode());
        zzb.zza(parcel0, 2, maskedWallet0.zzaQm, false);
        zzb.zza(parcel0, 3, maskedWallet0.zzaQn, false);
        zzb.zza(parcel0, 4, maskedWallet0.zzaQs, false);
        zzb.zza(parcel0, 5, maskedWallet0.zzaQp, false);
        zzb.zza(parcel0, 6, maskedWallet0.zzaQq, v, false);
        zzb.zza(parcel0, 7, maskedWallet0.zzaQr, v, false);
        zzb.zza(parcel0, 8, maskedWallet0.zzaRf, v, false);
        zzb.zza(parcel0, 9, maskedWallet0.zzaRg, v, false);
        zzb.zza(parcel0, 10, maskedWallet0.zzaQt, v, false);
        zzb.zza(parcel0, 11, maskedWallet0.zzaQu, v, false);
        zzb.zza(parcel0, 12, maskedWallet0.zzaQv, v, false);
        zzb.zzH(parcel0, v1);
    }

    public MaskedWallet zzgk(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        String s2 = null;
        Address address0 = null;
        Address address1 = null;
        LoyaltyWalletObject[] arr_loyaltyWalletObject = null;
        OfferWalletObject[] arr_offerWalletObject = null;
        UserAddress userAddress0 = null;
        UserAddress userAddress1 = null;
        InstrumentInfo[] arr_instrumentInfo = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_s = zza.zzA(parcel0, v2);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    address0 = (Address)zza.zza(parcel0, v2, Address.CREATOR);
                    break;
                }
                case 7: {
                    address1 = (Address)zza.zza(parcel0, v2, Address.CREATOR);
                    break;
                }
                case 8: {
                    arr_loyaltyWalletObject = (LoyaltyWalletObject[])zza.zzb(parcel0, v2, LoyaltyWalletObject.CREATOR);
                    break;
                }
                case 9: {
                    arr_offerWalletObject = (OfferWalletObject[])zza.zzb(parcel0, v2, OfferWalletObject.CREATOR);
                    break;
                }
                case 10: {
                    userAddress0 = (UserAddress)zza.zza(parcel0, v2, UserAddress.CREATOR);
                    break;
                }
                case 11: {
                    userAddress1 = (UserAddress)zza.zza(parcel0, v2, UserAddress.CREATOR);
                    break;
                }
                case 12: {
                    arr_instrumentInfo = (InstrumentInfo[])zza.zzb(parcel0, v2, InstrumentInfo.CREATOR);
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
        return new MaskedWallet(v1, s, s1, arr_s, s2, address0, address1, arr_loyaltyWalletObject, arr_offerWalletObject, userAddress0, userAddress1, arr_instrumentInfo);
    }

    public MaskedWallet[] zzjm(int v) {
        return new MaskedWallet[v];
    }
}

