package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zzmh.zza;
import com.google.android.gms.internal.zzmh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest implements SafeParcelable {
    public static class Builder {
        private String mName;
        private List zzakq;

        public Builder() {
            this.zzakq = new ArrayList();
        }

        public Builder addField(Field field) {
            if(!this.zzakq.contains(field)) {
                this.zzakq.add(field);
            }
            return this;
        }

        public Builder addField(String name, int format) {
            zzu.zzb(name != null && !name.isEmpty(), "Invalid name specified");
            return this.addField(Field.zzn(name, format));
        }

        public DataTypeCreateRequest build() {
            boolean z = true;
            zzu.zza(this.mName != null, "Must set the name");
            if(this.zzakq.isEmpty()) {
                z = false;
            }
            zzu.zza(z, "Must specify the data fields");
            return new DataTypeCreateRequest(this, null);
        }

        public Builder setName(String name) {
            this.mName = name;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final List zzakq;
    private final zzmh zzamk;

    static {
        DataTypeCreateRequest.CREATOR = new zzi();
    }

    DataTypeCreateRequest(int versionCode, String name, List list0, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.mName = name;
        this.zzakq = Collections.unmodifiableList(list0);
        this.zzamk = callback == null ? null : zza.zzbs(callback);
        this.zzMZ = packageName;
    }

    private DataTypeCreateRequest(Builder builder) {
        this(builder.mName, builder.zzakq, null, null);
    }

    DataTypeCreateRequest(Builder x0, com.google.android.gms.fitness.request.DataTypeCreateRequest.1 x1) {
        this(x0);
    }

    public DataTypeCreateRequest(DataTypeCreateRequest request, zzmh callback, String packageName) {
        this(request.mName, request.zzakq, callback, packageName);
    }

    public DataTypeCreateRequest(String name, List list0, zzmh callback, String packageName) {
        this.zzCY = 2;
        this.mName = name;
        this.zzakq = Collections.unmodifiableList(list0);
        this.zzamk = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof DataTypeCreateRequest && this.zzb(((DataTypeCreateRequest)o));
    }

    public List getFields() {
        return this.zzakq;
    }

    public String getName() {
        return this.mName;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mName, this.zzakq});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("name", this.mName).zzg("fields", this.zzakq).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(DataTypeCreateRequest dataTypeCreateRequest0) {
        return zzt.equal(this.mName, dataTypeCreateRequest0.mName) && zzt.equal(this.zzakq, dataTypeCreateRequest0.zzakq);
    }

    public IBinder zzqU() {
        return this.zzamk == null ? null : this.zzamk.asBinder();
    }

    class com.google.android.gms.fitness.request.DataTypeCreateRequest.1 {
    }

}

