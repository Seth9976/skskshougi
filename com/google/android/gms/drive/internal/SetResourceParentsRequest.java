package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzagv;
    final List zzagw;

    static {
        SetResourceParentsRequest.CREATOR = new zzbp();
    }

    SetResourceParentsRequest(int versionCode, DriveId targetId, List list0) {
        this.zzCY = versionCode;
        this.zzagv = targetId;
        this.zzagw = list0;
    }

    public SetResourceParentsRequest(DriveId targetId, List list0) {
        this(1, targetId, list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbp.zza(this, dest, flags);
    }
}

