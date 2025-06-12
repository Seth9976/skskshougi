package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionRef extends MultiDataBufferRef implements AppContentSection {
    private final int zzaoG;

    AppContentSectionRef(ArrayList arrayList0, int dataRow, int numChildren) {
        super(arrayList0, 0, dataRow);
        this.zzaoG = numChildren;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentSectionEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzsl();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public List getActions() {
        return this.zzsm();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public Bundle getExtras() {
        return AppContentUtils.zzd(this.zzWu, this.zzaoD, "section_data", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String getId() {
        return this.getString("section_id");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String getTitle() {
        return this.getString("section_title");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String getType() {
        return this.getString("section_type");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentSectionEntity.zza(this);
    }

    @Override
    public String toString() {
        return AppContentSectionEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentSectionEntity)this.zzsl()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String zzrP() {
        return this.getString("section_content_description");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public List zzrZ() {
        return this.zzsn();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String zzsb() {
        return this.getString("section_subtitle");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public List zzsj() {
        return this.zzso();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String zzsk() {
        return this.getString("section_card_type");
    }

    public AppContentSection zzsl() {
        return new AppContentSectionEntity(this);
    }

    public ArrayList zzsm() {
        return AppContentUtils.zza(this.zzWu, this.zzaoD, "section_actions", this.zzYs);
    }

    public ArrayList zzsn() {
        return AppContentUtils.zzb(this.zzWu, this.zzaoD, "section_annotations", this.zzYs);
    }

    public ArrayList zzso() {
        ArrayList arrayList0 = new ArrayList(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            arrayList0.add(new AppContentCardRef(this.zzaoD, this.zzYs + v));
        }
        return arrayList0;
    }
}

