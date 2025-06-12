package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.Collection;
import java.util.Collections;

public class InFilter extends AbstractFilter {
    public static final zzj CREATOR;
    final int zzCY;
    final MetadataBundle zzahR;
    private final zzb zzaie;

    static {
        InFilter.CREATOR = new zzj();
    }

    InFilter(int versionCode, MetadataBundle value) {
        this.zzCY = versionCode;
        this.zzahR = value;
        this.zzaie = (zzb)zze.zzb(value);
    }

    public InFilter(SearchableCollectionMetadataField searchableCollectionMetadataField0, Object object0) {
        this(1, MetadataBundle.zza(searchableCollectionMetadataField0, Collections.singleton(object0)));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getValue() {
        return ((Collection)this.zzahR.zza(this.zzaie)).iterator().next();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzj.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        Object object0 = this.getValue();
        return zzf0.zzb(this.zzaie, object0);
    }
}

