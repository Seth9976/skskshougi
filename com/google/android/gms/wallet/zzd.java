package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgd(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjf(x0);
    }

    static void zza(CreateWalletObjectsRequest createWalletObjectsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, createWalletObjectsRequest0.getVersionCode());
        zzb.zza(parcel0, 2, createWalletObjectsRequest0.zzaQj, v, false);
        zzb.zza(parcel0, 3, createWalletObjectsRequest0.zzaQk, v, false);
        zzb.zza(parcel0, 4, createWalletObjectsRequest0.zzaQl, v, false);
        zzb.zzH(parcel0, v1);
    }

    public CreateWalletObjectsRequest zzgd(Parcel parcel0) {
        int v3;
        LoyaltyWalletObject loyaltyWalletObject1;
        OfferWalletObject offerWalletObject1;
        GiftCardWalletObject giftCardWalletObject1;
        GiftCardWalletObject giftCardWalletObject0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        OfferWalletObject offerWalletObject0 = null;
        LoyaltyWalletObject loyaltyWalletObject0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    offerWalletObject1 = offerWalletObject0;
                    loyaltyWalletObject1 = loyaltyWalletObject0;
                    v3 = zza.zzg(parcel0, v2);
                    giftCardWalletObject1 = giftCardWalletObject0;
                    break;
                }
                case 2: {
                    v3 = v1;
                    loyaltyWalletObject1 = (LoyaltyWalletObject)zza.zza(parcel0, v2, LoyaltyWalletObject.CREATOR);
                    giftCardWalletObject1 = giftCardWalletObject0;
                    offerWalletObject1 = offerWalletObject0;
                    break;
                }
                case 3: {
                    loyaltyWalletObject1 = loyaltyWalletObject0;
                    v3 = v1;
                    offerWalletObject1 = (OfferWalletObject)zza.zza(parcel0, v2, OfferWalletObject.CREATOR);
                    giftCardWalletObject1 = giftCardWalletObject0;
                    break;
                }
                case 4: {
                    giftCardWalletObject1 = (GiftCardWalletObject)zza.zza(parcel0, v2, GiftCardWalletObject.CREATOR);
                    offerWalletObject1 = offerWalletObject0;
                    loyaltyWalletObject1 = loyaltyWalletObject0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    giftCardWalletObject1 = giftCardWalletObject0;
                    offerWalletObject1 = offerWalletObject0;
                    loyaltyWalletObject1 = loyaltyWalletObject0;
                    v3 = v1;
                }
            }
            v1 = v3;
            loyaltyWalletObject0 = loyaltyWalletObject1;
            offerWalletObject0 = offerWalletObject1;
            giftCardWalletObject0 = giftCardWalletObject1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CreateWalletObjectsRequest(v1, loyaltyWalletObject0, offerWalletObject0, giftCardWalletObject0);
    }

    public CreateWalletObjectsRequest[] zzjf(int v) {
        return new CreateWalletObjectsRequest[v];
    }
}

