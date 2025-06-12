package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzon.zza;
import com.google.android.gms.internal.zzon;

public class StartScanRequest implements SafeParcelable {
    public static final zzg CREATOR;
    final int versionCode;
    private final zzol zzaFk;
    private final zzon zzaFm;

    static {
        StartScanRequest.CREATOR = new zzg();
    }

    StartScanRequest(int versionCode, IBinder scanListener, IBinder callback) {
        this.versionCode = versionCode;
        zzu.zzu(scanListener);
        this.zzaFm = zza.zzcZ(scanListener);
        zzu.zzu(callback);
        this.zzaFk = com.google.android.gms.internal.zzol.zza.zzcX(callback);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzg.zza(this, out, flags);
    }

    public IBinder zzqU() {
        return this.zzaFk == null ? null : this.zzaFk.asBinder();
    }

    public IBinder zzwQ() {
        return this.zzaFm == null ? null : this.zzaFm.asBinder();
    }
}

