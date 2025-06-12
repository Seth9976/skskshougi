package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzt;

public class PlusCommonExtras implements SafeParcelable {
    public static final zzf CREATOR;
    private final int zzCY;
    private String zzaHr;
    private String zzaHs;

    static {
        PlusCommonExtras.CREATOR = new zzf();
    }

    public PlusCommonExtras() {
        this.zzCY = 1;
        this.zzaHr = "";
        this.zzaHs = "";
    }

    PlusCommonExtras(int versionCode, String gpsrc, String clientCallingPackage) {
        this.zzCY = versionCode;
        this.zzaHr = gpsrc;
        this.zzaHs = clientCallingPackage;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object obj) {
        return obj instanceof PlusCommonExtras ? this.zzCY == ((PlusCommonExtras)obj).zzCY && zzt.equal(this.zzaHr, ((PlusCommonExtras)obj).zzaHr) && zzt.equal(this.zzaHs, ((PlusCommonExtras)obj).zzaHs) : false;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzCY, this.zzaHr, this.zzaHs});
    }

    @Override
    public String toString() [...] // Potential decryptor

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzf.zza(this, out, flags);
    }

    public String zzxv() [...] // Potential decryptor

    public String zzxw() [...] // Potential decryptor

    public void zzy(Bundle bundle0) {
        bundle0.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", zzc.zza(this));
    }
}

