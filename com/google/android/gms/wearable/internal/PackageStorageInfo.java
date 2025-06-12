package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PackageStorageInfo implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String label;
    public final String packageName;
    public final int versionCode;
    public final long zzaUN;

    static {
        PackageStorageInfo.CREATOR = new zzba();
    }

    PackageStorageInfo(int versionCode, String packageName, String label, long totalSizeBytes) {
        this.versionCode = versionCode;
        this.packageName = packageName;
        this.label = label;
        this.zzaUN = totalSizeBytes;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzba.zza(this, out, flags);
    }
}

