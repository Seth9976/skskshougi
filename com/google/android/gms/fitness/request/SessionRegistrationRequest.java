package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmu.zza;
import com.google.android.gms.internal.zzmu;

public class SessionRegistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final int zzamI;

    static {
        SessionRegistrationRequest.CREATOR = new zzw();
    }

    SessionRegistrationRequest(int versionCode, PendingIntent intent, IBinder callback, String packageName, int sessionRegistrationOption) {
        this.zzCY = versionCode;
        this.mPendingIntent = intent;
        this.zzalN = callback == null ? null : zza.zzbF(callback);
        this.zzMZ = packageName;
        this.zzamI = sessionRegistrationOption;
    }

    public SessionRegistrationRequest(PendingIntent pendingIntent, zzmu callback, String packageName, int sessionRegistrationOption) {
        this.zzCY = 5;
        this.mPendingIntent = pendingIntent;
        this.zzalN = callback;
        this.zzMZ = packageName;
        this.zzamI = sessionRegistrationOption;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof SessionRegistrationRequest && this.zzb(((SessionRegistrationRequest)that));
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mPendingIntent, this.zzamI});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("pendingIntent", this.mPendingIntent).zzg("sessionRegistrationOption", this.zzamI).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzw.zza(this, parcel, flags);
    }

    private boolean zzb(SessionRegistrationRequest sessionRegistrationRequest0) {
        return this.zzamI == sessionRegistrationRequest0.zzamI && zzt.equal(this.mPendingIntent, sessionRegistrationRequest0.mPendingIntent);
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    public PendingIntent zzrg() {
        return this.mPendingIntent;
    }

    public int zzrp() {
        return this.zzamI;
    }
}

