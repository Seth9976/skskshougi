package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.List;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdo(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfj(x0);
    }

    static void zza(SessionStopResult sessionStopResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, sessionStopResult0.getVersionCode());
        zzb.zza(parcel0, 2, sessionStopResult0.getStatus(), v, false);
        zzb.zzc(parcel0, 3, sessionStopResult0.getSessions(), false);
        zzb.zzH(parcel0, v1);
    }

    public SessionStopResult zzdo(Parcel parcel0) {
        int v3;
        Status status1;
        List list0;
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Status status0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 2: {
                    v3 = v1;
                    list0 = arrayList0;
                    status1 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 3: {
                    list0 = zza.zzc(parcel0, v2, Session.CREATOR);
                    status1 = status0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    status1 = status0;
                    v3 = zza.zzg(parcel0, v2);
                    list0 = arrayList0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    list0 = arrayList0;
                    status1 = status0;
                    v3 = v1;
                }
            }
            v1 = v3;
            status0 = status1;
            arrayList0 = list0;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SessionStopResult(v1, status0, arrayList0);
    }

    public SessionStopResult[] zzfj(int v) {
        return new SessionStopResult[v];
    }
}

