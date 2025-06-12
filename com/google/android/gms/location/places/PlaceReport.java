package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class PlaceReport implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mTag;
    final int zzCY;
    private final String zzazK;
    private final String zzazL;

    static {
        PlaceReport.CREATOR = new zzk();
    }

    PlaceReport(int versionCode, String placeId, String tag, String source) {
        this.zzCY = versionCode;
        this.zzazK = placeId;
        this.mTag = tag;
        this.zzazL = source;
    }

    public static PlaceReport create(String placeId, String tag) {
        return PlaceReport.zzi(placeId, tag, "unknown");
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object that) {
        return that instanceof PlaceReport ? zzt.equal(this.zzazK, ((PlaceReport)that).zzazK) && zzt.equal(this.mTag, ((PlaceReport)that).mTag) && zzt.equal(this.zzazL, ((PlaceReport)that).zzazL) : false;
    }

    public String getPlaceId() {
        return this.zzazK;
    }

    public String getSource() {
        return this.zzazL;
    }

    public String getTag() {
        return this.mTag;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzazK, this.mTag, this.zzazL});
    }

    @Override
    public String toString() {
        zza zzt$zza0 = zzt.zzt(this);
        zzt$zza0.zzg("placeId", this.zzazK);
        zzt$zza0.zzg("tag", this.mTag);
        if(!"unknown".equals(this.zzazL)) {
            zzt$zza0.zzg("source", this.zzazL);
        }
        return zzt$zza0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzk.zza(this, out, flags);
    }

    private static boolean zzdo(String s) {
        switch(s) {
            case "inferredGeofencing": {
                return true;
            }
            case "inferredRadioSignals": {
                return true;
            }
            case "inferredReverseGeocoding": {
                return true;
            }
            case "unknown": {
                return true;
            }
            case "userReported": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static PlaceReport zzi(String s, String s1, String s2) {
        zzu.zzcj(s);
        zzu.zzcj(s1);
        zzu.zzcj(s2);
        zzu.zzb(PlaceReport.zzdo(s2), "Invalid source");
        return new PlaceReport(1, s, s1, s2);
    }
}

