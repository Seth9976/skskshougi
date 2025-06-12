package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class ClientIdentity implements SafeParcelable {
    public static final zzc CREATOR;
    public final String packageName;
    public final int uid;
    private final int zzCY;

    static {
        ClientIdentity.CREATOR = new zzc();
    }

    ClientIdentity(int versionCode, int uid, String packageName) {
        this.zzCY = versionCode;
        this.uid = uid;
        this.packageName = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object o) {
        return o instanceof ClientIdentity ? ((ClientIdentity)o).uid == this.uid && zzt.equal(((ClientIdentity)o).packageName, this.packageName) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return this.uid;
    }

    @Override
    public String toString() {
        return String.format("%d:%s", this.uid, this.packageName);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzc.zza(this, parcel, flags);
    }
}

