package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetPermissionsResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzafO;
    final int zzws;

    static {
        GetPermissionsResponse.CREATOR = new zzaj();
    }

    GetPermissionsResponse(int versionCode, List list0, int responseCode) {
        this.zzCY = versionCode;
        this.zzafO = list0;
        this.zzws = responseCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzaj.zza(this, dest, flags);
    }
}

