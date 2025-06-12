package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    DriveId zzaeq;

    static {
        OnDriveIdResponse.CREATOR = new zzax();
    }

    OnDriveIdResponse(int versionCode, DriveId driveId) {
        this.zzCY = versionCode;
        this.zzaeq = driveId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DriveId getDriveId() {
        return this.zzaeq;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzax.zza(this, dest, flags);
    }
}

