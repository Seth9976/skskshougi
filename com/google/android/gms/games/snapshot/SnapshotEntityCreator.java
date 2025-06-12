package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class SnapshotEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdS(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgc(x0);
    }

    static void zza(SnapshotEntity snapshotEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, snapshotEntity0.getMetadata(), v, false);
        zzb.zzc(parcel0, 1000, snapshotEntity0.getVersionCode());
        zzb.zza(parcel0, 3, snapshotEntity0.getSnapshotContents(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public SnapshotEntity zzdS(Parcel parcel0) {
        int v3;
        SnapshotMetadataEntity snapshotMetadataEntity1;
        SnapshotContentsEntity snapshotContentsEntity1;
        SnapshotContentsEntity snapshotContentsEntity0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        SnapshotMetadataEntity snapshotMetadataEntity0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    snapshotContentsEntity1 = snapshotContentsEntity0;
                    snapshotMetadataEntity1 = (SnapshotMetadataEntity)zza.zza(parcel0, v2, SnapshotMetadataEntity.CREATOR);
                    break;
                }
                case 3: {
                    snapshotContentsEntity1 = (SnapshotContentsEntity)zza.zza(parcel0, v2, SnapshotContentsEntity.CREATOR);
                    snapshotMetadataEntity1 = snapshotMetadataEntity0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    snapshotMetadataEntity1 = snapshotMetadataEntity0;
                    v3 = zza.zzg(parcel0, v2);
                    snapshotContentsEntity1 = snapshotContentsEntity0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    snapshotContentsEntity1 = snapshotContentsEntity0;
                    snapshotMetadataEntity1 = snapshotMetadataEntity0;
                    v3 = v1;
                }
            }
            v1 = v3;
            snapshotMetadataEntity0 = snapshotMetadataEntity1;
            snapshotContentsEntity0 = snapshotContentsEntity1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SnapshotEntity(v1, snapshotMetadataEntity0, snapshotContentsEntity0);
    }

    public SnapshotEntity[] zzgc(int v) {
        return new SnapshotEntity[v];
    }
}

