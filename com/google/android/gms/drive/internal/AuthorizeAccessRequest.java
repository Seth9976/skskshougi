package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzacT;
    final long zzaeo;

    static {
        AuthorizeAccessRequest.CREATOR = new zzc();
    }

    AuthorizeAccessRequest(int versionCode, long appId, DriveId driveId) {
        this.zzCY = versionCode;
        this.zzaeo = appId;
        this.zzacT = driveId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }
}

