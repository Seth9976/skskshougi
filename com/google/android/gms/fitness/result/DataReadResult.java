package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataReadResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzajS;
    private final List zzakc;
    private final List zzamP;
    private int zzamQ;
    private final List zzamR;

    static {
        DataReadResult.CREATOR = new zzc();
    }

    DataReadResult(int versionCode, List list0, Status status, List list1, int batchCount, List list2, List list3) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzamQ = batchCount;
        this.zzakc = list2;
        this.zzamR = list3;
        this.zzajS = new ArrayList(list0.size());
        for(Object object0: list0) {
            DataSet dataSet0 = new DataSet(((RawDataSet)object0), list2);
            this.zzajS.add(dataSet0);
        }
        this.zzamP = new ArrayList(list1.size());
        for(Object object1: list1) {
            Bucket bucket0 = new Bucket(((RawBucket)object1), list2);
            this.zzamP.add(bucket0);
        }
    }

    public DataReadResult(List list0, List list1, Status status) {
        this.zzCY = 5;
        this.zzajS = list0;
        this.zzOt = status;
        this.zzamP = list1;
        this.zzamQ = 1;
        this.zzakc = new ArrayList();
        this.zzamR = new ArrayList();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DataReadResult && this.zzc(((DataReadResult)that));
    }

    public List getBuckets() {
        return this.zzamP;
    }

    public DataSet getDataSet(DataSource dataSource) {
        for(Object object0: this.zzajS) {
            DataSet dataSet0 = (DataSet)object0;
            if(dataSource.equals(dataSet0.getDataSource())) {
                return dataSet0;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", dataSource.getStreamIdentifier()));
    }

    public DataSet getDataSet(DataType dataType) {
        for(Object object0: this.zzajS) {
            DataSet dataSet0 = (DataSet)object0;
            if(dataType.equals(dataSet0.getDataType())) {
                return dataSet0;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", dataType.getName()));
    }

    public List getDataSets() {
        return this.zzajS;
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
        return zzt.hashCode(new Object[]{this.zzOt, this.zzajS, this.zzamP});
    }

    @Override
    public String toString() {
        zza zzt$zza0 = zzt.zzt(this).zzg("status", this.zzOt);
        String s = this.zzajS.size() > 5 ? this.zzajS.size() + " data sets" : this.zzajS;
        zza zzt$zza1 = zzt$zza0.zzg("dataSets", s);
        return this.zzamP.size() <= 5 ? zzt$zza1.zzg("buckets", this.zzamP).toString() : zzt$zza1.zzg("buckets", this.zzamP.size() + " buckets").toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }

    public static DataReadResult zza(Status status0, DataReadRequest dataReadRequest0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: dataReadRequest0.getDataSources()) {
            arrayList0.add(DataSet.create(((DataSource)object0)));
        }
        for(Object object1: dataReadRequest0.getDataTypes()) {
            arrayList0.add(DataSet.create(new Builder().setDataType(((DataType)object1)).setType(1).setName("Default").build()));
        }
        return new DataReadResult(arrayList0, Collections.emptyList(), status0);
    }

    private void zza(Bucket bucket0, List list0) {
        for(Object object0: list0) {
            Bucket bucket1 = (Bucket)object0;
            if(!bucket1.zzb(bucket0)) {
                continue;
            }
            for(Object object1: bucket0.getDataSets()) {
                this.zza(((DataSet)object1), bucket1.getDataSets());
            }
            return;
        }
        this.zzamP.add(bucket0);
    }

    private void zza(DataSet dataSet0, List list0) {
        for(Object object0: list0) {
            DataSet dataSet1 = (DataSet)object0;
            if(dataSet1.getDataSource().equals(dataSet0.getDataSource())) {
                dataSet1.zzb(dataSet0.getDataPoints());
                return;
            }
            if(false) {
                break;
            }
        }
        list0.add(dataSet0);
    }

    public void zzb(DataReadResult dataReadResult0) {
        for(Object object0: dataReadResult0.getDataSets()) {
            this.zza(((DataSet)object0), this.zzajS);
        }
        for(Object object1: dataReadResult0.getBuckets()) {
            this.zza(((Bucket)object1), this.zzamP);
        }
    }

    // 去混淆评级： 低(30)
    private boolean zzc(DataReadResult dataReadResult0) {
        return this.zzOt.equals(dataReadResult0.zzOt) && zzt.equal(this.zzajS, dataReadResult0.zzajS) && zzt.equal(this.zzamP, dataReadResult0.zzamP);
    }

    List zzqA() {
        return this.zzakc;
    }

    public int zzrt() {
        return this.zzamQ;
    }

    List zzru() {
        List list0 = new ArrayList(this.zzamP.size());
        for(Object object0: this.zzamP) {
            list0.add(new RawBucket(((Bucket)object0), this.zzakc, this.zzamR));
        }
        return list0;
    }

    List zzrv() {
        List list0 = new ArrayList(this.zzajS.size());
        for(Object object0: this.zzajS) {
            list0.add(new RawDataSet(((DataSet)object0), this.zzakc, this.zzamR));
        }
        return list0;
    }

    List zzrw() {
        return this.zzamR;
    }
}

