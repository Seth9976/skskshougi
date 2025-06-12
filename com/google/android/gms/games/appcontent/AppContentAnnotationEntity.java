package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class AppContentAnnotationEntity implements SafeParcelable, AppContentAnnotation {
    public static final AppContentAnnotationEntityCreator CREATOR;
    private final int zzCY;
    private final String zzKI;
    private final String zzadv;
    private final String zzakM;
    private final Uri zzaop;
    private final String zzaoq;
    private final String zzaor;
    private final int zzaos;
    private final int zzaot;
    private final Bundle zzaou;

    static {
        AppContentAnnotationEntity.CREATOR = new AppContentAnnotationEntityCreator();
    }

    AppContentAnnotationEntity(int versionCode, String description, Uri imageUri, String title, String id, String layoutSlot, String imageDefaultId, int imageHeight, int imageWidth, Bundle modifiers) {
        this.zzCY = versionCode;
        this.zzakM = description;
        this.zzKI = id;
        this.zzaor = imageDefaultId;
        this.zzaos = imageHeight;
        this.zzaop = imageUri;
        this.zzaot = imageWidth;
        this.zzaoq = layoutSlot;
        this.zzaou = modifiers;
        this.zzadv = title;
    }

    public AppContentAnnotationEntity(AppContentAnnotation annotation) {
        this.zzCY = 4;
        this.zzakM = annotation.getDescription();
        this.zzKI = annotation.getId();
        this.zzaor = annotation.zzrS();
        this.zzaos = annotation.zzrT();
        this.zzaop = annotation.zzrU();
        this.zzaot = annotation.zzrW();
        this.zzaoq = annotation.zzrX();
        this.zzaou = annotation.zzrV();
        this.zzadv = annotation.getTitle();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AppContentAnnotationEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String getTitle() {
        return this.zzadv;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return AppContentAnnotationEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AppContentAnnotationEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        AppContentAnnotationEntityCreator.zza(this, out, flags);
    }

    static int zza(AppContentAnnotation appContentAnnotation0) {
        return zzt.hashCode(new Object[]{appContentAnnotation0.getDescription(), appContentAnnotation0.getId(), appContentAnnotation0.zzrS(), appContentAnnotation0.zzrT(), appContentAnnotation0.zzrU(), appContentAnnotation0.zzrW(), appContentAnnotation0.zzrX(), appContentAnnotation0.zzrV(), appContentAnnotation0.getTitle()});
    }

    // 去混淆评级： 中等(100)
    static boolean zza(AppContentAnnotation appContentAnnotation0, Object object0) {
        return object0 instanceof AppContentAnnotation ? appContentAnnotation0 == object0 || zzt.equal(((AppContentAnnotation)object0).getDescription(), appContentAnnotation0.getDescription()) && zzt.equal(((AppContentAnnotation)object0).getId(), appContentAnnotation0.getId()) && zzt.equal(((AppContentAnnotation)object0).zzrS(), appContentAnnotation0.zzrS()) && zzt.equal(((AppContentAnnotation)object0).zzrT(), appContentAnnotation0.zzrT()) && zzt.equal(((AppContentAnnotation)object0).zzrU(), appContentAnnotation0.zzrU()) && zzt.equal(((AppContentAnnotation)object0).zzrW(), appContentAnnotation0.zzrW()) && zzt.equal(((AppContentAnnotation)object0).zzrX(), appContentAnnotation0.zzrX()) && zzt.equal(((AppContentAnnotation)object0).zzrV(), appContentAnnotation0.zzrV()) && zzt.equal(((AppContentAnnotation)object0).getTitle(), appContentAnnotation0.getTitle()) : false;
    }

    static String zzb(AppContentAnnotation appContentAnnotation0) {
        return zzt.zzt(appContentAnnotation0).zzg("Description", appContentAnnotation0.getDescription()).zzg("Id", appContentAnnotation0.getId()).zzg("ImageDefaultId", appContentAnnotation0.zzrS()).zzg("ImageHeight", appContentAnnotation0.zzrT()).zzg("ImageUri", appContentAnnotation0.zzrU()).zzg("ImageWidth", appContentAnnotation0.zzrW()).zzg("LayoutSlot", appContentAnnotation0.zzrX()).zzg("Modifiers", appContentAnnotation0.zzrV()).zzg("Title", appContentAnnotation0.getTitle()).toString();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String zzrS() {
        return this.zzaor;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public int zzrT() {
        return this.zzaos;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public Uri zzrU() {
        return this.zzaop;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public Bundle zzrV() {
        return this.zzaou;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public int zzrW() {
        return this.zzaot;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAnnotation
    public String zzrX() {
        return this.zzaoq;
    }

    public AppContentAnnotation zzrY() [...] // Inlined contents
}

