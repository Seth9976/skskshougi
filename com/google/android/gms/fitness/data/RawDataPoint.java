package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawDataPoint implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final long zzajV;
    public final long zzajW;
    public final Value[] zzajX;
    public final long zzajZ;
    public final int zzakH;
    public final int zzakI;
    public final long zzaka;

    static {
        RawDataPoint.CREATOR = new zzn();
    }

    public RawDataPoint(int versionCode, long timestampNanos, long startTimeNanos, Value[] values, int dataSourceIndex, int originalDataSourceIndex, long rawTimestamp, long insertionTimeMillis) {
        this.zzCY = versionCode;
        this.zzajV = timestampNanos;
        this.zzajW = startTimeNanos;
        this.zzakH = dataSourceIndex;
        this.zzakI = originalDataSourceIndex;
        this.zzajZ = rawTimestamp;
        this.zzaka = insertionTimeMillis;
        this.zzajX = values;
    }

    RawDataPoint(DataPoint dataPoint, List list0) {
        this.zzCY = 4;
        this.zzajV = dataPoint.getTimestamp(TimeUnit.NANOSECONDS);
        this.zzajW = dataPoint.getStartTime(TimeUnit.NANOSECONDS);
        this.zzajX = dataPoint.zzqu();
        this.zzakH = zzs.zza(dataPoint.getDataSource(), list0);
        this.zzakI = zzs.zza(dataPoint.getOriginalDataSource(), list0);
        this.zzajZ = dataPoint.zzqv();
        this.zzaka = dataPoint.zzqw();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof RawDataPoint && this.zza(((RawDataPoint)o));
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajV, this.zzajW});
    }

    @Override
    public String toString() {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", Arrays.toString(this.zzajX), this.zzajW, this.zzajV, this.zzakH, this.zzakI);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzn.zza(this, parcel, flags);
    }

    private boolean zza(RawDataPoint rawDataPoint0) {
        return this.zzajV == rawDataPoint0.zzajV && this.zzajW == rawDataPoint0.zzajW && Arrays.equals(this.zzajX, rawDataPoint0.zzajX) && this.zzakH == rawDataPoint0.zzakH && this.zzakI == rawDataPoint0.zzakI && this.zzajZ == rawDataPoint0.zzajZ;
    }
}

