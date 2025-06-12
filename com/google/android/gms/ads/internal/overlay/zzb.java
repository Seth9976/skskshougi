package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzu(x0);
    }

    static void zza(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, adLauncherIntentInfoParcel0.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, adLauncherIntentInfoParcel0.zzze, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, adLauncherIntentInfoParcel0.zzzf, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, adLauncherIntentInfoParcel0.mimeType, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, adLauncherIntentInfoParcel0.packageName, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, adLauncherIntentInfoParcel0.zzzg, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, adLauncherIntentInfoParcel0.zzzh, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 8, adLauncherIntentInfoParcel0.zzzi, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AdLauncherIntentInfoParcel zzg(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s6 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s5 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    s4 = zza.zzo(parcel0, v2);
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
                default: {
                    zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AdLauncherIntentInfoParcel(v1, s6, s5, s4, s3, s2, s1, s);
    }

    public AdLauncherIntentInfoParcel[] zzu(int v) {
        return new AdLauncherIntentInfoParcel[v];
    }
}

