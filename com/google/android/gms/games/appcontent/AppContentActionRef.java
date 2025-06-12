package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef extends MultiDataBufferRef implements AppContentAction {
    AppContentActionRef(ArrayList arrayList0, int dataRow) {
        super(arrayList0, 1, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentActionEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzrR();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public Bundle getExtras() {
        return AppContentUtils.zzd(this.zzWu, this.zzaoD, "action_data", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String getId() {
        return this.getString("action_id");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String getType() {
        return this.getString("action_type");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentActionEntity.zza(this);
    }

    @Override
    public String toString() {
        return AppContentActionEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentActionEntity)this.zzrR()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public AppContentAnnotation zzrN() {
        ArrayList arrayList0 = AppContentUtils.zzb(this.zzWu, this.zzaoD, "action_annotation", this.zzYs);
        return arrayList0.size() == 1 ? ((AppContentAnnotation)arrayList0.get(0)) : null;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public List zzrO() {
        return AppContentUtils.zzc(this.zzWu, this.zzaoD, "action_conditions", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String zzrP() {
        return this.getString("action_content_description");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String zzrQ() {
        return this.getString("overflow_text");
    }

    public AppContentAction zzrR() {
        return new AppContentActionEntity(this);
    }
}

