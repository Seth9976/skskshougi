package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class DataStatsResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzamV;

    static {
        DataStatsResult.CREATOR = new zzf();
    }

    DataStatsResult(int versionCode, Status status, List list0) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzamV = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }

    List zzrx() {
        return this.zzamV;
    }
}

