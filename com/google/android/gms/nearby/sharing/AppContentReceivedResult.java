package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class AppContentReceivedResult implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private int statusCode;
    private final int versionCode;
    private Uri zzaGj;

    static {
        AppContentReceivedResult.CREATOR = new zza();
    }

    private AppContentReceivedResult() {
        this.versionCode = 1;
    }

    AppContentReceivedResult(int versionCode, Uri destinationUri, int statusCode) {
        this.versionCode = versionCode;
        this.zzaGj = destinationUri;
        this.statusCode = statusCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return o instanceof AppContentReceivedResult ? zzt.equal(this.zzaGj, ((AppContentReceivedResult)o).zzaGj) && zzt.equal(this.statusCode, ((AppContentReceivedResult)o).statusCode) : false;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    int getVersionCode() {
        return this.versionCode;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaGj, this.statusCode});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zza.zza(this, dest, flags);
    }

    public Uri zzxc() {
        return this.zzaGj;
    }
}

