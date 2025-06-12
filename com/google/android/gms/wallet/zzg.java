package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzji(x0);
    }

    static void zza(GiftCardWalletObject giftCardWalletObject0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, giftCardWalletObject0.getVersionCode());
        zzb.zza(parcel0, 2, giftCardWalletObject0.zzaQz, v, false);
        zzb.zza(parcel0, 3, giftCardWalletObject0.zzaQA, false);
        zzb.zza(parcel0, 4, giftCardWalletObject0.pin, false);
        zzb.zza(parcel0, 5, giftCardWalletObject0.zzaQB, false);
        zzb.zza(parcel0, 6, giftCardWalletObject0.zzaQC);
        zzb.zza(parcel0, 7, giftCardWalletObject0.zzaQD, false);
        zzb.zza(parcel0, 8, giftCardWalletObject0.zzaQE);
        zzb.zza(parcel0, 9, giftCardWalletObject0.zzaQF, false);
        zzb.zzH(parcel0, v1);
    }

    public GiftCardWalletObject zzgg(Parcel parcel0) {
        long v = 0L;
        String s = null;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        String s1 = null;
        long v3 = 0L;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        CommonWalletObject commonWalletObject0 = null;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    commonWalletObject0 = (CommonWalletObject)zza.zza(parcel0, v4, CommonWalletObject.CREATOR);
                    break;
                }
                case 3: {
                    s4 = zza.zzo(parcel0, v4);
                    break;
                }
                case 4: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 6: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 7: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 8: {
                    v = zza.zzi(parcel0, v4);
                    break;
                }
                case 9: {
                    s = zza.zzo(parcel0, v4);
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
        return new GiftCardWalletObject(v2, commonWalletObject0, s4, s3, s2, v3, s1, v, s);
    }

    public GiftCardWalletObject[] zzji(int v) {
        return new GiftCardWalletObject[v];
    }
}

