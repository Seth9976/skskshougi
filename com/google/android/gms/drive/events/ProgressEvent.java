package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.drive.DriveId;

public final class ProgressEvent implements DriveEvent {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final int zzSq;
    final DriveId zzacT;
    final long zzaeg;
    final long zzaeh;
    final int zzwS;

    static {
        ProgressEvent.CREATOR = new zzh();
    }

    ProgressEvent(int versionCode, DriveId driveId, int status, long bytesTransferred, long totalBytes, int type) {
        this.zzCY = versionCode;
        this.zzacT = driveId;
        this.zzwS = status;
        this.zzaeg = bytesTransferred;
        this.zzaeh = totalBytes;
        this.zzSq = type;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == this.getClass() ? o == this || zzt.equal(this.zzacT, ((ProgressEvent)o).zzacT) && this.zzwS == ((ProgressEvent)o).zzwS && this.zzaeg == ((ProgressEvent)o).zzaeg && this.zzaeh == ((ProgressEvent)o).zzaeh : false;
    }

    @Override  // com.google.android.gms.drive.events.DriveEvent
    public int getType() {
        return this.zzSq;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzacT, this.zzwS, this.zzaeg, this.zzaeh});
    }

    @Override
    public String toString() {
        return String.format("ProgressEvent[DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", this.zzacT, this.zzwS, this.zzaeg, this.zzaeh);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }
}

