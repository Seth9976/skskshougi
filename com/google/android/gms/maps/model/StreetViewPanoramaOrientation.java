package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class StreetViewPanoramaOrientation implements SafeParcelable {
    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder(StreetViewPanoramaOrientation previous) {
            this.bearing = previous.bearing;
            this.tilt = previous.tilt;
        }

        public Builder bearing(float bearing) {
            this.bearing = bearing;
            return this;
        }

        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        public Builder tilt(float tilt) {
            this.tilt = tilt;
            return this;
        }
    }

    public static final zzl CREATOR;
    public final float bearing;
    public final float tilt;
    private final int zzCY;

    static {
        StreetViewPanoramaOrientation.CREATOR = new zzl();
    }

    public StreetViewPanoramaOrientation(float tilt, float bearing) {
        this(1, tilt, bearing);
    }

    StreetViewPanoramaOrientation(int versionCode, float tilt, float bearing) {
        zzu.zzb(-90.0f <= tilt && tilt <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.zzCY = versionCode;
        this.tilt = tilt + 0.0f;
        if(((double)bearing) <= 0.0) {
            bearing = bearing % 360.0f + 360.0f;
        }
        this.bearing = bearing % 360.0f;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaOrientation orientation) {
        return new Builder(orientation);
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
        return o instanceof StreetViewPanoramaOrientation ? Float.floatToIntBits(this.tilt) == Float.floatToIntBits(((StreetViewPanoramaOrientation)o).tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(((StreetViewPanoramaOrientation)o).bearing) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.tilt, this.bearing});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("tilt", this.tilt).zzg("bearing", this.bearing).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzl.zza(this, out, flags);
    }
}

