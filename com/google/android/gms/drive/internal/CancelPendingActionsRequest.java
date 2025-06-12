package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzadW;

    static {
        CancelPendingActionsRequest.CREATOR = new zze();
    }

    CancelPendingActionsRequest(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzadW = list0;
    }

    public CancelPendingActionsRequest(List list0) {
        this(1, list0);
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

