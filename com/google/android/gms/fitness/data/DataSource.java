package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;

public class DataSource implements SafeParcelable {
    public static final class Builder {
        private String mName;
        private int zzSq;
        private DataType zzajF;
        private Device zzakd;
        private Application zzake;
        private String zzakf;

        public Builder() {
            this.zzSq = -1;
            this.zzakf = "";
        }

        public DataSource build() {
            boolean z = true;
            zzu.zza(this.zzajF != null, "Must set data type");
            if(this.zzSq < 0) {
                z = false;
            }
            zzu.zza(z, "Must set data source type");
            return new DataSource(this, null);
        }

        public Builder setAppPackageName(Context appContext) {
            return this.setAppPackageName("org.dyndns.vivi.SkskShogi");
        }

        public Builder setAppPackageName(String packageName) {
            this.zzake = Application.zzcG(packageName);
            return this;
        }

        public Builder setDataType(DataType dataType) {
            this.zzajF = dataType;
            return this;
        }

        public Builder setDevice(Device device) {
            this.zzakd = device;
            return this;
        }

        public Builder setName(String name) {
            this.mName = name;
            return this;
        }

        public Builder setStreamName(String streamName) {
            zzu.zzb(streamName != null, "Must specify a valid stream name");
            this.zzakf = streamName;
            return this;
        }

        public Builder setType(int type) {
            this.zzSq = type;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW;
    private final String mName;
    private final int zzCY;
    private final int zzSq;
    private final DataType zzajF;
    private final Device zzakd;
    private final Application zzake;
    private final String zzakf;
    private final String zzakg;

    static {
        DataSource.CREATOR = new zzf();
    }

    DataSource(int versionCode, DataType dataType, String name, int type, Device device, Application application, String streamName) {
        this.zzCY = versionCode;
        this.zzajF = dataType;
        this.zzSq = type;
        this.mName = name;
        this.zzakd = device;
        this.zzake = application;
        this.zzakf = streamName;
        this.zzakg = this.zzqC();
    }

    private DataSource(Builder builder) {
        this.zzCY = 3;
        this.zzajF = builder.zzajF;
        this.zzSq = builder.zzSq;
        this.mName = builder.mName;
        this.zzakd = builder.zzakd;
        this.zzake = builder.zzake;
        this.zzakf = builder.zzakf;
        this.zzakg = this.zzqC();
    }

    DataSource(Builder x0, com.google.android.gms.fitness.data.DataSource.1 x1) {
        this(x0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DataSource && this.zza(((DataSource)that));
    }

    public static DataSource extract(Intent intent) {
        return intent == null ? null : ((DataSource)zzc.zza(intent, "vnd.google.fitness.data_source", DataSource.CREATOR));
    }

    public String getAppPackageName() {
        return this.zzake == null ? null : this.zzake.getPackageName();
    }

    public DataType getDataType() {
        return this.zzajF;
    }

    public Device getDevice() {
        return this.zzakd;
    }

    public String getName() {
        return this.mName;
    }

    public String getStreamIdentifier() {
        return this.zzakg;
    }

    public String getStreamName() {
        return this.zzakf;
    }

    public int getType() {
        return this.zzSq;
    }

    private String getTypeString() {
        switch(this.zzSq) {
            case 0: {
                return "raw";
            }
            case 1: {
                return "derived";
            }
            default: {
                throw new IllegalArgumentException("invalid type value");
            }
        }
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return this.zzakg.hashCode();
    }

    public String toDebugString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder().append((this.zzSq == 0 ? "r" : "d")).append(":").append(this.zzajF.zzqD());
        if(this.zzake == null) {
            s = "";
        }
        else {
            s = this.zzake.equals(Application.zzajM) ? ":gms" : ":" + this.zzake.getPackageName();
        }
        StringBuilder stringBuilder1 = stringBuilder0.append(s).append((this.zzakd == null ? "" : ":" + this.zzakd.getModel() + ":" + this.zzakd.getUid()));
        return this.zzakf == null ? stringBuilder1.append("").toString() : stringBuilder1.append(":" + this.zzakf).toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataSource{");
        stringBuilder0.append(this.getTypeString());
        if(this.mName != null) {
            stringBuilder0.append(":").append(this.mName);
        }
        if(this.zzake != null) {
            stringBuilder0.append(":").append(this.zzake);
        }
        if(this.zzakd != null) {
            stringBuilder0.append(":").append(this.zzakd);
        }
        if(this.zzakf != null) {
            stringBuilder0.append(":").append(this.zzakf);
        }
        stringBuilder0.append(":").append(this.zzajF);
        return stringBuilder0.append("}").toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzf.zza(this, parcel, flags);
    }

    private boolean zza(DataSource dataSource0) {
        return this.zzakg.equals(dataSource0.zzakg);
    }

    public Application zzqB() {
        return this.zzake;
    }

    private String zzqC() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getTypeString());
        stringBuilder0.append(":").append(this.zzajF.getName());
        if(this.zzake != null) {
            stringBuilder0.append(":").append(this.zzake.getPackageName());
        }
        if(this.zzakd != null) {
            stringBuilder0.append(":").append(this.zzakd.getStreamIdentifier());
        }
        if(this.zzakf != null) {
            stringBuilder0.append(":").append(this.zzakf);
        }
        return stringBuilder0.toString();
    }

    class com.google.android.gms.fitness.data.DataSource.1 {
    }

}

