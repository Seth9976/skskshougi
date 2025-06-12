package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdl(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfg(x0);
    }

    static void zza(ListSubscriptionsResult listSubscriptionsResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, listSubscriptionsResult0.getSubscriptions(), false);
        zzb.zzc(parcel0, 1000, listSubscriptionsResult0.getVersionCode());
        zzb.zza(parcel0, 2, listSubscriptionsResult0.getStatus(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public ListSubscriptionsResult zzdl(Parcel parcel0) {
        Status status0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v2, Subscription.CREATOR);
                    break;
                }
                case 2: {
                    status0 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
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
        return new ListSubscriptionsResult(v1, arrayList0, status0);
    }

    public ListSubscriptionsResult[] zzfg(int v) {
        return new ListSubscriptionsResult[v];
    }
}

