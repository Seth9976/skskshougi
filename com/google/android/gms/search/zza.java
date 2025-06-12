package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfX(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziN(x0);
    }

    static void zza(GoogleNowAuthState googleNowAuthState0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, googleNowAuthState0.getAuthCode(), false);
        zzb.zzc(parcel0, 1000, googleNowAuthState0.zzCY);
        zzb.zza(parcel0, 2, googleNowAuthState0.getAccessToken(), false);
        zzb.zza(parcel0, 3, googleNowAuthState0.getNextAllowedTimeMillis());
        zzb.zzH(parcel0, v1);
    }

    public GoogleNowAuthState zzfX(Parcel parcel0) {
        String s = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v3);
                    break;
                }
                case 1000: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
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
        return new GoogleNowAuthState(v1, s1, s, v2);
    }

    public GoogleNowAuthState[] zziN(int v) {
        return new GoogleNowAuthState[v];
    }
}

