package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetPermissionsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzacT;

    static {
        GetPermissionsRequest.CREATOR = new zzai();
    }

    GetPermissionsRequest(int versionCode, DriveId driveId) {
        this.zzCY = versionCode;
        this.zzacT = driveId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzai.zza(this, dest, flags);
    }
}

