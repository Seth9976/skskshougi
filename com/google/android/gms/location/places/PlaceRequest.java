package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class PlaceRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int mPriority;
    final int zzCY;
    private final long zzaxU;
    private final long zzaxz;
    static final long zzazM;
    private final PlaceFilter zzazN;

    static {
        PlaceRequest.CREATOR = new zzl();
        PlaceRequest.zzazM = TimeUnit.HOURS.toMillis(1L);
    }

    public PlaceRequest(int versionCode, PlaceFilter filter, long interval, int priority, long expireAt) {
        this.zzCY = versionCode;
        this.zzazN = filter;
        this.zzaxU = interval;
        this.mPriority = priority;
        this.zzaxz = expireAt;
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
        return object instanceof PlaceRequest ? zzt.equal(this.zzazN, ((PlaceRequest)object).zzazN) && this.zzaxU == ((PlaceRequest)object).zzaxU && this.mPriority == ((PlaceRequest)object).mPriority && this.zzaxz == ((PlaceRequest)object).zzaxz : false;
    }

    public long getExpirationTime() {
        return this.zzaxz;
    }

    public long getInterval() {
        return this.zzaxU;
    }

    public int getPriority() {
        return this.mPriority;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzazN, this.zzaxU, this.mPriority, this.zzaxz});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("filter", this.zzazN).zzg("interval", this.zzaxU).zzg("priority", this.mPriority).zzg("expireAt", this.zzaxz).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzl.zza(this, parcel, flags);
    }

    public PlaceFilter zzuG() {
        return this.zzazN;
    }
}

