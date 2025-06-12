package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

public final class LocationSettingsStates implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final boolean zzayg;
    private final boolean zzayh;
    private final boolean zzayi;
    private final boolean zzayj;
    private final boolean zzayk;
    private final boolean zzayl;
    private final boolean zzaym;

    static {
        LocationSettingsStates.CREATOR = new zzi();
    }

    LocationSettingsStates(int version, boolean gpsUsable, boolean nlpUsable, boolean bleUsable, boolean gpsPresent, boolean nlpPresent, boolean blePresent, boolean userLocationReportingOn) {
        this.zzCY = version;
        this.zzayg = gpsUsable;
        this.zzayh = nlpUsable;
        this.zzayi = bleUsable;
        this.zzayj = gpsPresent;
        this.zzayk = nlpPresent;
        this.zzayl = blePresent;
        this.zzaym = userLocationReportingOn;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        return (LocationSettingsStates)zzc.zza(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", LocationSettingsStates.CREATOR);
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public boolean isBlePresent() {
        return this.zzayl;
    }

    public boolean isBleUsable() {
        return this.zzayi;
    }

    public boolean isGpsPresent() {
        return this.zzayj;
    }

    public boolean isGpsUsable() {
        return this.zzayg;
    }

    // 去混淆评级： 低(20)
    public boolean isLocationPresent() {
        return this.zzayj || this.zzayk;
    }

    // 去混淆评级： 低(20)
    public boolean isLocationUsable() {
        return this.zzayg || this.zzayh;
    }

    public boolean isNetworkLocationPresent() {
        return this.zzayk;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzayh;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }

    public boolean zzus() {
        return this.zzaym;
    }
}

