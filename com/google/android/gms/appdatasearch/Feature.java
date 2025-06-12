package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Feature implements SafeParcelable {
    public static final zze CREATOR;
    public final int id;
    final int zzCY;
    final Bundle zzNi;

    static {
        Feature.CREATOR = new zze();
    }

    Feature(int versionCode, int id, Bundle parameters) {
        this.zzCY = versionCode;
        this.id = id;
        this.zzNi = parameters;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }
}

