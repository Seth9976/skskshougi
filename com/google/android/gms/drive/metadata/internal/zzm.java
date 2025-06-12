package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbE(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdt(x0);
    }

    static void zza(PartialDriveId partialDriveId0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, partialDriveId0.zzCY);
        zzb.zza(parcel0, 2, partialDriveId0.zzadd, false);
        zzb.zza(parcel0, 3, partialDriveId0.zzade);
        zzb.zzc(parcel0, 4, partialDriveId0.zzadf);
        zzb.zzH(parcel0, v1);
    }

    public PartialDriveId zzbE(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        long v2 = 0L;
        int v3 = -1;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v4);
                    break;
                }
                case 4: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PartialDriveId(v1, s, v2, v3);
    }

    public PartialDriveId[] zzdt(int v) {
        return new PartialDriveId[v];
    }
}

