package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

public class PlacesParams implements SafeParcelable {
    public static final zzs CREATOR;
    public final int versionCode;
    public static final PlacesParams zzaAY;
    public final String zzaAZ;
    public final String zzaBa;
    public final String zzaBb;
    public final String zzaBc;
    public final int zzaBd;
    public final String zzazX;

    static {
        PlacesParams.zzaAY = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
        PlacesParams.CREATOR = new zzs();
    }

    public PlacesParams(int versionCode, String clientPackageName, String localeString, String accountName, String gCoreClientName, String chargedPackageName, int gCoreClientJarVersion) {
        this.versionCode = versionCode;
        this.zzaAZ = clientPackageName;
        this.zzaBa = localeString;
        this.zzaBb = accountName;
        this.zzazX = gCoreClientName;
        this.zzaBc = chargedPackageName;
        this.zzaBd = gCoreClientJarVersion;
    }

    public PlacesParams(String clientPackageName, Locale locale, String accountName) {
        this(1, clientPackageName, locale.toString(), accountName, null, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public PlacesParams(String clientPackageName, Locale locale, String accountName, String gCoreClientName, String chargedPackageName) {
        this(1, clientPackageName, locale.toString(), accountName, gCoreClientName, chargedPackageName, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object != null && object instanceof PlacesParams ? this.zzaBa.equals(((PlacesParams)object).zzaBa) && this.zzaAZ.equals(((PlacesParams)object).zzaAZ) && zzt.equal(this.zzaBb, ((PlacesParams)object).zzaBb) && zzt.equal(this.zzazX, ((PlacesParams)object).zzazX) && zzt.equal(this.zzaBc, ((PlacesParams)object).zzaBc) : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaAZ, this.zzaBa, this.zzaBb, this.zzazX, this.zzaBc});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("clientPackageName", this.zzaAZ).zzg("locale", this.zzaBa).zzg("accountName", this.zzaBb).zzg("gCoreClientName", this.zzazX).zzg("chargedPackageName", this.zzaBc).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzs.zza(this, out, flags);
    }
}

