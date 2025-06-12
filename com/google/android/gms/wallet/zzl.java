package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgl(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjn(x0);
    }

    static void zza(MaskedWalletRequest maskedWalletRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, maskedWalletRequest0.getVersionCode());
        zzb.zza(parcel0, 2, maskedWalletRequest0.zzaQn, false);
        zzb.zza(parcel0, 3, maskedWalletRequest0.zzaRi);
        zzb.zza(parcel0, 4, maskedWalletRequest0.zzaRj);
        zzb.zza(parcel0, 5, maskedWalletRequest0.zzaRk);
        zzb.zza(parcel0, 6, maskedWalletRequest0.zzaRl, false);
        zzb.zza(parcel0, 7, maskedWalletRequest0.zzaQg, false);
        zzb.zza(parcel0, 8, maskedWalletRequest0.zzaRm, false);
        zzb.zza(parcel0, 9, maskedWalletRequest0.zzaQx, v, false);
        zzb.zza(parcel0, 10, maskedWalletRequest0.zzaRn);
        zzb.zza(parcel0, 11, maskedWalletRequest0.zzaRo);
        zzb.zza(parcel0, 12, maskedWalletRequest0.zzaRp, v, false);
        zzb.zza(parcel0, 13, maskedWalletRequest0.zzaRq);
        zzb.zza(parcel0, 14, maskedWalletRequest0.zzaRr);
        zzb.zzc(parcel0, 15, maskedWalletRequest0.zzaRs, false);
        zzb.zza(parcel0, 17, maskedWalletRequest0.zzaRu, false);
        zzb.zza(parcel0, 16, maskedWalletRequest0.zzaRt, v, false);
        zzb.zzH(parcel0, v1);
    }

    public MaskedWalletRequest zzgl(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Cart cart0 = null;
        boolean z3 = false;
        boolean z4 = false;
        CountrySpecification[] arr_countrySpecification = null;
        boolean z5 = true;
        boolean z6 = true;
        ArrayList arrayList0 = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0 = null;
        ArrayList arrayList1 = null;
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
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 9: {
                    cart0 = (Cart)zza.zza(parcel0, v2, Cart.CREATOR);
                    break;
                }
                case 10: {
                    z3 = zza.zzc(parcel0, v2);
                    break;
                }
                case 11: {
                    z4 = zza.zzc(parcel0, v2);
                    break;
                }
                case 12: {
                    arr_countrySpecification = (CountrySpecification[])zza.zzb(parcel0, v2, CountrySpecification.CREATOR);
                    break;
                }
                case 13: {
                    z5 = zza.zzc(parcel0, v2);
                    break;
                }
                case 14: {
                    z6 = zza.zzc(parcel0, v2);
                    break;
                }
                case 15: {
                    arrayList0 = zza.zzc(parcel0, v2, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                }
                case 16: {
                    paymentMethodTokenizationParameters0 = (PaymentMethodTokenizationParameters)zza.zza(parcel0, v2, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                }
                case 17: {
                    arrayList1 = zza.zzB(parcel0, v2);
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
        return new MaskedWalletRequest(v1, s, z, z1, z2, s1, s2, s3, cart0, z3, z4, arr_countrySpecification, z5, z6, arrayList0, paymentMethodTokenizationParameters0, arrayList1);
    }

    public MaskedWalletRequest[] zzjn(int v) {
        return new MaskedWalletRequest[v];
    }
}

