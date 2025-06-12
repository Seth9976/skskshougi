package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;

public class NotFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final FilterHolder zzaig;

    static {
        NotFilter.CREATOR = new zzm();
    }

    NotFilter(int versionCode, FilterHolder toNegate) {
        this.zzCY = versionCode;
        this.zzaig = toNegate;
    }

    public NotFilter(Filter toNegate) {
        this(1, new FilterHolder(toNegate));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzm.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        return zzf0.zzv(this.zzaig.getFilter().zza(zzf0));
    }
}

