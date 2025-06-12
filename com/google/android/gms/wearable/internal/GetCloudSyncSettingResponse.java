package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncSettingResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean enabled;
    public final int statusCode;
    public final int versionCode;

    static {
        GetCloudSyncSettingResponse.CREATOR = new zzaj();
    }

    GetCloudSyncSettingResponse(int versionCode, int statusCode, boolean enabled) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.enabled = enabled;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzaj.zza(this, dest, flags);
    }
}

