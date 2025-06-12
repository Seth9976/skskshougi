package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfw(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzil(x0);
    }

    static void zza(UnpublishRequest unpublishRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, unpublishRequest0.zzCY);
        zzb.zza(parcel0, 2, unpublishRequest0.zzaGb, v, false);
        zzb.zza(parcel0, 3, unpublishRequest0.zzxa(), false);
        zzb.zza(parcel0, 4, unpublishRequest0.zzayp, false);
        zzb.zza(parcel0, 5, unpublishRequest0.zzaGe, false);
        zzb.zzH(parcel0, v1);
    }

    public UnpublishRequest zzfw(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        IBinder iBinder0 = null;
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
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
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
        return new UnpublishRequest(v1, messageWrapper0, iBinder0, s1, s);
    }

    public UnpublishRequest[] zzil(int v) {
        return new UnpublishRequest[v];
    }
}

