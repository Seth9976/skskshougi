package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ChannelSendFileResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;

    static {
        ChannelSendFileResponse.CREATOR = new zzp();
    }

    ChannelSendFileResponse(int versionCode, int statusCode) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzp.zza(this, dest, flags);
    }
}

