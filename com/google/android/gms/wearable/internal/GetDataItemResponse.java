package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetDataItemResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final DataItemParcelable zzaUx;

    static {
        GetDataItemResponse.CREATOR = new zzan();
    }

    GetDataItemResponse(int versionCode, int statusCode, DataItemParcelable dataItem) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaUx = dataItem;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzan.zza(this, dest, flags);
    }
}

