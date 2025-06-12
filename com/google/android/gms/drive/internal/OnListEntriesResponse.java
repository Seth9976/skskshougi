package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListEntriesResponse extends WriteAwareParcelable implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final boolean zzaeL;
    final DataHolder zzagp;

    static {
        OnListEntriesResponse.CREATOR = new zzbb();
    }

    OnListEntriesResponse(int versionCode, DataHolder entries, boolean moreEntriesMayExist) {
        this.zzCY = versionCode;
        this.zzagp = entries;
        this.zzaeL = moreEntriesMayExist;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.drive.WriteAwareParcelable
    protected void zzI(Parcel parcel0, int v) {
        zzbb.zza(this, parcel0, v);
    }

    public DataHolder zzpP() {
        return this.zzagp;
    }

    public boolean zzpQ() {
        return this.zzaeL;
    }
}

