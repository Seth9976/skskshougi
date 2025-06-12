package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class LocationRequest implements SafeParcelable {
    public static final LocationRequestCreator CREATOR = null;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int mPriority;
    private final int zzCY;
    boolean zzamB;
    long zzaxU;
    long zzaxV;
    int zzaxW;
    float zzaxX;
    long zzaxY;
    long zzaxz;

    static {
        LocationRequest.CREATOR = new LocationRequestCreator();
    }

    public LocationRequest() {
        this.zzCY = 1;
        this.mPriority = 102;
        this.zzaxU = 3600000L;
        this.zzaxV = 600000L;
        this.zzamB = false;
        this.zzaxz = 0x7FFFFFFFFFFFFFFFL;
        this.zzaxW = 0x7FFFFFFF;
        this.zzaxX = 0.0f;
        this.zzaxY = 0L;
    }

    LocationRequest(int versionCode, int priority, long interval, long fastestInterval, boolean explicitFastestInterval, long expireAt, int numUpdates, float smallestDisplacement, long maxWaitTime) {
        this.zzCY = versionCode;
        this.mPriority = priority;
        this.zzaxU = interval;
        this.zzaxV = fastestInterval;
        this.zzamB = explicitFastestInterval;
        this.zzaxz = expireAt;
        this.zzaxW = numUpdates;
        this.zzaxX = smallestDisplacement;
        this.zzaxY = maxWaitTime;
    }

    public static LocationRequest create() {
        return new LocationRequest();
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
        return object instanceof LocationRequest ? this.mPriority == ((LocationRequest)object).mPriority && this.zzaxU == ((LocationRequest)object).zzaxU && this.zzaxV == ((LocationRequest)object).zzaxV && this.zzamB == ((LocationRequest)object).zzamB && this.zzaxz == ((LocationRequest)object).zzaxz && this.zzaxW == ((LocationRequest)object).zzaxW && this.zzaxX == ((LocationRequest)object).zzaxX : false;
    }

    public long getExpirationTime() {
        return this.zzaxz;
    }

    public long getFastestInterval() {
        return this.zzaxV;
    }

    public long getInterval() {
        return this.zzaxU;
    }

    public long getMaxWaitTime() {
        return this.zzaxY >= this.zzaxU ? this.zzaxY : this.zzaxU;
    }

    public int getNumUpdates() {
        return this.zzaxW;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public float getSmallestDisplacement() {
        return this.zzaxX;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mPriority, this.zzaxU, this.zzaxV, Boolean.valueOf(this.zzamB), this.zzaxz, this.zzaxW, this.zzaxX});
    }

    public LocationRequest setExpirationDuration(long millis) {
        long v1 = SystemClock.elapsedRealtime();
        this.zzaxz = millis > 0x7FFFFFFFFFFFFFFFL - v1 ? 0x7FFFFFFFFFFFFFFFL : v1 + millis;
        if(this.zzaxz < 0L) {
            this.zzaxz = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long millis) {
        this.zzaxz = millis;
        if(this.zzaxz < 0L) {
            this.zzaxz = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long millis) {
        LocationRequest.zzK(millis);
        this.zzamB = true;
        this.zzaxV = millis;
        return this;
    }

    public LocationRequest setInterval(long millis) {
        LocationRequest.zzK(millis);
        this.zzaxU = millis;
        if(!this.zzamB) {
            this.zzaxV = (long)(((double)this.zzaxU) / 6.0);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long millis) {
        LocationRequest.zzK(millis);
        this.zzaxY = millis;
        return this;
    }

    public LocationRequest setNumUpdates(int numUpdates) {
        if(numUpdates <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + numUpdates);
        }
        this.zzaxW = numUpdates;
        return this;
    }

    public LocationRequest setPriority(int priority) {
        LocationRequest.zzgu(priority);
        this.mPriority = priority;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float smallestDisplacementMeters) {
        LocationRequest.zzd(smallestDisplacementMeters);
        this.zzaxX = smallestDisplacementMeters;
        return this;
    }

    @Override
    public String toString() [...] // Potential decryptor

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        LocationRequestCreator.zza(this, parcel, flags);
    }

    private static void zzK(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("invalid interval: " + v);
        }
    }

    private static void zzd(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    private static void zzgu(int v) {
        if(v != 100 && v != 102 && v != 104 && v != 105) {
            throw new IllegalArgumentException("invalid quality: " + v);
        }
    }

    public static String zzgv(int v) {
        switch(v) {
            case 100: {
                return "PRIORITY_HIGH_ACCURACY";
            }
            case 102: {
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            }
            case 104: {
                return "PRIORITY_LOW_POWER";
            }
            case 105: {
                return "PRIORITY_NO_POWER";
            }
            default: {
                return "???";
            }
        }
    }
}

