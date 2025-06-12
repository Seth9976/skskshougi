package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

public class zzu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcT(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeO(x0);
    }

    static void zza(SessionInsertRequest sessionInsertRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, sessionInsertRequest0.getSession(), v, false);
        zzb.zzc(parcel0, 1000, sessionInsertRequest0.getVersionCode());
        zzb.zzc(parcel0, 2, sessionInsertRequest0.getDataSets(), false);
        zzb.zzc(parcel0, 3, sessionInsertRequest0.getAggregateDataPoints(), false);
        zzb.zza(parcel0, 4, sessionInsertRequest0.zzqU(), false);
        zzb.zza(parcel0, 5, sessionInsertRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public SessionInsertRequest zzcT(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        Session session0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    session0 = (Session)zza.zza(parcel0, v2, Session.CREATOR);
                    break;
                }
                case 2: {
                    arrayList1 = zza.zzc(parcel0, v2, DataSet.CREATOR);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v2, DataPoint.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new SessionInsertRequest(v1, session0, arrayList1, arrayList0, iBinder0, s);
    }

    public SessionInsertRequest[] zzeO(int v) {
        return new SessionInsertRequest[v];
    }
}

