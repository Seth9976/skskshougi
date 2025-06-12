package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder implements SafeParcelable {
    public static final zzc CREATOR;
    final int zzCY;
    final String zzagy;
    final boolean zzahT;

    static {
        FieldWithSortOrder.CREATOR = new zzc();
    }

    FieldWithSortOrder(int versionCode, String fieldName, boolean isSortAscending) {
        this.zzCY = versionCode;
        this.zzagy = fieldName;
        this.zzahT = isSortAscending;
    }

    public FieldWithSortOrder(String fieldName, boolean isSortAscending) {
        this(1, fieldName, isSortAscending);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return String.format(Locale.US, "FieldWithSortOrder[%s %s]", this.zzagy, (this.zzahT ? "ASC" : "DESC"));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzc.zza(this, out, flags);
    }
}

