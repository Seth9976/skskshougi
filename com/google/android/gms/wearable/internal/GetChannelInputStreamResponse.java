package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetChannelInputStreamResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzaUs;

    static {
        GetChannelInputStreamResponse.CREATOR = new zzag();
    }

    GetChannelInputStreamResponse(int versionCode, int statusCode, ParcelFileDescriptor fileDescriptor) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaUs = fileDescriptor;
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

