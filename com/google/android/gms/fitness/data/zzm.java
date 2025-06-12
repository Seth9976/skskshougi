package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcs(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzel(x0);
    }

    static void zza(RawBucket rawBucket0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, rawBucket0.zzKT);
        zzb.zzc(parcel0, 1000, rawBucket0.zzCY);
        zzb.zza(parcel0, 2, rawBucket0.zzajH);
        zzb.zza(parcel0, 3, rawBucket0.zzajJ, v, false);
        zzb.zzc(parcel0, 4, rawBucket0.zzakG);
        zzb.zzc(parcel0, 5, rawBucket0.zzajS, false);
        zzb.zzc(parcel0, 6, rawBucket0.zzajT);
        zzb.zza(parcel0, 7, rawBucket0.zzajU);
        zzb.zzH(parcel0, v1);
    }

    public RawBucket zzcs(Parcel parcel0) {
        long v = 0L;
        ArrayList arrayList0 = null;
        boolean z = false;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        int v3 = 0;
        Session session0 = null;
        long v4 = 0L;
        int v5 = 0;
        while(parcel0.dataPosition() < v1) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    v4 = zza.zzi(parcel0, v6);
                    break;
                }
                case 2: {
                    v = zza.zzi(parcel0, v6);
                    break;
                }
                case 3: {
                    session0 = (Session)zza.zza(parcel0, v6, Session.CREATOR);
                    break;
                }
                case 4: {
                    v3 = zza.zzg(parcel0, v6);
                    break;
                }
                case 5: {
                    arrayList0 = zza.zzc(parcel0, v6, RawDataSet.CREATOR);
                    break;
                }
                case 6: {
                    v2 = zza.zzg(parcel0, v6);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v6);
                    break;
                }
                case 1000: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new RawBucket(v5, v4, v, session0, v3, arrayList0, v2, z);
    }

    public RawBucket[] zzel(int v) {
        return new RawBucket[v];
    }
}

