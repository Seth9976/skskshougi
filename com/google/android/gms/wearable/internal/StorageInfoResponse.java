package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StorageInfoResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final long zzaUN;
    public final List zzaUP;

    static {
        StorageInfoResponse.CREATOR = new zzbh();
    }

    StorageInfoResponse(int versionCode, int statusCode, long totalSizeBytes, List list0) {
        this.versionCode = versionCode;
        this.statusCode = statusCode;
        this.zzaUN = totalSizeBytes;
        this.zzaUP = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzbh.zza(this, out, flags);
    }
}

