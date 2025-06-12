package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UnsubscribeRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final zzb zzaGd;
    public final String zzaGe;
    public final zza zzaGf;
    public final PendingIntent zzaGh;
    public final int zzaGi;
    public final String zzayp;

    static {
        UnsubscribeRequest.CREATOR = new zzl();
    }

    UnsubscribeRequest(int versionCode, IBinder messageListener, IBinder callbackAsBinder, PendingIntent pendingIntent, int messageListenerKey, String zeroPartyPackageName, String realClientPackageName) {
        this.zzCY = versionCode;
        this.zzaGf = com.google.android.gms.nearby.messages.internal.zza.zza.zzdd(messageListener);
        this.zzaGd = com.google.android.gms.nearby.messages.internal.zzb.zza.zzde(callbackAsBinder);
        this.zzaGh = pendingIntent;
        this.zzaGi = messageListenerKey;
        this.zzayp = zeroPartyPackageName;
        this.zzaGe = realClientPackageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzl.zza(this, dest, flags);
    }

    IBinder zzxa() {
        return this.zzaGd.asBinder();
    }

    IBinder zzxb() {
        return this.zzaGf == null ? null : this.zzaGf.asBinder();
    }
}

