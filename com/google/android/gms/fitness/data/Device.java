package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzmy;

public final class Device implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int zzCY;
    private final int zzSq;
    private final String zzTQ;
    private final String zzakr;
    private final String zzaks;
    private final String zzakt;
    private final int zzaku;

    static {
        Device.CREATOR = new zzh();
    }

    Device(int versionCode, String manufacturer, String model, String version, String uid, int type, int platformType) {
        this.zzCY = versionCode;
        this.zzakr = (String)zzu.zzu(manufacturer);
        this.zzaks = (String)zzu.zzu(model);
        this.zzTQ = "";
        this.zzakt = (String)zzu.zzu(uid);
        this.zzSq = type;
        this.zzaku = platformType;
    }

    public Device(String manufacturer, String model, String uid, int type) {
        this(manufacturer, model, "", uid, type, 0);
    }

    public Device(String manufacturer, String model, String version, String uid, int type, int platformType) {
        this(1, manufacturer, model, "", uid, type, platformType);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof Device && this.zza(((Device)that));
    }

    public static Device getLocalDevice(Context context) {
        int v = zzlv.zzap(context);
        String s = Device.zzal(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, s, v, 2);
    }

    public String getManufacturer() {
        return this.zzakr;
    }

    public String getModel() {
        return this.zzaks;
    }

    String getStreamIdentifier() {
        return String.format("%s:%s:%s", this.zzakr, this.zzaks, this.zzakt);
    }

    public int getType() {
        return this.zzSq;
    }

    public String getUid() {
        return this.zzakt;
    }

    public String getVersion() {
        return this.zzTQ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzakr, this.zzaks, this.zzTQ, this.zzakt, this.zzSq});
    }

    @Override
    public String toString() {
        return String.format("Device{%s:%s:%s:%s}", this.getStreamIdentifier(), this.zzTQ, this.zzSq, this.zzaku);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzh.zza(this, parcel, flags);
    }

    // 去混淆评级： 低(40)
    private boolean zza(Device device0) {
        return zzt.equal(this.zzakr, device0.zzakr) && zzt.equal(this.zzaks, device0.zzaks) && zzt.equal(this.zzTQ, device0.zzTQ) && zzt.equal(this.zzakt, device0.zzakt) && this.zzSq == device0.zzSq && this.zzaku == device0.zzaku;
    }

    private static String zzal(Context context0) {
        return Settings.Secure.getString(context0.getContentResolver(), "android_id");
    }

    public int zzqE() {
        return this.zzaku;
    }

    private boolean zzqF() {
        return this.zzqE() == 1;
    }

    // 去混淆评级： 低(20)
    public String zzqG() {
        return this.zzqF() ? this.zzakt : zzmy.zzcL(this.zzakt);
    }
}

