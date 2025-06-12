package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;
import com.google.android.gms.internal.zzls;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class Metadata implements Freezable {
    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY;

    public String getAlternateLink() {
        return (String)this.zza(zzlo.zzagL);
    }

    public int getContentAvailability() {
        Integer integer0 = (Integer)this.zza(zzls.zzahE);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public Date getCreatedDate() {
        return (Date)this.zza(zzlq.zzahy);
    }

    public Map getCustomProperties() {
        AppVisibleCustomProperties appVisibleCustomProperties0 = (AppVisibleCustomProperties)this.zza(zzlo.zzagM);
        return appVisibleCustomProperties0 == null ? Collections.emptyMap() : appVisibleCustomProperties0.zzpT();
    }

    public String getDescription() {
        return (String)this.zza(zzlo.zzagN);
    }

    public DriveId getDriveId() {
        return (DriveId)this.zza(zzlo.zzagK);
    }

    public String getEmbedLink() {
        return (String)this.zza(zzlo.zzagO);
    }

    public String getFileExtension() {
        return (String)this.zza(zzlo.zzagP);
    }

    public long getFileSize() {
        return (long)(((Long)this.zza(zzlo.zzagQ)));
    }

    public Date getLastViewedByMeDate() {
        return (Date)this.zza(zzlq.zzahz);
    }

    public String getMimeType() {
        return (String)this.zza(zzlo.zzahg);
    }

    public Date getModifiedByMeDate() {
        return (Date)this.zza(zzlq.zzahB);
    }

    public Date getModifiedDate() {
        return (Date)this.zza(zzlq.zzahA);
    }

    public String getOriginalFilename() {
        return (String)this.zza(zzlo.zzahh);
    }

    public long getQuotaBytesUsed() {
        return (long)(((Long)this.zza(zzlo.zzahm)));
    }

    public Date getSharedWithMeDate() {
        return (Date)this.zza(zzlq.zzahC);
    }

    public String getTitle() {
        return (String)this.zza(zzlo.zzahp);
    }

    public String getWebContentLink() {
        return (String)this.zza(zzlo.zzahr);
    }

    public String getWebViewLink() {
        return (String)this.zza(zzlo.zzahs);
    }

    public boolean isEditable() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzagW);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isExplicitlyTrashed() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzagX);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isFolder() {
        return "application/vnd.google-apps.folder".equals(this.getMimeType());
    }

    public boolean isInAppFolder() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzagU);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isPinnable() {
        Boolean boolean0 = (Boolean)this.zza(zzls.zzahF);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isPinned() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzagY);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isRestricted() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzaha);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isShared() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzahb);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isStarred() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzahn);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isTrashable() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzahe);
        return boolean0 == null ? true : boolean0.booleanValue();
    }

    public boolean isTrashed() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzahq);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public boolean isViewed() {
        Boolean boolean0 = (Boolean)this.zza(zzlo.zzahf);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public abstract Object zza(MetadataField arg1);
}

