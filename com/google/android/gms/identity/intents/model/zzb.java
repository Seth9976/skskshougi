package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzea(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgm(x0);
    }

    static void zza(UserAddress userAddress0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, userAddress0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, userAddress0.name, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, userAddress0.zzawA, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, userAddress0.zzawB, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, userAddress0.zzawC, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, userAddress0.zzawD, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, userAddress0.zzawE, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 8, userAddress0.zzawF, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 9, userAddress0.zzawG, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 10, userAddress0.zzEr, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 11, userAddress0.zzawH, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 12, userAddress0.zzawI, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 13, userAddress0.zzawJ, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 14, userAddress0.zzawK);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 15, userAddress0.zzawL, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 16, userAddress0.zzawM, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public UserAddress zzea(Parcel parcel0) {
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
        String s10 = null;
        String s11 = null;
        boolean z = false;
        String s12 = null;
        String s13 = null;
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
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    s4 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s5 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    s6 = zza.zzo(parcel0, v2);
                    break;
                }
                case 9: {
                    s7 = zza.zzo(parcel0, v2);
                    break;
                }
                case 10: {
                    s8 = zza.zzo(parcel0, v2);
                    break;
                }
                case 11: {
                    s9 = zza.zzo(parcel0, v2);
                    break;
                }
                case 12: {
                    s10 = zza.zzo(parcel0, v2);
                    break;
                }
                case 13: {
                    s11 = zza.zzo(parcel0, v2);
                    break;
                }
                case 14: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 15: {
                    s12 = zza.zzo(parcel0, v2);
                    break;
                }
                case 16: {
                    s13 = zza.zzo(parcel0, v2);
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
        return new UserAddress(v1, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, z, s12, s13);
    }

    public UserAddress[] zzgm(int v) {
        return new UserAddress[v];
    }
}

