package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDeviceUsagePreferenceResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final FileUploadPreferencesImpl zzagf;

    static {
        OnDeviceUsagePreferenceResponse.CREATOR = new zzav();
    }

    OnDeviceUsagePreferenceResponse(int versionCode, FileUploadPreferencesImpl preferences) {
        this.zzCY = versionCode;
        this.zzagf = preferences;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzav.zza(this, dest, flags);
    }

    public FileUploadPreferencesImpl zzpL() {
        return this.zzagf;
    }
}

