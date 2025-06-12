package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzap implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhh(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkp(x0);
    }

    static void zza(GetLocalNodeResponse getLocalNodeResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getLocalNodeResponse0.versionCode);
        zzb.zzc(parcel0, 2, getLocalNodeResponse0.statusCode);
        zzb.zza(parcel0, 3, getLocalNodeResponse0.zzaUz, v, false);
        zzb.zzH(parcel0, v1);
    }

    public GetLocalNodeResponse zzhh(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        NodeParcelable nodeParcelable0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    nodeParcelable0 = (NodeParcelable)zza.zza(parcel0, v3, NodeParcelable.CREATOR);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GetLocalNodeResponse(v2, v, nodeParcelable0);
    }

    public GetLocalNodeResponse[] zzkp(int v) {
        return new GetLocalNodeResponse[v];
    }
}

