package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardEntity implements SafeParcelable, AppContentCard {
    public static final AppContentCardEntityCreator CREATOR;
    private final ArrayList mActions;
    private final Bundle mExtras;
    private final int zzCY;
    private final String zzEl;
    private final String zzKI;
    private final String zzadv;
    private final String zzakM;
    private final ArrayList zzaol;
    private final String zzaom;
    private final ArrayList zzaov;
    private final int zzaow;
    private final String zzaox;
    private final int zzaoy;

    static {
        AppContentCardEntity.CREATOR = new AppContentCardEntityCreator();
    }

    AppContentCardEntity(int versionCode, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, String contentDescription, int currentProgress, String description, Bundle extras, String subtitle, String title, int totalProgress, String type, String id) {
        this.zzCY = versionCode;
        this.mActions = arrayList0;
        this.zzaov = arrayList1;
        this.zzaol = arrayList2;
        this.zzaom = contentDescription;
        this.zzaow = currentProgress;
        this.zzakM = description;
        this.mExtras = extras;
        this.zzKI = id;
        this.zzaox = subtitle;
        this.zzadv = title;
        this.zzaoy = totalProgress;
        this.zzEl = type;
    }

    public AppContentCardEntity(AppContentCard card) {
        this.zzCY = 4;
        this.zzaom = card.zzrP();
        this.zzaow = card.zzsa();
        this.zzakM = card.getDescription();
        this.mExtras = card.getExtras();
        this.zzKI = card.getId();
        this.zzadv = card.getTitle();
        this.zzaox = card.zzsb();
        this.zzaoy = card.zzsc();
        this.zzEl = card.getType();
        List list0 = card.getActions();
        int v1 = list0.size();
        this.mActions = new ArrayList(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            AppContentActionEntity appContentActionEntity0 = (AppContentActionEntity)((AppContentAction)list0.get(v2)).freeze();
            this.mActions.add(appContentActionEntity0);
        }
        List list1 = card.zzrZ();
        int v3 = list1.size();
        this.zzaov = new ArrayList(v3);
        for(int v4 = 0; v4 < v3; ++v4) {
            AppContentAnnotationEntity appContentAnnotationEntity0 = (AppContentAnnotationEntity)((AppContentAnnotation)list1.get(v4)).freeze();
            this.zzaov.add(appContentAnnotationEntity0);
        }
        List list2 = card.zzrO();
        int v5 = list2.size();
        this.zzaol = new ArrayList(v5);
        for(int v = 0; v < v5; ++v) {
            AppContentConditionEntity appContentConditionEntity0 = (AppContentConditionEntity)((AppContentCondition)list2.get(v)).freeze();
            this.zzaol.add(appContentConditionEntity0);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AppContentCardEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public List getActions() {
        return new ArrayList(this.mActions);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getTitle() {
        return this.zzadv;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String getType() {
        return this.zzEl;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return AppContentCardEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AppContentCardEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        AppContentCardEntityCreator.zza(this, out, flags);
    }

    static int zza(AppContentCard appContentCard0) {
        return zzt.hashCode(new Object[]{appContentCard0.getActions(), appContentCard0.zzrZ(), appContentCard0.zzrO(), appContentCard0.zzrP(), appContentCard0.zzsa(), appContentCard0.getDescription(), appContentCard0.getExtras(), appContentCard0.getId(), appContentCard0.zzsb(), appContentCard0.getTitle(), appContentCard0.zzsc(), appContentCard0.getType()});
    }

    // 去混淆评级： 中等(130)
    static boolean zza(AppContentCard appContentCard0, Object object0) {
        return object0 instanceof AppContentCard ? appContentCard0 == object0 || zzt.equal(((AppContentCard)object0).getActions(), appContentCard0.getActions()) && zzt.equal(((AppContentCard)object0).zzrZ(), appContentCard0.zzrZ()) && zzt.equal(((AppContentCard)object0).zzrO(), appContentCard0.zzrO()) && zzt.equal(((AppContentCard)object0).zzrP(), appContentCard0.zzrP()) && zzt.equal(((AppContentCard)object0).zzsa(), appContentCard0.zzsa()) && zzt.equal(((AppContentCard)object0).getDescription(), appContentCard0.getDescription()) && zzt.equal(((AppContentCard)object0).getExtras(), appContentCard0.getExtras()) && zzt.equal(((AppContentCard)object0).getId(), appContentCard0.getId()) && zzt.equal(((AppContentCard)object0).zzsb(), appContentCard0.zzsb()) && zzt.equal(((AppContentCard)object0).getTitle(), appContentCard0.getTitle()) && zzt.equal(((AppContentCard)object0).zzsc(), appContentCard0.zzsc()) && zzt.equal(((AppContentCard)object0).getType(), appContentCard0.getType()) : false;
    }

    static String zzb(AppContentCard appContentCard0) {
        return zzt.zzt(appContentCard0).zzg("Actions", appContentCard0.getActions()).zzg("Annotations", appContentCard0.zzrZ()).zzg("Conditions", appContentCard0.zzrO()).zzg("ContentDescription", appContentCard0.zzrP()).zzg("CurrentSteps", appContentCard0.zzsa()).zzg("Description", appContentCard0.getDescription()).zzg("Extras", appContentCard0.getExtras()).zzg("Id", appContentCard0.getId()).zzg("Subtitle", appContentCard0.zzsb()).zzg("Title", appContentCard0.getTitle()).zzg("TotalSteps", appContentCard0.zzsc()).zzg("Type", appContentCard0.getType()).toString();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public List zzrO() {
        return new ArrayList(this.zzaol);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String zzrP() {
        return this.zzaom;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public List zzrZ() {
        return new ArrayList(this.zzaov);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public int zzsa() {
        return this.zzaow;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public String zzsb() {
        return this.zzaox;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentCard
    public int zzsc() {
        return this.zzaoy;
    }

    public AppContentCard zzsd() [...] // Inlined contents
}

