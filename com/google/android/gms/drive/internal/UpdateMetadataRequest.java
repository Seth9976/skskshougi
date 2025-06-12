package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class UpdateMetadataRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzaeq;
    final MetadataBundle zzaer;

    static {
        UpdateMetadataRequest.CREATOR = new zzbu();
    }

    UpdateMetadataRequest(int versionCode, DriveId id, MetadataBundle metadataChangeSet) {
        this.zzCY = versionCode;
        this.zzaeq = id;
        this.zzaer = metadataChangeSet;
    }

    public UpdateMetadataRequest(DriveId id, MetadataBundle metadataChangeSet) {
        this(1, id, metadataChangeSet);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbu.zza(this, dest, flags);
    }
}

