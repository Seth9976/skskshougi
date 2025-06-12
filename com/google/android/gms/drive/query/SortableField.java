package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;

public class SortableField {
    public static final SortableMetadataField CREATED_DATE;
    public static final SortableMetadataField LAST_VIEWED_BY_ME;
    public static final SortableMetadataField MODIFIED_BY_ME_DATE;
    public static final SortableMetadataField MODIFIED_DATE;
    public static final SortableMetadataField QUOTA_USED;
    public static final SortableMetadataField SHARED_WITH_ME_DATE;
    public static final SortableMetadataField TITLE;

    static {
        SortableField.TITLE = zzlo.zzahp;
        SortableField.CREATED_DATE = zzlq.zzahy;
        SortableField.MODIFIED_DATE = zzlq.zzahA;
        SortableField.MODIFIED_BY_ME_DATE = zzlq.zzahB;
        SortableField.LAST_VIEWED_BY_ME = zzlq.zzahz;
        SortableField.SHARED_WITH_ME_DATE = zzlq.zzahC;
        SortableField.QUOTA_USED = zzlo.zzahm;
    }
}

