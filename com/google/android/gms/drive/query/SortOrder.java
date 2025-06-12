package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder implements SafeParcelable {
    public static class Builder {
        private final List zzahO;
        private boolean zzahP;

        public Builder() {
            this.zzahO = new ArrayList();
            this.zzahP = false;
        }

        public Builder addSortAscending(SortableMetadataField sortField) {
            FieldWithSortOrder fieldWithSortOrder0 = new FieldWithSortOrder(sortField.getName(), true);
            this.zzahO.add(fieldWithSortOrder0);
            return this;
        }

        public Builder addSortDescending(SortableMetadataField sortField) {
            FieldWithSortOrder fieldWithSortOrder0 = new FieldWithSortOrder(sortField.getName(), false);
            this.zzahO.add(fieldWithSortOrder0);
            return this;
        }

        public SortOrder build() {
            return new SortOrder(this.zzahO, this.zzahP, null);
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzahO;
    final boolean zzahP;

    static {
        SortOrder.CREATOR = new zzb();
    }

    SortOrder(int versionCode, List list0, boolean sortFolderFirst) {
        this.zzCY = versionCode;
        this.zzahO = list0;
        this.zzahP = sortFolderFirst;
    }

    private SortOrder(List list0, boolean sortFolderFirst) {
        this(1, list0, sortFolderFirst);
    }

    SortOrder(List x0, boolean x1, com.google.android.gms.drive.query.SortOrder.1 x2) {
        this(x0, x1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", TextUtils.join(",", this.zzahO), Boolean.valueOf(this.zzahP));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    class com.google.android.gms.drive.query.SortOrder.1 {
    }

}

