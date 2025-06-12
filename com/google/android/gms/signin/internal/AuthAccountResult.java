package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountResult implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;

    static {
        AuthAccountResult.CREATOR = new zza();
    }

    public AuthAccountResult() {
        this(1);
    }

    AuthAccountResult(int versionCode) {
        this.zzCY = versionCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zza.zza(this, dest, flags);
    }
}

