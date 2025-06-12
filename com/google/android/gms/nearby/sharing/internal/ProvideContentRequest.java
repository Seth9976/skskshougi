package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class ProvideContentRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int versionCode;
    public IBinder zzaGp;
    public zzb zzaGq;
    @Deprecated
    public List zzaGr;
    public long zzaGs;
    public zzc zzaGt;

    static {
        ProvideContentRequest.CREATOR = new zzf();
    }

    ProvideContentRequest() {
        this.versionCode = 1;
    }

    ProvideContentRequest(int versionCode, IBinder clientBinder, IBinder contentProviderAsBinder, List list0, long activityId, IBinder callbackAsBinder) {
        this.versionCode = versionCode;
        this.zzaGp = clientBinder;
        this.zzaGq = zza.zzdi(contentProviderAsBinder);
        this.zzaGr = list0;
        this.zzaGs = activityId;
        this.zzaGt = com.google.android.gms.nearby.sharing.internal.zzc.zza.zzdj(callbackAsBinder);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }

    IBinder zzxa() {
        return this.zzaGt.asBinder();
    }

    IBinder zzxi() {
        return this.zzaGq == null ? null : this.zzaGq.asBinder();
    }
}

