package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal implements SafeParcelable {
    public static final zzk CREATOR;
    final String mTag;
    private final int zzCY;
    LocationRequest zzamz;
    static final List zzaza;
    boolean zzazb;
    boolean zzazc;
    boolean zzazd;
    List zzaze;

    static {
        LocationRequestInternal.zzaza = Collections.emptyList();
        LocationRequestInternal.CREATOR = new zzk();
    }

    LocationRequestInternal(int versionCode, LocationRequest locationRequest, boolean requestNlpDebugInfo, boolean restorePendingIntentListeners, boolean triggerUpdate, List list0, String tag) {
        this.zzCY = versionCode;
        this.zzamz = locationRequest;
        this.zzazb = requestNlpDebugInfo;
        this.zzazc = restorePendingIntentListeners;
        this.zzazd = triggerUpdate;
        this.zzaze = list0;
        this.mTag = tag;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object other) {
        return other instanceof LocationRequestInternal ? zzt.equal(this.zzamz, ((LocationRequestInternal)other).zzamz) && this.zzazb == ((LocationRequestInternal)other).zzazb && this.zzazc == ((LocationRequestInternal)other).zzazc && this.zzazd == ((LocationRequestInternal)other).zzazd && zzt.equal(this.zzaze, ((LocationRequestInternal)other).zzaze) : false;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return this.zzamz.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Request[PRIORITY_BALANCED_POWER_ACCURACY requested=3600000ms fastest=600000ms]");
        stringBuilder0.append(" requestNlpDebugInfo=");
        stringBuilder0.append(this.zzazb);
        stringBuilder0.append(" restorePendingIntentListeners=");
        stringBuilder0.append(this.zzazc);
        stringBuilder0.append(" triggerUpdate=");
        stringBuilder0.append(this.zzazd);
        stringBuilder0.append(" clients=");
        stringBuilder0.append(this.zzaze);
        if(this.mTag != null) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(this.mTag);
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzk.zza(this, parcel, flags);
    }

    public static LocationRequestInternal zza(String s, LocationRequest locationRequest0) {
        return new LocationRequestInternal(1, locationRequest0, false, true, true, LocationRequestInternal.zzaza, s);
    }

    public static LocationRequestInternal zzb(LocationRequest locationRequest0) {
        return LocationRequestInternal.zza(null, locationRequest0);
    }
}

