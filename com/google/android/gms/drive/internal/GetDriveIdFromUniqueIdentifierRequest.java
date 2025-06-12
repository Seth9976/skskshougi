package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetDriveIdFromUniqueIdentifierRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final String zzafL;
    final boolean zzafM;

    static {
        GetDriveIdFromUniqueIdentifierRequest.CREATOR = new zzag();
    }

    GetDriveIdFromUniqueIdentifierRequest(int versionCode, String uniqueIdentifier, boolean isInAppFolder) {
        this.zzCY = versionCode;
        this.zzafL = uniqueIdentifier;
        this.zzafM = isInAppFolder;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzag.zza(this, dest, flags);
    }
}

