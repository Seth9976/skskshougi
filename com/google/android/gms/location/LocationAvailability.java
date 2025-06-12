package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class LocationAvailability implements SafeParcelable {
    public static final LocationAvailabilityCreator CREATOR;
    private final int zzCY;
    int zzaxQ;
    int zzaxR;
    long zzaxS;
    int zzaxT;

    static {
        LocationAvailability.CREATOR = new LocationAvailabilityCreator();
    }

    LocationAvailability(int versionCode, int locationStatus, int cellStatus, int wifiStatus, long elapsedRealtimeNs) {
        this.zzCY = versionCode;
        this.zzaxT = locationStatus;
        this.zzaxQ = cellStatus;
        this.zzaxR = wifiStatus;
        this.zzaxS = elapsedRealtimeNs;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof LocationAvailability ? this.zzaxT == ((LocationAvailability)other).zzaxT && this.zzaxQ == ((LocationAvailability)other).zzaxQ && this.zzaxR == ((LocationAvailability)other).zzaxR && this.zzaxS == ((LocationAvailability)other).zzaxS : false;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        return LocationAvailability.hasLocationAvailability(intent) ? ((LocationAvailability)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY")) : null;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaxT, this.zzaxQ, this.zzaxR, this.zzaxS});
    }

    public boolean isLocationAvailable() {
        return this.zzaxT < 1000;
    }

    @Override
    public String toString() {
        return "LocationAvailability[isLocationAvailable: " + this.isLocationAvailable() + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        LocationAvailabilityCreator.zza(this, parcel, flags);
    }
}

