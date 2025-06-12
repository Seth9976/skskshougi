package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhk(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzks(x0);
    }

    static void zza(OpenChannelResponse openChannelResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, openChannelResponse0.versionCode);
        zzb.zzc(parcel0, 2, openChannelResponse0.statusCode);
        zzb.zza(parcel0, 3, openChannelResponse0.zzaTP, v, false);
        zzb.zzH(parcel0, v1);
    }

    public OpenChannelResponse zzhk(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        ChannelImpl channelImpl0 = null;
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
                    channelImpl0 = (ChannelImpl)zza.zza(parcel0, v3, ChannelImpl.CREATOR);
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
        return new OpenChannelResponse(v2, v, channelImpl0);
    }

    public OpenChannelResponse[] zzks(int v) {
        return new OpenChannelResponse[v];
    }
}

