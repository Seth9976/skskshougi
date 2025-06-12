package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzck(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzec(x0);
    }

    static void zza(Bucket bucket0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, bucket0.zzkt());
        zzb.zzc(parcel0, 1000, bucket0.getVersionCode());
        zzb.zza(parcel0, 2, bucket0.zzqs());
        zzb.zza(parcel0, 3, bucket0.getSession(), v, false);
        zzb.zzc(parcel0, 4, bucket0.zzqq());
        zzb.zzc(parcel0, 5, bucket0.getDataSets(), false);
        zzb.zzc(parcel0, 6, bucket0.getBucketType());
        zzb.zza(parcel0, 7, bucket0.zzqr());
        zzb.zzH(parcel0, v1);
    }

    public Bucket zzck(Parcel parcel0) {
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
                    arrayList0 = zza.zzc(parcel0, v6, DataSet.CREATOR);
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
        return new Bucket(v5, v4, v, session0, v3, arrayList0, v2, z);
    }

    public Bucket[] zzec(int v) {
        return new Bucket[v];
    }
}

