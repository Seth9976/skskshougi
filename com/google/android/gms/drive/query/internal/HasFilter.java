package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter extends AbstractFilter {
    public static final zzi CREATOR;
    final int zzCY;
    final MetadataBundle zzahR;
    final MetadataField zzahS;

    static {
        HasFilter.CREATOR = new zzi();
    }

    HasFilter(int versionCode, MetadataBundle value) {
        this.zzCY = versionCode;
        this.zzahR = value;
        this.zzahS = zze.zzb(value);
    }

    public HasFilter(SearchableMetadataField searchableMetadataField0, Object object0) {
        this(1, MetadataBundle.zza(searchableMetadataField0, object0));
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
        zzi.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        Object object0 = this.getValue();
        return zzf0.zzd(this.zzahS, object0);
    }
}

