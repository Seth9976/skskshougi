package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StopProvidingContentRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int versionCode;
    public long zzaGs;
    public zzc zzaGt;

    static {
        StopProvidingContentRequest.CREATOR = new zzj();
    }

    StopProvidingContentRequest() {
        this.versionCode = 1;
    }

    StopProvidingContentRequest(int versionCode, long activityId, IBinder callbackAsBinder) {
        this.versionCode = versionCode;
        this.zzaGs = activityId;
        this.zzaGt = zza.zzdj(callbackAsBinder);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }

    IBinder zzxa() {
        return this.zzaGt.asBinder();
    }
}

