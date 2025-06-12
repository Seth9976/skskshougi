package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlt;
import java.util.Collections;
import java.util.List;

public class BleDevice implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    private final int zzCY;
    private final String zzajO;
    private final List zzajP;
    private final List zzajQ;

    static {
        BleDevice.CREATOR = new zzb();
    }

    BleDevice(int versionCode, String address, String name, List list0, List list1) {
        this.zzCY = versionCode;
        this.zzajO = address;
        this.mName = name;
        this.zzajP = Collections.unmodifiableList(list0);
        this.zzajQ = Collections.unmodifiableList(list1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o == this || o instanceof BleDevice && this.zza(((BleDevice)o));
    }

    public String getAddress() {
        return this.zzajO;
    }

    public List getDataTypes() {
        return this.zzajQ;
    }

    public String getName() {
        return this.mName;
    }

    public List getSupportedProfiles() {
        return this.zzajP;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mName, this.zzajO, this.zzajP, this.zzajQ});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("name", this.mName).zzg("address", this.zzajO).zzg("dataTypes", this.zzajQ).zzg("supportedProfiles", this.zzajP).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzb.zza(this, parcel, flags);
    }

    // 去混淆评级： 低(40)
    private boolean zza(BleDevice bleDevice0) {
        return this.mName.equals(bleDevice0.mName) && this.zzajO.equals(bleDevice0.zzajO) && zzlt.zza(bleDevice0.zzajP, this.zzajP) && zzlt.zza(this.zzajQ, bleDevice0.zzajQ);
    }
}

