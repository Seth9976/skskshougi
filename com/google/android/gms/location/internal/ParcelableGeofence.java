package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public class ParcelableGeofence implements SafeParcelable, Geofence {
    public static final zzm CREATOR;
    private final int zzCY;
    private final String zzDK;
    private final short zzaxA;
    private final double zzaxB;
    private final double zzaxC;
    private final float zzaxD;
    private final int zzaxE;
    private final int zzaxF;
    private final int zzaxy;
    private final long zzazj;

    static {
        ParcelableGeofence.CREATOR = new zzm();
    }

    public ParcelableGeofence(int version, String requestId, int transitionTypes, short type, double latitude, double longitude, float radius, long expireAt, int notificationResponsiveness, int loiteringDelayMillis) {
        ParcelableGeofence.zzdn(requestId);
        ParcelableGeofence.zze(radius);
        ParcelableGeofence.zza(latitude, longitude);
        int v6 = ParcelableGeofence.zzgG(transitionTypes);
        this.zzCY = version;
        this.zzaxA = type;
        this.zzDK = requestId;
        this.zzaxB = latitude;
        this.zzaxC = longitude;
        this.zzaxD = radius;
        this.zzazj = expireAt;
        this.zzaxy = v6;
        this.zzaxE = notificationResponsiveness;
        this.zzaxF = loiteringDelayMillis;
    }

    public ParcelableGeofence(String requestId, int transitionTypes, short type, double latitude, double longitude, float radius, long expireAt, int notificationResponsiveness, int loiteringDelayMillis) {
        this(1, requestId, transitionTypes, type, latitude, longitude, radius, expireAt, notificationResponsiveness, loiteringDelayMillis);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof ParcelableGeofence)) {
            return false;
        }
        if(this.zzaxD != ((ParcelableGeofence)obj).zzaxD) {
            return false;
        }
        if(this.zzaxB != ((ParcelableGeofence)obj).zzaxB) {
            return false;
        }
        return this.zzaxC == ((ParcelableGeofence)obj).zzaxC ? this.zzaxA == ((ParcelableGeofence)obj).zzaxA : false;
    }

    public long getExpirationTime() {
        return this.zzazj;
    }

    public double getLatitude() {
        return this.zzaxB;
    }

    public double getLongitude() {
        return this.zzaxC;
    }

    public int getNotificationResponsiveness() {
        return this.zzaxE;
    }

    @Override  // com.google.android.gms.location.Geofence
    public String getRequestId() {
        return this.zzDK;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.zzaxB);
        long v1 = Double.doubleToLongBits(this.zzaxC);
        return ((((((int)(v ^ v >>> 0x20)) + 0x1F) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + Float.floatToIntBits(this.zzaxD)) * 0x1F + this.zzaxA) * 0x1F + this.zzaxy;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", ParcelableGeofence.zzgH(this.zzaxA), this.zzDK, this.zzaxy, this.zzaxB, this.zzaxC, this.zzaxD, ((int)(this.zzaxE / 1000)), this.zzaxF, this.zzazj);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzm.zza(this, parcel, flags);
    }

    private static void zza(double f, double f1) {
        if(f > 90.0 || f < -90.0) {
            throw new IllegalArgumentException("invalid latitude: " + f);
        }
        if(f1 > 180.0 || f1 < -180.0) {
            throw new IllegalArgumentException("invalid longitude: " + f1);
        }
    }

    private static void zzdn(String s) {
        if(s == null || s.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + s);
        }
    }

    private static void zze(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    private static int zzgG(int v) {
        if((v & 7) == 0) {
            throw new IllegalArgumentException("No supported transition specified: " + v);
        }
        return v & 7;
    }

    private static String zzgH(int v) {
        return v == 1 ? "CIRCLE" : null;
    }

    public static ParcelableGeofence zzn(byte[] arr_b) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        ParcelableGeofence parcelableGeofence0 = ParcelableGeofence.CREATOR.zzem(parcel0);
        parcel0.recycle();
        return parcelableGeofence0;
    }

    public short zzuA() {
        return this.zzaxA;
    }

    public float zzuB() {
        return this.zzaxD;
    }

    public int zzuC() {
        return this.zzaxy;
    }

    public int zzuD() {
        return this.zzaxF;
    }
}

