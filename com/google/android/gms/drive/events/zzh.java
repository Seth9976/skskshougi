package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaz(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzci(x0);
    }

    static void zza(ProgressEvent progressEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, progressEvent0.zzCY);
        zzb.zza(parcel0, 2, progressEvent0.zzacT, v, false);
        zzb.zzc(parcel0, 3, progressEvent0.zzwS);
        zzb.zza(parcel0, 4, progressEvent0.zzaeg);
        zzb.zza(parcel0, 5, progressEvent0.zzaeh);
        zzb.zzc(parcel0, 6, progressEvent0.zzSq);
        zzb.zzH(parcel0, v1);
    }

    public ProgressEvent zzaz(Parcel parcel0) {
        long v = 0L;
        int v1 = 0;
        int v2 = zza.zzab(parcel0);
        DriveId driveId0 = null;
        long v3 = 0L;
        int v4 = 0;
        int v5 = 0;
        while(parcel0.dataPosition() < v2) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                case 2: {
                    driveId0 = (DriveId)zza.zza(parcel0, v6, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    v4 = zza.zzg(parcel0, v6);
                    break;
                }
                case 4: {
                    v3 = zza.zzi(parcel0, v6);
                    break;
                }
                case 5: {
                    v = zza.zzi(parcel0, v6);
                    break;
                }
                case 6: {
                    v1 = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v2, parcel0);
        }
        return new ProgressEvent(v5, driveId0, v4, v3, v, v1);
    }

    public ProgressEvent[] zzci(int v) {
        return new ProgressEvent[v];
    }
}

