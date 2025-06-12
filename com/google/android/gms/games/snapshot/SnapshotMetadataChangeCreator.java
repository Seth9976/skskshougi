package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class SnapshotMetadataChangeCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdT(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgd(x0);
    }

    static void zza(SnapshotMetadataChangeEntity snapshotMetadataChangeEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, snapshotMetadataChangeEntity0.getDescription(), false);
        zzb.zzc(parcel0, 1000, snapshotMetadataChangeEntity0.getVersionCode());
        zzb.zza(parcel0, 2, snapshotMetadataChangeEntity0.getPlayedTimeMillis(), false);
        zzb.zza(parcel0, 4, snapshotMetadataChangeEntity0.getCoverImageUri(), v, false);
        zzb.zza(parcel0, 5, snapshotMetadataChangeEntity0.zztQ(), v, false);
        zzb.zza(parcel0, 6, snapshotMetadataChangeEntity0.getProgressValue(), false);
        zzb.zzH(parcel0, v1);
    }

    public SnapshotMetadataChangeEntity zzdT(Parcel parcel0) {
        Long long0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Uri uri0 = null;
        BitmapTeleporter bitmapTeleporter0 = null;
        Long long1 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    long1 = zza.zzj(parcel0, v2);
                    break;
                }
                case 4: {
                    uri0 = (Uri)zza.zza(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 5: {
                    bitmapTeleporter0 = (BitmapTeleporter)zza.zza(parcel0, v2, BitmapTeleporter.CREATOR);
                    break;
                }
                case 6: {
                    long0 = zza.zzj(parcel0, v2);
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
        return new SnapshotMetadataChangeEntity(v1, s, long1, bitmapTeleporter0, uri0, long0);
    }

    public SnapshotMetadataChangeEntity[] zzgd(int v) {
        return new SnapshotMetadataChangeEntity[v];
    }
}

