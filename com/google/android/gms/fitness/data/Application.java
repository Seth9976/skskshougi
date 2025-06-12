package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public final class Application implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final String zzTQ;
    public static final Application zzajM;
    private final String zzajN;

    static {
        Application.zzajM = new Application("com.google.android.gms", "7571000", null);
        Application.CREATOR = new zza();
    }

    Application(int versionCode, String packageName, String version, String domainName) {
        this.zzCY = versionCode;
        this.zzMZ = (String)zzu.zzu(packageName);
        this.zzTQ = "";
        this.zzajN = domainName;
    }

    public Application(String packageName, String version, String domainName) {
        this(1, packageName, "", domainName);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof Application && this.zza(((Application)that));
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    public String getVersion() {
        return this.zzTQ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzMZ, this.zzTQ, this.zzajN});
    }

    @Override
    public String toString() {
        return String.format("Application{%s:%s:%s}", this.zzMZ, this.zzTQ, this.zzajN);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zza.zza(this, parcel, flags);
    }

    // 去混淆评级： 低(30)
    private boolean zza(Application application0) {
        return this.zzMZ.equals(application0.zzMZ) && zzt.equal(this.zzTQ, application0.zzTQ) && zzt.equal(this.zzajN, application0.zzajN);
    }

    public static Application zzcG(String s) {
        return Application.zze(s, null, null);
    }

    // 去混淆评级： 低(20)
    public static Application zze(String s, String s1, String s2) {
        return "com.google.android.gms".equals(s) ? Application.zzajM : new Application(s, s1, s2);
    }

    public String zzqp() {
        return this.zzajN;
    }
}

