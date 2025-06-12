package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol.zza;
import com.google.android.gms.internal.zzol;

public class DisableTargetRequest implements SafeParcelable {
    public static final zzc CREATOR;
    final int versionCode;
    private final zzol zzaFk;

    static {
        DisableTargetRequest.CREATOR = new zzc();
    }

    DisableTargetRequest(int versionCode, IBinder callback) {
        this.versionCode = versionCode;
        zzu.zzu(callback);
        this.zzaFk = zza.zzcX(callback);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzc.zza(this, out, flags);
    }

    public IBinder zzqU() {
        return this.zzaFk == null ? null : this.zzaFk.asBinder();
    }
}

