package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcY(x0);
    }

    static void zza(OnLoadRealtimeResponse onLoadRealtimeResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onLoadRealtimeResponse0.zzCY);
        zzb.zza(parcel0, 2, onLoadRealtimeResponse0.zzpb);
        zzb.zzH(parcel0, v1);
    }

    public OnLoadRealtimeResponse zzbj(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    z = zza.zzc(parcel0, v2);
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
        return new OnLoadRealtimeResponse(v1, z);
    }

    public OnLoadRealtimeResponse[] zzcY(int v) {
        return new OnLoadRealtimeResponse[v];
    }
}

