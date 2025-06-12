package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol.zza;
import com.google.android.gms.internal.zzol;

public class ContinueConnectRequest implements SafeParcelable {
    public static final zzb CREATOR;
    final int versionCode;
    private final zzol zzaFk;
    private final String zzaFl;

    static {
        ContinueConnectRequest.CREATOR = new zzb();
    }

    ContinueConnectRequest(int versionCode, String token, IBinder callback) {
        this.versionCode = versionCode;
        this.zzaFl = (String)zzu.zzu(token);
        this.zzaFk = zza.zzcX(callback);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getToken() {
        return this.zzaFl;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    public IBinder zzqU() {
        return this.zzaFk == null ? null : this.zzaFk.asBinder();
    }
}

