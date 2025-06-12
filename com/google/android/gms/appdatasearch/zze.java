package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzu(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaf(x0);
    }

    static void zza(Feature feature0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, feature0.id);
        zzb.zzc(parcel0, 1000, feature0.zzCY);
        zzb.zza(parcel0, 2, feature0.zzNi, false);
        zzb.zzH(parcel0, v1);
    }

    public Feature[] zzaf(int v) {
        return new Feature[v];
    }

    public Feature zzu(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        Bundle bundle0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    bundle0 = zza.zzq(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel0, v3);
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
        return new Feature(v2, v, bundle0);
    }
}

