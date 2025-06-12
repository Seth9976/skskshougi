package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzag implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaS(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcH(x0);
    }

    static void zza(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getDriveIdFromUniqueIdentifierRequest0.zzCY);
        zzb.zza(parcel0, 2, getDriveIdFromUniqueIdentifierRequest0.zzafL, false);
        zzb.zza(parcel0, 3, getDriveIdFromUniqueIdentifierRequest0.zzafM);
        zzb.zzH(parcel0, v1);
    }

    public GetDriveIdFromUniqueIdentifierRequest zzaS(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        String s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v2);
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
        return new GetDriveIdFromUniqueIdentifierRequest(v1, s, z);
    }

    public GetDriveIdFromUniqueIdentifierRequest[] zzcH(int v) {
        return new GetDriveIdFromUniqueIdentifierRequest[v];
    }
}

