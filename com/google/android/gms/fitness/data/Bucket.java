package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final int zzCY;
    private final long zzKT;
    private final long zzajH;
    private final Session zzajJ;
    private final int zzajR;
    private final List zzajS;
    private final int zzajT;
    private boolean zzajU;

    static {
        Bucket.CREATOR = new zzc();
    }

    Bucket(int versionCode, long startTimeMillis, long endTimeMillis, Session session, int activityType, List list0, int bucketType, boolean serverHasMoreData) {
        this.zzCY = versionCode;
        this.zzKT = startTimeMillis;
        this.zzajH = endTimeMillis;
        this.zzajJ = session;
        this.zzajR = activityType;
        this.zzajS = list0;
        this.zzajT = bucketType;
        this.zzajU = serverHasMoreData;
    }

    public Bucket(RawBucket bucket, List list0) {
        List list1 = Bucket.zza(bucket.zzajS, list0);
        this(2, bucket.zzKT, bucket.zzajH, bucket.zzajJ, bucket.zzakG, list1, bucket.zzajT, bucket.zzajU);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof Bucket && this.zza(((Bucket)o));
    }

    public String getActivity() {
        return FitnessActivities.getName(this.zzajR);
    }

    public int getBucketType() {
        return this.zzajT;
    }

    public DataSet getDataSet(DataType dataType) {
        for(Object object0: this.zzajS) {
            DataSet dataSet0 = (DataSet)object0;
            if(dataSet0.getDataType().equals(dataType)) {
                return dataSet0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public List getDataSets() {
        return this.zzajS;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzajH, TimeUnit.MILLISECONDS);
    }

    public Session getSession() {
        return this.zzajJ;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzKT, this.zzajH, this.zzajR, this.zzajT});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("startTime", this.zzKT).zzg("endTime", this.zzajH).zzg("activity", this.zzajR).zzg("dataSets", this.zzajS).zzg("bucketType", Bucket.zzeb(this.zzajT)).zzg("serverHasMoreData", Boolean.valueOf(this.zzajU)).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }

    private static List zza(Collection collection0, List list0) {
        List list1 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            list1.add(new DataSet(((RawDataSet)object0), list0));
        }
        return list1;
    }

    private boolean zza(Bucket bucket0) {
        return this.zzKT == bucket0.zzKT && this.zzajH == bucket0.zzajH && this.zzajR == bucket0.zzajR && zzt.equal(this.zzajS, bucket0.zzajS) && this.zzajT == bucket0.zzajT && this.zzajU == bucket0.zzajU;
    }

    public boolean zzb(Bucket bucket0) {
        return this.zzKT == bucket0.zzKT && this.zzajH == bucket0.zzajH && this.zzajR == bucket0.zzajR && this.zzajT == bucket0.zzajT;
    }

    public static String zzeb(int v) {
        switch(v) {
            case 0: {
                return "unknown";
            }
            case 1: {
                return "time";
            }
            case 2: {
                return "session";
            }
            case 3: {
                return "type";
            }
            case 4: {
                return "segment";
            }
            default: {
                return "bug";
            }
        }
    }

    public long zzkt() {
        return this.zzKT;
    }

    public int zzqq() {
        return this.zzajR;
    }

    public boolean zzqr() {
        if(this.zzajU) {
            return true;
        }
        for(Object object0: this.zzajS) {
            if(((DataSet)object0).zzqr()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public long zzqs() {
        return this.zzajH;
    }
}

