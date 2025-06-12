package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UnsubscribeResourceRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzaeq;

    static {
        UnsubscribeResourceRequest.CREATOR = new zzbs();
    }

    UnsubscribeResourceRequest(int versionCode, DriveId id) {
        this.zzCY = versionCode;
        this.zzaeq = id;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbs.zza(this, dest, flags);
    }
}

