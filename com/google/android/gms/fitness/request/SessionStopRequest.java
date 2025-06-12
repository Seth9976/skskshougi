package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmt.zza;
import com.google.android.gms.internal.zzmt;

public class SessionStopRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final String zzakL;
    private final zzmt zzamJ;

    static {
        SessionStopRequest.CREATOR = new zzy();
    }

    SessionStopRequest(int versionCode, String name, String identifier, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.mName = name;
        this.zzakL = identifier;
        this.zzamJ = callback == null ? null : zza.zzbE(callback);
        this.zzMZ = packageName;
    }

    public SessionStopRequest(String name, String identifier, zzmt callback, String packageName) {
        this.zzCY = 2;
        this.mName = name;
        this.zzakL = identifier;
        this.zzamJ = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof SessionStopRequest && this.zzb(((SessionStopRequest)o));
    }

    public String getIdentifier() {
        return this.zzakL;
    }

    public String getName() {
        return this.mName;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mName, this.zzakL});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("name", this.mName).zzg("identifier", this.zzakL).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzy.zza(this, dest, flags);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(SessionStopRequest sessionStopRequest0) {
        return zzt.equal(this.mName, sessionStopRequest0.mName) && zzt.equal(this.zzakL, sessionStopRequest0.zzakL);
    }

    public IBinder zzqU() {
        return this.zzamJ == null ? null : this.zzamJ.asBinder();
    }
}

