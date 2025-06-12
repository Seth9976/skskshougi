package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

public class SnapshotMetadataEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdU(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzge(x0);
    }

    static void zza(SnapshotMetadataEntity snapshotMetadataEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, snapshotMetadataEntity0.getGame(), v, false);
        zzb.zzc(parcel0, 1000, snapshotMetadataEntity0.getVersionCode());
        zzb.zza(parcel0, 2, snapshotMetadataEntity0.getOwner(), v, false);
        zzb.zza(parcel0, 3, snapshotMetadataEntity0.getSnapshotId(), false);
        zzb.zza(parcel0, 5, snapshotMetadataEntity0.getCoverImageUri(), v, false);
        zzb.zza(parcel0, 6, snapshotMetadataEntity0.getCoverImageUrl(), false);
        zzb.zza(parcel0, 7, snapshotMetadataEntity0.getTitle(), false);
        zzb.zza(parcel0, 8, snapshotMetadataEntity0.getDescription(), false);
        zzb.zza(parcel0, 9, snapshotMetadataEntity0.getLastModifiedTimestamp());
        zzb.zza(parcel0, 10, snapshotMetadataEntity0.getPlayedTime());
        zzb.zza(parcel0, 11, snapshotMetadataEntity0.getCoverImageAspectRatio());
        zzb.zza(parcel0, 12, snapshotMetadataEntity0.getUniqueName(), false);
        zzb.zza(parcel0, 13, snapshotMetadataEntity0.hasChangePending());
        zzb.zza(parcel0, 14, snapshotMetadataEntity0.getProgressValue());
        zzb.zzH(parcel0, v1);
    }

    public SnapshotMetadataEntity zzdU(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        GameEntity gameEntity0 = null;
        PlayerEntity playerEntity0 = null;
        String s = null;
        Uri uri0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        long v2 = 0L;
        long v3 = 0L;
        float f = 0.0f;
        String s4 = null;
        boolean z = false;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    gameEntity0 = (GameEntity)zza.zza(parcel0, v5, GameEntity.CREATOR);
                    break;
                }
                case 2: {
                    playerEntity0 = (PlayerEntity)zza.zza(parcel0, v5, PlayerEntity.CREATOR);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 5: {
                    uri0 = (Uri)zza.zza(parcel0, v5, Uri.CREATOR);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 7: {
                    s2 = zza.zzo(parcel0, v5);
                    break;
                }
                case 8: {
                    s3 = zza.zzo(parcel0, v5);
                    break;
                }
                case 9: {
                    v2 = zza.zzi(parcel0, v5);
                    break;
                }
                case 10: {
                    v3 = zza.zzi(parcel0, v5);
                    break;
                }
                case 11: {
                    f = zza.zzl(parcel0, v5);
                    break;
                }
                case 12: {
                    s4 = zza.zzo(parcel0, v5);
                    break;
                }
                case 13: {
                    z = zza.zzc(parcel0, v5);
                    break;
                }
                case 14: {
                    v4 = zza.zzi(parcel0, v5);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SnapshotMetadataEntity(v1, gameEntity0, playerEntity0, s, uri0, s1, s2, s3, v2, v3, f, s4, z, v4);
    }

    public SnapshotMetadataEntity[] zzge(int v) {
        return new SnapshotMetadataEntity[v];
    }
}

