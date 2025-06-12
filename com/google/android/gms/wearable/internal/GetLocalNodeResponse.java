package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetLocalNodeResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final NodeParcelable zzaUz;

    static {
        GetLocalNodeResponse.CREATOR = new zzap();
    }

    GetLocalNodeResponse(int versionCode, int statusCode, NodeParcelable node) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaUz = node;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzap.zza(this, dest, flags);
    }
}

