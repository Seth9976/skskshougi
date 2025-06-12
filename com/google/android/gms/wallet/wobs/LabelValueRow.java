package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

public final class LabelValueRow implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    String zzaSx;
    String zzaSy;
    ArrayList zzaSz;

    static {
        LabelValueRow.CREATOR = new zzc();
    }

    LabelValueRow() {
        this.zzCY = 1;
        this.zzaSz = zzkx.zzoP();
    }

    LabelValueRow(int versionCode, String hexFontColor, String hexBackgroundColor, ArrayList arrayList0) {
        this.zzCY = versionCode;
        this.zzaSx = hexFontColor;
        this.zzaSy = hexBackgroundColor;
        this.zzaSz = arrayList0;
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
        zzc.zza(this, dest, flags);
    }
}

