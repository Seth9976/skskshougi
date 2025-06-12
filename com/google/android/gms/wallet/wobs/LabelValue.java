package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LabelValue implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String label;
    String value;
    private final int zzCY;

    static {
        LabelValue.CREATOR = new zzb();
    }

    LabelValue() {
        this.zzCY = 1;
    }

    LabelValue(int versionCode, String label, String value) {
        this.zzCY = versionCode;
        this.label = label;
        this.value = value;
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
        zzb.zza(this, dest, flags);
    }
}

