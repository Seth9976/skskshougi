package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmu.zza;
import com.google.android.gms.internal.zzmu;

public class DeleteAllUserDataRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;

    static {
        DeleteAllUserDataRequest.CREATOR = new zzk();
    }

    DeleteAllUserDataRequest(int versionCode, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzalN = zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "DisableFitRequest";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzk.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        return this.zzalN.asBinder();
    }
}

