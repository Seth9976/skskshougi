package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataType;

public class DataTypeResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final DataType zzajF;

    static {
        DataTypeResult.CREATOR = new zzg();
    }

    DataTypeResult(int versionCode, Status status, DataType dataType) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzajF = dataType;
    }

    public DataTypeResult(Status status, DataType dataType) {
        this.zzCY = 2;
        this.zzOt = status;
        this.zzajF = dataType;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DataTypeResult && this.zzb(((DataTypeResult)that));
    }

    public DataType getDataType() {
        return this.zzajF;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOt, this.zzajF});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("dataType", this.zzajF).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzg.zza(this, dest, flags);
    }

    public static DataTypeResult zzM(Status status0) {
        return new DataTypeResult(status0, null);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(DataTypeResult dataTypeResult0) {
        return this.zzOt.equals(dataTypeResult0.zzOt) && zzt.equal(this.zzajF, dataTypeResult0.zzajF);
    }
}

