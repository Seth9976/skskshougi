package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzk(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzD(x0);
    }

    public AdResponseParcel[] zzD(int v) {
        return new AdResponseParcel[v];
    }

    static void zza(AdResponseParcel adResponseParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, adResponseParcel0.versionCode);
        zzb.zza(parcel0, 2, adResponseParcel0.zzzG, false);
        zzb.zza(parcel0, 3, adResponseParcel0.zzCI, false);
        zzb.zzb(parcel0, 4, adResponseParcel0.zzxF, false);
        zzb.zzc(parcel0, 5, adResponseParcel0.errorCode);
        zzb.zzb(parcel0, 6, adResponseParcel0.zzxG, false);
        zzb.zza(parcel0, 7, adResponseParcel0.zzCJ);
        zzb.zza(parcel0, 8, adResponseParcel0.zzCK);
        zzb.zza(parcel0, 9, adResponseParcel0.zzCL);
        zzb.zzb(parcel0, 10, adResponseParcel0.zzCM, false);
        zzb.zza(parcel0, 11, adResponseParcel0.zzxJ);
        zzb.zzc(parcel0, 12, adResponseParcel0.orientation);
        zzb.zza(parcel0, 13, adResponseParcel0.zzCN, false);
        zzb.zza(parcel0, 14, adResponseParcel0.zzCO);
        zzb.zza(parcel0, 15, adResponseParcel0.zzCP, false);
        zzb.zza(parcel0, 19, adResponseParcel0.zzCR, false);
        zzb.zza(parcel0, 18, adResponseParcel0.zzCQ);
        zzb.zza(parcel0, 21, adResponseParcel0.zzCS, false);
        zzb.zza(parcel0, 23, adResponseParcel0.zzsp);
        zzb.zza(parcel0, 22, adResponseParcel0.zzCT);
        zzb.zza(parcel0, 25, adResponseParcel0.zzCU);
        zzb.zza(parcel0, 24, adResponseParcel0.zzCu);
        zzb.zzc(parcel0, 27, adResponseParcel0.zzCW);
        zzb.zza(parcel0, 26, adResponseParcel0.zzCV);
        zzb.zza(parcel0, 28, adResponseParcel0.zzCX, v, false);
        zzb.zzH(parcel0, v1);
    }

    public AdResponseParcel zzk(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        ArrayList arrayList0 = null;
        int v2 = 0;
        ArrayList arrayList1 = null;
        long v3 = 0L;
        boolean z = false;
        long v4 = 0L;
        ArrayList arrayList2 = null;
        long v5 = 0L;
        int v6 = 0;
        String s2 = null;
        long v7 = 0L;
        String s3 = null;
        boolean z1 = false;
        String s4 = null;
        String s5 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int v8 = 0;
        LargeParcelTeleporter largeParcelTeleporter0 = null;
        while(parcel0.dataPosition() < v) {
            int v9 = zza.zzaa(parcel0);
            switch(0xFFFF & v9) {
                case 1: {
                    v1 = zza.zzg(parcel0, v9);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v9);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v9);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzC(parcel0, v9);
                    break;
                }
                case 5: {
                    v2 = zza.zzg(parcel0, v9);
                    break;
                }
                case 6: {
                    arrayList1 = zza.zzC(parcel0, v9);
                    break;
                }
                case 7: {
                    v3 = zza.zzi(parcel0, v9);
                    break;
                }
                case 8: {
                    z = zza.zzc(parcel0, v9);
                    break;
                }
                case 9: {
                    v4 = zza.zzi(parcel0, v9);
                    break;
                }
                case 10: {
                    arrayList2 = zza.zzC(parcel0, v9);
                    break;
                }
                case 11: {
                    v5 = zza.zzi(parcel0, v9);
                    break;
                }
                case 12: {
                    v6 = zza.zzg(parcel0, v9);
                    break;
                }
                case 13: {
                    s2 = zza.zzo(parcel0, v9);
                    break;
                }
                case 14: {
                    v7 = zza.zzi(parcel0, v9);
                    break;
                }
                case 15: {
                    s3 = zza.zzo(parcel0, v9);
                    break;
                }
                case 18: {
                    z1 = zza.zzc(parcel0, v9);
                    break;
                }
                case 19: {
                    s4 = zza.zzo(parcel0, v9);
                    break;
                }
                case 21: {
                    s5 = zza.zzo(parcel0, v9);
                    break;
                }
                case 22: {
                    z2 = zza.zzc(parcel0, v9);
                    break;
                }
                case 23: {
                    z3 = zza.zzc(parcel0, v9);
                    break;
                }
                case 24: {
                    z4 = zza.zzc(parcel0, v9);
                    break;
                }
                case 25: {
                    z5 = zza.zzc(parcel0, v9);
                    break;
                }
                case 26: {
                    z6 = zza.zzc(parcel0, v9);
                    break;
                }
                case 27: {
                    v8 = zza.zzg(parcel0, v9);
                    break;
                }
                case 28: {
                    largeParcelTeleporter0 = (LargeParcelTeleporter)zza.zza(parcel0, v9, LargeParcelTeleporter.CREATOR);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v9);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AdResponseParcel(v1, s, s1, arrayList0, v2, arrayList1, v3, z, v4, arrayList2, v5, v6, s2, v7, s3, z1, s4, s5, z2, z3, z4, z5, z6, v8, largeParcelTeleporter0);
    }
}

