package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmh.zza;
import com.google.android.gms.internal.zzmh;

public class DataTypeReadRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final zzmh zzamk;

    static {
        DataTypeReadRequest.CREATOR = new zzj();
    }

    DataTypeReadRequest(int versionCode, String name, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.mName = name;
        this.zzamk = callback == null ? null : zza.zzbs(callback);
        this.zzMZ = packageName;
    }

    public DataTypeReadRequest(String name, zzmh callback, String packageName) {
        this.zzCY = 2;
        this.mName = name;
        this.zzamk = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof DataTypeReadRequest && this.zzb(((DataTypeReadRequest)o));
    }

    public String getName() {
        return this.mName;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mName});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("name", this.mName).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }

    private boolean zzb(DataTypeReadRequest dataTypeReadRequest0) {
        return zzt.equal(this.mName, dataTypeReadRequest0.mName);
    }

    public IBinder zzqU() {
        return this.zzamk.asBinder();
    }
}

