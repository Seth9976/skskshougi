package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SessionReadResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzalQ;
    private final List zzamX;

    static {
        SessionReadResult.CREATOR = new zzj();
    }

    SessionReadResult(int versionCode, List list0, List list1, Status status) {
        this.zzCY = versionCode;
        this.zzalQ = list0;
        this.zzamX = Collections.unmodifiableList(list1);
        this.zzOt = status;
    }

    public SessionReadResult(List list0, List list1, Status status) {
        this.zzCY = 3;
        this.zzalQ = list0;
        this.zzamX = Collections.unmodifiableList(list1);
        this.zzOt = status;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof SessionReadResult && this.zzb(((SessionReadResult)that));
    }

    public List getDataSet(Session session) {
        zzu.zzb(this.zzalQ.contains(session), "Attempting to read data for session %s which was not returned", new Object[]{session});
        List list0 = new ArrayList();
        for(Object object0: this.zzamX) {
            SessionDataSet sessionDataSet0 = (SessionDataSet)object0;
            if(zzt.equal(session, sessionDataSet0.getSession())) {
                list0.add(sessionDataSet0.zzqK());
            }
        }
        return list0;
    }

    public List getDataSet(Session session, DataType dataType) {
        zzu.zzb(this.zzalQ.contains(session), "Attempting to read data for session %s which was not returned", new Object[]{session});
        List list0 = new ArrayList();
        for(Object object0: this.zzamX) {
            SessionDataSet sessionDataSet0 = (SessionDataSet)object0;
            if(zzt.equal(session, sessionDataSet0.getSession()) && dataType.equals(sessionDataSet0.zzqK().getDataType())) {
                list0.add(sessionDataSet0.zzqK());
            }
        }
        return list0;
    }

    public List getSessions() {
        return this.zzalQ;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOt, this.zzalQ, this.zzamX});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("sessions", this.zzalQ).zzg("sessionDataSets", this.zzamX).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }

    public static SessionReadResult zzO(Status status0) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status0);
    }

    // 去混淆评级： 低(30)
    private boolean zzb(SessionReadResult sessionReadResult0) {
        return this.zzOt.equals(sessionReadResult0.zzOt) && zzt.equal(this.zzalQ, sessionReadResult0.zzalQ) && zzt.equal(this.zzamX, sessionReadResult0.zzamX);
    }

    public List zzry() {
        return this.zzamX;
    }
}

