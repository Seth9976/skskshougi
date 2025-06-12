package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzap(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbU(x0);
    }

    static void zza(DriveId driveId0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, driveId0.zzCY);
        zzb.zza(parcel0, 2, driveId0.zzadd, false);
        zzb.zza(parcel0, 3, driveId0.zzade);
        zzb.zza(parcel0, 4, driveId0.zzacO);
        zzb.zzc(parcel0, 5, driveId0.zzadf);
        zzb.zzH(parcel0, v1);
    }

    public DriveId zzap(Parcel parcel0) {
        long v = 0L;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        String s = null;
        int v3 = -1;
        long v4 = 0L;
        while(parcel0.dataPosition() < v1) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v2 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 3: {
                    v4 = zza.zzi(parcel0, v5);
                    break;
                }
                case 4: {
                    v = zza.zzi(parcel0, v5);
                    break;
                }
                case 5: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new DriveId(v2, s, v4, v, v3);
    }

    public DriveId[] zzbU(int v) {
        return new DriveId[v];
    }
}

