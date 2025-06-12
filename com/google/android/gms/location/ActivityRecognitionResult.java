package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final ActivityRecognitionResultCreator CREATOR;
    private final int zzCY;
    List zzaxr;
    long zzaxs;
    long zzaxt;
    int zzaxu;

    static {
        ActivityRecognitionResult.CREATOR = new ActivityRecognitionResultCreator();
    }

    public ActivityRecognitionResult(int versionCode, List list0, long timeMillis, long elapsedRealtimeMillis, int detectorInfoId) {
        this.zzCY = versionCode;
        this.zzaxr = list0;
        this.zzaxs = timeMillis;
        this.zzaxt = elapsedRealtimeMillis;
        this.zzaxu = detectorInfoId;
    }

    public ActivityRecognitionResult(DetectedActivity mostProbableActivity, long time, long elapsedRealtimeMillis) {
        this(mostProbableActivity, time, elapsedRealtimeMillis, 0);
    }

    public ActivityRecognitionResult(DetectedActivity mostProbableActivity, long time, long elapsedRealtimeMillis, int detectorInfoId) {
        this(Collections.singletonList(mostProbableActivity), time, elapsedRealtimeMillis, detectorInfoId);
    }

    public ActivityRecognitionResult(List list0, long time, long elapsedRealtimeMillis) {
        this(list0, time, elapsedRealtimeMillis, 0);
    }

    public ActivityRecognitionResult(List list0, long time, long elapsedRealtimeMillis, int detectorInfoId) {
        boolean z = true;
        super();
        zzu.zzb(list0 != null && list0.size() > 0, "Must have at least 1 detected activity");
        if(time <= 0L || elapsedRealtimeMillis <= 0L) {
            z = false;
        }
        zzu.zzb(z, "Must set times");
        this.zzCY = 2;
        this.zzaxr = list0;
        this.zzaxs = time;
        this.zzaxt = elapsedRealtimeMillis;
        this.zzaxu = detectorInfoId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static ActivityRecognitionResult extractResult(Intent intent) {
        if(!ActivityRecognitionResult.hasResult(intent)) {
            return null;
        }
        Object object0 = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        if(object0 instanceof byte[]) {
            Parcel parcel0 = Parcel.obtain();
            parcel0.unmarshall(((byte[])object0), 0, ((byte[])object0).length);
            parcel0.setDataPosition(0);
            return ActivityRecognitionResult.CREATOR.createFromParcel(parcel0);
        }
        return object0 instanceof ActivityRecognitionResult ? ((ActivityRecognitionResult)object0) : null;
    }

    public int getActivityConfidence(int activityType) {
        for(Object object0: this.zzaxr) {
            DetectedActivity detectedActivity0 = (DetectedActivity)object0;
            if(detectedActivity0.getType() == activityType) {
                return detectedActivity0.getConfidence();
            }
            if(false) {
                break;
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzaxt;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity)this.zzaxr.get(0);
    }

    public List getProbableActivities() {
        return this.zzaxr;
    }

    public long getTime() {
        return this.zzaxs;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public static boolean hasResult(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
    }

    @Override
    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.zzaxr + ", timeMillis=" + this.zzaxs + ", elapsedRealtimeMillis=" + this.zzaxt + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        ActivityRecognitionResultCreator.zza(this, out, flags);
    }
}

