package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfH(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziw(x0);
    }

    static void zza(PlayLoggerContext playLoggerContext0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, playLoggerContext0.versionCode);
        zzb.zza(parcel0, 2, playLoggerContext0.packageName, false);
        zzb.zzc(parcel0, 3, playLoggerContext0.zzaGP);
        zzb.zzc(parcel0, 4, playLoggerContext0.zzaGQ);
        zzb.zza(parcel0, 5, playLoggerContext0.zzaGR, false);
        zzb.zza(parcel0, 6, playLoggerContext0.zzaGS, false);
        zzb.zza(parcel0, 7, playLoggerContext0.zzaGT);
        zzb.zza(parcel0, 8, playLoggerContext0.zzaGU, false);
        zzb.zza(parcel0, 9, playLoggerContext0.zzaGV);
        zzb.zzH(parcel0, v1);
    }

    public PlayLoggerContext zzfH(Parcel parcel0) {
        String s = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        boolean z1 = true;
        String s1 = null;
        String s2 = null;
        int v1 = 0;
        int v2 = 0;
        String s3 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 7: {
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 8: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PlayLoggerContext(v3, s3, v2, v1, s2, s1, z1, s, z);
    }

    public PlayLoggerContext[] zziw(int v) {
        return new PlayLoggerContext[v];
    }
}

