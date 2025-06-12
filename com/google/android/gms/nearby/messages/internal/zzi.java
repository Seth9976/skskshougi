package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Strategy;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfu(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzij(x0);
    }

    static void zza(PublishRequest publishRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, publishRequest0.zzCY);
        zzb.zza(parcel0, 2, publishRequest0.zzaGb, v, false);
        zzb.zza(parcel0, 3, publishRequest0.zzaGc, v, false);
        zzb.zza(parcel0, 4, publishRequest0.zzxa(), false);
        zzb.zza(parcel0, 5, publishRequest0.zzayp, false);
        zzb.zza(parcel0, 6, publishRequest0.zzaGe, false);
        zzb.zzH(parcel0, v1);
    }

    public PublishRequest zzfu(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        IBinder iBinder0 = null;
        Strategy strategy0 = null;
        MessageWrapper messageWrapper0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    messageWrapper0 = (MessageWrapper)zza.zza(parcel0, v2, MessageWrapper.CREATOR);
                    break;
                }
                case 3: {
                    strategy0 = (Strategy)zza.zza(parcel0, v2, Strategy.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v2);
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
        return new PublishRequest(v1, messageWrapper0, strategy0, iBinder0, s1, s);
    }

    public PublishRequest[] zzij(int v) {
        return new PublishRequest[v];
    }
}

