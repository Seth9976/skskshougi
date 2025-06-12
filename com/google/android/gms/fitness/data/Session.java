package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session implements SafeParcelable {
    public static class Builder {
        private String mName;
        private long zzKT;
        private long zzajH;
        private int zzajR;
        private String zzakL;
        private String zzakM;
        private Long zzakN;
        private Application zzake;

        public Builder() {
            this.zzKT = 0L;
            this.zzajH = 0L;
            this.mName = null;
            this.zzajR = 4;
        }

        public Session build() {
            boolean z = false;
            zzu.zza(this.zzKT > 0L, "Start time should be specified.");
            if(this.zzajH == 0L || this.zzajH > this.zzKT) {
                z = true;
            }
            zzu.zza(z, "End time should be later than start time.");
            if(this.zzakL == null) {
                this.zzakL = (this.mName == null ? "" : this.mName) + this.zzKT;
            }
            return new Session(this, null);
        }

        public Builder setActiveTime(long time, TimeUnit timeUnit) {
            this.zzakN = timeUnit.toMillis(time);
            return this;
        }

        public Builder setActivity(String activity) {
            return this.zzeo(FitnessActivities.zzcF(activity));
        }

        public Builder setDescription(String description) {
            zzu.zzb(description.length() <= 1000, "Session description cannot exceed %d characters", new Object[]{1000});
            this.zzakM = description;
            return this;
        }

        public Builder setEndTime(long time, TimeUnit timeUnit) {
            zzu.zza(time >= 0L, "End time should be positive.");
            this.zzajH = timeUnit.toMillis(time);
            return this;
        }

        public Builder setIdentifier(String identifier) {
            zzu.zzV(identifier != null && TextUtils.getTrimmedLength(identifier) > 0);
            this.zzakL = identifier;
            return this;
        }

        public Builder setName(String name) {
            zzu.zzb(name.length() <= 100, "Session name cannot exceed %d characters", new Object[]{100});
            this.mName = name;
            return this;
        }

        public Builder setStartTime(long time, TimeUnit timeUnit) {
            zzu.zza(time > 0L, "Start time should be positive.");
            this.zzKT = timeUnit.toMillis(time);
            return this;
        }

        public Builder zzeo(int v) {
            this.zzajR = v;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final String mName;
    private final int zzCY;
    private final long zzKT;
    private final long zzajH;
    private final int zzajR;
    private final String zzakL;
    private final String zzakM;
    private final Long zzakN;
    private final Application zzake;

    static {
        Session.CREATOR = new zzp();
    }

    Session(int versionCode, long startTimeMillis, long endTimeMillis, String name, String identifier, String description, int activityType, Application application, Long activeTimeMillis) {
        this.zzCY = versionCode;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.mName = name;
        this.zzakL = identifier;
        this.zzakM = description;
        this.zzajR = activityType;
        this.zzake = application;
        this.zzakN = activeTimeMillis;
    }

    public Session(long startTimeMillis, long endTimeMillis, String name, String identifier, String description, int activityType, Application application, Long activeTimeMillis) {
        this(3, startTimeMillis, endTimeMillis, name, identifier, description, activityType, application, activeTimeMillis);
    }

    private Session(Builder builder) {
        this(builder.zzKT, builder.zzajH, builder.mName, builder.zzakL, builder.zzakM, builder.zzajR, builder.zzake, builder.zzakN);
    }

    Session(Builder x0, com.google.android.gms.fitness.data.Session.1 x1) {
        this(x0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof Session && this.zza(((Session)o));
    }

    public static Session extract(Intent intent) {
        return intent == null ? null : ((Session)zzc.zza(intent, "vnd.google.fitness.session", Session.CREATOR));
    }

    public long getActiveTime(TimeUnit timeUnit) {
        zzu.zza(this.zzakN != null, "Active time is not set");
        return timeUnit.convert(((long)this.zzakN), TimeUnit.MILLISECONDS);
    }

    public String getActivity() {
        return FitnessActivities.getName(this.zzajR);
    }

    public String getAppPackageName() {
        return this.zzake == null ? null : this.zzake.getPackageName();
    }

    public String getDescription() {
        return this.zzakM;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzajH, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier() {
        return this.zzakL;
    }

    public static String getMimeType(String activity) {
        return "vnd.google.fitness.session/" + activity;
    }

    public String getName() {
        return this.mName;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public boolean hasActiveTime() {
        return this.zzakN != null;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzKT, this.zzajH, this.zzakL});
    }

    public boolean isOngoing() {
        return this.zzajH == 0L;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("startTime", this.zzKT).zzg("endTime", this.zzajH).zzg("name", this.mName).zzg("identifier", this.zzakL).zzg("description", this.zzakM).zzg("activity", this.zzajR).zzg("application", this.zzake).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzp.zza(this, dest, flags);
    }

    // 去混淆评级： 低(40)
    private boolean zza(Session session0) {
        return this.zzKT == session0.zzKT && this.zzajH == session0.zzajH && zzt.equal(this.mName, session0.mName) && zzt.equal(this.zzakL, session0.zzakL) && zzt.equal(this.zzakM, session0.zzakM) && zzt.equal(this.zzake, session0.zzake) && this.zzajR == session0.zzajR;
    }

    public long zzkt() {
        return this.zzKT;
    }

    public Application zzqB() {
        return this.zzake;
    }

    public Long zzqJ() {
        return this.zzakN;
    }

    public int zzqq() {
        return this.zzajR;
    }

    public long zzqs() {
        return this.zzajH;
    }

    class com.google.android.gms.fitness.data.Session.1 {
    }

}

