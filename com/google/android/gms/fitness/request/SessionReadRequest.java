package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzms.zza;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest implements SafeParcelable {
    public static class Builder {
        private String zzFE;
        private long zzKT;
        private long zzajH;
        private List zzajQ;
        private List zzalP;
        private String zzamE;
        private boolean zzamF;
        private List zzamG;
        private boolean zzama;

        public Builder() {
            this.zzKT = 0L;
            this.zzajH = 0L;
            this.zzajQ = new ArrayList();
            this.zzalP = new ArrayList();
            this.zzamF = false;
            this.zzama = false;
            this.zzamG = new ArrayList();
        }

        public SessionReadRequest build() {
            zzu.zzb(this.zzKT > 0L, "Invalid start time: %s", new Object[]{this.zzKT});
            zzu.zzb(this.zzajH > 0L && this.zzajH > this.zzKT, "Invalid end time: %s", new Object[]{this.zzajH});
            return new SessionReadRequest(this, null);
        }

        public Builder enableServerQueries() {
            this.zzama = true;
            return this;
        }

        public Builder excludePackage(String appPackageName) {
            zzu.zzb(appPackageName, "Attempting to use a null package name");
            if(!this.zzamG.contains(appPackageName)) {
                this.zzamG.add(appPackageName);
            }
            return this;
        }

        public Builder read(DataSource dataSource) {
            zzu.zzb(dataSource, "Attempting to add a null data source");
            if(!this.zzalP.contains(dataSource)) {
                this.zzalP.add(dataSource);
            }
            return this;
        }

        public Builder read(DataType dataType) {
            zzu.zzb(dataType, "Attempting to use a null data type");
            if(!this.zzajQ.contains(dataType)) {
                this.zzajQ.add(dataType);
            }
            return this;
        }

        public Builder readSessionsFromAllApps() {
            this.zzamF = true;
            return this;
        }

        public Builder setSessionId(String sessionId) {
            this.zzFE = sessionId;
            return this;
        }

        public Builder setSessionName(String sessionName) {
            this.zzamE = sessionName;
            return this;
        }

        public Builder setTimeInterval(long startTime, long endTime, TimeUnit timeUnit) {
            this.zzKT = timeUnit.toMillis(startTime);
            this.zzajH = timeUnit.toMillis(endTime);
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzFE;
    private final long zzKT;
    private final String zzMZ;
    private final long zzajH;
    private final List zzajQ;
    private final List zzalP;
    private final String zzamE;
    private boolean zzamF;
    private final List zzamG;
    private final zzms zzamH;
    private final boolean zzama;

    static {
        SessionReadRequest.CREATOR = new zzv();
    }

    SessionReadRequest(int versionCode, String sessionName, String sessionId, long startTimeMillis, long endTimeMillis, List list0, List list1, boolean getSessionsFromAllApps, boolean serverQueriesEnabled, List list2, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzamE = sessionName;
        this.zzFE = sessionId;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzajQ = Collections.unmodifiableList(list0);
        this.zzalP = Collections.unmodifiableList(list1);
        this.zzamF = getSessionsFromAllApps;
        this.zzama = serverQueriesEnabled;
        this.zzamG = list2;
        this.zzamH = callback == null ? null : zza.zzbD(callback);
        this.zzMZ = packageName;
    }

    private SessionReadRequest(Builder builder) {
        this(builder.zzamE, builder.zzFE, builder.zzKT, builder.zzajH, builder.zzajQ, builder.zzalP, builder.zzamF, builder.zzama, builder.zzamG, null, null);
    }

    SessionReadRequest(Builder x0, com.google.android.gms.fitness.request.SessionReadRequest.1 x1) {
        this(x0);
    }

    public SessionReadRequest(SessionReadRequest request, zzms callback, String packageName) {
        this(request.zzamE, request.zzFE, request.zzKT, request.zzajH, request.zzajQ, request.zzalP, request.zzamF, request.zzama, request.zzamG, callback, packageName);
    }

    public SessionReadRequest(String sessionName, String sessionId, long startTimeMillis, long endTimeMillis, List list0, List list1, boolean getSessionsFromAllApps, boolean serverQueriesEnabled, List list2, zzms callback, String packageName) {
        this.zzCY = 4;
        this.zzamE = sessionName;
        this.zzFE = sessionId;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzajQ = Collections.unmodifiableList(list0);
        this.zzalP = Collections.unmodifiableList(list1);
        this.zzamF = getSessionsFromAllApps;
        this.zzama = serverQueriesEnabled;
        this.zzamG = list2;
        this.zzamH = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof SessionReadRequest && this.zzb(((SessionReadRequest)o));
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

    public List getExcludedPackages() {
        return this.zzamG;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    public String getSessionId() {
        return this.zzFE;
    }

    public String getSessionName() {
        return this.zzamE;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzamE, this.zzFE, this.zzKT, this.zzajH});
    }

    public boolean includeSessionsFromAllApps() {
        return this.zzamF;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("sessionName", this.zzamE).zzg("sessionId", this.zzFE).zzg("startTimeMillis", this.zzKT).zzg("endTimeMillis", this.zzajH).zzg("dataTypes", this.zzajQ).zzg("dataSources", this.zzalP).zzg("sessionsFromAllApps", Boolean.valueOf(this.zzamF)).zzg("excludedPackages", this.zzamG).zzg("useServer", Boolean.valueOf(this.zzama)).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzv.zza(this, dest, flags);
    }

    // 去混淆评级： 中等(50)
    private boolean zzb(SessionReadRequest sessionReadRequest0) {
        return zzt.equal(this.zzamE, sessionReadRequest0.zzamE) && this.zzFE.equals(sessionReadRequest0.zzFE) && this.zzKT == sessionReadRequest0.zzKT && this.zzajH == sessionReadRequest0.zzajH && zzt.equal(this.zzajQ, sessionReadRequest0.zzajQ) && zzt.equal(this.zzalP, sessionReadRequest0.zzalP) && this.zzamF == sessionReadRequest0.zzamF && this.zzamG.equals(sessionReadRequest0.zzamG) && this.zzama == sessionReadRequest0.zzama;
    }

    public long zzkt() {
        return this.zzKT;
    }

    public IBinder zzqU() {
        return this.zzamH == null ? null : this.zzamH.asBinder();
    }

    public boolean zzqZ() {
        return this.zzama;
    }

    public long zzqs() {
        return this.zzajH;
    }

    public boolean zzro() {
        return this.zzamF;
    }

    class com.google.android.gms.fitness.request.SessionReadRequest.1 {
    }

}

