package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

public final class FileUploadPreferencesImpl implements SafeParcelable, FileUploadPreferences {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    int zzafG;
    int zzafH;
    boolean zzafI;

    static {
        FileUploadPreferencesImpl.CREATOR = new zzae();
    }

    FileUploadPreferencesImpl(int versionCode, int networkTypePreference, int batteryUsagePreference, boolean allowRoaming) {
        this.zzCY = versionCode;
        this.zzafG = networkTypePreference;
        this.zzafH = batteryUsagePreference;
        this.zzafI = allowRoaming;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.drive.FileUploadPreferences
    public int getBatteryUsagePreference() {
        return FileUploadPreferencesImpl.zzcE(this.zzafH) ? this.zzafH : 0;
    }

    @Override  // com.google.android.gms.drive.FileUploadPreferences
    public int getNetworkTypePreference() {
        return FileUploadPreferencesImpl.zzcD(this.zzafG) ? this.zzafG : 0;
    }

    @Override  // com.google.android.gms.drive.FileUploadPreferences
    public boolean isRoamingAllowed() {
        return this.zzafI;
    }

    @Override  // com.google.android.gms.drive.FileUploadPreferences
    public void setBatteryUsagePreference(int batteryUsagePreference) {
        if(!FileUploadPreferencesImpl.zzcE(batteryUsagePreference)) {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        }
        this.zzafH = batteryUsagePreference;
    }

    @Override  // com.google.android.gms.drive.FileUploadPreferences
    public void setNetworkTypePreference(int networkTypePreference) {
        if(!FileUploadPreferencesImpl.zzcD(networkTypePreference)) {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        }
        this.zzafG = networkTypePreference;
    }

    @Override  // com.google.android.gms.drive.FileUploadPreferences
    public void setRoamingAllowed(boolean allowRoaming) {
        this.zzafI = allowRoaming;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzae.zza(this, parcel, flags);
    }

    public static boolean zzcD(int v) {
        return v == 1 || v == 2;
    }

    public static boolean zzcE(int v) {
        return v == 0x100 || v == 0x101;
    }
}

