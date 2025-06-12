package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzga(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjc(x0);
    }

    static void zza(Address address0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, address0.getVersionCode());
        zzb.zza(parcel0, 2, address0.name, false);
        zzb.zza(parcel0, 3, address0.zzawA, false);
        zzb.zza(parcel0, 4, address0.zzawB, false);
        zzb.zza(parcel0, 5, address0.zzawC, false);
        zzb.zza(parcel0, 6, address0.zzEr, false);
        zzb.zza(parcel0, 7, address0.zzaQd, false);
        zzb.zza(parcel0, 8, address0.zzaQe, false);
        zzb.zza(parcel0, 9, address0.zzawH, false);
        zzb.zza(parcel0, 10, address0.zzawJ, false);
        zzb.zza(parcel0, 11, address0.zzawK);
        zzb.zza(parcel0, 12, address0.zzawL, false);
        zzb.zzH(parcel0, v1);
    }

    public Address zzga(Parcel parcel0) {
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
        String s8 = null;
        boolean z = false;
        String s9 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 9: {
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 10: {
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 11: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2);
                    break;
                }
                case 12: {
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new Address(v1, s, s1, s2, s3, s4, s5, s6, s7, s8, z, s9);
    }

    public Address[] zzjc(int v) {
        return new Address[v];
    }
}

