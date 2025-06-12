package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class StreetViewPanoramaLocation implements SafeParcelable {
    public static final zzk CREATOR;
    public final StreetViewPanoramaLink[] links;
    public final String panoId;
    public final LatLng position;
    private final int zzCY;

    static {
        StreetViewPanoramaLocation.CREATOR = new zzk();
    }

    StreetViewPanoramaLocation(int versionCode, StreetViewPanoramaLink[] links, LatLng position, String panoId) {
        this.zzCY = versionCode;
        this.links = links;
        this.position = position;
        this.panoId = panoId;
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] links, LatLng position, String panoId) {
        this(1, links, position, panoId);
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
        return o instanceof StreetViewPanoramaLocation ? this.panoId.equals(((StreetViewPanoramaLocation)o).panoId) && this.position.equals(((StreetViewPanoramaLocation)o).position) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.position, this.panoId});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("panoId", this.panoId).zzg("position", this.position.toString()).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzk.zza(this, out, flags);
    }
}

