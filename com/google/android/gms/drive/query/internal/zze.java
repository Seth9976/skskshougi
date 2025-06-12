package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

class zze {
    static MetadataField zzb(MetadataBundle metadataBundle0) {
        Set set0 = metadataBundle0.zzpY();
        if(set0.size() != 1) {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        }
        return set0.iterator().next();
    }
}

