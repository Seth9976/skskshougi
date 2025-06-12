package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmu.zza;
import com.google.android.gms.internal.zzmu;

public class SessionUnregistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;

    static {
        SessionUnregistrationRequest.CREATOR = new zzz();
    }

    SessionUnregistrationRequest(int versionCode, PendingIntent intent, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.mPendingIntent = intent;
        this.zzalN = callback == null ? null : zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent, zzmu callback, String packageName) {
        this.zzCY = 4;
        this.mPendingIntent = pendingIntent;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof SessionUnregistrationRequest && this.zzb(((SessionUnregistrationRequest)that));
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mPendingIntent});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("pendingIntent", this.mPendingIntent).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzz.zza(this, parcel, flags);
    }

    private boolean zzb(SessionUnregistrationRequest sessionUnregistrationRequest0) {
        return zzt.equal(this.mPendingIntent, sessionUnregistrationRequest0.mPendingIntent);
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    public PendingIntent zzrg() {
        return this.mPendingIntent;
    }
}

