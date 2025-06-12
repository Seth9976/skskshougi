package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public class MapValue implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final int zzakB;
    private final float zzakF;

    static {
        MapValue.CREATOR = new zzl();
    }

    public MapValue(int format, float value) {
        this(1, format, value);
    }

    MapValue(int versionCode, int format, float value) {
        this.zzCY = versionCode;
        this.zzakB = format;
        this.zzakF = value;
    }

    public float asFloat() {
        zzu.zza(this.zzakB == 2, "Value is not in float format");
        return this.zzakF;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof MapValue && this.zza(((MapValue)o));
    }

    int getFormat() {
        return this.zzakB;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return (int)this.zzakF;
    }

    @Override
    public String toString() {
        return this.zzakB == 2 ? Float.toString(this.asFloat()) : "unknown";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzl.zza(this, dest, flags);
    }

    private boolean zza(MapValue mapValue0) {
        if(this.zzakB == mapValue0.zzakB) {
            return this.zzakB == 2 ? this.asFloat() == mapValue0.asFloat() : this.zzakF == mapValue0.zzakF;
        }
        return false;
    }

    public static MapValue zzc(float f) {
        return new MapValue(2, f);
    }

    float zzqI() {
        return this.zzakF;
    }
}

