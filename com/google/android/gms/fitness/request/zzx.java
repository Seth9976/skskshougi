package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;

public class zzx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcW(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeR(x0);
    }

    static void zza(SessionStartRequest sessionStartRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, sessionStartRequest0.getSession(), v, false);
        zzb.zzc(parcel0, 1000, sessionStartRequest0.getVersionCode());
        zzb.zza(parcel0, 2, sessionStartRequest0.zzqU(), false);
        zzb.zza(parcel0, 3, sessionStartRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public SessionStartRequest zzcW(Parcel parcel0) {
        int v3;
        Session session1;
        IBinder iBinder1;
        String s1;
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        Session session0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    session1 = (Session)zza.zza(parcel0, v2, Session.CREATOR);
                    s1 = s;
                    iBinder1 = iBinder0;
                    break;
                }
                case 2: {
                    session1 = session0;
                    v3 = v1;
                    iBinder1 = zza.zzp(parcel0, v2);
                    s1 = s;
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    iBinder1 = iBinder0;
                    session1 = session0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    iBinder1 = iBinder0;
                    session1 = session0;
                    v3 = zza.zzg(parcel0, v2);
                    s1 = s;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    s1 = s;
                    iBinder1 = iBinder0;
                    session1 = session0;
                    v3 = v1;
                }
            }
            v1 = v3;
            session0 = session1;
            iBinder0 = iBinder1;
            s = s1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SessionStartRequest(v1, session0, iBinder0, s);
    }

    public SessionStartRequest[] zzeR(int v) {
        return new SessionStartRequest[v];
    }
}

