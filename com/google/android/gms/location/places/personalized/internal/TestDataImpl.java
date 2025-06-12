package com.google.android.gms.location.places.personalized.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.personalized.zzf;

public class TestDataImpl extends zzf implements SafeParcelable {
    public static final zza CREATOR;
    final int zzCY;
    private final String zzaBm;

    static {
        TestDataImpl.CREATOR = new zza();
    }

    TestDataImpl(int versionCode, String testName) {
        this.zzCY = versionCode;
        this.zzaBm = testName;
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
        return object instanceof TestDataImpl ? this.zzaBm.equals(((TestDataImpl)object).zzaBm) : false;
    }

    @Override
    public int hashCode() {
        return this.zzaBm.hashCode();
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("testName", this.zzaBm).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zza.zza(this, parcel, flags);
    }

    public String zzvf() {
        return this.zzaBm;
    }
}

