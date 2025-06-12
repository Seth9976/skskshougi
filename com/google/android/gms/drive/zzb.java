package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzao(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbT(x0);
    }

    static void zza(Contents contents0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, contents0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, contents0.zzYZ, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 3, contents0.zzacR);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 4, contents0.zzacS);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, contents0.zzacT, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, contents0.zzacU);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public Contents zzao(Parcel parcel0) {
        DriveId driveId0 = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)zza.zza(parcel0, v4, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 3: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 5: {
                    driveId0 = (DriveId)zza.zza(parcel0, v4, DriveId.CREATOR);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v4);
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
        return new Contents(v3, parcelFileDescriptor0, v2, v1, driveId0, z);
    }

    public Contents[] zzbT(int v) {
        return new Contents[v];
    }
}

