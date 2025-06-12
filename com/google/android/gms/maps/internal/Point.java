package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Point implements SafeParcelable {
    public static final zzz CREATOR;
    private final int versionCode;
    private final android.graphics.Point zzaCO;

    static {
        Point.CREATOR = new zzz();
    }

    public Point(int versionCode, android.graphics.Point point) {
        this.versionCode = versionCode;
        this.zzaCO = point;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof Point ? this.zzaCO.equals(((Point)o).zzaCO) : false;
    }

    int getVersionCode() {
        return this.versionCode;
    }

    @Override
    public int hashCode() {
        return this.zzaCO.hashCode();
    }

    @Override
    public String toString() {
        return this.zzaCO.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzz.zza(this, out, flags);
    }

    public android.graphics.Point zzvG() {
        return this.zzaCO;
    }
}

