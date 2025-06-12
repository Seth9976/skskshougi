package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionEntity implements SafeParcelable, AppContentAction {
    public static final AppContentActionEntityCreator CREATOR;
    private final Bundle mExtras;
    private final int zzCY;
    private final String zzEl;
    private final String zzKI;
    private final ArrayList zzaol;
    private final String zzaom;
    private final AppContentAnnotationEntity zzaon;
    private final String zzaoo;

    static {
        AppContentActionEntity.CREATOR = new AppContentActionEntityCreator();
    }

    AppContentActionEntity(int versionCode, ArrayList arrayList0, String contentDescription, Bundle extras, String type, String id, AppContentAnnotationEntity annotation, String overflowText) {
        this.zzCY = versionCode;
        this.zzaon = annotation;
        this.zzaol = arrayList0;
        this.zzaom = contentDescription;
        this.mExtras = extras;
        this.zzKI = id;
        this.zzaoo = overflowText;
        this.zzEl = type;
    }

    public AppContentActionEntity(AppContentAction action) {
        this.zzCY = 5;
        this.zzaon = (AppContentAnnotationEntity)action.zzrN().freeze();
        this.zzaom = action.zzrP();
        this.mExtras = action.getExtras();
        this.zzKI = action.getId();
        this.zzaoo = action.zzrQ();
        this.zzEl = action.getType();
        List list0 = action.zzrO();
        int v = list0.size();
        this.zzaol = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            AppContentConditionEntity appContentConditionEntity0 = (AppContentConditionEntity)((AppContentCondition)list0.get(v1)).freeze();
            this.zzaol.add(appContentConditionEntity0);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AppContentActionEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String getType() {
        return this.zzEl;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return AppContentActionEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AppContentActionEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        AppContentActionEntityCreator.zza(this, out, flags);
    }

    static int zza(AppContentAction appContentAction0) {
        return zzt.hashCode(new Object[]{appContentAction0.zzrN(), appContentAction0.zzrO(), appContentAction0.zzrP(), appContentAction0.getExtras(), appContentAction0.getId(), appContentAction0.zzrQ(), appContentAction0.getType()});
    }

    // 去混淆评级： 中等(80)
    static boolean zza(AppContentAction appContentAction0, Object object0) {
        return object0 instanceof AppContentAction ? appContentAction0 == object0 || zzt.equal(((AppContentAction)object0).zzrN(), appContentAction0.zzrN()) && zzt.equal(((AppContentAction)object0).zzrO(), appContentAction0.zzrO()) && zzt.equal(((AppContentAction)object0).zzrP(), appContentAction0.zzrP()) && zzt.equal(((AppContentAction)object0).getExtras(), appContentAction0.getExtras()) && zzt.equal(((AppContentAction)object0).getId(), appContentAction0.getId()) && zzt.equal(((AppContentAction)object0).zzrQ(), appContentAction0.zzrQ()) && zzt.equal(((AppContentAction)object0).getType(), appContentAction0.getType()) : false;
    }

    static String zzb(AppContentAction appContentAction0) {
        return zzt.zzt(appContentAction0).zzg("Annotation", appContentAction0.zzrN()).zzg("Conditions", appContentAction0.zzrO()).zzg("ContentDescription", appContentAction0.zzrP()).zzg("Extras", appContentAction0.getExtras()).zzg("Id", appContentAction0.getId()).zzg("OverflowText", appContentAction0.zzrQ()).zzg("Type", appContentAction0.getType()).toString();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public AppContentAnnotation zzrN() {
        return this.zzaon;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public List zzrO() {
        return new ArrayList(this.zzaol);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String zzrP() {
        return this.zzaom;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentAction
    public String zzrQ() {
        return this.zzaoo;
    }

    public AppContentAction zzrR() [...] // Inlined contents
}

