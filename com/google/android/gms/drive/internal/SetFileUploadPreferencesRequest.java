package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetFileUploadPreferencesRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final FileUploadPreferencesImpl zzagf;

    static {
        SetFileUploadPreferencesRequest.CREATOR = new zzbo();
    }

    SetFileUploadPreferencesRequest(int versionCode, FileUploadPreferencesImpl preferences) {
        this.zzCY = versionCode;
        this.zzagf = preferences;
    }

    public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl preferences) {
        this(1, preferences);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbo.zza(this, dest, flags);
    }
}

