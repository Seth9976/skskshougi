package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class AppContentConditionEntity implements SafeParcelable, AppContentCondition {
    public static final AppContentConditionEntityCreator CREATOR;
    private final int zzCY;
    private final String zzaoA;
    private final String zzaoB;
    private final Bundle zzaoC;
    private final String zzaoz;

    static {
        AppContentConditionEntity.CREATOR = new AppContentConditionEntityCreator();
    }

    AppContentConditionEntity(int versionCode, String defaultValue, String expectedValue, String predicate, Bundle predicateParameters) {
        this.zzCY = versionCode;
        this.zzaoz = defaultValue;
        this.zzaoA = expectedValue;
        this.zzaoB = predicate;
        this.zzaoC = predicateParameters;
    }

    public AppContentConditionEntity(AppContentCondition condition) {
        this.zzCY = 1;
        this.zzaoz = condition.zzse();
        this.zzaoA = condition.zzsf();
        this.zzaoB = condition.zzsg();
        this.zzaoC = condition.zzsh();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AppContentConditionEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return AppContentConditionEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AppContentConditionEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        AppContentConditionEntityCreator.zza(this, out, flags);
    }

    static int zza(AppContentCondition appContentCondition0) {
        return zzt.hashCode(new Object[]{appContentCondition0.zzse(), appContentCondition0.zzsf(), appContentCondition0.zzsg(), appContentCondition0.zzsh()});
    }

    // 去混淆评级： 中等(50)
    static boolean zza(AppContentCondition appContentCondition0, Object object0) {
        return object0 instanceof AppContentCondition ? appContentCondition0 == object0 || zzt.equal(((AppContentCondition)object0).zzse(), appContentCondition0.zzse()) && zzt.equal(((AppContentCondition)object0).zzsf(), appContentCondition0.zzsf()) && zzt.equal(((AppContentCondition)object0).zzsg(), appContentCondition0.zzsg()) && zzt.equal(((AppContentCondition)object0).zzsh(), appContentCondition0.zzsh()) : false;
    }

    static String zzb(AppContentCondition appContentCondition0) {
        return zzt.zzt(appContentCondition0).zzg("DefaultValue", appContentCondition0.zzse()).zzg("ExpectedValue", appContentCondition0.zzsf()).zzg("Predicate", appContentCondition0.zzsg()).zzg("PredicateParameters", appContentCondition0.zzsh()).toString();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzse() {
        return this.zzaoz;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzsf() {
        return this.zzaoA;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public String zzsg() {
        return this.zzaoB;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCondition
    public Bundle zzsh() {
        return this.zzaoC;
    }

    public AppContentCondition zzsi() [...] // Inlined contents
}

