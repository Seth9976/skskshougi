package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class SyncInfoResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final long zzVp;

    static {
        SyncInfoResult.CREATOR = new zzl();
    }

    SyncInfoResult(int versionCode, Status status, long timestamp) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzVp = timestamp;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof SyncInfoResult && this.zzb(((SyncInfoResult)that));
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
        return zzt.hashCode(new Object[]{this.zzOt, this.zzVp});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("timestamp", this.zzVp).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzl.zza(this, dest, flags);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(SyncInfoResult syncInfoResult0) {
        return this.zzOt.equals(syncInfoResult0.zzOt) && zzt.equal(this.zzVp, syncInfoResult0.zzVp);
    }

    public long zzrz() {
        return this.zzVp;
    }
}

