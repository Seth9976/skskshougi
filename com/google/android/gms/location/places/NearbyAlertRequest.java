package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class NearbyAlertRequest implements SafeParcelable {
    public static final zze CREATOR;
    private final int zzCY;
    private final int zzaxy;
    private final NearbyAlertFilter zzazA;
    private final int zzazy;
    @Deprecated
    private final PlaceFilter zzazz;

    static {
        NearbyAlertRequest.CREATOR = new zze();
    }

    NearbyAlertRequest(int versionCode, int transitionTypes, int loiteringTimeMillis, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter) {
        this.zzCY = versionCode;
        this.zzaxy = transitionTypes;
        this.zzazy = loiteringTimeMillis;
        if(nearbyAlertFilter != null) {
            this.zzazA = nearbyAlertFilter;
        }
        else if(placeFilter == null) {
            this.zzazA = null;
        }
        else if(NearbyAlertRequest.zza(placeFilter)) {
            this.zzazA = NearbyAlertFilter.zza(placeFilter.getPlaceIds(), placeFilter.getPlaceTypes(), placeFilter.zzuI());
        }
        else {
            this.zzazA = null;
        }
        this.zzazz = null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object instanceof NearbyAlertRequest ? this.zzaxy == ((NearbyAlertRequest)object).zzaxy && this.zzazy == ((NearbyAlertRequest)object).zzazy && zzt.equal(this.zzazz, ((NearbyAlertRequest)object).zzazz) && zzt.equal(this.zzazA, ((NearbyAlertRequest)object).zzazA) : false;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaxy, this.zzazy});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("transitionTypes", this.zzaxy).zzg("loiteringTimeMillis", this.zzazy).zzg("nearbyAlertFilter", this.zzazA).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zze.zza(this, parcel, flags);
    }

    // 去混淆评级： 中等(50)
    @Deprecated
    public static boolean zza(PlaceFilter placeFilter0) {
        return placeFilter0.getPlaceTypes() != null && !placeFilter0.getPlaceTypes().isEmpty() || placeFilter0.getPlaceIds() != null && !placeFilter0.getPlaceIds().isEmpty() || placeFilter0.zzuI() != null && !placeFilter0.zzuI().isEmpty();
    }

    public int zzuC() {
        return this.zzaxy;
    }

    public int zzuF() {
        return this.zzazy;
    }

    @Deprecated
    public PlaceFilter zzuG() {
        return this.zzazz;
    }

    public NearbyAlertFilter zzuH() {
        return this.zzazA;
    }
}

