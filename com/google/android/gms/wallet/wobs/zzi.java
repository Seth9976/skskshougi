package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjL(x0);
    }

    static void zza(WalletObjectMessage walletObjectMessage0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, walletObjectMessage0.getVersionCode());
        zzb.zza(parcel0, 2, walletObjectMessage0.zzaSG, false);
        zzb.zza(parcel0, 3, walletObjectMessage0.zzCI, false);
        zzb.zza(parcel0, 4, walletObjectMessage0.zzaSJ, v, false);
        zzb.zza(parcel0, 5, walletObjectMessage0.zzaSK, v, false);
        zzb.zza(parcel0, 6, walletObjectMessage0.zzaSL, v, false);
        zzb.zzH(parcel0, v1);
    }

    public WalletObjectMessage zzgG(Parcel parcel0) {
        UriData uriData0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        UriData uriData1 = null;
        TimeInterval timeInterval0 = null;
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
                    timeInterval0 = (TimeInterval)zza.zza(parcel0, v2, TimeInterval.CREATOR);
                    break;
                }
                case 5: {
                    uriData1 = (UriData)zza.zza(parcel0, v2, UriData.CREATOR);
                    break;
                }
                case 6: {
                    uriData0 = (UriData)zza.zza(parcel0, v2, UriData.CREATOR);
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
        return new WalletObjectMessage(v1, s1, s, timeInterval0, uriData1, uriData0);
    }

    public WalletObjectMessage[] zzjL(int v) {
        return new WalletObjectMessage[v];
    }
}

