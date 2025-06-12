package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter extends AbstractFilter {
    public static final zzl CREATOR;
    final int zzCY;

    static {
        MatchAllFilter.CREATOR = new zzl();
    }

    public MatchAllFilter() {
        this(1);
    }

    MatchAllFilter(int versionCode) {
        this.zzCY = versionCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzl.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        return zzf0.zzqf();
    }
}

