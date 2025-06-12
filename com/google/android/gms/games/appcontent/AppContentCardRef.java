package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardRef extends MultiDataBufferRef implements AppContentCard {
    AppContentCardRef(ArrayList arrayList0, int dataRow) {
        super(arrayList0, 0, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentCardEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzsd();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public List getActions() {
        return AppContentUtils.zza(this.zzWu, this.zzaoD, "card_actions", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getDescription() {
        return this.getString("card_description");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public Bundle getExtras() {
        return AppContentUtils.zzd(this.zzWu, this.zzaoD, "card_data", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getId() {
        return this.getString("card_id");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getTitle() {
        return this.getString("card_title");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getType() {
        return this.getString("card_type");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentCardEntity.zza(this);
    }

    @Override
    public String toString() {
        return AppContentCardEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentCardEntity)this.zzsd()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public List zzrO() {
        return AppContentUtils.zzc(this.zzWu, this.zzaoD, "card_conditions", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String zzrP() {
        return this.getString("card_content_description");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public List zzrZ() {
        return AppContentUtils.zzb(this.zzWu, this.zzaoD, "card_annotations", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public int zzsa() {
        return this.getInteger("card_current_steps");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String zzsb() {
        return this.getString("card_subtitle");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public int zzsc() {
        return this.getInteger("card_total_steps");
    }

    public AppContentCard zzsd() {
        return new AppContentCardEntity(this);
    }
}

