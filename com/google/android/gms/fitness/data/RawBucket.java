package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawBucket implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final long zzKT;
    public final long zzajH;
    public final Session zzajJ;
    public final List zzajS;
    public final int zzajT;
    public final boolean zzajU;
    public final int zzakG;

    static {
        RawBucket.CREATOR = new zzm();
    }

    public RawBucket(int versionCode, long startTimeMillis, long endTimeMillis, Session session, int activity, List list0, int bucketType, boolean serverHasMoreData) {
        this.zzCY = versionCode;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzajJ = session;
        this.zzakG = activity;
        this.zzajS = list0;
        this.zzajT = bucketType;
        this.zzajU = serverHasMoreData;
    }

    public RawBucket(Bucket bucket, List list0, List list1) {
        this.zzCY = 2;
        this.zzKT = bucket.getStartTime(TimeUnit.MILLISECONDS);
        this.zzajH = bucket.getEndTime(TimeUnit.MILLISECONDS);
        this.zzajJ = bucket.getSession();
        this.zzakG = bucket.zzqq();
        this.zzajT = bucket.getBucketType();
        this.zzajU = bucket.zzqr();
        List list2 = bucket.getDataSets();
        this.zzajS = new ArrayList(list2.size());
        for(Object object0: list2) {
            RawDataSet rawDataSet0 = new RawDataSet(((DataSet)object0), list0, list1);
            this.zzajS.add(rawDataSet0);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof RawBucket && this.zza(((RawBucket)o));
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzKT, this.zzajH, this.zzajT});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("startTime", this.zzKT).zzg("endTime", this.zzajH).zzg("activity", this.zzakG).zzg("dataSets", this.zzajS).zzg("bucketType", this.zzajT).zzg("serverHasMoreData", Boolean.valueOf(this.zzajU)).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzm.zza(this, parcel, flags);
    }

    private boolean zza(RawBucket rawBucket0) {
        return this.zzKT == rawBucket0.zzKT && this.zzajH == rawBucket0.zzajH && this.zzakG == rawBucket0.zzakG && zzt.equal(this.zzajS, rawBucket0.zzajS) && this.zzajT == rawBucket0.zzajT && this.zzajU == rawBucket0.zzajU;
    }
}

