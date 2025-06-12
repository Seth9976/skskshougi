package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public final class Field implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final Field FIELD_ACCURACY = null;
    public static final Field FIELD_ACTIVITY = null;
    public static final Field FIELD_ALTITUDE = null;
    public static final Field FIELD_AVERAGE = null;
    public static final Field FIELD_BPM = null;
    public static final Field FIELD_CALORIES = null;
    public static final Field FIELD_CIRCUMFERENCE = null;
    public static final Field FIELD_CONFIDENCE = null;
    public static final Field FIELD_DISTANCE = null;
    public static final Field FIELD_DURATION = null;
    public static final Field FIELD_EXERCISE = null;
    public static final Field FIELD_FOOD_ITEM = null;
    public static final Field FIELD_HEIGHT = null;
    public static final Field FIELD_HIGH_LATITUDE = null;
    public static final Field FIELD_HIGH_LONGITUDE = null;
    public static final Field FIELD_LATITUDE = null;
    public static final Field FIELD_LONGITUDE = null;
    public static final Field FIELD_LOW_LATITUDE = null;
    public static final Field FIELD_LOW_LONGITUDE = null;
    public static final Field FIELD_MAX = null;
    public static final Field FIELD_MEAL_TYPE = null;
    public static final Field FIELD_MIN = null;
    public static final Field FIELD_NUM_SEGMENTS = null;
    public static final Field FIELD_NUTRIENTS = null;
    public static final Field FIELD_PERCENTAGE = null;
    public static final Field FIELD_REPETITIONS = null;
    public static final Field FIELD_RESISTANCE = null;
    public static final Field FIELD_RESISTANCE_TYPE = null;
    public static final Field FIELD_REVOLUTIONS = null;
    public static final Field FIELD_RPM = null;
    public static final Field FIELD_SPEED = null;
    public static final Field FIELD_STEPS = null;
    public static final Field FIELD_WATTS = null;
    public static final Field FIELD_WEIGHT = null;
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final String NUTRIENT_CALCIUM = "calcium";
    public static final String NUTRIENT_CALORIES = "calories";
    public static final String NUTRIENT_CHOLESTEROL = "cholesterol";
    public static final String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
    public static final String NUTRIENT_IRON = "iron";
    public static final String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
    public static final String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
    public static final String NUTRIENT_POTASSIUM = "potassium";
    public static final String NUTRIENT_PROTEIN = "protein";
    public static final String NUTRIENT_SATURATED_FAT = "fat.saturated";
    public static final String NUTRIENT_SODIUM = "sodium";
    public static final String NUTRIENT_SUGAR = "sugar";
    public static final String NUTRIENT_TOTAL_CARBS = "carbs.total";
    public static final String NUTRIENT_TOTAL_FAT = "fat.total";
    public static final String NUTRIENT_TRANS_FAT = "fat.trans";
    public static final String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";
    public static final String NUTRIENT_VITAMIN_A = "vitamin_a";
    public static final String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final int RESISTANCE_TYPE_BARBELL = 1;
    public static final int RESISTANCE_TYPE_BODY = 6;
    public static final int RESISTANCE_TYPE_CABLE = 2;
    public static final int RESISTANCE_TYPE_DUMBBELL = 3;
    public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
    public static final int RESISTANCE_TYPE_MACHINE = 5;
    public static final int RESISTANCE_TYPE_UNKNOWN;
    private final String mName;
    private final int zzCY;
    public static final Field zzakA;
    private final int zzakB;
    public static final Field zzakv;
    public static final Field zzakw;
    public static final Field zzakx;
    public static final Field zzaky;
    public static final Field zzakz;

    static {
        Field.FIELD_ACTIVITY = Field.zzcH("activity");
        Field.FIELD_CONFIDENCE = Field.zzcI("confidence");
        Field.zzakv = Field.zzcK("activity_confidences");
        Field.FIELD_STEPS = Field.zzcH("steps");
        Field.FIELD_DURATION = Field.zzcH("duration");
        Field.FIELD_BPM = Field.zzcI("bpm");
        Field.FIELD_LATITUDE = Field.zzcI("latitude");
        Field.FIELD_LONGITUDE = Field.zzcI("longitude");
        Field.FIELD_ACCURACY = Field.zzcI("accuracy");
        Field.FIELD_ALTITUDE = Field.zzcI("altitude");
        Field.zzakw = Field.zzcI("elevation.gain");
        Field.FIELD_DISTANCE = Field.zzcI("distance");
        Field.FIELD_HEIGHT = Field.zzcI("height");
        Field.FIELD_WEIGHT = Field.zzcI("weight");
        Field.FIELD_CIRCUMFERENCE = Field.zzcI("circumference");
        Field.FIELD_PERCENTAGE = Field.zzcI("percentage");
        Field.FIELD_SPEED = Field.zzcI("speed");
        Field.FIELD_RPM = Field.zzcI("rpm");
        Field.FIELD_REVOLUTIONS = Field.zzcH("revolutions");
        Field.FIELD_CALORIES = Field.zzcI("calories");
        Field.FIELD_WATTS = Field.zzcI("watts");
        Field.FIELD_MEAL_TYPE = Field.zzcH("meal_type");
        Field.FIELD_FOOD_ITEM = Field.zzcJ("food_item");
        Field.FIELD_NUTRIENTS = Field.zzcK("nutrients");
        Field.FIELD_EXERCISE = Field.zzcJ("exercise");
        Field.FIELD_REPETITIONS = Field.zzcH("repetitions");
        Field.FIELD_RESISTANCE = Field.zzcI("resistance");
        Field.FIELD_RESISTANCE_TYPE = Field.zzcH("resistance_type");
        Field.FIELD_NUM_SEGMENTS = Field.zzcH("num_segments");
        Field.FIELD_AVERAGE = Field.zzcI("average");
        Field.FIELD_MAX = Field.zzcI("max");
        Field.FIELD_MIN = Field.zzcI("min");
        Field.FIELD_LOW_LATITUDE = Field.zzcI("low_latitude");
        Field.FIELD_LOW_LONGITUDE = Field.zzcI("low_longitude");
        Field.FIELD_HIGH_LATITUDE = Field.zzcI("high_latitude");
        Field.FIELD_HIGH_LONGITUDE = Field.zzcI("high_longitude");
        Field.zzakx = Field.zzcH("edge_type");
        Field.zzaky = Field.zzcI("x");
        Field.zzakz = Field.zzcI("y");
        Field.zzakA = Field.zzcI("z");
        Field.CREATOR = new zzi();
    }

    Field(int versionCode, String name, int format) {
        this.zzCY = versionCode;
        this.mName = (String)zzu.zzu(name);
        this.zzakB = format;
    }

    private Field(String name, int format) {
        this(1, name, format);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof Field && this.zza(((Field)that));
    }

    public int getFormat() {
        return this.zzakB;
    }

    public String getName() {
        return this.mName;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return this.mName.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", this.mName, (this.zzakB == 1 ? "i" : "f"));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }

    private boolean zza(Field field0) {
        return this.mName.equals(field0.mName) && this.zzakB == field0.zzakB;
    }

    private static Field zzcH(String s) {
        return new Field(s, 1);
    }

    private static Field zzcI(String s) {
        return new Field(s, 2);
    }

    private static Field zzcJ(String s) {
        return new Field(s, 3);
    }

    private static Field zzcK(String s) {
        return new Field(s, 4);
    }

    public static Field zzn(String s, int v) {
        switch(s) {
            case "accuracy": {
                return Field.FIELD_ACCURACY;
            }
            case "activity": {
                return Field.FIELD_ACTIVITY;
            }
            case "altitude": {
                return Field.FIELD_ALTITUDE;
            }
            case "average": {
                return Field.FIELD_AVERAGE;
            }
            case "bpm": {
                return Field.FIELD_BPM;
            }
            case "calories": {
                return Field.FIELD_CALORIES;
            }
            case "circumference": {
                return Field.FIELD_CIRCUMFERENCE;
            }
            case "confidence": {
                return Field.FIELD_CONFIDENCE;
            }
            case "distance": {
                return Field.FIELD_DISTANCE;
            }
            case "duration": {
                return Field.FIELD_DURATION;
            }
            case "edge_type": {
                return Field.zzakx;
            }
            case "elevation.gain": {
                return Field.zzakw;
            }
            case "exercise": {
                return Field.FIELD_EXERCISE;
            }
            case "food_item": {
                return Field.FIELD_FOOD_ITEM;
            }
            case "height": {
                return Field.FIELD_HEIGHT;
            }
            case "high_latitude": {
                return Field.FIELD_HIGH_LATITUDE;
            }
            case "high_longitude": {
                return Field.FIELD_HIGH_LONGITUDE;
            }
            case "latitude": {
                return Field.FIELD_LATITUDE;
            }
            case "longitude": {
                return Field.FIELD_LONGITUDE;
            }
            case "low_latitude": {
                return Field.FIELD_LOW_LATITUDE;
            }
            case "low_longitude": {
                return Field.FIELD_LOW_LONGITUDE;
            }
            case "max": {
                return Field.FIELD_MAX;
            }
            case "meal_type": {
                return Field.FIELD_MEAL_TYPE;
            }
            case "min": {
                return Field.FIELD_MIN;
            }
            case "num_segments": {
                return Field.FIELD_NUM_SEGMENTS;
            }
            case "nutrients": {
                return Field.FIELD_NUTRIENTS;
            }
            case "percentage": {
                return Field.FIELD_PERCENTAGE;
            }
            case "repetitions": {
                return Field.FIELD_REPETITIONS;
            }
            case "resistance": {
                return Field.FIELD_RESISTANCE;
            }
            case "resistance_type": {
                return Field.FIELD_RESISTANCE_TYPE;
            }
            case "revolutions": {
                return Field.FIELD_REVOLUTIONS;
            }
            case "rpm": {
                return Field.FIELD_RPM;
            }
            case "speed": {
                return Field.FIELD_SPEED;
            }
            case "steps": {
                return Field.FIELD_STEPS;
            }
            case "watts": {
                return Field.FIELD_WATTS;
            }
            case "weight": {
                return Field.FIELD_WEIGHT;
            }
            case "x": {
                return Field.zzaky;
            }
            case "y": {
                return Field.zzakz;
            }
            case "z": {
                return Field.zzakA;
            }
            default: {
                return new Field(s, v);
            }
        }
    }
}

