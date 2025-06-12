package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbY(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdO(x0);
    }

    static void zza(ObjectChangedDetails objectChangedDetails0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, objectChangedDetails0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, objectChangedDetails0.zzaiA);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 3, objectChangedDetails0.zzaiB);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public ObjectChangedDetails zzbY(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ObjectChangedDetails(v3, v2, v);
    }

    public ObjectChangedDetails[] zzdO(int v) {
        return new ObjectChangedDetails[v];
    }
}

