package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest implements SafeParcelable {
    public static final class Builder {
        private boolean zzayb;
        private boolean zzayc;
        private boolean zzayd;
        private final ArrayList zzaye;

        public Builder() {
            this.zzaye = new ArrayList();
            this.zzayb = false;
            this.zzayc = false;
            this.zzayd = false;
        }

        public Builder addAllLocationRequests(Collection collection0) {
            this.zzaye.addAll(collection0);
            return this;
        }

        public Builder addLocationRequest(LocationRequest request) {
            this.zzaye.add(request);
            return this;
        }

        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.zzaye, this.zzayb, this.zzayc, this.zzayd, null);
        }

        public Builder setAlwaysShow(boolean show) {
            this.zzayb = show;
            return this;
        }

        public Builder setNeedBle(boolean needBle) {
            this.zzayc = needBle;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final List zzamw;
    private final boolean zzayb;
    private final boolean zzayc;
    private final boolean zzayd;

    static {
        LocationSettingsRequest.CREATOR = new zzg();
    }

    LocationSettingsRequest(int version, List list0, boolean alwaysShow, boolean needBle, boolean optInUserLocationReporting) {
        this.zzCY = version;
        this.zzamw = list0;
        this.zzayb = alwaysShow;
        this.zzayc = needBle;
        this.zzayd = optInUserLocationReporting;
    }

    private LocationSettingsRequest(List list0, boolean alwaysShow, boolean needBle, boolean optInUserLocationReporting) {
        this(2, list0, alwaysShow, needBle, optInUserLocationReporting);
    }

    LocationSettingsRequest(List x0, boolean x1, boolean x2, boolean x3, com.google.android.gms.location.LocationSettingsRequest.1 x4) {
        this(x0, x1, x2, x3);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzg.zza(this, dest, flags);
    }

    public List zzrj() {
        return Collections.unmodifiableList(this.zzamw);
    }

    public boolean zzup() {
        return this.zzayb;
    }

    public boolean zzuq() {
        return this.zzayc;
    }

    public boolean zzur() {
        return this.zzayd;
    }

    class com.google.android.gms.location.LocationSettingsRequest.1 {
    }

}

