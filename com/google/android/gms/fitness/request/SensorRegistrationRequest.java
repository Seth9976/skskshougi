package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzj.zza;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.internal.zzmu;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SensorRegistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;
    private final zzmu zzalN;
    private zzj zzamr;
    int zzams;
    int zzamt;
    private final long zzamu;
    private final long zzamv;
    private final List zzamw;
    private final long zzamx;
    private final List zzamy;

    static {
        SensorRegistrationRequest.CREATOR = new zzs();
    }

    SensorRegistrationRequest(int versionCode, DataSource dataSource, DataType dataType, IBinder listenerBinder, int samplingIntervalMicrosInt, int maxDeliveryLatencyMicrosInt, long samplingIntervalMicros, long maxDeliveryLatencyMicros, PendingIntent intent, long fastestIntervalMicros, int accuracyMode, List list0, long registrationTimeOutMicros, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzajG = dataSource;
        this.zzajF = dataType;
        this.zzamr = listenerBinder == null ? null : zza.zzbh(listenerBinder);
        if(samplingIntervalMicros == 0L) {
            samplingIntervalMicros = (long)samplingIntervalMicrosInt;
        }
        this.zzakP = samplingIntervalMicros;
        this.zzamv = fastestIntervalMicros;
        if(maxDeliveryLatencyMicros == 0L) {
            maxDeliveryLatencyMicros = (long)maxDeliveryLatencyMicrosInt;
        }
        this.zzamu = maxDeliveryLatencyMicros;
        this.zzamw = list0;
        this.mPendingIntent = intent;
        this.zzakQ = accuracyMode;
        this.zzamy = Collections.emptyList();
        this.zzamx = registrationTimeOutMicros;
        this.zzalN = callback == null ? null : com.google.android.gms.internal.zzmu.zza.zzbF(callback);
        this.zzMZ = packageName;
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, zzj listener, PendingIntent pendingIntent, long samplingIntervalMicros, long fastestIntervalMicros, long maxDeliveryLatencyMicros, int accuracyMode, List list0, List clientIdentities, long registrationTimeOutMicros, zzmu callback, String packageName) {
        this.zzCY = 5;
        this.zzajG = dataSource;
        this.zzajF = dataType;
        this.zzamr = listener;
        this.mPendingIntent = pendingIntent;
        this.zzakP = samplingIntervalMicros;
        this.zzamv = fastestIntervalMicros;
        this.zzamu = maxDeliveryLatencyMicros;
        this.zzakQ = accuracyMode;
        this.zzamw = list0;
        this.zzamy = clientIdentities;
        this.zzamx = registrationTimeOutMicros;
        this.zzalN = callback;
        this.zzMZ = packageName;
    }

    public SensorRegistrationRequest(SensorRequest request, zzj listener, PendingIntent intent, zzmu callback, String packageName) {
        this(request.getDataSource(), request.getDataType(), listener, intent, request.getSamplingRate(TimeUnit.MICROSECONDS), request.getFastestRate(TimeUnit.MICROSECONDS), request.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), request.getAccuracyMode(), null, Collections.emptyList(), request.zzrm(), callback, packageName);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof SensorRegistrationRequest && this.zzb(((SensorRegistrationRequest)that));
    }

    public int getAccuracyMode() {
        return this.zzakQ;
    }

    public DataSource getDataSource() {
        return this.zzajG;
    }

    public DataType getDataType() {
        return this.zzajF;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajG, this.zzajF, this.zzamr, this.zzakP, this.zzamv, this.zzamu, this.zzakQ, this.zzamw});
    }

    @Override
    public String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.zzajF, this.zzajG, this.zzakP, this.zzamv, this.zzamu);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzs.zza(this, parcel, flags);
    }

    // 去混淆评级： 低(30)
    private boolean zzb(SensorRegistrationRequest sensorRegistrationRequest0) {
        return zzt.equal(this.zzajG, sensorRegistrationRequest0.zzajG) && zzt.equal(this.zzajF, sensorRegistrationRequest0.zzajF) && this.zzakP == sensorRegistrationRequest0.zzakP && this.zzamv == sensorRegistrationRequest0.zzamv && this.zzamu == sensorRegistrationRequest0.zzamu && this.zzakQ == sensorRegistrationRequest0.zzakQ && zzt.equal(this.zzamw, sensorRegistrationRequest0.zzamw);
    }

    public long zzqL() {
        return this.zzakP;
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    public PendingIntent zzrg() {
        return this.mPendingIntent;
    }

    public long zzrh() {
        return this.zzamv;
    }

    public long zzri() {
        return this.zzamu;
    }

    public List zzrj() {
        return this.zzamw;
    }

    public long zzrk() {
        return this.zzamx;
    }

    IBinder zzrl() {
        return this.zzamr == null ? null : this.zzamr.asBinder();
    }
}

