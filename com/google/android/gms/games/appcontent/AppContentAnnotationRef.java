package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

public final class AppContentAnnotationRef extends MultiDataBufferRef implements AppContentAnnotation {
    AppContentAnnotationRef(ArrayList arrayList0, int dataRow) {
        super(arrayList0, 2, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return AppContentAnnotationEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzrY();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String getDescription() {
        return this.getString("annotation_description");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String getId() {
        return this.getString("annotation_id");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String getTitle() {
        return this.getString("annotation_title");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return AppContentAnnotationEntity.zza(this);
    }

    @Override
    public String toString() {
        return AppContentAnnotationEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AppContentAnnotationEntity)this.zzrY()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String zzrS() {
        return this.getString("annotation_image_default_id");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public int zzrT() {
        return this.getInteger("annotation_image_height");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public Uri zzrU() {
        return this.zzbW("annotation_image_uri");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public Bundle zzrV() {
        return AppContentUtils.zzd(this.zzWu, this.zzaoD, "annotation_modifiers", this.zzYs);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public int zzrW() {
        return this.getInteger("annotation_image_width");
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String zzrX() {
        return this.getString("annotation_layout_slot");
    }

    public AppContentAnnotation zzrY() {
        return new AppContentAnnotationEntity(this);
    }
}

