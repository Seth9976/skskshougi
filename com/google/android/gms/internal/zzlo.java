package com.google.android.gms.internal;

import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.zzg;
import com.google.android.gms.drive.metadata.internal.zzi;
import com.google.android.gms.drive.metadata.internal.zzj;
import com.google.android.gms.drive.metadata.internal.zzl;
import com.google.android.gms.drive.metadata.internal.zzn;
import com.google.android.gms.drive.metadata.internal.zzo;
import com.google.android.gms.drive.metadata.internal.zzp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class zzlo {
    public static class zza extends zzlp implements SearchableMetadataField {
        public zza(int v) {
            super(v);
        }
    }

    public static class zzb extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField {
        public zzb(String s, int v) {
            super(s, v);
        }
    }

    public static class zzc extends zzo implements SearchableMetadataField {
        public zzc(int v) {
            super("mimeType", v);
        }
    }

    public static class zzd extends zzg implements SortableMetadataField {
        public zzd(String s, int v) {
            super(s, v);
        }
    }

    public static class zze extends zzi {
        public zze(int v) {
            super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), v);
        }

        @Override  // com.google.android.gms.drive.metadata.zzb
        protected Object zzc(DataHolder dataHolder0, int v, int v1) {
            return this.zzd(dataHolder0, v, v1);
        }

        @Override  // com.google.android.gms.drive.metadata.zzb
        protected Collection zzd(DataHolder dataHolder0, int v, int v1) {
            Collection collection0 = new ArrayList();
            if(dataHolder0.zze("inDriveSpace", v, v1)) {
                ((List)collection0).add(DriveSpace.zzadi);
            }
            if(dataHolder0.zze("isAppData", v, v1)) {
                ((List)collection0).add(DriveSpace.zzadj);
            }
            if(dataHolder0.zze("inGooglePhotosSpace", v, v1)) {
                ((List)collection0).add(DriveSpace.zzadk);
            }
            return collection0;
        }
    }

    public static class zzf extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField {
        public zzf(String s, int v) {
            super(s, v);
        }
    }

    public static class com.google.android.gms.internal.zzlo.zzg extends zzo implements SearchableMetadataField, SortableMetadataField {
        public com.google.android.gms.internal.zzlo.zzg(String s, int v) {
            super(s, v);
        }
    }

    public static class zzh extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField {
        public zzh(String s, int v) {
            super(s, v);
        }

        @Override  // com.google.android.gms.drive.metadata.internal.zzb
        protected Object zzc(DataHolder dataHolder0, int v, int v1) {
            return this.zze(dataHolder0, v, v1);
        }

        @Override  // com.google.android.gms.drive.metadata.internal.zzb
        protected Boolean zze(DataHolder dataHolder0, int v, int v1) {
            return dataHolder0.zzc(this.getName(), v, v1) == 0 ? false : true;
        }
    }

    public static final MetadataField zzagK;
    public static final MetadataField zzagL;
    public static final zza zzagM;
    public static final MetadataField zzagN;
    public static final MetadataField zzagO;
    public static final MetadataField zzagP;
    public static final MetadataField zzagQ;
    public static final MetadataField zzagR;
    public static final MetadataField zzagS;
    public static final MetadataField zzagT;
    public static final MetadataField zzagU;
    public static final MetadataField zzagV;
    public static final MetadataField zzagW;
    public static final MetadataField zzagX;
    public static final zzb zzagY;
    public static final MetadataField zzagZ;
    public static final MetadataField zzaha;
    public static final MetadataField zzahb;
    public static final MetadataField zzahc;
    public static final MetadataField zzahd;
    public static final MetadataField zzahe;
    public static final MetadataField zzahf;
    public static final zzc zzahg;
    public static final MetadataField zzahh;
    public static final com.google.android.gms.drive.metadata.zzb zzahi;
    public static final zzp zzahj;
    public static final zzp zzahk;
    public static final zzl zzahl;
    public static final zzd zzahm;
    public static final zzf zzahn;
    public static final MetadataField zzaho;
    public static final com.google.android.gms.internal.zzlo.zzg zzahp;
    public static final zzh zzahq;
    public static final MetadataField zzahr;
    public static final MetadataField zzahs;
    public static final MetadataField zzaht;
    public static final com.google.android.gms.drive.metadata.internal.zzb zzahu;
    public static final MetadataField zzahv;
    public static final MetadataField zzahw;
    public static final zze zzahx;

    static {
        zzlo.zzagK = zzlr.zzahD;
        zzlo.zzagL = new zzo("alternateLink", 4300000);
        zzlo.zzagM = new zza(5000000);
        zzlo.zzagN = new zzo("description", 4300000);
        zzlo.zzagO = new zzo("embedLink", 4300000);
        zzlo.zzagP = new zzo("fileExtension", 4300000);
        zzlo.zzagQ = new zzg("fileSize", 4300000);
        zzlo.zzagR = new zzo("folderColorRgb", 7500000);
        zzlo.zzagS = new com.google.android.gms.drive.metadata.internal.zzb("hasThumbnail", 4300000);
        zzlo.zzagT = new zzo("indexableText", 4300000);
        zzlo.zzagU = new com.google.android.gms.drive.metadata.internal.zzb("isAppData", 4300000);
        zzlo.zzagV = new com.google.android.gms.drive.metadata.internal.zzb("isCopyable", 4300000);
        zzlo.zzagW = new com.google.android.gms.drive.metadata.internal.zzb("isEditable", 4100000);
        zzlo.zzagX = new com.google.android.gms.drive.metadata.internal.zzb("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet(), 7000000) {
            @Override  // com.google.android.gms.drive.metadata.internal.zzb
            protected Boolean zze(DataHolder dataHolder0, int v, int v1) {
                return dataHolder0.zzc("trashed", v, v1) == 2;
            }
        };
        zzlo.zzagY = new zzb("isPinned", 4100000);
        zzlo.zzagZ = new com.google.android.gms.drive.metadata.internal.zzb("isOpenable", 7200000);
        zzlo.zzaha = new com.google.android.gms.drive.metadata.internal.zzb("isRestricted", 4300000);
        zzlo.zzahb = new com.google.android.gms.drive.metadata.internal.zzb("isShared", 4300000);
        zzlo.zzahc = new com.google.android.gms.drive.metadata.internal.zzb("isGooglePhotosFolder", 7000000);
        zzlo.zzahd = new com.google.android.gms.drive.metadata.internal.zzb("isGooglePhotosRootFolder", 7000000);
        zzlo.zzahe = new com.google.android.gms.drive.metadata.internal.zzb("isTrashable", 4400000);
        zzlo.zzahf = new com.google.android.gms.drive.metadata.internal.zzb("isViewed", 4300000);
        zzlo.zzahg = new zzc(4100000);
        zzlo.zzahh = new zzo("originalFilename", 4300000);
        zzlo.zzahi = new zzn("ownerNames", 4300000);
        zzlo.zzahj = new zzp("lastModifyingUser", 6000000);
        zzlo.zzahk = new zzp("sharingUser", 6000000);
        zzlo.zzahl = new zzl(4100000);
        zzlo.zzahm = new zzd("quotaBytesUsed", 4300000);
        zzlo.zzahn = new zzf("starred", 4100000);
        zzlo.zzaho = new zzj("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000) {
            protected BitmapTeleporter zzk(DataHolder dataHolder0, int v, int v1) {
                throw new IllegalStateException("Thumbnail field is write only");
            }
        };
        zzlo.zzahp = new com.google.android.gms.internal.zzlo.zzg("title", 4100000);
        zzlo.zzahq = new zzh("trashed", 4100000);
        zzlo.zzahr = new zzo("webContentLink", 4300000);
        zzlo.zzahs = new zzo("webViewLink", 4300000);
        zzlo.zzaht = new zzo("uniqueIdentifier", 5000000);
        zzlo.zzahu = new com.google.android.gms.drive.metadata.internal.zzb("writersCanShare", 6000000);
        zzlo.zzahv = new zzo("role", 6000000);
        zzlo.zzahw = new zzo("md5Checksum", 7000000);
        zzlo.zzahx = new zze(7000000);
    }
}

