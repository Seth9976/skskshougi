package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgy(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjD(x0);
    }

    static void zza(CommonWalletObject commonWalletObject0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, commonWalletObject0.getVersionCode());
        zzb.zza(parcel0, 2, commonWalletObject0.zzhI, false);
        zzb.zza(parcel0, 3, commonWalletObject0.zzaQT, false);
        zzb.zza(parcel0, 4, commonWalletObject0.name, false);
        zzb.zza(parcel0, 5, commonWalletObject0.zzaQN, false);
        zzb.zza(parcel0, 6, commonWalletObject0.zzaQP, false);
        zzb.zza(parcel0, 7, commonWalletObject0.zzaQQ, false);
        zzb.zza(parcel0, 8, commonWalletObject0.zzaQR, false);
        zzb.zza(parcel0, 9, commonWalletObject0.zzaQS, false);
        zzb.zzc(parcel0, 10, commonWalletObject0.state);
        zzb.zzc(parcel0, 11, commonWalletObject0.zzaQU, false);
        zzb.zza(parcel0, 12, commonWalletObject0.zzaQV, v, false);
        zzb.zzc(parcel0, 13, commonWalletObject0.zzaQW, false);
        zzb.zza(parcel0, 14, commonWalletObject0.zzaQX, false);
        zzb.zza(parcel0, 15, commonWalletObject0.zzaQY, false);
        zzb.zza(parcel0, 17, commonWalletObject0.zzaRa);
        zzb.zzc(parcel0, 16, commonWalletObject0.zzaQZ, false);
        zzb.zzc(parcel0, 19, commonWalletObject0.zzaRc, false);
        zzb.zzc(parcel0, 18, commonWalletObject0.zzaRb, false);
        zzb.zzc(parcel0, 20, commonWalletObject0.zzaRd, false);
        zzb.zzH(parcel0, v1);
    }

    public CommonWalletObject zzgy(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        int v2 = 0;
        ArrayList arrayList0 = zzkx.zzoP();
        TimeInterval timeInterval0 = null;
        ArrayList arrayList1 = zzkx.zzoP();
        String s8 = null;
        String s9 = null;
        ArrayList arrayList2 = zzkx.zzoP();
        boolean z = false;
        ArrayList arrayList3 = zzkx.zzoP();
        ArrayList arrayList4 = zzkx.zzoP();
        ArrayList arrayList5 = zzkx.zzoP();
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
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 5: {
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 6: {
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 7: {
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 8: {
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 9: {
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 10: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    break;
                }
                case 11: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, WalletObjectMessage.CREATOR);
                    break;
                }
                case 12: {
                    timeInterval0 = (TimeInterval)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, TimeInterval.CREATOR);
                    break;
                }
                case 13: {
                    arrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, LatLng.CREATOR);
                    break;
                }
                case 14: {
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 15: {
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 16: {
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, LabelValueRow.CREATOR);
                    break;
                }
                case 17: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3);
                    break;
                }
                case 18: {
                    arrayList3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, UriData.CREATOR);
                    break;
                }
                case 19: {
                    arrayList4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, TextModuleData.CREATOR);
                    break;
                }
                case 20: {
                    arrayList5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, UriData.CREATOR);
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
        return new CommonWalletObject(v1, s, s1, s2, s3, s4, s5, s6, s7, v2, arrayList0, timeInterval0, arrayList1, s8, s9, arrayList2, z, arrayList3, arrayList4, arrayList5);
    }

    public CommonWalletObject[] zzjD(int v) {
        return new CommonWalletObject[v];
    }
}

