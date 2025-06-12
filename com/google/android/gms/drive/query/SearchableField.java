package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;

public class SearchableField {
    public static final SearchableMetadataField IS_PINNED;
    public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField MIME_TYPE;
    public static final SearchableOrderedMetadataField MODIFIED_DATE;
    public static final SearchableCollectionMetadataField PARENTS;
    public static final SearchableMetadataField STARRED;
    public static final SearchableMetadataField TITLE;
    public static final SearchableMetadataField TRASHED;
    public static final SearchableOrderedMetadataField zzahM;
    public static final SearchableMetadataField zzahN;

    static {
        SearchableField.TITLE = zzlo.zzahp;
        SearchableField.MIME_TYPE = zzlo.zzahg;
        SearchableField.TRASHED = zzlo.zzahq;
        SearchableField.PARENTS = zzlo.zzahl;
        SearchableField.zzahM = zzlq.zzahC;
        SearchableField.STARRED = zzlo.zzahn;
        SearchableField.MODIFIED_DATE = zzlq.zzahA;
        SearchableField.LAST_VIEWED_BY_ME = zzlq.zzahz;
        SearchableField.IS_PINNED = zzlo.zzagY;
        SearchableField.zzahN = zzlo.zzagM;
    }
}

