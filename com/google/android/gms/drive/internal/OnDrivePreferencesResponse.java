package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

public class OnDrivePreferencesResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    DrivePreferences zzagi;

    static {
        OnDrivePreferencesResponse.CREATOR = new zzay();
    }

    OnDrivePreferencesResponse(int versionCode, DrivePreferences prefs) {
        this.zzCY = versionCode;
        this.zzagi = prefs;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzay.zza(this, dest, flags);
    }
}

