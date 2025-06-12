package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class Subscription implements SafeParcelable {
    public static class zza {
        private DataType zzajF;
        private DataSource zzajG;
        private long zzakP;
        private int zzakQ;

        public zza() {
            this.zzakP = -1L;
            this.zzakQ = 2;
        }

        public zza zzb(DataSource dataSource0) {
            this.zzajG = dataSource0;
            return this;
        }

        public zza zzb(DataType dataType0) {
            this.zzajF = dataType0;
            return this;
        }

        public Subscription zzqN() {
            boolean z = false;
            zzu.zza(this.zzajG != null || this.zzajF != null, "Must call setDataSource() or setDataType()");
            if(this.zzajF == null || this.zzajG == null || this.zzajF.equals(this.zzajG.getDataType())) {
                z = true;
            }
            zzu.zza(z, "Specified data type is incompatible with specified data source");
            return new Subscription(this, null);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;

    static {
        Subscription.CREATOR = new zzr();
    }

    Subscription(int versionCode, DataSource dataSource, DataType dataType, long samplingIntervalMicros, int accuracyMode) {
        this.zzCY = versionCode;
        this.zzajG = dataSource;
        this.zzajF = dataType;
        this.zzakP = samplingIntervalMicros;
        this.zzakQ = accuracyMode;
    }

    private Subscription(zza builder) {
        this.zzCY = 1;
        this.zzajF = builder.zzajF;
        this.zzajG = builder.zzajG;
        this.zzakP = builder.zzakP;
        this.zzakQ = builder.zzakQ;
    }

    Subscription(zza x0, com.google.android.gms.fitness.data.Subscription.1 x1) {
        this(x0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof Subscription && this.zza(((Subscription)that));
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

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajG, this.zzajG, this.zzakP, this.zzakQ});
    }

    public String toDebugString() {
        return String.format("Subscription{%s}", (this.zzajG == null ? this.zzajF.getName() : this.zzajG.toDebugString()));
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("dataSource", this.zzajG).zzg("dataType", this.zzajF).zzg("samplingIntervalMicros", this.zzakP).zzg("accuracyMode", this.zzakQ).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzr.zza(this, dest, flags);
    }

    // 去混淆评级： 低(20)
    private boolean zza(Subscription subscription0) {
        return zzt.equal(this.zzajG, subscription0.zzajG) && zzt.equal(this.zzajF, subscription0.zzajF) && this.zzakP == subscription0.zzakP && this.zzakQ == subscription0.zzakQ;
    }

    public long zzqL() {
        return this.zzakP;
    }

    public DataType zzqM() {
        return this.zzajF == null ? this.zzajG.getDataType() : this.zzajF;
    }

    class com.google.android.gms.fitness.data.Subscription.1 {
    }

}

