package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class EndCompoundOperationRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;

    static {
        EndCompoundOperationRequest.CREATOR = new zzb();
    }

    public EndCompoundOperationRequest() {
        this(1);
    }

    EndCompoundOperationRequest(int versionCode) {
        this.zzCY = versionCode;
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

