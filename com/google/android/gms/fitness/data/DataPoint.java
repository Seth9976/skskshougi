package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlu;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final DataSource zzajG;
    private long zzajV;
    private long zzajW;
    private final Value[] zzajX;
    private DataSource zzajY;
    private long zzajZ;
    private long zzaka;

    static {
        DataPoint.CREATOR = new zzd();
    }

    DataPoint(int versionCode, DataSource dataSource, long timestampNanos, long startTimeNanos, Value[] values, DataSource originalDataSource, long rawTimestamp, long insertionTimeMillis) {
        this.zzCY = versionCode;
        this.zzajG = dataSource;
        this.zzajY = originalDataSource;
        this.zzajV = timestampNanos;
        this.zzajW = startTimeNanos;
        this.zzajX = values;
        this.zzajZ = rawTimestamp;
        this.zzaka = insertionTimeMillis;
    }

    private DataPoint(DataSource dataSource) {
        this.zzCY = 4;
        this.zzajG = (DataSource)zzu.zzb(dataSource, "Data source cannot be null");
        List list0 = dataSource.getDataType().getFields();
        this.zzajX = new Value[list0.size()];
        int v = 0;
        for(Object object0: list0) {
            this.zzajX[v] = new Value(((Field)object0).getFormat());
            ++v;
        }
    }

    public DataPoint(DataSource dataSource, DataSource originalDataSource, RawDataPoint rawDataPoint) {
        this(4, dataSource, DataPoint.zza(rawDataPoint.zzajV, 0L), DataPoint.zza(rawDataPoint.zzajW, 0L), rawDataPoint.zzajX, originalDataSource, DataPoint.zza(rawDataPoint.zzajZ, 0L), DataPoint.zza(rawDataPoint.zzaka, 0L));
    }

    DataPoint(List list0, RawDataPoint rawDataPoint) {
        this(DataPoint.zza(list0, rawDataPoint.zzakH), DataPoint.zza(list0, rawDataPoint.zzakI), rawDataPoint);
    }

    public static DataPoint create(DataSource dataSource) {
        return new DataPoint(dataSource);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof DataPoint && this.zza(((DataPoint)o));
    }

    public static DataPoint extract(Intent intent) {
        return intent == null ? null : ((DataPoint)zzc.zza(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", DataPoint.CREATOR));
    }

    public DataSource getDataSource() {
        return this.zzajG;
    }

    public DataType getDataType() {
        return this.zzajG.getDataType();
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzajV, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource() {
        return this.zzajY;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzajW, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzajV, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos() {
        return this.zzajV;
    }

    public Value getValue(Field field) {
        return this.zzajX[this.getDataType().indexOf(field)];
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajG, this.zzajV, this.zzajW});
    }

    public DataPoint setFloatValues(float[] values) {
        this.zzed(values.length);
        for(int v = 0; v < values.length; ++v) {
            this.zzajX[v].setFloat(values[v]);
        }
        return this;
    }

    public DataPoint setIntValues(int[] values) {
        this.zzed(values.length);
        for(int v = 0; v < values.length; ++v) {
            this.zzajX[v].setInt(values[v]);
        }
        return this;
    }

    public DataPoint setTimeInterval(long startTime, long endTime, TimeUnit timeUnit) {
        this.zzajW = timeUnit.toNanos(startTime);
        this.zzajV = timeUnit.toNanos(endTime);
        return this;
    }

    public DataPoint setTimestamp(long timestamp, TimeUnit timeUnit) {
        this.zzajV = timeUnit.toNanos(timestamp);
        if(this.zzqt() && zzlu.zza(timeUnit)) {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            this.zzajV = zzlu.zza(this.zzajV, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", Arrays.toString(this.zzajX), this.zzajW, this.zzajV, this.zzajZ, this.zzaka, this.zzajG.toDebugString(), (this.zzajY == null ? "N/A" : this.zzajY.toDebugString()));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzd.zza(this, parcel, flags);
    }

    private static long zza(Long long0, long v) {
        return long0 == null ? v : ((long)long0);
    }

    private static DataSource zza(List list0, int v) {
        return v < 0 || v >= list0.size() ? null : ((DataSource)list0.get(v));
    }

    // 去混淆评级： 低(30)
    private boolean zza(DataPoint dataPoint0) {
        return zzt.equal(this.zzajG, dataPoint0.zzajG) && this.zzajV == dataPoint0.zzajV && this.zzajW == dataPoint0.zzajW && Arrays.equals(this.zzajX, dataPoint0.zzajX) && zzt.equal(this.zzajY, dataPoint0.zzajY);
    }

    private void zzed(int v) {
        List list0 = this.getDataType().getFields();
        int v1 = list0.size();
        zzu.zzb(v == v1, "Attempting to insert %s values, but needed %s: %s", new Object[]{v, v1, list0});
    }

    private boolean zzqt() {
        return this.getDataType() == DataType.TYPE_LOCATION_SAMPLE;
    }

    public Value[] zzqu() {
        return this.zzajX;
    }

    public long zzqv() {
        return this.zzajZ;
    }

    public long zzqw() {
        return this.zzaka;
    }

    public void zzqx() {
        zzu.zzb(this.getDataType().getName().equals(this.getDataSource().getDataType().getName()), "Conflicting data types found %s vs %s", new Object[]{this.getDataType(), this.getDataType()});
        zzu.zzb(this.zzajV > 0L, "Data point does not have the timestamp set: %s", new Object[]{this});
        zzu.zzb(this.zzajW <= this.zzajV, "Data point with start time greater than end time found: %s", new Object[]{this});
    }

    public long zzqy() {
        return this.zzajW;
    }
}

