package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetConnectedNodesResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final List zzaUw;

    static {
        GetConnectedNodesResponse.CREATOR = new zzam();
    }

    GetConnectedNodesResponse(int versionCode, int statusCode, List list0) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaUw = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzam.zza(this, dest, flags);
    }
}

