package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    static final List zzaxZ;
    private final List zzaya;

    static {
        LocationResult.zzaxZ = Collections.emptyList();
        LocationResult.CREATOR = new zzf();
    }

    LocationResult(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzaya = list0;
    }

    public static LocationResult create(List list0) {
        if(list0 == null) {
            list0 = LocationResult.zzaxZ;
        }
        return new LocationResult(2, list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof LocationResult)) {
            return false;
        }
        if(((LocationResult)other).zzaya.size() != this.zzaya.size()) {
            return false;
        }
        Iterator iterator0 = ((LocationResult)other).zzaya.iterator();
        Iterator iterator1 = this.zzaya.iterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator1.next();
            Object object2 = iterator0.next();
            if(((Location)object1).getTime() != ((Location)object2).getTime()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static LocationResult extractResult(Intent intent) {
        return LocationResult.hasResult(intent) ? ((LocationResult)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT")) : null;
    }

    public Location getLastLocation() {
        int v = this.zzaya.size();
        return v == 0 ? null : ((Location)this.zzaya.get(v - 1));
    }

    public List getLocations() {
        return this.zzaya;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public static boolean hasResult(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    @Override
    public int hashCode() {
        int v = 17;
        for(Object object0: this.zzaya) {
            long v1 = ((Location)object0).getTime();
            v = ((int)(v1 ^ v1 >>> 0x20)) + v * 0x1F;
        }
        return v;
    }

    @Override
    public String toString() {
        return "LocationResult[locations: " + this.zzaya + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzf.zza(this, parcel, flags);
    }
}

