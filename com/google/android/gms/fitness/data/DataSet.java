package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DataSet implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final DataType zzajF;
    private final DataSource zzajG;
    private boolean zzajU;
    private final List zzakb;
    private final List zzakc;

    static {
        DataSet.CREATOR = new zze();
    }

    DataSet(int versionCode, DataSource dataSource, DataType dataType, List list0, List list1, boolean serverHasMoreData) {
        this.zzajU = false;
        this.zzCY = versionCode;
        this.zzajG = dataSource;
        this.zzajF = dataSource.getDataType();
        this.zzajU = serverHasMoreData;
        this.zzakb = new ArrayList(list0.size());
        if(versionCode < 2) {
            list1 = Collections.singletonList(dataSource);
        }
        this.zzakc = list1;
        for(Object object0: list0) {
            DataPoint dataPoint0 = new DataPoint(this.zzakc, ((RawDataPoint)object0));
            this.zzakb.add(dataPoint0);
        }
    }

    public DataSet(DataSource dataSource) {
        this.zzajU = false;
        this.zzCY = 3;
        this.zzajG = (DataSource)zzu.zzu(dataSource);
        this.zzajF = dataSource.getDataType();
        this.zzakb = new ArrayList();
        this.zzakc = new ArrayList();
        this.zzakc.add(this.zzajG);
    }

    public DataSet(RawDataSet dataSet, List list0) {
        this.zzajU = false;
        this.zzCY = 3;
        this.zzajG = (DataSource)DataSet.zzb(list0, dataSet.zzakH);
        this.zzajF = this.zzajG.getDataType();
        this.zzakc = list0;
        this.zzajU = dataSet.zzajU;
        this.zzakb = new ArrayList(dataSet.zzakK.size());
        for(Object object0: dataSet.zzakK) {
            DataPoint dataPoint0 = new DataPoint(this.zzakc, ((RawDataPoint)object0));
            this.zzakb.add(dataPoint0);
        }
    }

    public void add(DataPoint dataPoint) {
        DataSource dataSource0 = dataPoint.getDataSource();
        zzu.zzb(dataSource0.getStreamIdentifier().equals(this.zzajG.getStreamIdentifier()), "Conflicting data sources found %s vs %s", new Object[]{dataSource0, this.zzajG});
        dataPoint.zzqx();
        this.zzb(dataPoint);
    }

    public void addAll(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.add(((DataPoint)object0));
        }
    }

    public static DataSet create(DataSource dataSource) {
        zzu.zzb(dataSource, "DataSource should be specified");
        return new DataSet(dataSource);
    }

    public DataPoint createDataPoint() {
        return DataPoint.create(this.zzajG);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof DataSet && this.zza(((DataSet)o));
    }

    public List getDataPoints() {
        return Collections.unmodifiableList(this.zzakb);
    }

    public DataSource getDataSource() {
        return this.zzajG;
    }

    public DataType getDataType() {
        return this.zzajG.getDataType();
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzajG});
    }

    public boolean isEmpty() {
        return this.zzakb.isEmpty();
    }

    @Override
    public String toString() {
        List list0 = this.zzqz();
        Object[] arr_object = {this.zzajG.toDebugString(), null};
        if(this.zzakb.size() >= 10) {
            list0 = String.format("%d data points, first 5: %s", this.zzakb.size(), list0.subList(0, 5));
        }
        arr_object[1] = list0;
        return String.format("DataSet{%s %s}", arr_object);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zze.zza(this, parcel, flags);
    }

    // 去混淆评级： 低(30)
    private boolean zza(DataSet dataSet0) {
        return zzt.equal(this.getDataType(), dataSet0.getDataType()) && zzt.equal(this.zzajG, dataSet0.zzajG) && zzt.equal(this.zzakb, dataSet0.zzakb) && this.zzajU == dataSet0.zzajU;
    }

    private static Object zzb(List list0, int v) {
        return v < 0 || v >= list0.size() ? null : list0.get(v);
    }

    public void zzb(DataPoint dataPoint0) {
        this.zzakb.add(dataPoint0);
        DataSource dataSource0 = dataPoint0.getOriginalDataSource();
        if(dataSource0 != null && !this.zzakc.contains(dataSource0)) {
            this.zzakc.add(dataSource0);
        }
    }

    public void zzb(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.zzb(((DataPoint)object0));
        }
    }

    List zzk(List list0) {
        List list1 = new ArrayList(this.zzakb.size());
        for(Object object0: this.zzakb) {
            list1.add(new RawDataPoint(((DataPoint)object0), list0));
        }
        return list1;
    }

    List zzqA() {
        return this.zzakc;
    }

    public boolean zzqr() {
        return this.zzajU;
    }

    List zzqz() {
        return this.zzk(this.zzakc);
    }
}

