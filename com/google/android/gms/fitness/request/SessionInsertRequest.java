package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzlu;
import com.google.android.gms.internal.zzmu.zza;
import com.google.android.gms.internal.zzmu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest implements SafeParcelable {
    public static class Builder {
        private Session zzajJ;
        private List zzajS;
        private List zzamC;
        private List zzamD;

        public Builder() {
            this.zzajS = new ArrayList();
            this.zzamC = new ArrayList();
            this.zzamD = new ArrayList();
        }

        public Builder addAggregateDataPoint(DataPoint aggregateDataPoint) {
            zzu.zzb(aggregateDataPoint != null, "Must specify a valid aggregate data point.");
            long v = aggregateDataPoint.getStartTime(TimeUnit.NANOSECONDS);
            zzu.zzb(v > 0L && aggregateDataPoint.getEndTime(TimeUnit.NANOSECONDS) > v, "Aggregate data point should have valid start and end times: %s", new Object[]{aggregateDataPoint});
            DataSource dataSource0 = aggregateDataPoint.getDataSource();
            zzu.zza(!this.zzamD.contains(dataSource0), "Data set/Aggregate data point for this data source %s is already added.", new Object[]{dataSource0});
            this.zzamD.add(dataSource0);
            this.zzamC.add(aggregateDataPoint);
            return this;
        }

        public Builder addDataSet(DataSet dataSet) {
            boolean z = true;
            zzu.zzb(dataSet != null, "Must specify a valid data set.");
            DataSource dataSource0 = dataSet.getDataSource();
            zzu.zza(!this.zzamD.contains(dataSource0), "Data set for this data source %s is already added.", new Object[]{dataSource0});
            if(dataSet.getDataPoints().isEmpty()) {
                z = false;
            }
            zzu.zzb(z, "No data points specified in the input data set.");
            this.zzamD.add(dataSource0);
            this.zzajS.add(dataSet);
            return this;
        }

        public SessionInsertRequest build() {
            boolean z = true;
            zzu.zza(this.zzajJ != null, "Must specify a valid session.");
            if(this.zzajJ.getEndTime(TimeUnit.MILLISECONDS) == 0L) {
                z = false;
            }
            zzu.zza(z, "Must specify a valid end time, cannot insert a continuing session.");
            this.zzrn();
            return new SessionInsertRequest(this, null);
        }

        public Builder setSession(Session session) {
            this.zzajJ = session;
            return this;
        }

        private void zzd(DataPoint dataPoint0) {
            this.zzf(dataPoint0);
            this.zze(dataPoint0);
        }

        private void zze(DataPoint dataPoint0) {
            long v = this.zzajJ.getStartTime(TimeUnit.NANOSECONDS);
            long v1 = this.zzajJ.getEndTime(TimeUnit.NANOSECONDS);
            long v2 = dataPoint0.getStartTime(TimeUnit.NANOSECONDS);
            long v3 = dataPoint0.getEndTime(TimeUnit.NANOSECONDS);
            if(v2 != 0L && v3 != 0L) {
                TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                if(v3 > v1) {
                    v3 = zzlu.zza(v3, TimeUnit.NANOSECONDS, timeUnit0);
                }
                zzu.zza(v2 >= v && v3 <= v1, "Data point %s has start and end times outside session interval [%d, %d]", new Object[]{dataPoint0, v, v1});
                if(v3 != dataPoint0.getEndTime(TimeUnit.NANOSECONDS)) {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", dataPoint0.getEndTime(TimeUnit.NANOSECONDS), v3, timeUnit0));
                    dataPoint0.setTimeInterval(v2, v3, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzf(DataPoint dataPoint0) {
            long v = this.zzajJ.getStartTime(TimeUnit.NANOSECONDS);
            long v1 = this.zzajJ.getEndTime(TimeUnit.NANOSECONDS);
            long v2 = dataPoint0.getTimestamp(TimeUnit.NANOSECONDS);
            if(v2 != 0L) {
                TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                if(v2 < v || v2 > v1) {
                    v2 = zzlu.zza(v2, TimeUnit.NANOSECONDS, timeUnit0);
                }
                zzu.zza(v2 >= v && v2 <= v1, "Data point %s has time stamp outside session interval [%d, %d]", new Object[]{dataPoint0, v, v1});
                if(dataPoint0.getTimestamp(TimeUnit.NANOSECONDS) != v2) {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", dataPoint0.getTimestamp(TimeUnit.NANOSECONDS), v2, timeUnit0));
                    dataPoint0.setTimestamp(v2, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzrn() {
            for(Object object0: this.zzajS) {
                for(Object object1: ((DataSet)object0).getDataPoints()) {
                    this.zzd(((DataPoint)object1));
                }
            }
            for(Object object2: this.zzamC) {
                this.zzd(((DataPoint)object2));
            }
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final Session zzajJ;
    private final List zzajS;
    private final zzmu zzalN;
    private final List zzamC;

    static {
        SessionInsertRequest.CREATOR = new com.google.android.gms.fitness.request.zzu();
    }

    SessionInsertRequest(int versionCode, Session session, List list0, List list1, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzajJ = session;
        this.zzajS = Collections.unmodifiableList(list0);
        this.zzamC = Collections.unmodifiableList(list1);
        this.zzalN = callback == null ? null : zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public SessionInsertRequest(Session session, List list0, List list1, zzmu callback, String packageName) {
        this.zzCY = 2;
        this.zzajJ = session;
        this.zzajS = Collections.unmodifiableList(list0);
        this.zzamC = Collections.unmodifiableList(list1);
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    private SessionInsertRequest(Builder builder) {
        this(builder.zzajJ, builder.zzajS, builder.zzamC, null, null);
    }

    SessionInsertRequest(Builder x0, com.google.android.gms.fitness.request.SessionInsertRequest.1 x1) {
        this(x0);
    }

    public SessionInsertRequest(SessionInsertRequest request, zzmu callback, String packageName) {
        this(request.zzajJ, request.zzajS, request.zzamC, callback, packageName);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof SessionInsertRequest && this.zzb(((SessionInsertRequest)o));
    }

    public List getAggregateDataPoints() {
        return this.zzamC;
    }

    public List getDataSets() {
        return this.zzajS;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    public Session getSession() {
        return this.zzajJ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajJ, this.zzajS, this.zzamC});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("session", this.zzajJ).zzg("dataSets", this.zzajS).zzg("aggregateDataPoints", this.zzamC).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        com.google.android.gms.fitness.request.zzu.zza(this, dest, flags);
    }

    // 去混淆评级： 低(30)
    private boolean zzb(SessionInsertRequest sessionInsertRequest0) {
        return zzt.equal(this.zzajJ, sessionInsertRequest0.zzajJ) && zzt.equal(this.zzajS, sessionInsertRequest0.zzajS) && zzt.equal(this.zzamC, sessionInsertRequest0.zzamC);
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    class com.google.android.gms.fitness.request.SessionInsertRequest.1 {
    }

}

