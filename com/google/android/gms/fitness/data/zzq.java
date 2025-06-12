package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcw(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeq(x0);
    }

    static void zza(SessionDataSet sessionDataSet0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, sessionDataSet0.getSession(), v, false);
        zzb.zzc(parcel0, 1000, sessionDataSet0.zzCY);
        zzb.zza(parcel0, 2, sessionDataSet0.zzqK(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public SessionDataSet zzcw(Parcel parcel0) {
        int v3;
        Session session1;
        DataSet dataSet1;
        DataSet dataSet0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Session session0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    dataSet1 = dataSet0;
                    session1 = (Session)zza.zza(parcel0, v2, Session.CREATOR);
                    break;
                }
                case 2: {
                    dataSet1 = (DataSet)zza.zza(parcel0, v2, DataSet.CREATOR);
                    session1 = session0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    session1 = session0;
                    v3 = zza.zzg(parcel0, v2);
                    dataSet1 = dataSet0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    dataSet1 = dataSet0;
                    session1 = session0;
                    v3 = v1;
                }
            }
            v1 = v3;
            session0 = session1;
            dataSet0 = dataSet1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SessionDataSet(v1, session0, dataSet0);
    }

    public SessionDataSet[] zzeq(int v) {
        return new SessionDataSet[v];
    }
}

