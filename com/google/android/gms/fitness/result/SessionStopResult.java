package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Collections;
import java.util.List;

public class SessionStopResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzalQ;

    static {
        SessionStopResult.CREATOR = new zzk();
    }

    SessionStopResult(int versionCode, Status status, List list0) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzalQ = Collections.unmodifiableList(list0);
    }

    public SessionStopResult(Status status, List list0) {
        this.zzCY = 3;
        this.zzOt = status;
        this.zzalQ = Collections.unmodifiableList(list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof SessionStopResult && this.zzb(((SessionStopResult)o));
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
        return zzt.hashCode(new Object[]{this.zzOt, this.zzalQ});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("sessions", this.zzalQ).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzk.zza(this, dest, flags);
    }

    public static SessionStopResult zzP(Status status0) {
        return new SessionStopResult(status0, Collections.emptyList());
    }

    // 去混淆评级： 低(20)
    private boolean zzb(SessionStopResult sessionStopResult0) {
        return this.zzOt.equals(sessionStopResult0.zzOt) && zzt.equal(this.zzalQ, sessionStopResult0.zzalQ);
    }
}

