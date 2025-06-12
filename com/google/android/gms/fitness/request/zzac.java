package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;

public class zzac implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdb(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeW(x0);
    }

    static void zza(SubscribeRequest subscribeRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, subscribeRequest0.zzrr(), v, false);
        zzb.zzc(parcel0, 1000, subscribeRequest0.getVersionCode());
        zzb.zza(parcel0, 2, subscribeRequest0.zzrs());
        zzb.zza(parcel0, 3, subscribeRequest0.zzqU(), false);
        zzb.zza(parcel0, 4, subscribeRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public SubscribeRequest zzdb(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        IBinder iBinder0 = null;
        Subscription subscription0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    subscription0 = (Subscription)zza.zza(parcel0, v2, Subscription.CREATOR);
                    break;
                }
                case 2: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v2);
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
        return new SubscribeRequest(v1, subscription0, z, iBinder0, s);
    }

    public SubscribeRequest[] zzeW(int v) {
        return new SubscribeRequest[v];
    }
}

