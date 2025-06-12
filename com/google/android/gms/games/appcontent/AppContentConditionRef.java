package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

public final class AppContentConditionRef extends MultiDataBufferRef implements AppContentCondition {
    AppContentConditionRef(ArrayList arrayList0, int dataRow) {
        super(arrayList0, 4, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentConditionEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzsi();
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentConditionEntity.zza(this);
    }

    @Override
    public String toString() {
        return AppContentConditionEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentConditionEntity)this.zzsi()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzse() {
        return this.getString("condition_default_value");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzsf() {
        return this.getString("condition_expected_value");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzsg() {
        return this.getString("condition_predicate");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public Bundle zzsh() {
        return AppContentUtils.zzd(this.zzWu, this.zzaoD, "condition_predicate_parameters", this.zzYs);
    }

    public AppContentCondition zzsi() {
        return new AppContentConditionEntity(this);
    }
}

