package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class OwnedByMeFilter extends AbstractFilter {
    public static final zzo CREATOR;
    final int zzCY;

    static {
        OwnedByMeFilter.CREATOR = new zzo();
    }

    public OwnedByMeFilter() {
        this(1);
    }

    OwnedByMeFilter(int versionCode) {
        this.zzCY = versionCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzo.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        return zzf0.zzqe();
    }
}

