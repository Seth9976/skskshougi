package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UriData implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String description;
    private final int zzCY;
    String zzaGl;

    static {
        UriData.CREATOR = new zzh();
    }

    UriData() {
        this.zzCY = 1;
    }

    UriData(int versionCode, String uri, String description) {
        this.zzCY = versionCode;
        this.zzaGl = uri;
        this.description = description;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }
}

