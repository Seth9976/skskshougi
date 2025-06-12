package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzz(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzap(x0);
    }

    static void zza(AccountChangeEvent accountChangeEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, accountChangeEvent0.mVersion);
        zzb.zza(parcel0, 2, accountChangeEvent0.zzOw);
        zzb.zza(parcel0, 3, accountChangeEvent0.zzOx, false);
        zzb.zzc(parcel0, 4, accountChangeEvent0.zzOy);
        zzb.zzc(parcel0, 5, accountChangeEvent0.zzOz);
        zzb.zza(parcel0, 6, accountChangeEvent0.zzOA, false);
        zzb.zzH(parcel0, v1);
    }

    public AccountChangeEvent[] zzap(int v) {
        return new AccountChangeEvent[v];
    }

    public AccountChangeEvent zzz(Parcel parcel0) {
        String s = null;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        long v2 = 0L;
        int v3 = 0;
        String s1 = null;
        int v4 = 0;
        while(parcel0.dataPosition() < v1) {
            int v5 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v5);
                    break;
                }
                case 4: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 5: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 6: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v5);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new AccountChangeEvent(v4, v2, s1, v3, v, s);
    }
}

