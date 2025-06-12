package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

public class DetectedActivity implements SafeParcelable {
    public static final DetectedActivityCreator CREATOR = null;
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    private final int zzCY;
    public static final Comparator zzaxv;
    int zzaxw;
    int zzaxx;

    static {
        DetectedActivity.zzaxv = new Comparator() {
            public int zza(DetectedActivity detectedActivity0, DetectedActivity detectedActivity1) {
                int v = detectedActivity1.getConfidence().compareTo(detectedActivity0.getConfidence());
                return v == 0 ? detectedActivity0.getType().compareTo(detectedActivity1.getType()) : v;
            }
        };
        DetectedActivity.CREATOR = new DetectedActivityCreator();
    }

    public DetectedActivity(int activityType, int confidence) {
        this.zzCY = 1;
        this.zzaxw = activityType;
        this.zzaxx = confidence;
    }

    public DetectedActivity(int versionCode, int activityType, int confidence) {
        this.zzCY = versionCode;
        this.zzaxw = activityType;
        this.zzaxx = confidence;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConfidence() {
        return this.zzaxx;
    }

    public int getType() {
        return this.zzgp(this.zzaxw);
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public String toString() {
        return "DetectedActivity [type=" + DetectedActivity.zzgq(this.getType()) + ", confidence=" + this.zzaxx + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        DetectedActivityCreator.zza(this, out, flags);
    }

    private int zzgp(int v) {
        return v <= 15 ? v : 4;
    }

    public static String zzgq(int v) {
        switch(v) {
            case 0: {
                return "IN_VEHICLE";
            }
            case 1: {
                return "ON_BICYCLE";
            }
            case 2: {
                return "ON_FOOT";
            }
            case 3: {
                return "STILL";
            }
            case 4: {
                return "UNKNOWN";
            }
            case 5: {
                return "TILTING";
            }
            case 7: {
                return "WALKING";
            }
            case 8: {
                return "RUNNING";
            }
            default: {
                return Integer.toString(v);
            }
        }
    }
}

