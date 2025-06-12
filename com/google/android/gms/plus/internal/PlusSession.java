package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;

public class PlusSession implements SafeParcelable {
    public static final zzh CREATOR;
    private final int zzCY;
    private final String zzOx;
    private final String zzTO;
    private final PlusCommonExtras zzaHA;
    private final String[] zzaHu;
    private final String[] zzaHv;
    private final String[] zzaHw;
    private final String zzaHx;
    private final String zzaHy;
    private final String zzaHz;

    static {
        PlusSession.CREATOR = new zzh();
    }

    PlusSession(int versionCode, String accountName, String[] requestedScopes, String[] visibleActions, String[] requiredFeatures, String packageNameForAuth, String callingPackageName, String applicationName, String clientId_DEPRECATED, PlusCommonExtras extras) {
        this.zzCY = versionCode;
        this.zzOx = accountName;
        this.zzaHu = requestedScopes;
        this.zzaHv = visibleActions;
        this.zzaHw = requiredFeatures;
        this.zzaHx = packageNameForAuth;
        this.zzaHy = callingPackageName;
        this.zzTO = applicationName;
        this.zzaHz = clientId_DEPRECATED;
        this.zzaHA = extras;
    }

    public PlusSession(String accountName, String[] requestedScopes, String[] visibleActions, String[] requiredFeatures, String packageNameForAuth, String callingPackageName, String applicationName, PlusCommonExtras extra) {
        this.zzCY = 1;
        this.zzOx = accountName;
        this.zzaHu = requestedScopes;
        this.zzaHv = visibleActions;
        this.zzaHw = requiredFeatures;
        this.zzaHx = packageNameForAuth;
        this.zzaHy = callingPackageName;
        this.zzTO = applicationName;
        this.zzaHz = null;
        this.zzaHA = extra;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(100)
    @Override
    public boolean equals(Object obj) {
        return obj instanceof PlusSession ? this.zzCY == ((PlusSession)obj).zzCY && zzt.equal(this.zzOx, ((PlusSession)obj).zzOx) && Arrays.equals(this.zzaHu, ((PlusSession)obj).zzaHu) && Arrays.equals(this.zzaHv, ((PlusSession)obj).zzaHv) && Arrays.equals(this.zzaHw, ((PlusSession)obj).zzaHw) && zzt.equal(this.zzaHx, ((PlusSession)obj).zzaHx) && zzt.equal(this.zzaHy, ((PlusSession)obj).zzaHy) && zzt.equal(this.zzTO, ((PlusSession)obj).zzTO) && zzt.equal(this.zzaHz, ((PlusSession)obj).zzaHz) && zzt.equal(this.zzaHA, ((PlusSession)obj).zzaHA) : false;
    }

    public String getAccountName() {
        return this.zzOx;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzCY, this.zzOx, this.zzaHu, this.zzaHv, this.zzaHw, this.zzaHx, this.zzaHy, this.zzTO, this.zzaHz, this.zzaHA});
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return zzt.zzt(this).zzg("versionCode", this.zzCY).zzg("accountName", this.zzOx).zzg("requestedScopes", this.zzaHu).zzg("visibleActivities", this.zzaHv).zzg("requiredFeatures", this.zzaHw).zzg("packageNameForAuth", this.zzaHx).zzg("callingPackageName", this.zzaHy).zzg("applicationName", this.zzTO).zzg("extra", "PlusCommonExtras{versionCode=1, Gpsrc=, ClientCallingPackage=}").toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzh.zza(this, out, flags);
    }

    public String zzlB() {
        return this.zzTO;
    }

    public String zzxA() {
        return this.zzaHx;
    }

    public String zzxB() {
        return this.zzaHy;
    }

    public String zzxC() {
        return this.zzaHz;
    }

    public PlusCommonExtras zzxD() {
        return this.zzaHA;
    }

    public Bundle zzxE() {
        Bundle bundle0 = new Bundle();
        bundle0.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.zzaHA.zzy(bundle0);
        return bundle0;
    }

    public String[] zzxx() {
        return this.zzaHu;
    }

    public String[] zzxy() {
        return this.zzaHv;
    }

    public String[] zzxz() {
        return this.zzaHw;
    }
}

