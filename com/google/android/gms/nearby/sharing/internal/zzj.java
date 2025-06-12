package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfE(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzit(x0);
    }

    static void zza(StopProvidingContentRequest stopProvidingContentRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, stopProvidingContentRequest0.versionCode);
        zzb.zza(parcel0, 2, stopProvidingContentRequest0.zzaGs);
        zzb.zza(parcel0, 3, stopProvidingContentRequest0.zzxa(), false);
        zzb.zzH(parcel0, v1);
    }

    public StopProvidingContentRequest zzfE(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = zza.zzi(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new StopProvidingContentRequest(v1, v2, iBinder0);
    }

    public StopProvidingContentRequest[] zzit(int v) {
        return new StopProvidingContentRequest[v];
    }
}

