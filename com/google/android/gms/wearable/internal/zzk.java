package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgO(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjV(x0);
    }

    static void zza(ChannelEventParcelable channelEventParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, channelEventParcelable0.zzCY);
        zzb.zza(parcel0, 2, channelEventParcelable0.zzaTP, v, false);
        zzb.zzc(parcel0, 3, channelEventParcelable0.type);
        zzb.zzc(parcel0, 4, channelEventParcelable0.zzaTN);
        zzb.zzc(parcel0, 5, channelEventParcelable0.zzaTO);
        zzb.zzH(parcel0, v1);
    }

    public ChannelEventParcelable zzgO(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        ChannelImpl channelImpl0 = null;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(parcel0.dataPosition() < v1) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    channelImpl0 = (ChannelImpl)zza.zza(parcel0, v5, ChannelImpl.CREATOR);
                    break;
                }
                case 3: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v5);
                    break;
                }
                case 5: {
                    v = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ChannelEventParcelable(v4, channelImpl0, v3, v2, v);
    }

    public ChannelEventParcelable[] zzjV(int v) {
        return new ChannelEventParcelable[v];
    }
}

