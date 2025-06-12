package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class PlayLoggerContext implements SafeParcelable {
    public static final zze CREATOR;
    public final String packageName;
    public final int versionCode;
    public final int zzaGP;
    public final int zzaGQ;
    public final String zzaGR;
    public final String zzaGS;
    public final boolean zzaGT;
    public final String zzaGU;
    public final boolean zzaGV;

    static {
        PlayLoggerContext.CREATOR = new zze();
    }

    public PlayLoggerContext(int versionCode, String packageName, int packageVersionCode, int logSource, String uploadAccountName, String loggingId, boolean logAndroidId, String logSourceName, boolean isAnonymous) {
        this.versionCode = versionCode;
        this.packageName = packageName;
        this.zzaGP = packageVersionCode;
        this.zzaGQ = logSource;
        this.zzaGR = uploadAccountName;
        this.zzaGS = loggingId;
        this.zzaGT = logAndroidId;
        this.zzaGU = logSourceName;
        this.zzaGV = isAnonymous;
    }

    @Deprecated
    public PlayLoggerContext(String packageName, int packageVersionCode, int logSource, String uploadAccountName, String loggingId, boolean logAndroidId) {
        this.versionCode = 1;
        this.packageName = (String)zzu.zzu(packageName);
        this.zzaGP = packageVersionCode;
        this.zzaGQ = logSource;
        this.zzaGU = null;
        this.zzaGR = uploadAccountName;
        this.zzaGS = loggingId;
        this.zzaGT = logAndroidId;
        this.zzaGV = false;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(Object object) {
        return this == object ? true : object instanceof PlayLoggerContext && (this.versionCode == ((PlayLoggerContext)object).versionCode && this.packageName.equals(((PlayLoggerContext)object).packageName) && this.zzaGP == ((PlayLoggerContext)object).zzaGP && this.zzaGQ == ((PlayLoggerContext)object).zzaGQ && zzt.equal(this.zzaGU, ((PlayLoggerContext)object).zzaGU) && zzt.equal(this.zzaGR, ((PlayLoggerContext)object).zzaGR) && zzt.equal(this.zzaGS, ((PlayLoggerContext)object).zzaGS) && this.zzaGT == ((PlayLoggerContext)object).zzaGT && this.zzaGV == ((PlayLoggerContext)object).zzaGV);
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.versionCode, this.packageName, this.zzaGP, this.zzaGQ, this.zzaGU, this.zzaGR, this.zzaGS, Boolean.valueOf(this.zzaGT), Boolean.valueOf(this.zzaGV)});
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("PlayLoggerContext[");
        stringBuilder0.append("versionCode=").append(this.versionCode).append(',');
        stringBuilder0.append("package=").append(this.packageName).append(',');
        stringBuilder0.append("packageVersionCode=").append(this.zzaGP).append(',');
        stringBuilder0.append("logSource=").append(this.zzaGQ).append(',');
        stringBuilder0.append("logSourceName=").append(this.zzaGU).append(',');
        stringBuilder0.append("uploadAccount=").append(this.zzaGR).append(',');
        stringBuilder0.append("loggingId=").append(this.zzaGS).append(',');
        stringBuilder0.append("logAndroidId=").append(this.zzaGT).append(',');
        stringBuilder0.append("isAnonymous=").append(this.zzaGV);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zze.zza(this, out, flags);
    }
}

