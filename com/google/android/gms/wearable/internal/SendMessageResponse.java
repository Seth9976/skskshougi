package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SendMessageResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final int zzaxg;

    static {
        SendMessageResponse.CREATOR = new zzbe();
    }

    SendMessageResponse(int versionCode, int statusCode, int requestId) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaxg = requestId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbe.zza(this, dest, flags);
    }
}

