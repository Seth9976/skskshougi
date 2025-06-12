package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Message;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzft(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzii(x0);
    }

    static void zza(MessageWrapper messageWrapper0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, messageWrapper0.zzaFZ, v, false);
        zzb.zzc(parcel0, 1000, messageWrapper0.versionCode);
        zzb.zzH(parcel0, v1);
    }

    public MessageWrapper zzft(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Message message0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    message0 = (Message)zza.zza(parcel0, v2, Message.CREATOR);
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
        return new MessageWrapper(v1, message0);
    }

    public MessageWrapper[] zzii(int v) {
        return new MessageWrapper[v];
    }
}

