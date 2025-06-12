package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfo(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhW(x0);
    }

    static void zza(AppMetadata appMetadata0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, appMetadata0.getAppIdentifiers(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, appMetadata0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AppMetadata zzfo(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v2, AppIdentifier.CREATOR);
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
        return new AppMetadata(v1, arrayList0);
    }

    public AppMetadata[] zzhW(int v) {
        return new AppMetadata[v];
    }
}

