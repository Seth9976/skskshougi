package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdn(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfi(x0);
    }

    static void zza(SessionReadResult sessionReadResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, sessionReadResult0.getSessions(), false);
        zzb.zzc(parcel0, 1000, sessionReadResult0.getVersionCode());
        zzb.zzc(parcel0, 2, sessionReadResult0.zzry(), false);
        zzb.zza(parcel0, 3, sessionReadResult0.getStatus(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public SessionReadResult zzdn(Parcel parcel0) {
        Status status0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList1 = zza.zzc(parcel0, v2, Session.CREATOR);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzc(parcel0, v2, SessionDataSet.CREATOR);
                    break;
                }
                case 3: {
                    status0 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
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
        return new SessionReadResult(v1, arrayList1, arrayList0, status0);
    }

    public SessionReadResult[] zzfi(int v) {
        return new SessionReadResult[v];
    }
}

