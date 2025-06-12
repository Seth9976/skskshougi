package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OpenChannelResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final ChannelImpl zzaTP;

    static {
        OpenChannelResponse.CREATOR = new zzaz();
    }

    OpenChannelResponse(int versionCode, int statusCode, ChannelImpl channel) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaTP = channel;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzaz.zza(this, dest, flags);
    }
}

