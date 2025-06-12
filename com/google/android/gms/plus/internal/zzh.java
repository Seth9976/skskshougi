package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfJ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziz(x0);
    }

    static void zza(PlusSession plusSession0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, plusSession0.getAccountName(), false);
        zzb.zzc(parcel0, 1000, plusSession0.getVersionCode());
        zzb.zza(parcel0, 2, plusSession0.zzxx(), false);
        zzb.zza(parcel0, 3, plusSession0.zzxy(), false);
        zzb.zza(parcel0, 4, plusSession0.zzxz(), false);
        zzb.zza(parcel0, 5, plusSession0.zzxA(), false);
        zzb.zza(parcel0, 6, plusSession0.zzxB(), false);
        zzb.zza(parcel0, 7, plusSession0.zzlB(), false);
        zzb.zza(parcel0, 8, plusSession0.zzxC(), false);
        zzb.zza(parcel0, 9, plusSession0.zzxD(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public PlusSession zzfJ(Parcel parcel0) {
        PlusCommonExtras plusCommonExtras0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String[] arr_s = null;
        String[] arr_s1 = null;
        String[] arr_s2 = null;
        String s4 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s4 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_s2 = zza.zzA(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_s1 = zza.zzA(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_s = zza.zzA(parcel0, v2);
                    break;
                }
                case 5: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 9: {
                    plusCommonExtras0 = (PlusCommonExtras)zza.zza(parcel0, v2, PlusCommonExtras.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new PlusSession(v1, s4, arr_s2, arr_s1, arr_s, s3, s2, s1, s, plusCommonExtras0);
    }

    public PlusSession[] zziz(int v) {
        return new PlusSession[v];
    }
}

