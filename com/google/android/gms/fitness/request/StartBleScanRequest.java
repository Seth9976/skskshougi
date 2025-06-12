package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzmu;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest implements SafeParcelable {
    public static class Builder {
        private zzn zzamK;
        private int zzamL;
        private DataType[] zzami;

        public Builder() {
            this.zzami = new DataType[0];
            this.zzamL = 10;
        }

        public StartBleScanRequest build() {
            zzu.zza(this.zzamK != null, "Must set BleScanCallback");
            return new StartBleScanRequest(this, null);
        }

        public Builder setBleScanCallback(BleScanCallback bleScanCallback) {
            this.zza(zza.zzqS().zza(bleScanCallback));
            return this;
        }

        public Builder setDataTypes(DataType[] dataTypes) {
            this.zzami = dataTypes;
            return this;
        }

        public Builder setTimeoutSecs(int stopTimeSecs) {
            boolean z = true;
            zzu.zzb(stopTimeSecs > 0, "Stop time must be greater than zero");
            if(stopTimeSecs > 60) {
                z = false;
            }
            zzu.zzb(z, "Stop time must be less than 1 minute");
            this.zzamL = stopTimeSecs;
            return this;
        }

        public Builder zza(zzn zzn0) {
            this.zzamK = zzn0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final List zzajQ;
    private final zzmu zzalN;
    private final zzn zzamK;
    private final int zzamL;

    static {
        StartBleScanRequest.CREATOR = new zzaa();
    }

    StartBleScanRequest(int versionCode, List list0, IBinder bleScanCallback, int timeoutSecs, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzajQ = list0;
        this.zzamK = com.google.android.gms.fitness.request.zzn.zza.zzbI(bleScanCallback);
        this.zzamL = timeoutSecs;
        this.zzalN = callback == null ? null : com.google.android.gms.internal.zzmu.zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    private StartBleScanRequest(Builder builder) {
        this(zzkx.zzb(builder.zzami), builder.zzamK, builder.zzamL, null, null);
    }

    StartBleScanRequest(Builder x0, com.google.android.gms.fitness.request.StartBleScanRequest.1 x1) {
        this(x0);
    }

    public StartBleScanRequest(StartBleScanRequest request, zzmu callback, String packageName) {
        this(request.zzajQ, request.zzamK, request.zzamL, callback, packageName);
    }

    public StartBleScanRequest(List list0, zzn bleScanCallback, int timeoutSecs, zzmu callback, String packageName) {
        this.zzCY = 3;
        this.zzajQ = list0;
        this.zzamK = bleScanCallback;
        this.zzamL = timeoutSecs;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List getDataTypes() {
        return Collections.unmodifiableList(this.zzajQ);
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    public int getTimeoutSecs() {
        return this.zzamL;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("dataTypes", this.zzajQ).zzg("timeoutSecs", this.zzamL).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzaa.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    public IBinder zzrq() {
        return this.zzamK.asBinder();
    }

    class com.google.android.gms.fitness.request.StartBleScanRequest.1 {
    }

}

