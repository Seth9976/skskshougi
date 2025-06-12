package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RemoveListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final zzas zzaTq;

    static {
        RemoveListenerRequest.CREATOR = new zzbc();
    }

    RemoveListenerRequest(int versionCode, IBinder listener) {
        this.zzCY = versionCode;
        if(listener != null) {
            this.zzaTq = zza.zzdP(listener);
            return;
        }
        this.zzaTq = null;
    }

    public RemoveListenerRequest(zzas listener) {
        this.zzCY = 1;
        this.zzaTq = listener;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbc.zza(this, dest, flags);
    }

    IBinder zzAT() {
        return this.zzaTq == null ? null : this.zzaTq.asBinder();
    }
}

