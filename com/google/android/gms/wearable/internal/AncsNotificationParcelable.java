package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

public class AncsNotificationParcelable implements SafeParcelable, zzb {
    public static final Parcelable.Creator CREATOR;
    private int mId;
    final int zzCY;
    private final String zzRx;
    private final String zzaEw;
    private final String zzaTu;
    private byte zzaTv;
    private byte zzaTw;
    private byte zzaTx;
    private byte zzaTy;
    private String zzadI;
    private final String zzadv;
    private final String zzaox;

    static {
        AncsNotificationParcelable.CREATOR = new zze();
    }

    AncsNotificationParcelable(int versionCode, int id, String appId, String dateTime, String notificationText, String title, String subtitle, String displayName, byte eventId, byte eventFlags, byte categoryId, byte categoryCount) {
        this.mId = id;
        this.zzCY = versionCode;
        this.zzaEw = appId;
        this.zzaTu = dateTime;
        this.zzRx = notificationText;
        this.zzadv = title;
        this.zzaox = subtitle;
        this.zzadI = displayName;
        this.zzaTv = eventId;
        this.zzaTw = eventFlags;
        this.zzaTx = categoryId;
        this.zzaTy = categoryCount;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if(this.zzaTy != ((AncsNotificationParcelable)o).zzaTy) {
            return false;
        }
        if(this.zzaTx != ((AncsNotificationParcelable)o).zzaTx) {
            return false;
        }
        if(this.zzaTw != ((AncsNotificationParcelable)o).zzaTw) {
            return false;
        }
        if(this.zzaTv != ((AncsNotificationParcelable)o).zzaTv) {
            return false;
        }
        if(this.mId != ((AncsNotificationParcelable)o).mId) {
            return false;
        }
        if(this.zzCY != ((AncsNotificationParcelable)o).zzCY) {
            return false;
        }
        if(!this.zzaEw.equals(((AncsNotificationParcelable)o).zzaEw)) {
            return false;
        }
        if(this.zzaTu != null) {
            if(this.zzaTu.equals(((AncsNotificationParcelable)o).zzaTu)) {
                goto label_22;
            }
            return false;
        }
        if(((AncsNotificationParcelable)o).zzaTu == null) {
        label_22:
            if(!this.zzadI.equals(((AncsNotificationParcelable)o).zzadI)) {
                return false;
            }
            if(!this.zzRx.equals(((AncsNotificationParcelable)o).zzRx)) {
                return false;
            }
            return this.zzaox.equals(((AncsNotificationParcelable)o).zzaox) ? this.zzadv.equals(((AncsNotificationParcelable)o).zzadv) : false;
        }
        return false;
    }

    public String getDisplayName() {
        return this.zzadI == null ? this.zzaEw : this.zzadI;
    }

    public int getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.zzadv;
    }

    @Override
    public int hashCode() {
        int v = (this.zzCY * 0x1F + this.mId) * 0x1F;
        int v1 = this.zzaEw.hashCode();
        return this.zzaTu == null ? ((((((((v + v1) * 961 + this.zzRx.hashCode()) * 0x1F + this.zzadv.hashCode()) * 0x1F + this.zzaox.hashCode()) * 0x1F + this.zzadI.hashCode()) * 0x1F + this.zzaTv) * 0x1F + this.zzaTw) * 0x1F + this.zzaTx) * 0x1F + this.zzaTy : ((((((((this.zzaTu.hashCode() + (v + v1) * 0x1F) * 0x1F + this.zzRx.hashCode()) * 0x1F + this.zzadv.hashCode()) * 0x1F + this.zzaox.hashCode()) * 0x1F + this.zzadI.hashCode()) * 0x1F + this.zzaTv) * 0x1F + this.zzaTw) * 0x1F + this.zzaTx) * 0x1F + this.zzaTy;
    }

    @Override
    public String toString() {
        return "AncsNotificationParcelable{mVersionCode=" + this.zzCY + ", mId=" + this.mId + ", mAppId=\'" + this.zzaEw + '\'' + ", mDateTime=\'" + this.zzaTu + '\'' + ", mNotificationText=\'" + this.zzRx + '\'' + ", mTitle=\'" + this.zzadv + '\'' + ", mSubtitle=\'" + this.zzaox + '\'' + ", mDisplayName=\'" + this.zzadI + '\'' + ", mEventId=" + ((int)this.zzaTv) + ", mEventFlags=" + ((int)this.zzaTw) + ", mCategoryId=" + ((int)this.zzaTx) + ", mCategoryCount=" + ((int)this.zzaTy) + '}';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }

    public String zzAU() {
        return this.zzaTu;
    }

    public String zzAV() {
        return this.zzRx;
    }

    public byte zzAW() {
        return this.zzaTv;
    }

    public byte zzAX() {
        return this.zzaTw;
    }

    public byte zzAY() {
        return this.zzaTx;
    }

    public byte zzAZ() {
        return this.zzaTy;
    }

    public String zzsK() {
        return this.zzaEw;
    }

    public String zzsb() {
        return this.zzaox;
    }
}

