package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSet;

public class DailyTotalResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final DataSet zzakO;

    static {
        DailyTotalResult.CREATOR = new zzb();
    }

    DailyTotalResult(int versionCode, Status status, DataSet dataSet) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzakO = dataSet;
    }

    public DailyTotalResult(DataSet dataSet, Status status) {
        this.zzCY = 1;
        this.zzOt = status;
        this.zzakO = dataSet;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DailyTotalResult && this.zzb(((DailyTotalResult)that));
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    public DataSet getTotal() {
        return this.zzakO;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOt, this.zzakO});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("dataPoint", this.zzakO).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }

    public static DailyTotalResult zzK(Status status0) {
        return new DailyTotalResult(null, status0);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(DailyTotalResult dailyTotalResult0) {
        return this.zzOt.equals(dailyTotalResult0.zzOt) && zzt.equal(this.zzakO, dailyTotalResult0.zzakO);
    }
}

