package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class Status implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final int zzTS;
    public static final Status zzXP;
    public static final Status zzXQ;
    public static final Status zzXR;
    public static final Status zzXS;
    public static final Status zzXT;
    private final String zzXU;

    static {
        Status.zzXP = new Status(0);
        Status.zzXQ = new Status(14);
        Status.zzXR = new Status(8);
        Status.zzXS = new Status(15);
        Status.zzXT = new Status(16);
        Status.CREATOR = new zzk();
    }

    public Status(int statusCode) {
        this(statusCode, null);
    }

    Status(int versionCode, int statusCode, String statusMessage, PendingIntent pendingIntent) {
        this.zzCY = versionCode;
        this.zzTS = statusCode;
        this.zzXU = statusMessage;
        this.mPendingIntent = pendingIntent;
    }

    public Status(int statusCode, String statusMessage) {
        this(1, statusCode, statusMessage, null);
    }

    public Status(int statusCode, String statusMessage, PendingIntent pendingIntent) {
        this(1, statusCode, statusMessage, pendingIntent);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Status ? this.zzCY == ((Status)obj).zzCY && this.zzTS == ((Status)obj).zzTS && zzt.equal(this.zzXU, ((Status)obj).zzXU) && zzt.equal(this.mPendingIntent, ((Status)obj).mPendingIntent) : false;
    }

    public PendingIntent getResolution() {
        return this.mPendingIntent;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() [...] // Inlined contents

    public int getStatusCode() {
        return this.zzTS;
    }

    public String getStatusMessage() {
        return this.zzXU;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public boolean hasResolution() {
        return this.mPendingIntent != null;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzCY, this.zzTS, this.zzXU, this.mPendingIntent});
    }

    public boolean isCanceled() {
        return this.zzTS == 16;
    }

    public boolean isInterrupted() {
        return this.zzTS == 14;
    }

    public boolean isSuccess() {
        return this.zzTS <= 0;
    }

    public void startResolutionForResult(Activity activity, int requestCode) throws IntentSender.SendIntentException {
        if(!this.hasResolution()) {
            return;
        }
        activity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), requestCode, null, 0, 0, 0);
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("statusCode", this.zzmU()).zzg("resolution", this.mPendingIntent).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzk.zza(this, out, flags);
    }

    PendingIntent zzmT() {
        return this.mPendingIntent;
    }

    private String zzmU() {
        return this.zzXU == null ? CommonStatusCodes.getStatusCodeString(this.zzTS) : this.zzXU;
    }
}

