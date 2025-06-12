package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class AppContentTupleRef extends zzc implements AppContentTuple {
    AppContentTupleRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentTupleEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzsp();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentTuple
    public String getName() {
        return this.getString("tuple_name");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentTuple
    public String getValue() {
        return this.getString("tuple_value");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentTupleEntity.zza(this);
    }

    @Override
    public String toString() {
        return AppContentTupleEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentTupleEntity)this.zzsp()).writeToParcel(dest, flags);
    }

    public AppContentTuple zzsp() {
        return new AppContentTupleEntity(this);
    }
}

