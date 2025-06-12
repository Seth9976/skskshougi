package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ReferenceShiftedDetails implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final String zzaiT;
    final String zzaiU;
    final int zzaiV;
    final int zzaiW;

    static {
        ReferenceShiftedDetails.CREATOR = new zze();
    }

    ReferenceShiftedDetails(int versionCode, String oldObjectId, String newObjectId, int oldIndex, int newIndex) {
        this.zzCY = versionCode;
        this.zzaiT = oldObjectId;
        this.zzaiU = newObjectId;
        this.zzaiV = oldIndex;
        this.zzaiW = newIndex;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }
}

