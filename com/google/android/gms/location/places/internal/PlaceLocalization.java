package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

@Deprecated
public final class PlaceLocalization implements SafeParcelable {
    public static final zzn CREATOR;
    public final String name;
    public final int versionCode;
    public final String zzaAM;
    public final String zzaAN;
    public final String zzaAO;
    public final List zzaAP;

    static {
        PlaceLocalization.CREATOR = new zzn();
    }

    public PlaceLocalization(int versionCode, String name, String address, String internationalPhoneNumber, String regularOpenHours, List list0) {
        this.versionCode = versionCode;
        this.name = name;
        this.zzaAM = address;
        this.zzaAN = internationalPhoneNumber;
        this.zzaAO = regularOpenHours;
        this.zzaAP = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object instanceof PlaceLocalization ? zzt.equal(this.name, ((PlaceLocalization)object).name) && zzt.equal(this.zzaAM, ((PlaceLocalization)object).zzaAM) && zzt.equal(this.zzaAN, ((PlaceLocalization)object).zzaAN) && zzt.equal(this.zzaAO, ((PlaceLocalization)object).zzaAO) && zzt.equal(this.zzaAP, ((PlaceLocalization)object).zzaAP) : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.name, this.zzaAM, this.zzaAN, this.zzaAO});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("name", this.name).zzg("address", this.zzaAM).zzg("internationalPhoneNumber", this.zzaAN).zzg("regularOpenHours", this.zzaAO).zzg("attributions", this.zzaAP).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzn.zza(this, parcel, flags);
    }

    public static PlaceLocalization zza(String s, String s1, String s2, String s3, List list0) {
        return new PlaceLocalization(0, s, s1, s2, s3, list0);
    }
}

