package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class StreetViewPanoramaCamera implements SafeParcelable {
    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(StreetViewPanoramaCamera previous) {
            this.zoom = previous.zoom;
            this.bearing = previous.bearing;
            this.tilt = previous.tilt;
        }

        public Builder bearing(float bearing) {
            this.bearing = bearing;
            return this;
        }

        public StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }

        public Builder orientation(StreetViewPanoramaOrientation orientation) {
            this.tilt = orientation.tilt;
            this.bearing = orientation.bearing;
            return this;
        }

        public Builder tilt(float tilt) {
            this.tilt = tilt;
            return this;
        }

        public Builder zoom(float zoom) {
            this.zoom = zoom;
            return this;
        }
    }

    public static final zzi CREATOR;
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final int zzCY;
    private StreetViewPanoramaOrientation zzaDE;

    static {
        StreetViewPanoramaCamera.CREATOR = new zzi();
    }

    public StreetViewPanoramaCamera(float zoom, float tilt, float bearing) {
        this(1, zoom, tilt, bearing);
    }

    StreetViewPanoramaCamera(int versionCode, float zoom, float tilt, float bearing) {
        zzu.zzb(-90.0f <= tilt && tilt <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.zzCY = versionCode;
        if(((double)zoom) <= 0.0) {
            zoom = 0.0f;
        }
        this.zoom = zoom;
        this.tilt = tilt + 0.0f;
        this.bearing = (((double)bearing) <= 0.0 ? bearing % 360.0f + 360.0f : bearing) % 360.0f;
        this.zzaDE = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder().tilt(tilt).bearing(bearing).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera camera) {
        return new Builder(camera);
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
        return o instanceof StreetViewPanoramaCamera ? Float.floatToIntBits(this.zoom) == Float.floatToIntBits(((StreetViewPanoramaCamera)o).zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(((StreetViewPanoramaCamera)o).tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(((StreetViewPanoramaCamera)o).bearing) : false;
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.zzaDE;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zoom, this.tilt, this.bearing});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("zoom", this.zoom).zzg("tilt", this.tilt).zzg("bearing", this.bearing).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzi.zza(this, out, flags);
    }
}

