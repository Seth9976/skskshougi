package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbg(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcV(x0);
    }

    static void zza(OnListEntriesResponse onListEntriesResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onListEntriesResponse0.zzCY);
        zzb.zza(parcel0, 2, onListEntriesResponse0.zzagp, v, false);
        zzb.zza(parcel0, 3, onListEntriesResponse0.zzaeL);
        zzb.zzH(parcel0, v1);
    }

    public OnListEntriesResponse zzbg(Parcel parcel0) {
        int v3;
        DataHolder dataHolder1;
        boolean z1;
        boolean z = false;
        int v = zza.zzab(parcel0);
        DataHolder dataHolder0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    dataHolder1 = dataHolder0;
                    v3 = zza.zzg(parcel0, v2);
                    z1 = z;
                    break;
                }
                case 2: {
                    v3 = v1;
                    z1 = z;
                    dataHolder1 = (DataHolder)zza.zza(parcel0, v2, DataHolder.CREATOR);
                    break;
                }
                case 3: {
                    z1 = zza.zzc(parcel0, v2);
                    dataHolder1 = dataHolder0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    z1 = z;
                    dataHolder1 = dataHolder0;
                    v3 = v1;
                }
            }
            v1 = v3;
            dataHolder0 = dataHolder1;
            z = z1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new OnListEntriesResponse(v1, dataHolder0, z);
    }

    public OnListEntriesResponse[] zzcV(int v) {
        return new OnListEntriesResponse[v];
    }
}

