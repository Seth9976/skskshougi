package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbC(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdr(x0);
    }

    static void zza(MetadataBundle metadataBundle0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, metadataBundle0.zzCY);
        zzb.zza(parcel0, 2, metadataBundle0.zzagI, false);
        zzb.zzH(parcel0, v1);
    }

    public MetadataBundle zzbC(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    bundle0 = zza.zzq(parcel0, v2);
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
        return new MetadataBundle(v1, bundle0);
    }

    public MetadataBundle[] zzdr(int v) {
        return new MetadataBundle[v];
    }
}

