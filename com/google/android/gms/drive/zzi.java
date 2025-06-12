package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzat(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcc(x0);
    }

    static void zza(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, realtimeDocumentSyncRequest0.zzCY);
        zzb.zzb(parcel0, 2, realtimeDocumentSyncRequest0.zzadF, false);
        zzb.zzb(parcel0, 3, realtimeDocumentSyncRequest0.zzadG, false);
        zzb.zzH(parcel0, v1);
    }

    public RealtimeDocumentSyncRequest zzat(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList1 = zza.zzC(parcel0, v2);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzC(parcel0, v2);
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
        return new RealtimeDocumentSyncRequest(v1, arrayList1, arrayList0);
    }

    public RealtimeDocumentSyncRequest[] zzcc(int v) {
        return new RealtimeDocumentSyncRequest[v];
    }
}

