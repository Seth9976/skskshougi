package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzge(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjg(x0);
    }

    static void zza(FullWallet fullWallet0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, fullWallet0.getVersionCode());
        zzb.zza(parcel0, 2, fullWallet0.zzaQm, false);
        zzb.zza(parcel0, 3, fullWallet0.zzaQn, false);
        zzb.zza(parcel0, 4, fullWallet0.zzaQo, v, false);
        zzb.zza(parcel0, 5, fullWallet0.zzaQp, false);
        zzb.zza(parcel0, 6, fullWallet0.zzaQq, v, false);
        zzb.zza(parcel0, 7, fullWallet0.zzaQr, v, false);
        zzb.zza(parcel0, 8, fullWallet0.zzaQs, false);
        zzb.zza(parcel0, 9, fullWallet0.zzaQt, v, false);
        zzb.zza(parcel0, 10, fullWallet0.zzaQu, v, false);
        zzb.zza(parcel0, 11, fullWallet0.zzaQv, v, false);
        zzb.zza(parcel0, 12, fullWallet0.zzaQw, v, false);
        zzb.zzH(parcel0, v1);
    }

    public FullWallet zzge(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        ProxyCard proxyCard0 = null;
        String s2 = null;
        Address address0 = null;
        Address address1 = null;
        String[] arr_s = null;
        UserAddress userAddress0 = null;
        UserAddress userAddress1 = null;
        InstrumentInfo[] arr_instrumentInfo = null;
        PaymentMethodToken paymentMethodToken0 = null;
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
                    proxyCard0 = (ProxyCard)zza.zza(parcel0, v2, ProxyCard.CREATOR);
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
                    arr_s = zza.zzA(parcel0, v2);
                    break;
                }
                case 9: {
                    userAddress0 = (UserAddress)zza.zza(parcel0, v2, UserAddress.CREATOR);
                    break;
                }
                case 10: {
                    userAddress1 = (UserAddress)zza.zza(parcel0, v2, UserAddress.CREATOR);
                    break;
                }
                case 11: {
                    arr_instrumentInfo = (InstrumentInfo[])zza.zzb(parcel0, v2, InstrumentInfo.CREATOR);
                    break;
                }
                case 12: {
                    paymentMethodToken0 = (PaymentMethodToken)zza.zza(parcel0, v2, PaymentMethodToken.CREATOR);
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
        return new FullWallet(v1, s, s1, proxyCard0, s2, address0, address1, arr_s, userAddress0, userAddress1, arr_instrumentInfo, paymentMethodToken0);
    }

    public FullWallet[] zzjg(int v) {
        return new FullWallet[v];
    }
}

