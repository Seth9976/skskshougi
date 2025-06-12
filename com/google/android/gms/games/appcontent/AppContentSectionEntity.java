package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionEntity implements SafeParcelable, AppContentSection {
    public static final AppContentSectionEntityCreator CREATOR;
    private final ArrayList mActions;
    private final Bundle mExtras;
    private final int zzCY;
    private final String zzEl;
    private final String zzKI;
    private final String zzadv;
    private final ArrayList zzaoE;
    private final String zzaoF;
    private final String zzaom;
    private final ArrayList zzaov;
    private final String zzaox;

    static {
        AppContentSectionEntity.CREATOR = new AppContentSectionEntityCreator();
    }

    AppContentSectionEntity(int versionCode, ArrayList arrayList0, ArrayList arrayList1, String contentDescription, Bundle extras, String subtitle, String title, String type, String id, String cardType, ArrayList arrayList2) {
        this.zzCY = versionCode;
        this.mActions = arrayList0;
        this.zzaov = arrayList2;
        this.zzaoE = arrayList1;
        this.zzaoF = cardType;
        this.zzaom = contentDescription;
        this.mExtras = extras;
        this.zzKI = id;
        this.zzaox = subtitle;
        this.zzadv = title;
        this.zzEl = type;
    }

    public AppContentSectionEntity(AppContentSection section) {
        this.zzCY = 5;
        this.zzaoF = section.zzsk();
        this.zzaom = section.zzrP();
        this.mExtras = section.getExtras();
        this.zzKI = section.getId();
        this.zzaox = section.zzsb();
        this.zzadv = section.getTitle();
        this.zzEl = section.getType();
        List list0 = section.getActions();
        int v1 = list0.size();
        this.mActions = new ArrayList(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            AppContentActionEntity appContentActionEntity0 = (AppContentActionEntity)((AppContentAction)list0.get(v2)).freeze();
            this.mActions.add(appContentActionEntity0);
        }
        List list1 = section.zzsj();
        int v3 = list1.size();
        this.zzaoE = new ArrayList(v3);
        for(int v4 = 0; v4 < v3; ++v4) {
            AppContentCardEntity appContentCardEntity0 = (AppContentCardEntity)((AppContentCard)list1.get(v4)).freeze();
            this.zzaoE.add(appContentCardEntity0);
        }
        List list2 = section.zzrZ();
        int v5 = list2.size();
        this.zzaov = new ArrayList(v5);
        for(int v = 0; v < v5; ++v) {
            AppContentAnnotationEntity appContentAnnotationEntity0 = (AppContentAnnotationEntity)((AppContentAnnotation)list2.get(v)).freeze();
            this.zzaov.add(appContentAnnotationEntity0);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AppContentSectionEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public List getActions() {
        return new ArrayList(this.mActions);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String getTitle() {
        return this.zzadv;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String getType() {
        return this.zzEl;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return AppContentSectionEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AppContentSectionEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        AppContentSectionEntityCreator.zza(this, out, flags);
    }

    static int zza(AppContentSection appContentSection0) {
        return zzt.hashCode(new Object[]{appContentSection0.getActions(), appContentSection0.zzrZ(), appContentSection0.zzsj(), appContentSection0.zzsk(), appContentSection0.zzrP(), appContentSection0.getExtras(), appContentSection0.getId(), appContentSection0.zzsb(), appContentSection0.getTitle(), appContentSection0.getType()});
    }

    // 去混淆评级： 中等(110)
    static boolean zza(AppContentSection appContentSection0, Object object0) {
        return object0 instanceof AppContentSection ? appContentSection0 == object0 || zzt.equal(((AppContentSection)object0).getActions(), appContentSection0.getActions()) && zzt.equal(((AppContentSection)object0).zzrZ(), appContentSection0.zzrZ()) && zzt.equal(((AppContentSection)object0).zzsj(), appContentSection0.zzsj()) && zzt.equal(((AppContentSection)object0).zzsk(), appContentSection0.zzsk()) && zzt.equal(((AppContentSection)object0).zzrP(), appContentSection0.zzrP()) && zzt.equal(((AppContentSection)object0).getExtras(), appContentSection0.getExtras()) && zzt.equal(((AppContentSection)object0).getId(), appContentSection0.getId()) && zzt.equal(((AppContentSection)object0).zzsb(), appContentSection0.zzsb()) && zzt.equal(((AppContentSection)object0).getTitle(), appContentSection0.getTitle()) && zzt.equal(((AppContentSection)object0).getType(), appContentSection0.getType()) : false;
    }

    static String zzb(AppContentSection appContentSection0) {
        return zzt.zzt(appContentSection0).zzg("Actions", appContentSection0.getActions()).zzg("Annotations", appContentSection0.zzrZ()).zzg("Cards", appContentSection0.zzsj()).zzg("CardType", appContentSection0.zzsk()).zzg("ContentDescription", appContentSection0.zzrP()).zzg("Extras", appContentSection0.getExtras()).zzg("Id", appContentSection0.getId()).zzg("Subtitle", appContentSection0.zzsb()).zzg("Title", appContentSection0.getTitle()).zzg("Type", appContentSection0.getType()).toString();
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String zzrP() {
        return this.zzaom;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public List zzrZ() {
        return new ArrayList(this.zzaov);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String zzsb() {
        return this.zzaox;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public List zzsj() {
        return new ArrayList(this.zzaoE);
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentSection
    public String zzsk() {
        return this.zzaoF;
    }

    public AppContentSection zzsl() [...] // Inlined contents
}

