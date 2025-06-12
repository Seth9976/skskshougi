package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UnpublishRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final MessageWrapper zzaGb;
    public final zzb zzaGd;
    public final String zzaGe;
    public final String zzayp;

    static {
        UnpublishRequest.CREATOR = new zzk();
    }

    UnpublishRequest(int versionCode, MessageWrapper messageWrapper, IBinder callbackAsBinder, String zeroPartyPackageName, String realClientPackageName) {
        this.zzCY = versionCode;
        this.zzaGb = messageWrapper;
        this.zzaGd = zza.zzde(callbackAsBinder);
        this.zzayp = zeroPartyPackageName;
        this.zzaGe = realClientPackageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzk.zza(this, dest, flags);
    }

    IBinder zzxa() {
        return this.zzaGd.asBinder();
    }
}

