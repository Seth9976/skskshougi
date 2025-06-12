package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaI(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcs(x0);
    }

    static void zza(CreateContentsRequest createContentsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, createContentsRequest0.zzCY);
        zzb.zzc(parcel0, 2, createContentsRequest0.zzacS);
        zzb.zzH(parcel0, v1);
    }

    public CreateContentsRequest zzaI(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0x20000000;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new CreateContentsRequest(v1, v2);
    }

    public CreateContentsRequest[] zzcs(int v) {
        return new CreateContentsRequest[v];
    }
}

