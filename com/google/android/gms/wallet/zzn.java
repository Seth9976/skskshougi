package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgn(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjp(x0);
    }

    static void zza(OfferWalletObject offerWalletObject0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, offerWalletObject0.getVersionCode());
        zzb.zza(parcel0, 2, offerWalletObject0.zzhI, false);
        zzb.zza(parcel0, 3, offerWalletObject0.zzaRy, false);
        zzb.zza(parcel0, 4, offerWalletObject0.zzaQz, v, false);
        zzb.zzH(parcel0, v1);
    }

    public OfferWalletObject zzgn(Parcel parcel0) {
        CommonWalletObject commonWalletObject0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    commonWalletObject0 = (CommonWalletObject)zza.zza(parcel0, v2, CommonWalletObject.CREATOR);
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
        return new OfferWalletObject(v1, s1, s, commonWalletObject0);
    }

    public OfferWalletObject[] zzjp(int v) {
        return new OfferWalletObject[v];
    }
}

