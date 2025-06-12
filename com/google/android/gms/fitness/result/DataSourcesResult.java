package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSourcesResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzalP;

    static {
        DataSourcesResult.CREATOR = new zze();
    }

    DataSourcesResult(int versionCode, List list0, Status status) {
        this.zzCY = versionCode;
        this.zzalP = Collections.unmodifiableList(list0);
        this.zzOt = status;
    }

    public DataSourcesResult(List list0, Status status) {
        this.zzCY = 3;
        this.zzalP = Collections.unmodifiableList(list0);
        this.zzOt = status;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DataSourcesResult && this.zzb(((DataSourcesResult)that));
    }

    public List getDataSources() {
        return this.zzalP;
    }

    public List getDataSources(DataType dataType) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzalP) {
            DataSource dataSource0 = (DataSource)object0;
            if(dataSource0.getDataType().equals(dataType)) {
                arrayList0.add(dataSource0);
            }
        }
        return Collections.unmodifiableList(arrayList0);
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOt, this.zzalP});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("dataSets", this.zzalP).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }

    public static DataSourcesResult zzL(Status status0) {
        return new DataSourcesResult(Collections.emptyList(), status0);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(DataSourcesResult dataSourcesResult0) {
        return this.zzOt.equals(dataSourcesResult0.zzOt) && zzt.equal(this.zzalP, dataSourcesResult0.zzalP);
    }
}

