package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzj;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int UNSPECIFIED = -1;
    private final int zzCY;
    private final DataSource zzajG;
    private final zzj zzamr;
    private final long zzana;
    private final long zzanb;

    static {
        FitnessSensorServiceRequest.CREATOR = new zza();
    }

    FitnessSensorServiceRequest(int versionCode, DataSource dataSource, IBinder listenerBinder, long samplingRateMicros, long batchIntervalMicros) {
        this.zzCY = versionCode;
        this.zzajG = dataSource;
        this.zzamr = com.google.android.gms.fitness.data.zzj.zza.zzbh(listenerBinder);
        this.zzana = samplingRateMicros;
        this.zzanb = batchIntervalMicros;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof FitnessSensorServiceRequest && this.zza(((FitnessSensorServiceRequest)that));
    }

    public long getBatchInterval(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzanb, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource() {
        return this.zzajG;
    }

    public SensorEventDispatcher getDispatcher() {
        return new zzb(this.zzamr);
    }

    public long getSamplingRate(TimeUnit timeUnit) {
        return this.zzana == -1L ? -1L : timeUnit.convert(this.zzana, TimeUnit.MICROSECONDS);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajG, this.zzana, this.zzanb});
    }

    @Override
    public String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", this.zzajG);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zza.zza(this, parcel, flags);
    }

    private boolean zza(FitnessSensorServiceRequest fitnessSensorServiceRequest0) {
        return zzt.equal(this.zzajG, fitnessSensorServiceRequest0.zzajG) && this.zzana == fitnessSensorServiceRequest0.zzana && this.zzanb == fitnessSensorServiceRequest0.zzanb;
    }

    public long zzqL() {
        return this.zzana;
    }

    public long zzrB() {
        return this.zzanb;
    }

    IBinder zzrl() {
        return this.zzamr.asBinder();
    }
}

