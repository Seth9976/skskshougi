package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziv(x0);
    }

    static void zza(LogEvent logEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, logEvent0.versionCode);
        zzb.zza(parcel0, 2, logEvent0.zzaGF);
        zzb.zza(parcel0, 3, logEvent0.tag, false);
        zzb.zza(parcel0, 4, logEvent0.zzaGG, false);
        zzb.zza(parcel0, 5, logEvent0.zzaGH, false);
        zzb.zzH(parcel0, v1);
    }

    public LogEvent zzfG(Parcel parcel0) {
        Bundle bundle0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        byte[] arr_b = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = zza.zzi(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = zza.zzr(parcel0, v3);
                    break;
                }
                case 5: {
                    bundle0 = zza.zzq(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new LogEvent(v1, v2, s, arr_b, bundle0);
    }

    public LogEvent[] zziv(int v) {
        return new LogEvent[v];
    }
}

