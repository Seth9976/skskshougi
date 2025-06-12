package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DataType implements SafeParcelable {
    public static final DataType AGGREGATE_ACTIVITY_SUMMARY = null;
    public static final DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = null;
    public static final DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = null;
    @Deprecated
    public static final DataType AGGREGATE_CALORIES_CONSUMED = null;
    public static final DataType AGGREGATE_CALORIES_EXPENDED = null;
    public static final DataType AGGREGATE_DISTANCE_DELTA = null;
    public static final DataType AGGREGATE_HEART_RATE_SUMMARY = null;
    public static final Set AGGREGATE_INPUT_TYPES = null;
    public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX = null;
    public static final DataType AGGREGATE_NUTRITION_SUMMARY = null;
    public static final DataType AGGREGATE_POWER_SUMMARY = null;
    public static final DataType AGGREGATE_SPEED_SUMMARY = null;
    public static final DataType AGGREGATE_STEP_COUNT_DELTA = null;
    public static final DataType AGGREGATE_WEIGHT_SUMMARY = null;
    public static final Parcelable.Creator CREATOR = null;
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
    public static final DataType TYPE_ACTIVITY_SAMPLE;
    public static final DataType TYPE_ACTIVITY_SEGMENT;
    public static final DataType TYPE_BASAL_METABOLIC_RATE;
    public static final DataType TYPE_BODY_FAT_PERCENTAGE;
    public static final DataType TYPE_CALORIES_CONSUMED;
    public static final DataType TYPE_CALORIES_EXPENDED;
    public static final DataType TYPE_CYCLING_PEDALING_CADENCE;
    public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
    public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION;
    public static final DataType TYPE_CYCLING_WHEEL_RPM;
    public static final DataType TYPE_DISTANCE_CUMULATIVE;
    public static final DataType TYPE_DISTANCE_DELTA;
    public static final DataType TYPE_HEART_RATE_BPM;
    public static final DataType TYPE_HEIGHT;
    public static final DataType TYPE_LOCATION_SAMPLE;
    public static final DataType TYPE_LOCATION_TRACK;
    public static final DataType TYPE_NUTRITION;
    public static final DataType TYPE_POWER_SAMPLE;
    public static final DataType TYPE_SPEED;
    public static final DataType TYPE_STEP_COUNT_CADENCE;
    public static final DataType TYPE_STEP_COUNT_CUMULATIVE;
    public static final DataType TYPE_STEP_COUNT_DELTA;
    public static final DataType TYPE_WEIGHT;
    public static final DataType TYPE_WORKOUT_EXERCISE;
    private final String mName;
    private final int zzCY;
    public static final DataType zzakh;
    public static final DataType zzaki;
    public static final DataType zzakj;
    public static final DataType zzakk;
    public static final DataType zzakl;
    public static final DataType zzakm;
    public static final DataType zzakn;
    private static final Map zzako;
    public static final DataType[] zzakp;
    private final List zzakq;

    static {
        DataType.TYPE_STEP_COUNT_DELTA = new DataType("com.google.step_count.delta", new Field[]{Field.FIELD_STEPS});
        DataType.TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", new Field[]{Field.FIELD_STEPS});
        DataType.TYPE_STEP_COUNT_CADENCE = new DataType("com.google.step_count.cadence", new Field[]{Field.FIELD_RPM});
        DataType.TYPE_ACTIVITY_SEGMENT = new DataType("com.google.activity.segment", new Field[]{Field.FIELD_ACTIVITY});
        DataType.zzakh = new DataType("com.google.level_change", new Field[]{Field.zzakv, Field.zzakw});
        DataType.TYPE_CALORIES_CONSUMED = new DataType("com.google.calories.consumed", new Field[]{Field.FIELD_CALORIES});
        DataType.TYPE_CALORIES_EXPENDED = new DataType("com.google.calories.expended", new Field[]{Field.FIELD_CALORIES});
        DataType.TYPE_BASAL_METABOLIC_RATE = new DataType("com.google.calories.bmr", new Field[]{Field.FIELD_CALORIES});
        DataType.TYPE_POWER_SAMPLE = new DataType("com.google.power.sample", new Field[]{Field.FIELD_WATTS});
        DataType.TYPE_ACTIVITY_SAMPLE = new DataType("com.google.activity.sample", new Field[]{Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE});
        DataType.zzaki = new DataType("com.google.activity.edge", new Field[]{Field.FIELD_ACTIVITY, Field.zzakx});
        DataType.zzakj = new DataType("com.google.accelerometer", new Field[]{Field.zzaky, Field.zzakz, Field.zzakA});
        DataType.TYPE_HEART_RATE_BPM = new DataType("com.google.heart_rate.bpm", new Field[]{Field.FIELD_BPM});
        DataType.TYPE_LOCATION_SAMPLE = new DataType("com.google.location.sample", new Field[]{Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE});
        DataType.TYPE_LOCATION_TRACK = new DataType("com.google.location.track", new Field[]{Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE});
        DataType.TYPE_DISTANCE_DELTA = new DataType("com.google.distance.delta", new Field[]{Field.FIELD_DISTANCE});
        DataType.TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", new Field[]{Field.FIELD_DISTANCE});
        DataType.TYPE_SPEED = new DataType("com.google.speed", new Field[]{Field.FIELD_SPEED});
        DataType.TYPE_CYCLING_WHEEL_REVOLUTION = new DataType("com.google.cycling.wheel_revolution.cumulative", new Field[]{Field.FIELD_REVOLUTIONS});
        DataType.TYPE_CYCLING_WHEEL_RPM = new DataType("com.google.cycling.wheel_revolution.rpm", new Field[]{Field.FIELD_RPM});
        DataType.TYPE_CYCLING_PEDALING_CUMULATIVE = new DataType("com.google.cycling.pedaling.cumulative", new Field[]{Field.FIELD_REVOLUTIONS});
        DataType.TYPE_CYCLING_PEDALING_CADENCE = new DataType("com.google.cycling.pedaling.cadence", new Field[]{Field.FIELD_RPM});
        DataType.TYPE_HEIGHT = new DataType("com.google.height", new Field[]{Field.FIELD_HEIGHT});
        DataType.TYPE_WEIGHT = new DataType("com.google.weight", new Field[]{Field.FIELD_WEIGHT});
        DataType.TYPE_BODY_FAT_PERCENTAGE = new DataType("com.google.body.fat.percentage", new Field[]{Field.FIELD_PERCENTAGE});
        DataType.zzakk = new DataType("com.google.body.waist.circumference", new Field[]{Field.FIELD_CIRCUMFERENCE});
        DataType.zzakl = new DataType("com.google.body.hip.circumference", new Field[]{Field.FIELD_CIRCUMFERENCE});
        DataType.TYPE_NUTRITION = new DataType("com.google.nutrition", new Field[]{Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE, Field.FIELD_FOOD_ITEM});
        DataType.TYPE_WORKOUT_EXERCISE = new DataType("com.google.activity.exercise", new Field[]{Field.FIELD_EXERCISE, Field.FIELD_REPETITIONS, Field.FIELD_DURATION, Field.FIELD_RESISTANCE_TYPE, Field.FIELD_RESISTANCE});
        DataType.AGGREGATE_INPUT_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DataType[]{DataType.TYPE_STEP_COUNT_DELTA, DataType.TYPE_DISTANCE_DELTA, DataType.TYPE_ACTIVITY_SEGMENT, DataType.TYPE_SPEED, DataType.TYPE_HEART_RATE_BPM, DataType.TYPE_WEIGHT, DataType.TYPE_LOCATION_SAMPLE, DataType.TYPE_CALORIES_CONSUMED, DataType.TYPE_CALORIES_EXPENDED, DataType.TYPE_BODY_FAT_PERCENTAGE, DataType.zzakl, DataType.zzakk, DataType.TYPE_NUTRITION})));
        DataType.AGGREGATE_ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", new Field[]{Field.FIELD_ACTIVITY, Field.FIELD_DURATION, Field.FIELD_NUM_SEGMENTS});
        DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = new DataType("com.google.calories.bmr.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.AGGREGATE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
        DataType.AGGREGATE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
        DataType.AGGREGATE_CALORIES_CONSUMED = DataType.TYPE_CALORIES_CONSUMED;
        DataType.AGGREGATE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
        DataType.AGGREGATE_HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.AGGREGATE_LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", new Field[]{Field.FIELD_LOW_LATITUDE, Field.FIELD_LOW_LONGITUDE, Field.FIELD_HIGH_LATITUDE, Field.FIELD_HIGH_LONGITUDE});
        DataType.AGGREGATE_POWER_SUMMARY = new DataType("com.google.power.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.AGGREGATE_SPEED_SUMMARY = new DataType("com.google.speed.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = new DataType("com.google.body.fat.percentage.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.zzakm = new DataType("com.google.body.hip.circumference.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.zzakn = new DataType("com.google.body.waist.circumference.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.AGGREGATE_WEIGHT_SUMMARY = new DataType("com.google.weight.summary", new Field[]{Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN});
        DataType.AGGREGATE_NUTRITION_SUMMARY = new DataType("com.google.nutrition.summary", new Field[]{Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE});
        DataType.zzako = new HashMap() {
            {
                List list0 = Collections.singletonList(DataType.AGGREGATE_ACTIVITY_SUMMARY);
                this.put(DataType.TYPE_ACTIVITY_SEGMENT, list0);
                List list1 = Collections.singletonList(DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY);
                this.put(DataType.TYPE_BASAL_METABOLIC_RATE, list1);
                List list2 = Collections.singletonList(DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY);
                this.put(DataType.TYPE_BODY_FAT_PERCENTAGE, list2);
                List list3 = Collections.singletonList(DataType.zzakm);
                this.put(DataType.zzakl, list3);
                List list4 = Collections.singletonList(DataType.zzakn);
                this.put(DataType.zzakk, list4);
                List list5 = Collections.singletonList(DataType.AGGREGATE_CALORIES_CONSUMED);
                this.put(DataType.TYPE_CALORIES_CONSUMED, list5);
                List list6 = Collections.singletonList(DataType.AGGREGATE_CALORIES_EXPENDED);
                this.put(DataType.TYPE_CALORIES_EXPENDED, list6);
                List list7 = Collections.singletonList(DataType.AGGREGATE_DISTANCE_DELTA);
                this.put(DataType.TYPE_DISTANCE_DELTA, list7);
                List list8 = Collections.singletonList(DataType.AGGREGATE_LOCATION_BOUNDING_BOX);
                this.put(DataType.TYPE_LOCATION_SAMPLE, list8);
                List list9 = Collections.singletonList(DataType.AGGREGATE_NUTRITION_SUMMARY);
                this.put(DataType.TYPE_NUTRITION, list9);
                List list10 = Collections.singletonList(DataType.AGGREGATE_POWER_SUMMARY);
                this.put(DataType.TYPE_POWER_SAMPLE, list10);
                List list11 = Collections.singletonList(DataType.AGGREGATE_HEART_RATE_SUMMARY);
                this.put(DataType.TYPE_HEART_RATE_BPM, list11);
                List list12 = Collections.singletonList(DataType.AGGREGATE_SPEED_SUMMARY);
                this.put(DataType.TYPE_SPEED, list12);
                List list13 = Collections.singletonList(DataType.AGGREGATE_STEP_COUNT_DELTA);
                this.put(DataType.TYPE_STEP_COUNT_DELTA, list13);
                List list14 = Collections.singletonList(DataType.AGGREGATE_WEIGHT_SUMMARY);
                this.put(DataType.TYPE_WEIGHT, list14);
            }
        };
        DataType.zzakp = new DataType[]{DataType.zzakj, DataType.zzaki, DataType.TYPE_WORKOUT_EXERCISE, DataType.TYPE_ACTIVITY_SAMPLE, DataType.TYPE_ACTIVITY_SEGMENT, DataType.AGGREGATE_ACTIVITY_SUMMARY, DataType.TYPE_BODY_FAT_PERCENTAGE, DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, DataType.zzakl, DataType.zzakm, DataType.zzakk, DataType.zzakn, DataType.TYPE_BASAL_METABOLIC_RATE, DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, DataType.TYPE_CALORIES_CONSUMED, DataType.TYPE_CALORIES_EXPENDED, DataType.TYPE_CYCLING_PEDALING_CADENCE, DataType.TYPE_CYCLING_PEDALING_CUMULATIVE, DataType.TYPE_CYCLING_WHEEL_REVOLUTION, DataType.TYPE_CYCLING_WHEEL_RPM, DataType.TYPE_DISTANCE_CUMULATIVE, DataType.TYPE_DISTANCE_DELTA, DataType.TYPE_HEART_RATE_BPM, DataType.AGGREGATE_HEART_RATE_SUMMARY, DataType.TYPE_HEIGHT, DataType.zzakh, DataType.AGGREGATE_LOCATION_BOUNDING_BOX, DataType.TYPE_LOCATION_SAMPLE, DataType.TYPE_LOCATION_TRACK, DataType.TYPE_NUTRITION, DataType.AGGREGATE_NUTRITION_SUMMARY, DataType.TYPE_POWER_SAMPLE, DataType.AGGREGATE_POWER_SUMMARY, DataType.TYPE_SPEED, DataType.AGGREGATE_SPEED_SUMMARY, DataType.TYPE_STEP_COUNT_CADENCE, DataType.TYPE_STEP_COUNT_CUMULATIVE, DataType.TYPE_STEP_COUNT_DELTA, DataType.TYPE_WEIGHT, DataType.AGGREGATE_WEIGHT_SUMMARY};
        DataType.CREATOR = new zzg();
    }

    DataType(int versionCode, String name, List list0) {
        this.zzCY = versionCode;
        this.mName = name;
        this.zzakq = Collections.unmodifiableList(list0);
    }

    public DataType(String name, Field[] fields) {
        this(1, name, zzkx.zzb(fields));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof DataType && this.zza(((DataType)that));
    }

    public static List getAggregatesForInput(DataType inputDataType) {
        List list0 = (List)DataType.zzako.get(inputDataType);
        return list0 == null ? Collections.emptyList() : Collections.unmodifiableList(list0);
    }

    public List getFields() {
        return this.zzakq;
    }

    public static String getMimeType(DataType dataType) {
        return "vnd.google.fitness.data_type/" + dataType.getName();
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

    public int indexOf(Field field) {
        if(!this.zzakq.contains(field)) {
            throw new IllegalArgumentException(String.format("%s not a field of %s", field, this));
        }
        return this.zzakq.indexOf(field);
    }

    @Override
    public String toString() {
        return String.format("DataType{%s%s}", this.mName, this.zzakq);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzg.zza(this, dest, flags);
    }

    // 去混淆评级： 低(20)
    private boolean zza(DataType dataType0) {
        return this.mName.equals(dataType0.mName) && this.zzakq.equals(dataType0.zzakq);
    }

    // 去混淆评级： 低(20)
    public String zzqD() {
        return this.mName.startsWith("com.google.") ? this.mName.substring(11) : this.mName;
    }
}

