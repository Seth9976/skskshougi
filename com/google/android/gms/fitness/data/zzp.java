package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcv(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzep(x0);
    }

    static void zza(Session session0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, session0.zzkt());
        zzb.zzc(parcel0, 1000, session0.getVersionCode());
        zzb.zza(parcel0, 2, session0.zzqs());
        zzb.zza(parcel0, 3, session0.getName(), false);
        zzb.zza(parcel0, 4, session0.getIdentifier(), false);
        zzb.zza(parcel0, 5, session0.getDescription(), false);
        zzb.zzc(parcel0, 7, session0.zzqq());
        zzb.zza(parcel0, 8, session0.zzqB(), v, false);
        zzb.zza(parcel0, 9, session0.zzqJ(), false);
        zzb.zzH(parcel0, v1);
    }

    public Session zzcv(Parcel parcel0) {
        long v = 0L;
        int v1 = 0;
        Long long0 = null;
        int v2 = zza.zzab(parcel0);
        Application application0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        long v3 = 0L;
        int v4 = 0;
        while(parcel0.dataPosition() < v2) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v3 = zza.zzi(parcel0, v5);
                    break;
                }
                case 2: {
                    v = zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    s2 = zza.zzo(parcel0, v5);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 7: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                case 8: {
                    application0 = (Application)zza.zza(parcel0, v5, Application.CREATOR);
                    break;
                }
                case 9: {
                    long0 = zza.zzj(parcel0, v5);
                    break;
                }
                case 1000: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel0);
        }
        return new Session(v4, v3, v, s2, s1, s, v1, application0, long0);
    }

    public Session[] zzep(int v) {
        return new Session[v];
    }
}

