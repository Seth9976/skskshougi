package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLng implements SafeParcelable {
    public static final zze CREATOR;
    public final double latitude;
    public final double longitude;
    private final int zzCY;

    static {
        LatLng.CREATOR = new zze();
    }

    public LatLng(double latitude, double longitude) {
        this(1, latitude, longitude);
    }

    LatLng(int versionCode, double latitude, double longitude) {
        this.zzCY = versionCode;
        this.longitude = -180.0 > longitude || longitude >= 180.0 ? ((longitude - 180.0) % 360.0 + 360.0) % 360.0 - 180.0 : longitude;
        this.latitude = Math.max(-90.0, Math.min(90.0, latitude));
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
        return o instanceof LatLng ? Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(((LatLng)o).latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(((LatLng)o).longitude) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.latitude);
        long v1 = Double.doubleToLongBits(this.longitude);
        return (((int)(v ^ v >>> 0x20)) + 0x1F) * 0x1F + ((int)(v1 ^ v1 >>> 0x20));
    }

    @Override
    public String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zze.zza(this, out, flags);
    }
}

