package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzmf.zza;
import com.google.android.gms.internal.zzmf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest implements SafeParcelable {
    public static class Builder {
        private long zzKT;
        private long zzajH;
        private List zzajQ;
        private int zzajT;
        private List zzalP;
        private List zzalU;
        private List zzalV;
        private long zzalW;
        private DataSource zzalX;
        private int zzalY;
        private boolean zzalZ;
        private boolean zzama;
        private List zzamc;

        public Builder() {
            this.zzajQ = new ArrayList();
            this.zzalP = new ArrayList();
            this.zzalU = new ArrayList();
            this.zzalV = new ArrayList();
            this.zzajT = 0;
            this.zzalW = 0L;
            this.zzalY = 0;
            this.zzalZ = false;
            this.zzama = false;
            this.zzamc = new ArrayList();
        }

        public Builder aggregate(DataSource dataSource, DataType outputDataType) {
            zzu.zzb(dataSource, "Attempting to add a null data source");
            zzu.zza(!this.zzalP.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            DataType dataType1 = dataSource.getDataType();
            zzu.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(dataType1), "Unsupported input data type specified for aggregation: %s", new Object[]{dataType1});
            zzu.zzb(DataType.getAggregatesForInput(dataType1).contains(outputDataType), "Invalid output aggregate data type specified: %s -> %s", new Object[]{dataType1, outputDataType});
            if(!this.zzalV.contains(dataSource)) {
                this.zzalV.add(dataSource);
            }
            return this;
        }

        public Builder aggregate(DataType inputDataType, DataType outputDataType) {
            zzu.zzb(inputDataType, "Attempting to use a null data type");
            zzu.zza(!this.zzajQ.contains(inputDataType), "Cannot add the same data type as aggregated and detailed");
            zzu.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(inputDataType), "Unsupported input data type specified for aggregation: %s", new Object[]{inputDataType});
            zzu.zzb(DataType.getAggregatesForInput(inputDataType).contains(outputDataType), "Invalid output aggregate data type specified: %s -> %s", new Object[]{inputDataType, outputDataType});
            if(!this.zzalU.contains(inputDataType)) {
                this.zzalU.add(inputDataType);
            }
            return this;
        }

        public Builder bucketByActivitySegment(int minDuration, TimeUnit timeUnit) {
            zzu.zzb(this.zzajT == 0, "Bucketing strategy already set to %s", new Object[]{this.zzajT});
            zzu.zzb(minDuration > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{minDuration});
            this.zzajT = 4;
            this.zzalW = timeUnit.toMillis(((long)minDuration));
            return this;
        }

        public Builder bucketByActivitySegment(int minDuration, TimeUnit timeUnit, DataSource activityDataSource) {
            zzu.zzb(this.zzajT == 0, "Bucketing strategy already set to %s", new Object[]{this.zzajT});
            zzu.zzb(minDuration > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{minDuration});
            zzu.zzb(activityDataSource != null, "Invalid activity data source specified");
            zzu.zzb(activityDataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[]{activityDataSource});
            this.zzalX = activityDataSource;
            this.zzajT = 4;
            this.zzalW = timeUnit.toMillis(((long)minDuration));
            return this;
        }

        public Builder bucketByActivityType(int minDuration, TimeUnit timeUnit) {
            zzu.zzb(this.zzajT == 0, "Bucketing strategy already set to %s", new Object[]{this.zzajT});
            zzu.zzb(minDuration > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{minDuration});
            this.zzajT = 3;
            this.zzalW = timeUnit.toMillis(((long)minDuration));
            return this;
        }

        public Builder bucketByActivityType(int minDuration, TimeUnit timeUnit, DataSource activityDataSource) {
            zzu.zzb(this.zzajT == 0, "Bucketing strategy already set to %s", new Object[]{this.zzajT});
            zzu.zzb(minDuration > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{minDuration});
            zzu.zzb(activityDataSource != null, "Invalid activity data source specified");
            zzu.zzb(activityDataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[]{activityDataSource});
            this.zzalX = activityDataSource;
            this.zzajT = 3;
            this.zzalW = timeUnit.toMillis(((long)minDuration));
            return this;
        }

        public Builder bucketBySession(int minDuration, TimeUnit timeUnit) {
            zzu.zzb(this.zzajT == 0, "Bucketing strategy already set to %s", new Object[]{this.zzajT});
            zzu.zzb(minDuration > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{minDuration});
            this.zzajT = 2;
            this.zzalW = timeUnit.toMillis(((long)minDuration));
            return this;
        }

        public Builder bucketByTime(int duration, TimeUnit timeUnit) {
            zzu.zzb(this.zzajT == 0, "Bucketing strategy already set to %s", new Object[]{this.zzajT});
            zzu.zzb(duration > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{duration});
            this.zzajT = 1;
            this.zzalW = timeUnit.toMillis(((long)duration));
            return this;
        }

        public DataReadRequest build() {
            boolean z = true;
            zzu.zza(!this.zzalP.isEmpty() || !this.zzajQ.isEmpty() || !this.zzalV.isEmpty() || !this.zzalU.isEmpty(), "Must add at least one data source (aggregated or detailed)");
            zzu.zza(this.zzKT > 0L, "Invalid start time: %s", new Object[]{this.zzKT});
            zzu.zza(this.zzajH > 0L && this.zzajH > this.zzKT, "Invalid end time: %s", new Object[]{this.zzajH});
            boolean z1 = this.zzalV.isEmpty() && this.zzalU.isEmpty();
            if((!z1 || this.zzajT != 0) && (z1 || this.zzajT == 0)) {
                z = false;
            }
            zzu.zza(z, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this, null);
        }

        public Builder enableServerQueries() {
            this.zzama = true;
            return this;
        }

        public Builder read(DataSource dataSource) {
            zzu.zzb(dataSource, "Attempting to add a null data source");
            zzu.zzb(!this.zzalV.contains(dataSource), "Cannot add the same data source as aggregated and detailed");
            if(!this.zzalP.contains(dataSource)) {
                this.zzalP.add(dataSource);
            }
            return this;
        }

        public Builder read(DataType dataType) {
            zzu.zzb(dataType, "Attempting to use a null data type");
            zzu.zza(!this.zzalU.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if(!this.zzajQ.contains(dataType)) {
                this.zzajQ.add(dataType);
            }
            return this;
        }

        public Builder setLimit(int limit) {
            zzu.zzb(limit > 0, "Invalid limit %d is specified", new Object[]{limit});
            this.zzalY = limit;
            return this;
        }

        public Builder setTimeRange(long start, long end, TimeUnit timeUnit) {
            this.zzKT = timeUnit.toMillis(start);
            this.zzajH = timeUnit.toMillis(end);
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public static final int NO_LIMIT;
    private final int zzCY;
    private final long zzKT;
    private final String zzMZ;
    private final long zzajH;
    private final List zzajQ;
    private final int zzajT;
    private final List zzalP;
    private final List zzalU;
    private final List zzalV;
    private final long zzalW;
    private final DataSource zzalX;
    private final int zzalY;
    private final boolean zzalZ;
    private final boolean zzama;
    private final zzmf zzamb;
    private final List zzamc;

    static {
        DataReadRequest.CREATOR = new zzf();
    }

    DataReadRequest(int versionCode, List list0, List list1, long startTimeMillis, long endTimeMillis, List list2, List list3, int bucketType, long bucketDurationMillis, DataSource activityDataSource, int limit, boolean flushBeforeRead, boolean serverQueriesEnabled, IBinder callback, String packageName, List list4) {
        this.zzCY = versionCode;
        this.zzajQ = Collections.unmodifiableList(list0);
        this.zzalP = Collections.unmodifiableList(list1);
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzalU = Collections.unmodifiableList(list2);
        this.zzalV = Collections.unmodifiableList(list3);
        this.zzajT = bucketType;
        this.zzalW = bucketDurationMillis;
        this.zzalX = activityDataSource;
        this.zzalY = limit;
        this.zzalZ = flushBeforeRead;
        this.zzama = serverQueriesEnabled;
        this.zzamb = callback == null ? null : zza.zzbq(callback);
        this.zzMZ = packageName;
        if(list4 == null) {
            list4 = Collections.EMPTY_LIST;
        }
        this.zzamc = list4;
    }

    private DataReadRequest(Builder builder) {
        this(builder.zzajQ, builder.zzalP, builder.zzKT, builder.zzajH, builder.zzalU, builder.zzalV, builder.zzajT, builder.zzalW, builder.zzalX, builder.zzalY, builder.zzalZ, builder.zzama, null, null, builder.zzamc);
    }

    DataReadRequest(Builder x0, com.google.android.gms.fitness.request.DataReadRequest.1 x1) {
        this(x0);
    }

    public DataReadRequest(DataReadRequest request, zzmf callback, String packageName) {
        this(request.zzajQ, request.zzalP, request.zzKT, request.zzajH, request.zzalU, request.zzalV, request.zzajT, request.zzalW, request.zzalX, request.zzalY, request.zzalZ, request.zzama, callback, packageName, request.zzamc);
    }

    public DataReadRequest(List list0, List list1, long startTimeMillis, long endTimeMillis, List list2, List list3, int bucketType, long bucketDurationMillis, DataSource activityDataSource, int limit, boolean flushBeforeRead, boolean serverQueriesEnabled, zzmf callback, String packageName, List list4) {
        this.zzCY = 4;
        this.zzajQ = Collections.unmodifiableList(list0);
        this.zzalP = Collections.unmodifiableList(list1);
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzalU = Collections.unmodifiableList(list2);
        this.zzalV = Collections.unmodifiableList(list3);
        this.zzajT = bucketType;
        this.zzalW = bucketDurationMillis;
        this.zzalX = activityDataSource;
        this.zzalY = limit;
        this.zzalZ = flushBeforeRead;
        this.zzama = serverQueriesEnabled;
        this.zzamb = callback;
        this.zzMZ = packageName;
        this.zzamc = list4;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DataReadRequest && this.zzb(((DataReadRequest)that));
    }

    public DataSource getActivityDataSource() {
        return this.zzalX;
    }

    public List getAggregatedDataSources() {
        return this.zzalV;
    }

    public List getAggregatedDataTypes() {
        return this.zzalU;
    }

    public long getBucketDuration(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzalW, TimeUnit.MILLISECONDS);
    }

    public int getBucketType() {
        return this.zzajT;
    }

    public List getDataSources() {
        return this.zzalP;
    }

    public List getDataTypes() {
        return this.zzajQ;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzajH, TimeUnit.MILLISECONDS);
    }

    public int getLimit() {
        return this.zzalY;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajT, this.zzKT, this.zzajH});
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("DataReadRequest{");
        if(!this.zzajQ.isEmpty()) {
            for(Object object0: this.zzajQ) {
                stringBuilder0.append(((DataType)object0).zzqD()).append(" ");
            }
        }
        if(!this.zzalP.isEmpty()) {
            for(Object object1: this.zzalP) {
                stringBuilder0.append(((DataSource)object1).toDebugString()).append(" ");
            }
        }
        if(this.zzajT != 0) {
            stringBuilder0.append("bucket by ").append(Bucket.zzeb(this.zzajT));
            if(this.zzalW > 0L) {
                stringBuilder0.append(" >").append(this.zzalW).append("ms");
            }
            stringBuilder0.append(": ");
        }
        if(!this.zzalU.isEmpty()) {
            for(Object object2: this.zzalU) {
                stringBuilder0.append(((DataType)object2).zzqD()).append(" ");
            }
        }
        if(!this.zzalV.isEmpty()) {
            for(Object object3: this.zzalV) {
                stringBuilder0.append(((DataSource)object3).toDebugString()).append(" ");
            }
        }
        stringBuilder0.append(String.format("(%tF %tT - %tF %tT)", this.zzKT, this.zzKT, this.zzajH, this.zzajH));
        if(this.zzalX != null) {
            stringBuilder0.append("activities: ").append(this.zzalX.toDebugString());
        }
        if(this.zzama) {
            stringBuilder0.append(" +server");
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }

    // 去混淆评级： 中等(50)
    private boolean zzb(DataReadRequest dataReadRequest0) {
        return this.zzajQ.equals(dataReadRequest0.zzajQ) && this.zzalP.equals(dataReadRequest0.zzalP) && this.zzKT == dataReadRequest0.zzKT && this.zzajH == dataReadRequest0.zzajH && this.zzajT == dataReadRequest0.zzajT && this.zzalV.equals(dataReadRequest0.zzalV) && this.zzalU.equals(dataReadRequest0.zzalU) && zzt.equal(this.zzalX, dataReadRequest0.zzalX) && this.zzalW == dataReadRequest0.zzalW && this.zzama == dataReadRequest0.zzama;
    }

    public long zzkt() {
        return this.zzKT;
    }

    public IBinder zzqU() {
        return this.zzamb == null ? null : this.zzamb.asBinder();
    }

    public boolean zzqZ() {
        return this.zzama;
    }

    public long zzqs() {
        return this.zzajH;
    }

    public boolean zzra() {
        return this.zzalZ;
    }

    public long zzrb() {
        return this.zzalW;
    }

    public List zzrc() {
        return this.zzamc;
    }

    class com.google.android.gms.fitness.request.DataReadRequest.1 {
    }

}

