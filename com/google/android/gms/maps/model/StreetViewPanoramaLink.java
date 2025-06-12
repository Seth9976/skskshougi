package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class StreetViewPanoramaLink implements SafeParcelable {
    public static final zzj CREATOR;
    public final float bearing;
    public final String panoId;
    private final int zzCY;

    static {
        StreetViewPanoramaLink.CREATOR = new zzj();
    }

    StreetViewPanoramaLink(int versionCode, String panoId, float bearing) {
        this.zzCY = versionCode;
        this.panoId = panoId;
        if(((double)bearing) <= 0.0) {
            bearing = bearing % 360.0f + 360.0f;
        }
        this.bearing = bearing % 360.0f;
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
        return o instanceof StreetViewPanoramaLink ? this.panoId.equals(((StreetViewPanoramaLink)o).panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(((StreetViewPanoramaLink)o).bearing) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.panoId, this.bearing});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("panoId", this.panoId).zzg("bearing", this.bearing).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzj.zza(this, out, flags);
    }
}

