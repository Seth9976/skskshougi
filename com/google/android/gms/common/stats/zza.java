package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzam(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbM(x0);
    }

    static void zza(ConnectionEvent connectionEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, connectionEvent0.zzCY);
        zzb.zza(parcel0, 2, connectionEvent0.getTimeMillis());
        zzb.zza(parcel0, 4, connectionEvent0.zzoG(), false);
        zzb.zza(parcel0, 5, connectionEvent0.zzoH(), false);
        zzb.zza(parcel0, 6, connectionEvent0.zzoI(), false);
        zzb.zza(parcel0, 7, connectionEvent0.zzoJ(), false);
        zzb.zza(parcel0, 8, connectionEvent0.zzoK(), false);
        zzb.zza(parcel0, 10, connectionEvent0.zzoN());
        zzb.zza(parcel0, 11, connectionEvent0.zzoM());
        zzb.zzc(parcel0, 12, connectionEvent0.getEventType());
        zzb.zza(parcel0, 13, connectionEvent0.zzoL(), false);
        zzb.zzH(parcel0, v1);
    }

    public ConnectionEvent zzam(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        int v3 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        long v4 = 0L;
        long v5 = 0L;
        while(parcel0.dataPosition() < v) {
            int v6 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v6);
                    break;
                }
                case 2: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v6);
                    break;
                }
                case 4: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v6);
                    break;
                }
                case 5: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v6);
                    break;
                }
                case 6: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v6);
                    break;
                }
                case 7: {
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v6);
                    break;
                }
                case 8: {
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v6);
                    break;
                }
                case 10: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v6);
                    break;
                }
                case 11: {
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v6);
                    break;
                }
                case 12: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v6);
                    break;
                }
                case 13: {
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v6);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ConnectionEvent(v1, v2, v3, s, s1, s2, s3, s4, s5, v4, v5);
    }

    public ConnectionEvent[] zzbM(int v) {
        return new ConnectionEvent[v];
    }
}

