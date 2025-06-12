package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetInstrumentsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    int[] zzaRL;

    static {
        GetInstrumentsRequest.CREATOR = new zzd();
    }

    GetInstrumentsRequest() {
        this(1, null);
    }

    GetInstrumentsRequest(int versionCode, int[] familyFilter) {
        this.zzCY = versionCode;
        this.zzaRL = familyFilter;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzd.zza(this, out, flags);
    }
}

