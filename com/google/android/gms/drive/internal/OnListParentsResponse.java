package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListParentsResponse extends WriteAwareParcelable implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DataHolder zzagq;

    static {
        OnListParentsResponse.CREATOR = new zzbc();
    }

    OnListParentsResponse(int versionCode, DataHolder parents) {
        this.zzCY = versionCode;
        this.zzagq = parents;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.drive.WriteAwareParcelable
    protected void zzI(Parcel parcel0, int v) {
        zzbc.zza(this, parcel0, v);
    }

    public DataHolder zzpR() {
        return this.zzagq;
    }
}

