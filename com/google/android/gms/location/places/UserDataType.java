package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class UserDataType implements SafeParcelable {
    public static final zzn CREATOR;
    final int zzCY;
    final String zzEl;
    public static final UserDataType zzaAa;
    public static final UserDataType zzaAb;
    public static final Set zzaAc;
    final int zzaAd;
    public static final UserDataType zzazZ;

    static {
        UserDataType.zzazZ = UserDataType.zzy("test_type", 1);
        UserDataType.zzaAa = UserDataType.zzy("labeled_place", 6);
        UserDataType.zzaAb = UserDataType.zzy("here_content", 7);
        UserDataType.zzaAc = Collections.unmodifiableSet(new HashSet(Arrays.asList(new UserDataType[]{UserDataType.zzazZ, UserDataType.zzaAa, UserDataType.zzaAb})));
        UserDataType.CREATOR = new zzn();
    }

    UserDataType(int versionCode, String type, int enumValue) {
        zzu.zzcj(type);
        this.zzCY = versionCode;
        this.zzEl = type;
        this.zzaAd = enumValue;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object instanceof UserDataType ? this.zzEl.equals(((UserDataType)object).zzEl) && this.zzaAd == ((UserDataType)object).zzaAd : false;
    }

    @Override
    public int hashCode() {
        return this.zzEl.hashCode();
    }

    @Override
    public String toString() {
        return this.zzEl;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzn.zza(this, parcel, flags);
    }

    private static UserDataType zzy(String s, int v) {
        return new UserDataType(0, s, v);
    }
}

