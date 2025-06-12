package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest {
    public static class Builder {
        private DataType zzajF;
        private DataSource zzajG;
        private long zzakP;
        private int zzakQ;
        private long zzamA;
        private boolean zzamB;
        private long zzamu;
        private long zzamv;

        public Builder() {
            this.zzakP = -1L;
            this.zzamv = 0L;
            this.zzamu = 0L;
            this.zzamB = false;
            this.zzakQ = 2;
            this.zzamA = 0x7FFFFFFFFFFFFFFFL;
        }

        public SensorRequest build() {
            boolean z = false;
            zzu.zza(this.zzajG != null || this.zzajF != null, "Must call setDataSource() or setDataType()");
            if(this.zzajF == null || this.zzajG == null || this.zzajF.equals(this.zzajG.getDataType())) {
                z = true;
            }
            zzu.zza(z, "Specified data type is incompatible with specified data source");
            return new SensorRequest(this, null);
        }

        public Builder setAccuracyMode(int accuracyMode) {
            this.zzakQ = SensorRequest.zzeM(accuracyMode);
            return this;
        }

        public Builder setDataSource(DataSource dataSource) {
            this.zzajG = dataSource;
            return this;
        }

        public Builder setDataType(DataType dataType) {
            this.zzajF = dataType;
            return this;
        }

        public Builder setFastestRate(int fastestInterval, TimeUnit unit) {
            zzu.zzb(fastestInterval >= 0, "Cannot use a negative interval");
            this.zzamB = true;
            this.zzamv = unit.toMicros(((long)fastestInterval));
            return this;
        }

        public Builder setMaxDeliveryLatency(int interval, TimeUnit unit) {
            zzu.zzb(interval >= 0, "Cannot use a negative delivery interval");
            this.zzamu = unit.toMicros(((long)interval));
            return this;
        }

        public Builder setSamplingRate(long interval, TimeUnit unit) {
            zzu.zzb(interval >= 0L, "Cannot use a negative sampling interval");
            this.zzakP = unit.toMicros(interval);
            if(!this.zzamB) {
                this.zzamv = this.zzakP / 2L;
            }
            return this;
        }

        public Builder setTimeout(long timeout, TimeUnit timeUnit) {
            boolean z = true;
            zzu.zzb(timeout > 0L, "Invalid time out value specified: %d", new Object[]{timeout});
            if(timeUnit == null) {
                z = false;
            }
            zzu.zzb(z, "Invalid time unit specified");
            this.zzamA = timeUnit.toMicros(timeout);
            return this;
        }
    }

    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;
    private final long zzamA;
    private final long zzamu;
    private final long zzamv;
    private final LocationRequest zzamz;

    private SensorRequest(DataSource dataSource, LocationRequest locationRequest) {
        this.zzamz = locationRequest;
        this.zzakP = TimeUnit.MILLISECONDS.toMicros(locationRequest.getInterval());
        this.zzamv = TimeUnit.MILLISECONDS.toMicros(locationRequest.getFastestInterval());
        this.zzamu = this.zzakP;
        this.zzajF = dataSource.getDataType();
        this.zzakQ = SensorRequest.zza(locationRequest);
        this.zzajG = dataSource;
        long v = locationRequest.getExpirationTime();
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            this.zzamA = 0x7FFFFFFFFFFFFFFFL;
            return;
        }
        this.zzamA = TimeUnit.MILLISECONDS.toMicros(v - SystemClock.elapsedRealtime());
    }

    private SensorRequest(Builder builder) {
        this.zzajG = builder.zzajG;
        this.zzajF = builder.zzajF;
        this.zzakP = builder.zzakP;
        this.zzamv = builder.zzamv;
        this.zzamu = builder.zzamu;
        this.zzakQ = builder.zzakQ;
        this.zzamz = null;
        this.zzamA = builder.zzamA;
    }

    SensorRequest(Builder x0, com.google.android.gms.fitness.request.SensorRequest.1 x1) {
        this(x0);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof SensorRequest && this.zza(((SensorRequest)that));
    }

    public static SensorRequest fromLocationRequest(DataSource dataSource, LocationRequest locationRequest) {
        return new SensorRequest(dataSource, locationRequest);
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

    public long getFastestRate(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzamv, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzamu, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzakP, TimeUnit.MICROSECONDS);
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajG, this.zzajF, this.zzakP, this.zzamv, this.zzamu, this.zzakQ, this.zzamz, this.zzamA});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("dataSource", this.zzajG).zzg("dataType", this.zzajF).zzg("samplingRateMicros", this.zzakP).zzg("deliveryLatencyMicros", this.zzamu).zzg("timeOutMicros", this.zzamA).toString();
    }

    private static int zza(LocationRequest locationRequest0) {
        switch(locationRequest0.getPriority()) {
            case 100: {
                return 3;
            }
            case 104: {
                return 1;
            }
            default: {
                return 2;
            }
        }
    }

    // 去混淆评级： 低(30)
    private boolean zza(SensorRequest sensorRequest0) {
        return zzt.equal(this.zzajG, sensorRequest0.zzajG) && zzt.equal(this.zzajF, sensorRequest0.zzajF) && this.zzakP == sensorRequest0.zzakP && this.zzamv == sensorRequest0.zzamv && this.zzamu == sensorRequest0.zzamu && this.zzakQ == sensorRequest0.zzakQ && zzt.equal(this.zzamz, sensorRequest0.zzamz) && this.zzamA == sensorRequest0.zzamA;
    }

    public static int zzeM(int v) {
        return v == 1 || v == 3 ? v : 2;
    }

    public long zzrm() {
        return this.zzamA;
    }

    class com.google.android.gms.fitness.request.SensorRequest.1 {
    }

}

