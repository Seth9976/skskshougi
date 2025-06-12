package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter extends AbstractFilter {
    public static final zza CREATOR;
    final int zzCY;
    final Operator zzahQ;
    final MetadataBundle zzahR;
    final MetadataField zzahS;

    static {
        ComparisonFilter.CREATOR = new zza();
    }

    ComparisonFilter(int versionCode, Operator operator, MetadataBundle value) {
        this.zzCY = versionCode;
        this.zzahQ = operator;
        this.zzahR = value;
        this.zzahS = zze.zzb(value);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField searchableMetadataField0, Object object0) {
        this(1, operator, MetadataBundle.zza(searchableMetadataField0, object0));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getValue() {
        return this.zzahR.zza(this.zzahS);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        Object object0 = this.getValue();
        return zzf0.zzb(this.zzahQ, this.zzahS, object0);
    }
}

