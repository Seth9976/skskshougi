package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class PartialDriveId implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final String zzadd;
    final long zzade;
    final int zzadf;

    static {
        PartialDriveId.CREATOR = new zzm();
    }

    PartialDriveId(int versionCode, String resourceId, long sqlId, int resourceType) {
        this.zzCY = versionCode;
        this.zzadd = resourceId;
        this.zzade = sqlId;
        this.zzadf = resourceType;
    }

    public PartialDriveId(String resourceId, long sqlId, int resourceType) {
        this(1, resourceId, sqlId, resourceType);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzm.zza(this, out, flags);
    }

    public DriveId zzD(long v) {
        return new DriveId(this.zzadd, this.zzade, v, this.zzadf);
    }
}

