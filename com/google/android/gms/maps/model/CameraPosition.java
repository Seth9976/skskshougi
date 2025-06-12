package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public final class CameraPosition implements SafeParcelable {
    public static final class Builder {
        private LatLng zzaCQ;
        private float zzaCR;
        private float zzaCS;
        private float zzaCT;

        public Builder() {
        }

        public Builder(CameraPosition previous) {
            this.zzaCQ = previous.target;
            this.zzaCR = previous.zoom;
            this.zzaCS = previous.tilt;
            this.zzaCT = previous.bearing;
        }

        public Builder bearing(float bearing) {
            this.zzaCT = bearing;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.zzaCQ, this.zzaCR, this.zzaCS, this.zzaCT);
        }

        public Builder target(LatLng location) {
            this.zzaCQ = location;
            return this;
        }

        public Builder tilt(float tilt) {
            this.zzaCS = tilt;
            return this;
        }

        public Builder zoom(float zoom) {
            this.zzaCR = zoom;
            return this;
        }
    }

    public static final zza CREATOR;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;
    private final int zzCY;

    static {
        CameraPosition.CREATOR = new zza();
    }

    CameraPosition(int versionCode, LatLng target, float zoom, float tilt, float bearing) {
        zzu.zzb(target, "null camera target");
        zzu.zzb(0.0f <= tilt && tilt <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[]{tilt});
        this.zzCY = versionCode;
        this.target = target;
        this.zoom = zoom;
        this.tilt = tilt + 0.0f;
        if(((double)bearing) <= 0.0) {
            bearing = bearing % 360.0f + 360.0f;
        }
        this.bearing = bearing % 360.0f;
    }

    public CameraPosition(LatLng target, float zoom, float tilt, float bearing) {
        this(1, target, zoom, tilt, bearing);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition camera) {
        return new Builder(camera);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attrs) {
        if(attrs == null) {
            return null;
        }
        TypedArray typedArray0 = context.getResources().obtainAttributes(attrs, styleable.MapAttrs);
        LatLng latLng0 = new LatLng(((double)(typedArray0.hasValue(styleable.MapAttrs_cameraTargetLat) ? typedArray0.getFloat(styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f)), ((double)(typedArray0.hasValue(styleable.MapAttrs_cameraTargetLng) ? typedArray0.getFloat(styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f)));
        Builder cameraPosition$Builder0 = CameraPosition.builder();
        cameraPosition$Builder0.target(latLng0);
        if(typedArray0.hasValue(styleable.MapAttrs_cameraZoom)) {
            cameraPosition$Builder0.zoom(typedArray0.getFloat(styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_cameraBearing)) {
            cameraPosition$Builder0.bearing(typedArray0.getFloat(styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_cameraTilt)) {
            cameraPosition$Builder0.tilt(typedArray0.getFloat(styleable.MapAttrs_cameraTilt, 0.0f));
        }
        return cameraPosition$Builder0.build();
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
        return o instanceof CameraPosition ? this.target.equals(((CameraPosition)o).target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(((CameraPosition)o).zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(((CameraPosition)o).tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(((CameraPosition)o).bearing) : false;
    }

    public static final CameraPosition fromLatLngZoom(LatLng target, float zoom) {
        return new CameraPosition(target, zoom, 0.0f, 0.0f);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.target, this.zoom, this.tilt, this.bearing});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("target", this.target).zzg("zoom", this.zoom).zzg("tilt", this.tilt).zzg("bearing", this.bearing).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }
}

