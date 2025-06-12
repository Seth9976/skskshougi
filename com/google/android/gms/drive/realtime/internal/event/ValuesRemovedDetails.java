package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesRemovedDetails implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int mIndex;
    final int zzCY;
    final int zzaiA;
    final int zzaiB;
    final String zzaja;
    final int zzajb;

    static {
        ValuesRemovedDetails.CREATOR = new zzj();
    }

    ValuesRemovedDetails(int versionCode, int index, int valueIndex, int valueCount, String movedToId, int movedToIndex) {
        this.zzCY = versionCode;
        this.mIndex = index;
        this.zzaiA = valueIndex;
        this.zzaiB = valueCount;
        this.zzaja = movedToId;
        this.zzajb = movedToIndex;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }
}

