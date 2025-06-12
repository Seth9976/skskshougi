package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class PlaceAlias implements SafeParcelable {
    public static final zzc CREATOR;
    final int zzCY;
    public static final PlaceAlias zzaBg;
    public static final PlaceAlias zzaBh;
    private final String zzaBi;

    static {
        PlaceAlias.CREATOR = new zzc();
        PlaceAlias.zzaBg = new PlaceAlias(0, "Home");
        PlaceAlias.zzaBh = new PlaceAlias(0, "Work");
    }

    PlaceAlias(int versionCode, String alias) {
        this.zzCY = versionCode;
        this.zzaBi = alias;
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
        return object instanceof PlaceAlias ? zzt.equal(this.zzaBi, ((PlaceAlias)object).zzaBi) : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaBi});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("alias", this.zzaBi).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzc.zza(this, parcel, flags);
    }

    public String zzva() {
        return this.zzaBi;
    }
}

