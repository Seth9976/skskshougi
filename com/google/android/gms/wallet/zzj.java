package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjl(x0);
    }

    static void zza(LoyaltyWalletObject loyaltyWalletObject0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, loyaltyWalletObject0.getVersionCode());
        zzb.zza(parcel0, 2, loyaltyWalletObject0.zzhI, false);
        zzb.zza(parcel0, 3, loyaltyWalletObject0.zzaQM, false);
        zzb.zza(parcel0, 4, loyaltyWalletObject0.zzaQN, false);
        zzb.zza(parcel0, 5, loyaltyWalletObject0.zzaQO, false);
        zzb.zza(parcel0, 6, loyaltyWalletObject0.zzaBb, false);
        zzb.zza(parcel0, 7, loyaltyWalletObject0.zzaQP, false);
        zzb.zza(parcel0, 8, loyaltyWalletObject0.zzaQQ, false);
        zzb.zza(parcel0, 9, loyaltyWalletObject0.zzaQR, false);
        zzb.zza(parcel0, 10, loyaltyWalletObject0.zzaQS, false);
        zzb.zza(parcel0, 11, loyaltyWalletObject0.zzaQT, false);
        zzb.zzc(parcel0, 12, loyaltyWalletObject0.state);
        zzb.zzc(parcel0, 13, loyaltyWalletObject0.zzaQU, false);
        zzb.zza(parcel0, 14, loyaltyWalletObject0.zzaQV, v, false);
        zzb.zzc(parcel0, 15, loyaltyWalletObject0.zzaQW, false);
        zzb.zza(parcel0, 17, loyaltyWalletObject0.zzaQY, false);
        zzb.zza(parcel0, 16, loyaltyWalletObject0.zzaQX, false);
        zzb.zza(parcel0, 19, loyaltyWalletObject0.zzaRa);
        zzb.zzc(parcel0, 18, loyaltyWalletObject0.zzaQZ, false);
        zzb.zzc(parcel0, 21, loyaltyWalletObject0.zzaRc, false);
        zzb.zzc(parcel0, 20, loyaltyWalletObject0.zzaRb, false);
        zzb.zza(parcel0, 23, loyaltyWalletObject0.zzaRe, v, false);
        zzb.zzc(parcel0, 22, loyaltyWalletObject0.zzaRd, false);
        zzb.zzH(parcel0, v1);
    }

    public LoyaltyWalletObject zzgj(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        int v2 = 0;
        ArrayList arrayList0 = zzkx.zzoP();
        TimeInterval timeInterval0 = null;
        ArrayList arrayList1 = zzkx.zzoP();
        String s10 = null;
        String s11 = null;
        ArrayList arrayList2 = zzkx.zzoP();
        boolean z = false;
        ArrayList arrayList3 = zzkx.zzoP();
        ArrayList arrayList4 = zzkx.zzoP();
        ArrayList arrayList5 = zzkx.zzoP();
        LoyaltyPoints loyaltyPoints0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    s2 = zza.zzo(parcel0, v3);
                    break;
                }
                case 5: {
                    s3 = zza.zzo(parcel0, v3);
                    break;
                }
                case 6: {
                    s4 = zza.zzo(parcel0, v3);
                    break;
                }
                case 7: {
                    s5 = zza.zzo(parcel0, v3);
                    break;
                }
                case 8: {
                    s6 = zza.zzo(parcel0, v3);
                    break;
                }
                case 9: {
                    s7 = zza.zzo(parcel0, v3);
                    break;
                }
                case 10: {
                    s8 = zza.zzo(parcel0, v3);
                    break;
                }
                case 11: {
                    s9 = zza.zzo(parcel0, v3);
                    break;
                }
                case 12: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 13: {
                    arrayList0 = zza.zzc(parcel0, v3, WalletObjectMessage.CREATOR);
                    break;
                }
                case 14: {
                    timeInterval0 = (TimeInterval)zza.zza(parcel0, v3, TimeInterval.CREATOR);
                    break;
                }
                case 15: {
                    arrayList1 = zza.zzc(parcel0, v3, LatLng.CREATOR);
                    break;
                }
                case 16: {
                    s10 = zza.zzo(parcel0, v3);
                    break;
                }
                case 17: {
                    s11 = zza.zzo(parcel0, v3);
                    break;
                }
                case 18: {
                    arrayList2 = zza.zzc(parcel0, v3, LabelValueRow.CREATOR);
                    break;
                }
                case 19: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                case 20: {
                    arrayList3 = zza.zzc(parcel0, v3, UriData.CREATOR);
                    break;
                }
                case 21: {
                    arrayList4 = zza.zzc(parcel0, v3, TextModuleData.CREATOR);
                    break;
                }
                case 22: {
                    arrayList5 = zza.zzc(parcel0, v3, UriData.CREATOR);
                    break;
                }
                case 23: {
                    loyaltyPoints0 = (LoyaltyPoints)zza.zza(parcel0, v3, LoyaltyPoints.CREATOR);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new LoyaltyWalletObject(v1, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, v2, arrayList0, timeInterval0, arrayList1, s10, s11, arrayList2, z, arrayList3, arrayList4, arrayList5, loyaltyPoints0);
    }

    public LoyaltyWalletObject[] zzjl(int v) {
        return new LoyaltyWalletObject[v];
    }
}

