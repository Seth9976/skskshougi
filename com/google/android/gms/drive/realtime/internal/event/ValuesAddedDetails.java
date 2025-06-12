package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesAddedDetails implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int mIndex;
    final int zzCY;
    final int zzaiA;
    final int zzaiB;
    final String zzaiY;
    final int zzaiZ;

    static {
        ValuesAddedDetails.CREATOR = new zzi();
    }

    ValuesAddedDetails(int versionCode, int index, int valueIndex, int valueCount, String movedFromId, int movedFromIndex) {
        this.zzCY = versionCode;
        this.mIndex = index;
        this.zzaiA = valueIndex;
        this.zzaiB = valueCount;
        this.zzaiY = movedFromId;
        this.zzaiZ = movedFromIndex;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }
}

