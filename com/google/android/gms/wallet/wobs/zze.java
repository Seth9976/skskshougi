package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgC(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjH(x0);
    }

    static void zza(LoyaltyPoints loyaltyPoints0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, loyaltyPoints0.getVersionCode());
        zzb.zza(parcel0, 2, loyaltyPoints0.label, false);
        zzb.zza(parcel0, 3, loyaltyPoints0.zzaSA, v, false);
        zzb.zza(parcel0, 4, loyaltyPoints0.type, false);
        zzb.zza(parcel0, 5, loyaltyPoints0.zzaQV, v, false);
        zzb.zzH(parcel0, v1);
    }

    public LoyaltyPoints zzgC(Parcel parcel0) {
        TimeInterval timeInterval0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        LoyaltyPointsBalance loyaltyPointsBalance0 = null;
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
                    loyaltyPointsBalance0 = (LoyaltyPointsBalance)zza.zza(parcel0, v2, LoyaltyPointsBalance.CREATOR);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    timeInterval0 = (TimeInterval)zza.zza(parcel0, v2, TimeInterval.CREATOR);
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
        return new LoyaltyPoints(v1, s1, loyaltyPointsBalance0, s, timeInterval0);
    }

    public LoyaltyPoints[] zzjH(int v) {
        return new LoyaltyPoints[v];
    }
}

