package com.google.android.gms.internal;

import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.zzd;

public class zzlq {
    public static class zza extends zzd implements SortableMetadataField {
        public zza(String s, int v) {
            super(s, v);
        }
    }

    public static class zzb extends zzd implements SearchableOrderedMetadataField, SortableMetadataField {
        public zzb(String s, int v) {
            super(s, v);
        }
    }

    public static class zzc extends zzd implements SortableMetadataField {
        public zzc(String s, int v) {
            super(s, v);
        }
    }

    public static class com.google.android.gms.internal.zzlq.zzd extends zzd implements SearchableOrderedMetadataField, SortableMetadataField {
        public com.google.android.gms.internal.zzlq.zzd(String s, int v) {
            super(s, v);
        }
    }

    public static class zze extends zzd implements SearchableOrderedMetadataField, SortableMetadataField {
        public zze(String s, int v) {
            super(s, v);
        }
    }

    public static final com.google.android.gms.internal.zzlq.zzd zzahA;
    public static final zzc zzahB;
    public static final zze zzahC;
    public static final zza zzahy;
    public static final zzb zzahz;

    static {
        zzlq.zzahy = new zza("created", 4100000);
        zzlq.zzahz = new zzb("lastOpenedTime", 4300000);
        zzlq.zzahA = new com.google.android.gms.internal.zzlq.zzd("modified", 4100000);
        zzlq.zzahB = new zzc("modifiedByMe", 4100000);
        zzlq.zzahC = new zze("sharedWithMe", 4100000);
    }
}

