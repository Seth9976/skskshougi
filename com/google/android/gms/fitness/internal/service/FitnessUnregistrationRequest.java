package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class FitnessUnregistrationRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final DataSource zzajG;

    static {
        FitnessUnregistrationRequest.CREATOR = new zzb();
    }

    FitnessUnregistrationRequest(int versionCode, DataSource dataSource) {
        this.zzCY = versionCode;
        this.zzajG = dataSource;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DataSource getDataSource() {
        return this.zzajG;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", this.zzajG);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzb.zza(this, parcel, flags);
    }
}

