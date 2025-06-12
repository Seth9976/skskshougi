package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class SessionDataSet implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private final Session zzajJ;
    private final DataSet zzakO;

    static {
        SessionDataSet.CREATOR = new zzq();
    }

    SessionDataSet(int versionCode, Session session, DataSet dataSet) {
        this.zzCY = versionCode;
        this.zzajJ = session;
        this.zzakO = dataSet;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof SessionDataSet && this.zza(((SessionDataSet)o));
    }

    public Session getSession() {
        return this.zzajJ;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajJ, this.zzakO});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("session", this.zzajJ).zzg("dataSet", this.zzakO).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzq.zza(this, dest, flags);
    }

    // 去混淆评级： 低(20)
    private boolean zza(SessionDataSet sessionDataSet0) {
        return zzt.equal(this.zzajJ, sessionDataSet0.zzajJ) && zzt.equal(this.zzakO, sessionDataSet0.zzakO);
    }

    public DataSet zzqK() {
        return this.zzakO;
    }
}

