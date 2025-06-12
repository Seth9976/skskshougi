package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzmu.zza;
import com.google.android.gms.internal.zzmu;

public class DataInsertRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final DataSet zzakO;
    private final zzmu zzalN;
    private final boolean zzalT;

    static {
        DataInsertRequest.CREATOR = new zze();
    }

    DataInsertRequest(int versionCode, DataSet dataSet, IBinder callback, String packageName, boolean skipSync) {
        this.zzCY = versionCode;
        this.zzakO = dataSet;
        this.zzalN = callback == null ? null : zza.zzbF(callback);
        this.zzMZ = packageName;
        this.zzalT = skipSync;
    }

    public DataInsertRequest(DataSet dataSet, zzmu callback, String packageName, boolean skipSync) {
        this.zzCY = 3;
        this.zzakO = dataSet;
        this.zzalN = callback;
        this.zzMZ = packageName;
        this.zzalT = skipSync;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof DataInsertRequest && this.zzb(((DataInsertRequest)o));
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzakO});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("dataSet", this.zzakO).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }

    private boolean zzb(DataInsertRequest dataInsertRequest0) {
        return zzt.equal(this.zzakO, dataInsertRequest0.zzakO);
    }

    public DataSet zzqK() {
        return this.zzakO;
    }

    public IBinder zzqU() {
        return this.zzalN == null ? null : this.zzalN.asBinder();
    }

    public boolean zzqY() {
        return this.zzalT;
    }
}

