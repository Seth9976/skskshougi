package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValueChangedDetails implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final int zzaiz;

    static {
        ValueChangedDetails.CREATOR = new zzh();
    }

    ValueChangedDetails(int versionCode, int keyIndex) {
        this.zzCY = versionCode;
        this.zzaiz = keyIndex;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }
}

