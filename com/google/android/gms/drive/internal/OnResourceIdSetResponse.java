package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class OnResourceIdSetResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final List zzaep;

    static {
        OnResourceIdSetResponse.CREATOR = new zzbf();
    }

    OnResourceIdSetResponse(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzaep = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbf.zza(this, dest, flags);
    }

    public List zzpA() {
        return this.zzaep;
    }
}

