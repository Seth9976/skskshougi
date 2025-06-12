package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class FullTextSearchFilter extends AbstractFilter {
    public static final zzh CREATOR;
    final String mValue;
    final int zzCY;

    static {
        FullTextSearchFilter.CREATOR = new zzh();
    }

    FullTextSearchFilter(int versionCode, String value) {
        this.zzCY = versionCode;
        this.mValue = value;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzh.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        return zzf0.zzcC(this.mValue);
    }
}

