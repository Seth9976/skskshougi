package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public final class LatLngBounds implements SafeParcelable {
    public static final class Builder {
        private double zzaDn;
        private double zzaDo;
        private double zzaDp;
        private double zzaDq;

        public Builder() {
            this.zzaDn = Infinity;
            this.zzaDo = -Infinity;
            this.zzaDp = NaN;
            this.zzaDq = NaN;
        }

        public LatLngBounds build() {
            zzu.zza(!Double.isNaN(this.zzaDp), "no included points");
            return new LatLngBounds(new LatLng(this.zzaDn, this.zzaDp), new LatLng(this.zzaDo, this.zzaDq));
        }

        public Builder include(LatLng point) {
            this.zzaDn = Math.min(this.zzaDn, point.latitude);
            this.zzaDo = Math.max(this.zzaDo, point.latitude);
            double f = point.longitude;
            if(Double.isNaN(this.zzaDp)) {
                this.zzaDp = f;
                this.zzaDq = f;
                return this;
            }
            if(!this.zzg(f)) {
                if(LatLngBounds.zzb(this.zzaDp, f) < LatLngBounds.zzc(this.zzaDq, f)) {
                    this.zzaDp = f;
                    return this;
                }
                this.zzaDq = f;
                return this;
            }
            return this;
        }

        private boolean zzg(double f) {
            return this.zzaDp <= this.zzaDq ? this.zzaDp <= f && f <= this.zzaDq : this.zzaDp <= f || f <= this.zzaDq;
        }
    }

    public static final zzd CREATOR;
    public final LatLng northeast;
    public final LatLng southwest;
    private final int zzCY;

    static {
        LatLngBounds.CREATOR = new zzd();
    }

    LatLngBounds(int versionCode, LatLng southwest, LatLng northeast) {
        zzu.zzb(southwest, "null southwest");
        zzu.zzb(northeast, "null northeast");
        zzu.zzb(northeast.latitude >= southwest.latitude, "southern latitude exceeds northern latitude (%s > %s)", new Object[]{southwest.latitude, northeast.latitude});
        this.zzCY = versionCode;
        this.southwest = southwest;
        this.northeast = northeast;
    }

    public LatLngBounds(LatLng southwest, LatLng northeast) {
        this(1, southwest, northeast);
    }

    public static Builder builder() {
        return new Builder();
    }

    // 去混淆评级： 低(20)
    public boolean contains(LatLng point) {
        return this.zzf(point.latitude) && this.zzg(point.longitude);
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
        return o instanceof LatLngBounds ? this.southwest.equals(((LatLngBounds)o).southwest) && this.northeast.equals(((LatLngBounds)o).northeast) : false;
    }

    public LatLng getCenter() {
        double f = (this.southwest.latitude + this.northeast.latitude) / 2.0;
        double f1 = this.northeast.longitude;
        double f2 = this.southwest.longitude;
        return f2 <= f1 ? new LatLng(f, (f1 + f2) / 2.0) : new LatLng(f, (f1 + 360.0 + f2) / 2.0);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public LatLngBounds including(LatLng point) {
        double f = Math.min(this.southwest.latitude, point.latitude);
        double f1 = Math.max(this.northeast.latitude, point.latitude);
        double f2 = this.northeast.longitude;
        double f3 = this.southwest.longitude;
        double f4 = point.longitude;
        if(!this.zzg(f4)) {
            return LatLngBounds.zzb(f3, f4) < LatLngBounds.zzc(f2, f4) ? new LatLngBounds(new LatLng(f, f4), new LatLng(f1, f2)) : new LatLngBounds(new LatLng(f, f3), new LatLng(f1, f4));
        }
        return new LatLngBounds(new LatLng(f, f3), new LatLng(f1, f2));
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("southwest", this.southwest).zzg("northeast", this.northeast).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzd.zza(this, out, flags);
    }

    private static double zzb(double f, double f1) {
        return (f - f1 + 360.0) % 360.0;
    }

    private static double zzc(double f, double f1) {
        return (f1 - f + 360.0) % 360.0;
    }

    private boolean zzf(double f) {
        return this.southwest.latitude <= f && f <= this.northeast.latitude;
    }

    private boolean zzg(double f) {
        return this.southwest.longitude <= this.northeast.longitude ? this.southwest.longitude <= f && f <= this.northeast.longitude : this.southwest.longitude <= f || f <= this.northeast.longitude;
    }
}

