package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public final class Scope implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private final String zzXO;

    static {
        Scope.CREATOR = new zzj();
    }

    Scope(int versionCode, String scopeUri) {
        zzu.zzh(scopeUri, "scopeUri must not be null or empty");
        this.zzCY = versionCode;
        this.zzXO = scopeUri;
    }

    public Scope(String scopeUri) {
        this(1, scopeUri);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof Scope ? this.zzXO.equals(((Scope)o).zzXO) : false;
    }

    @Override
    public int hashCode() {
        return this.zzXO.hashCode();
    }

    @Override
    public String toString() {
        return this.zzXO;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }

    public String zzmS() {
        return this.zzXO;
    }
}

