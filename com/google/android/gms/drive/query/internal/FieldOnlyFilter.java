package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class FieldOnlyFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final MetadataBundle zzahR;
    private final MetadataField zzahS;

    static {
        FieldOnlyFilter.CREATOR = new zzb();
    }

    FieldOnlyFilter(int versionCode, MetadataBundle value) {
        this.zzCY = versionCode;
        this.zzahR = value;
        this.zzahS = zze.zzb(value);
    }

    public FieldOnlyFilter(SearchableMetadataField searchableMetadataField0) {
        this(1, MetadataBundle.zza(searchableMetadataField0, null));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        return zzf0.zze(this.zzahS);
    }
}

