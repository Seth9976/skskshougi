package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public final class Value implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final int zzakB;
    private float zzakF;
    private boolean zzakR;
    private String zzakS;
    private Map zzakT;

    static {
        Value.CREATOR = new zzt();
    }

    public Value(int format) {
        this(2, format, false, 0.0f, null, null);
    }

    Value(int versionCode, int format, boolean isSet, float value, String stringValue, Bundle mapValue) {
        this.zzCY = versionCode;
        this.zzakB = format;
        this.zzakR = isSet;
        this.zzakF = value;
        this.zzakS = stringValue;
        this.zzakT = Value.zzr(mapValue);
    }

    public String asActivity() {
        return FitnessActivities.getName(this.asInt());
    }

    public float asFloat() {
        zzu.zza(this.zzakB == 2, "Value is not in float format");
        return this.zzakF;
    }

    public int asInt() {
        zzu.zza(this.zzakB == 1, "Value is not in int format");
        return Float.floatToRawIntBits(this.zzakF);
    }

    public String asString() {
        zzu.zza(this.zzakB == 3, "Value is not in string format");
        return this.zzakS;
    }

    public void clearKey(String key) {
        zzu.zza(this.zzakB == 4, "Attempting to set a key\'s value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        if(this.zzakT != null) {
            this.zzakT.remove(key);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof Value && this.zza(((Value)o));
    }

    public int getFormat() {
        return this.zzakB;
    }

    public Float getKeyValue(String key) {
        zzu.zza(this.zzakB == 4, "Value is not in float map format");
        return this.zzakT == null || !this.zzakT.containsKey(key) ? null : ((MapValue)this.zzakT.get(key)).asFloat();
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return com.google.android.gms.common.internal.zzt.hashCode(new Object[]{this.zzakF, this.zzakS, this.zzakT});
    }

    public boolean isSet() {
        return this.zzakR;
    }

    public void setActivity(String activity) {
        this.setInt(FitnessActivities.zzcF(activity));
    }

    public void setFloat(float value) {
        zzu.zza(this.zzakB == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.zzakR = true;
        this.zzakF = value;
    }

    public void setInt(int value) {
        zzu.zza(this.zzakB == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.zzakR = true;
        this.zzakF = Float.intBitsToFloat(value);
    }

    public void setKeyValue(String key, float value) {
        zzu.zza(this.zzakB == 4, "Attempting to set a key\'s value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzakR = true;
        if(this.zzakT == null) {
            this.zzakT = new HashMap();
        }
        this.zzakT.put(key, MapValue.zzc(value));
    }

    public void setString(String value) {
        zzu.zza(this.zzakB == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.zzakR = true;
        this.zzakS = value;
    }

    @Override
    public String toString() {
        if(!this.zzakR) {
            return "unset";
        }
        switch(this.zzakB) {
            case 1: {
                return Integer.toString(this.asInt());
            }
            case 2: {
                return Float.toString(this.asFloat());
            }
            case 3: {
                return this.zzakS;
            }
            case 4: {
                return new TreeMap(this.zzakT).toString();
            }
            default: {
                return "unknown";
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzt.zza(this, dest, flags);
    }

    private boolean zza(Value value0) {
        if(this.zzakB == value0.zzakB && this.zzakR == value0.zzakR) {
            switch(this.zzakB) {
                case 1: {
                    return this.asInt() == value0.asInt();
                }
                case 2: {
                    return this.asFloat() == value0.asFloat();
                }
                case 3: {
                    return this.asString().equals(value0.asString());
                }
                case 4: {
                    return this.zzpT().equals(value0.zzpT());
                }
                default: {
                    return this.zzakF == value0.zzakF;
                }
            }
        }
        return false;
    }

    public Map zzpT() {
        zzu.zza(this.zzakB == 4, "Value is not in float map format");
        return this.zzakT == null ? Collections.emptyMap() : this.zzakT;
    }

    float zzqI() {
        return this.zzakF;
    }

    String zzqO() {
        return this.zzakS;
    }

    Bundle zzqP() {
        if(this.zzakT == null) {
            return null;
        }
        Bundle bundle0 = new Bundle(this.zzakT.size());
        for(Object object0: this.zzakT.entrySet()) {
            bundle0.putParcelable(((String)((Map.Entry)object0).getKey()), ((Parcelable)((Map.Entry)object0).getValue()));
        }
        return bundle0;
    }

    private static Map zzr(Bundle bundle0) {
        if(bundle0 == null) {
            return null;
        }
        bundle0.setClassLoader(MapValue.class.getClassLoader());
        ArrayMap arrayMap0 = new ArrayMap(bundle0.size());
        for(Object object0: bundle0.keySet()) {
            ((Map)arrayMap0).put(((String)object0), bundle0.getParcelable(((String)object0)));
        }
        return arrayMap0;
    }
}

