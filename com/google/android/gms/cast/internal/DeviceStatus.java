package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class DeviceStatus implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private double zzSh;
    private boolean zzSi;
    private ApplicationMetadata zzUF;
    private int zzUu;
    private int zzUv;

    static {
        DeviceStatus.CREATOR = new zzg();
    }

    public DeviceStatus() {
        this(3, NaN, false, -1, null, -1);
    }

    DeviceStatus(int versionCode, double volume, boolean muteState, int activeInputState, ApplicationMetadata applicationMetadata, int standbyState) {
        this.zzCY = versionCode;
        this.zzSh = volume;
        this.zzSi = muteState;
        this.zzUu = activeInputState;
        this.zzUF = applicationMetadata;
        this.zzUv = standbyState;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        return obj instanceof DeviceStatus ? this.zzSh == ((DeviceStatus)obj).zzSh && this.zzSi == ((DeviceStatus)obj).zzSi && this.zzUu == ((DeviceStatus)obj).zzUu && zzf.zza(this.zzUF, ((DeviceStatus)obj).zzUF) && this.zzUv == ((DeviceStatus)obj).zzUv : false;
    }

    public ApplicationMetadata getApplicationMetadata() {
        return this.zzUF;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzSh, Boolean.valueOf(this.zzSi), this.zzUu, this.zzUF, this.zzUv});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzg.zza(this, out, flags);
    }

    public double zzlO() {
        return this.zzSh;
    }

    public int zzlP() {
        return this.zzUu;
    }

    public int zzlQ() {
        return this.zzUv;
    }

    public boolean zzlX() {
        return this.zzSi;
    }
}

