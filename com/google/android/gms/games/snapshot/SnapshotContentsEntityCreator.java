package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class SnapshotContentsEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgb(x0);
    }

    static void zza(SnapshotContentsEntity snapshotContentsEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, snapshotContentsEntity0.zzpe(), v, false);
        zzb.zzc(parcel0, 1000, snapshotContentsEntity0.getVersionCode());
        zzb.zzH(parcel0, v1);
    }

    public SnapshotContentsEntity zzdR(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Contents contents0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    contents0 = (Contents)zza.zza(parcel0, v2, Contents.CREATOR);
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
        return new SnapshotContentsEntity(v1, contents0);
    }

    public SnapshotContentsEntity[] zzgb(int v) {
        return new SnapshotContentsEntity[v];
    }
}

