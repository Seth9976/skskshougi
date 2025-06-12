package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ListParentsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzafP;

    static {
        ListParentsRequest.CREATOR = new zzao();
    }

    ListParentsRequest(int versionCode, DriveId driveId) {
        this.zzCY = versionCode;
        this.zzafP = driveId;
    }

    public ListParentsRequest(DriveId id) {
        this(1, id);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzao.zza(this, dest, flags);
    }
}

