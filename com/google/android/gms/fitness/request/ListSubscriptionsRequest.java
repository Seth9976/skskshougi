package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzmp.zza;
import com.google.android.gms.internal.zzmp;

public class ListSubscriptionsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final DataType zzajF;
    private final zzmp zzamn;

    static {
        ListSubscriptionsRequest.CREATOR = new zzp();
    }

    ListSubscriptionsRequest(int versionCode, DataType dataType, IBinder callback, String packageName) {
        this.zzCY = versionCode;
        this.zzajF = dataType;
        this.zzamn = callback == null ? null : zza.zzbA(callback);
        this.zzMZ = packageName;
    }

    public ListSubscriptionsRequest(DataType dataType, zzmp callback, String packageName) {
        this.zzCY = 2;
        this.zzajF = dataType;
        this.zzamn = callback;
        this.zzMZ = packageName;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DataType getDataType() {
        return this.zzajF;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzp.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        return this.zzamn == null ? null : this.zzamn.asBinder();
    }
}

