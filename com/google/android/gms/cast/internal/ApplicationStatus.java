package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class ApplicationStatus implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private String zzUd;

    static {
        ApplicationStatus.CREATOR = new zza();
    }

    public ApplicationStatus() {
        this(1, null);
    }

    ApplicationStatus(int versionCode, String applicationStatusText) {
        this.zzCY = versionCode;
        this.zzUd = applicationStatusText;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        return obj instanceof ApplicationStatus ? zzf.zza(this.zzUd, ((ApplicationStatus)obj).zzUd) : false;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzUd});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    public String zzlI() {
        return this.zzUd;
    }
}

