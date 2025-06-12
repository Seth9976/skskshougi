package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class VisibleRegion implements SafeParcelable {
    public static final zzo CREATOR;
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;
    private final int zzCY;

    static {
        VisibleRegion.CREATOR = new zzo();
    }

    VisibleRegion(int versionCode, LatLng nearLeft, LatLng nearRight, LatLng farLeft, LatLng farRight, LatLngBounds latLngBounds) {
        this.zzCY = versionCode;
        this.nearLeft = nearLeft;
        this.nearRight = nearRight;
        this.farLeft = farLeft;
        this.farRight = farRight;
        this.latLngBounds = latLngBounds;
    }

    public VisibleRegion(LatLng nearLeft, LatLng nearRight, LatLng farLeft, LatLng farRight, LatLngBounds latLngBounds) {
        this(1, nearLeft, nearRight, farLeft, farRight, latLngBounds);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof VisibleRegion ? this.nearLeft.equals(((VisibleRegion)o).nearLeft) && this.nearRight.equals(((VisibleRegion)o).nearRight) && this.farLeft.equals(((VisibleRegion)o).farLeft) && this.farRight.equals(((VisibleRegion)o).farRight) && this.latLngBounds.equals(((VisibleRegion)o).latLngBounds) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("nearLeft", this.nearLeft).zzg("nearRight", this.nearRight).zzg("farLeft", this.farLeft).zzg("farRight", this.farRight).zzg("latLngBounds", this.latLngBounds).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzo.zza(this, out, flags);
    }
}

