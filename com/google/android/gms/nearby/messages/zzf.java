package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfr(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzig(x0);
    }

    static void zza(Strategy strategy0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, strategy0.zzaFT);
        zzb.zzc(parcel0, 1000, strategy0.versionCode);
        zzb.zzc(parcel0, 2, strategy0.zzaFU);
        zzb.zzc(parcel0, 3, strategy0.zzaFV);
        zzb.zza(parcel0, 4, strategy0.zzaFW);
        zzb.zzc(parcel0, 5, strategy0.zzaFX);
        zzb.zzc(parcel0, 6, strategy0.zzaFY);
        zzb.zzH(parcel0, v1);
    }

    public Strategy zzfr(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(parcel0.dataPosition() < v1) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    v5 = zza.zzg(parcel0, v7);
                    break;
                }
                case 2: {
                    v4 = zza.zzg(parcel0, v7);
                    break;
                }
                case 3: {
                    v3 = zza.zzg(parcel0, v7);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v7);
                    break;
                }
                case 5: {
                    v2 = zza.zzg(parcel0, v7);
                    break;
                }
                case 6: {
                    v = zza.zzg(parcel0, v7);
                    break;
                }
                case 1000: {
                    v6 = zza.zzg(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new Strategy(v6, v5, v4, v3, z, v2, v);
    }

    public Strategy[] zzig(int v) {
        return new Strategy[v];
    }
}

