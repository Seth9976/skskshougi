package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class AppContentTupleEntity implements SafeParcelable, AppContentTuple {
    public static final AppContentTupleEntityCreator CREATOR;
    private final String mName;
    private final String mValue;
    private final int zzCY;

    static {
        AppContentTupleEntity.CREATOR = new AppContentTupleEntityCreator();
    }

    AppContentTupleEntity(int versionCode, String name, String value) {
        this.zzCY = versionCode;
        this.mName = name;
        this.mValue = value;
    }

    public AppContentTupleEntity(AppContentTuple tuple) {
        this.zzCY = 1;
        this.mName = tuple.getName();
        this.mValue = tuple.getValue();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AppContentTupleEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentTuple
    public String getName() {
        return this.mName;
    }

    @Override  // com.google.android.gms.games.appcontent.AppContentTuple
    public String getValue() {
        return this.mValue;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return AppContentTupleEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AppContentTupleEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        AppContentTupleEntityCreator.zza(this, out, flags);
    }

    static int zza(AppContentTuple appContentTuple0) {
        return zzt.hashCode(new Object[]{appContentTuple0.getName(), appContentTuple0.getValue()});
    }

    // 去混淆评级： 低(30)
    static boolean zza(AppContentTuple appContentTuple0, Object object0) {
        return object0 instanceof AppContentTuple ? appContentTuple0 == object0 || zzt.equal(((AppContentTuple)object0).getName(), appContentTuple0.getName()) && zzt.equal(((AppContentTuple)object0).getValue(), appContentTuple0.getValue()) : false;
    }

    static String zzb(AppContentTuple appContentTuple0) {
        return zzt.zzt(appContentTuple0).zzg("Name", appContentTuple0.getName()).zzg("Value", appContentTuple0.getValue()).toString();
    }

    public AppContentTuple zzsp() [...] // Inlined contents
}

