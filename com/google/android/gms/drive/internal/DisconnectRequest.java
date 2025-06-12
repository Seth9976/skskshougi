package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DisconnectRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;

    static {
        DisconnectRequest.CREATOR = new zzp();
    }

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int versionCode) {
        this.zzCY = versionCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzp.zza(this, dest, flags);
    }
}

