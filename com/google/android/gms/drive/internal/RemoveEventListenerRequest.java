package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemoveEventListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzacT;
    final int zzaca;

    static {
        RemoveEventListenerRequest.CREATOR = new zzbl();
    }

    RemoveEventListenerRequest(int versionCode, DriveId driveId, int eventType) {
        this.zzCY = versionCode;
        this.zzacT = driveId;
        this.zzaca = eventType;
    }

    public RemoveEventListenerRequest(DriveId id, int eventType) {
        this(1, id, eventType);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbl.zza(this, dest, flags);
    }
}

