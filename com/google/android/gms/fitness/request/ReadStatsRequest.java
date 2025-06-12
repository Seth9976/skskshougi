package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmr.zza;
import com.google.android.gms.internal.zzmr;

public class ReadStatsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final zzmr zzamq;

    static {
        ReadStatsRequest.CREATOR = new zzr();
    }

    ReadStatsRequest(int versionCode, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzamq = zza.zzbC(callback);
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
        return "ReadStatsRequest";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzr.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        return this.zzamq.asBinder();
    }
}

