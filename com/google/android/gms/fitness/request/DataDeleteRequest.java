package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzmu.zza;
import com.google.android.gms.internal.zzmu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest implements SafeParcelable {
    public static class Builder {
        private long zzKT;
        private long zzajH;
        private List zzajQ;
        private List zzalP;
        private List zzalQ;
        private boolean zzalR;
        private boolean zzalS;

        public Builder() {
            this.zzalP = new ArrayList();
            this.zzajQ = new ArrayList();
            this.zzalQ = new ArrayList();
            this.zzalR = false;
            this.zzalS = false;
        }

        public Builder addDataSource(DataSource dataSource) {
            boolean z = true;
            zzu.zzb(!this.zzalR, "All data is already marked for deletion");
            if(dataSource == null) {
                z = false;
            }
            zzu.zzb(z, "Must specify a valid data source");
            if(!this.zzalP.contains(dataSource)) {
                this.zzalP.add(dataSource);
            }
            return this;
        }

        public Builder addDataType(DataType dataType) {
            boolean z = true;
            zzu.zzb(!this.zzalR, "All data is already marked for deletion");
            if(dataType == null) {
                z = false;
            }
            zzu.zzb(z, "Must specify a valid data type");
            if(!this.zzajQ.contains(dataType)) {
                this.zzajQ.add(dataType);
            }
            return this;
        }

        public Builder addSession(Session session) {
            boolean z = true;
            zzu.zzb(!this.zzalS, "All sessions already marked for deletion");
            zzu.zzb(session != null, "Must specify a valid session");
            if(session.getEndTime(TimeUnit.MILLISECONDS) <= 0L) {
                z = false;
            }
            zzu.zzb(z, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.zzalQ.add(session);
            return this;
        }

        public DataDeleteRequest build() {
            boolean z = false;
            zzu.zza(this.zzKT > 0L && this.zzajH > this.zzKT, "Must specify a valid time interval");
            if(this.zzalR || !this.zzalP.isEmpty() || !this.zzajQ.isEmpty() || (this.zzalS || !this.zzalQ.isEmpty())) {
                z = true;
            }
            zzu.zza(z, "No data or session marked for deletion");
            this.zzqX();
            return new DataDeleteRequest(this, null);
        }

        public Builder deleteAllData() {
            zzu.zzb(this.zzajQ.isEmpty() && this.zzalP.isEmpty(), "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", new Object[]{this.zzalP, this.zzajQ});
            this.zzalR = true;
            return this;
        }

        public Builder deleteAllSessions() {
            zzu.zzb(this.zzalQ.isEmpty(), "Specific sessions already added for deletion: %s", new Object[]{this.zzalQ});
            this.zzalS = true;
            return this;
        }

        public Builder setTimeInterval(long startTime, long endTime, TimeUnit timeUnit) {
            zzu.zzb(startTime > 0L, "Invalid start time :%d", new Object[]{startTime});
            zzu.zzb(endTime > startTime, "Invalid end time :%d", new Object[]{endTime});
            this.zzKT = timeUnit.toMillis(startTime);
            this.zzajH = timeUnit.toMillis(endTime);
            return this;
        }

        private void zzqX() {
            if(!this.zzalQ.isEmpty()) {
                for(Object object0: this.zzalQ) {
                    zzu.zza(((Session)object0).getStartTime(TimeUnit.MILLISECONDS) >= this.zzKT && ((Session)object0).getEndTime(TimeUnit.MILLISECONDS) <= this.zzajH, "Session %s is outside the time interval [%d, %d]", new Object[]{((Session)object0), this.zzKT, this.zzajH});
                }
            }
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final long zzKT;
    private final String zzMZ;
    private final long zzajH;
    private final List zzajQ;
    private final zzmu zzalN;
    private final List zzalP;
    private final List zzalQ;
    private final boolean zzalR;
    private final boolean zzalS;

    static {
        DataDeleteRequest.CREATOR = new zzd();
    }

    DataDeleteRequest(int versionCode, long startTimeMillis, long endTimeMillis, List list0, List list1, List list2, boolean deleteAllData, boolean deleteAllSessions, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzalP = Collections.unmodifiableList(list0);
        this.zzajQ = Collections.unmodifiableList(list1);
        this.zzalQ = list2;
        this.zzalR = deleteAllData;
        this.zzalS = deleteAllSessions;
        this.zzalN = callback == null ? null : zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public DataDeleteRequest(long startTimeMillis, long endTimeMillis, List list0, List list1, List list2, boolean deleteAllData, boolean deleteAllSessions, zzmu callback, String packageName) {
        this.zzCY = 2;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzalP = Collections.unmodifiableList(list0);
        this.zzajQ = Collections.unmodifiableList(list1);
        this.zzalQ = list2;
        this.zzalR = deleteAllData;
        this.zzalS = deleteAllSessions;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    private DataDeleteRequest(Builder builder) {
        this(builder.zzKT, builder.zzajH, builder.zzalP, builder.zzajQ, builder.zzalQ, builder.zzalR, builder.zzalS, null, null);
    }

    DataDeleteRequest(Builder x0, com.google.android.gms.fitness.request.DataDeleteRequest.1 x1) {
        this(x0);
    }

    public DataDeleteRequest(DataDeleteRequest request, zzmu callback, String packageName) {
        this(request.zzKT, request.zzajH, request.zzalP, request.zzajQ, request.zzalQ, request.zzalR, request.zzalS, callback, packageName);
    }

    public boolean deleteAllData() {
        return this.zzalR;
    }

    public boolean deleteAllSessions() {
        return this.zzalS;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof DataDeleteRequest && this.zzb(((DataDeleteRequest)o));
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

    public String getPackageName() {
        return this.zzMZ;
    }

    public List getSessions() {
        return this.zzalQ;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzKT, this.zzajH});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("startTimeMillis", this.zzKT).zzg("endTimeMillis", this.zzajH).zzg("dataSources", this.zzalP).zzg("dateTypes", this.zzajQ).zzg("sessions", this.zzalQ).zzg("deleteAllData", Boolean.valueOf(this.zzalR)).zzg("deleteAllSessions", Boolean.valueOf(this.zzalS)).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzd.zza(this, dest, flags);
    }

    // 去混淆评级： 低(30)
    private boolean zzb(DataDeleteRequest dataDeleteRequest0) {
        return this.zzKT == dataDeleteRequest0.zzKT && this.zzajH == dataDeleteRequest0.zzajH && zzt.equal(this.zzalP, dataDeleteRequest0.zzalP) && zzt.equal(this.zzajQ, dataDeleteRequest0.zzajQ) && zzt.equal(this.zzalQ, dataDeleteRequest0.zzalQ) && this.zzalR == dataDeleteRequest0.zzalR && this.zzalS == dataDeleteRequest0.zzalS;
    }

    public long zzkt() {
        return this.zzKT;
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    public boolean zzqV() {
        return this.zzalR;
    }

    public boolean zzqW() {
        return this.zzalS;
    }

    public long zzqs() {
        return this.zzajH;
    }

    class com.google.android.gms.fitness.request.DataDeleteRequest.1 {
    }

}

