package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzmg.zza;
import com.google.android.gms.internal.zzmg;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataSourcesRequest implements SafeParcelable {
    public static class Builder {
        private boolean zzamg;
        private DataType[] zzami;
        private int[] zzamj;

        public Builder() {
            this.zzami = new DataType[0];
            this.zzamj = new int[]{0, 1};
            this.zzamg = false;
        }

        public DataSourcesRequest build() {
            boolean z = true;
            zzu.zza(this.zzami.length > 0, "Must add at least one data type");
            if(this.zzamj.length <= 0) {
                z = false;
            }
            zzu.zza(z, "Must add at least one data source type");
            return new DataSourcesRequest(this, null);
        }

        public Builder setDataSourceTypes(int[] dataSourceTypes) {
            this.zzamj = dataSourceTypes;
            return this;
        }

        public Builder setDataTypes(DataType[] dataTypes) {
            this.zzami = dataTypes;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final List zzajQ;
    private final List zzamf;
    private final boolean zzamg;
    private final zzmg zzamh;

    static {
        DataSourcesRequest.CREATOR = new zzh();
    }

    DataSourcesRequest(int versionCode, List list0, List list1, boolean includeDbOnlySources, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzajQ = list0;
        this.zzamf = list1;
        this.zzamg = includeDbOnlySources;
        this.zzamh = callback == null ? null : zza.zzbr(callback);
        this.zzMZ = packageName;
    }

    private DataSourcesRequest(Builder builder) {
        this(zzkx.zzb(builder.zzami), Arrays.asList(zzkx.zza(builder.zzamj)), builder.zzamg, null, null);
    }

    DataSourcesRequest(Builder x0, com.google.android.gms.fitness.request.DataSourcesRequest.1 x1) {
        this(x0);
    }

    public DataSourcesRequest(DataSourcesRequest request, zzmg callback, String packageName) {
        this(request.zzajQ, request.zzamf, request.zzamg, callback, packageName);
    }

    public DataSourcesRequest(List list0, List list1, boolean includeDbOnlySources, zzmg callback, String packageName) {
        this.zzCY = 3;
        this.zzajQ = list0;
        this.zzamf = list1;
        this.zzamg = includeDbOnlySources;
        this.zzamh = callback;
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

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public String toString() {
        com.google.android.gms.common.internal.zzt.zza zzt$zza0 = zzt.zzt(this).zzg("dataTypes", this.zzajQ).zzg("sourceTypes", this.zzamf);
        if(this.zzamg) {
            zzt$zza0.zzg("includeDbOnlySources", "true");
        }
        return zzt$zza0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzh.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        return this.zzamh == null ? null : this.zzamh.asBinder();
    }

    public List zzrd() {
        return this.zzamf;
    }

    public boolean zzre() {
        return this.zzamg;
    }

    class com.google.android.gms.fitness.request.DataSourcesRequest.1 {
    }

}

