package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgB(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjG(x0);
    }

    static void zza(LoyaltyPointsBalance loyaltyPointsBalance0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, loyaltyPointsBalance0.getVersionCode());
        zzb.zzc(parcel0, 2, loyaltyPointsBalance0.zzaSB);
        zzb.zza(parcel0, 3, loyaltyPointsBalance0.zzaSC, false);
        zzb.zza(parcel0, 4, loyaltyPointsBalance0.zzaSD);
        zzb.zza(parcel0, 5, loyaltyPointsBalance0.zzaQD, false);
        zzb.zza(parcel0, 6, loyaltyPointsBalance0.zzaSE);
        zzb.zzc(parcel0, 7, loyaltyPointsBalance0.zzaSF);
        zzb.zzH(parcel0, v1);
    }

    public LoyaltyPointsBalance zzgB(Parcel parcel0) {
        String s = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        double f = 0.0;
        long v2 = 0L;
        int v3 = -1;
        String s1 = null;
        int v4 = 0;
        while(parcel0.dataPosition() < v1) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v5);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 4: {
                    f = zza.zzm(parcel0, v5);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 6: {
                    v2 = zza.zzi(parcel0, v5);
                    break;
                }
                case 7: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new LoyaltyPointsBalance(v4, v, s1, f, s, v2, v3);
    }

    public LoyaltyPointsBalance[] zzjG(int v) {
        return new LoyaltyPointsBalance[v];
    }
}

