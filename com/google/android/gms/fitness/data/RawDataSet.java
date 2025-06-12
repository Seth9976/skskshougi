package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

public final class RawDataSet implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public final boolean zzajU;
    public final int zzakH;
    public final int zzakJ;
    public final List zzakK;

    static {
        RawDataSet.CREATOR = new zzo();
    }

    public RawDataSet(int versionCode, int dataSourceIndex, int dataTypeIndex, List list0, boolean serverHasMoreData) {
        this.zzCY = versionCode;
        this.zzakH = dataSourceIndex;
        this.zzakJ = dataTypeIndex;
        this.zzakK = list0;
        this.zzajU = serverHasMoreData;
    }

    public RawDataSet(DataSet dataSet, List list0, List list1) {
        this.zzCY = 3;
        this.zzakK = dataSet.zzk(list0);
        this.zzajU = dataSet.zzqr();
        this.zzakH = zzs.zza(dataSet.getDataSource(), list0);
        this.zzakJ = zzs.zza(dataSet.getDataType(), list1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof RawDataSet && this.zza(((RawDataSet)o));
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzakH});
    }

    @Override
    public String toString() {
        return String.format("RawDataSet{%s@[%s]}", this.zzakH, this.zzakK);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzo.zza(this, parcel, flags);
    }

    private boolean zza(RawDataSet rawDataSet0) {
        return this.zzakH == rawDataSet0.zzakH && this.zzajU == rawDataSet0.zzajU && zzt.equal(this.zzakK, rawDataSet0.zzakK);
    }
}

