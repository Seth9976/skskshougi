package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final zzas zzaTq;
    public final IntentFilter[] zzaTr;
    public final String zzaTs;
    public final String zzaTt;

    static {
        AddListenerRequest.CREATOR = new zzb();
    }

    AddListenerRequest(int versionCode, IBinder listener, IntentFilter[] filters, String channelToken, String capability) {
        this.zzCY = versionCode;
        this.zzaTq = listener == null ? null : zza.zzdP(listener);
        this.zzaTr = filters;
        this.zzaTs = channelToken;
        this.zzaTt = capability;
    }

    public AddListenerRequest(zzbl stub) {
        this.zzCY = 1;
        this.zzaTq = stub;
        this.zzaTr = stub.zzBh();
        this.zzaTs = stub.zzBi();
        this.zzaTt = stub.zzBj();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }

    IBinder zzAT() {
        return this.zzaTq == null ? null : this.zzaTq.asBinder();
    }
}

