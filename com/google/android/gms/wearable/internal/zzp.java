package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjZ(x0);
    }

    static void zza(ChannelSendFileResponse channelSendFileResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, channelSendFileResponse0.versionCode);
        zzb.zzc(parcel0, 2, channelSendFileResponse0.statusCode);
        zzb.zzH(parcel0, v1);
    }

    public ChannelSendFileResponse zzgR(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
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
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ChannelSendFileResponse(v2, v);
    }

    public ChannelSendFileResponse[] zzjZ(int v) {
        return new ChannelSendFileResponse[v];
    }
}

