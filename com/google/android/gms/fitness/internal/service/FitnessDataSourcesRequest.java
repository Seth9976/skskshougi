package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Collections;
import java.util.List;

public class FitnessDataSourcesRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final List zzajQ;

    static {
        FitnessDataSourcesRequest.CREATOR = new zza();
    }

    FitnessDataSourcesRequest(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzajQ = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List getDataTypes() {
        return Collections.unmodifiableList(this.zzajQ);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("dataTypes", this.zzajQ).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zza.zza(this, parcel, flags);
    }
}

