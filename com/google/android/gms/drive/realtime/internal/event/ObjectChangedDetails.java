package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ObjectChangedDetails implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final int zzaiA;
    final int zzaiB;

    static {
        ObjectChangedDetails.CREATOR = new zzb();
    }

    ObjectChangedDetails(int versionCode, int valueIndex, int valueCount) {
        this.zzCY = versionCode;
        this.zzaiA = valueIndex;
        this.zzaiB = valueCount;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }
}

