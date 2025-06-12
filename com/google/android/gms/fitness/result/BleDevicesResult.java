package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BleDevicesResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzamO;

    static {
        BleDevicesResult.CREATOR = new zza();
    }

    BleDevicesResult(int versionCode, List list0, Status status) {
        this.zzCY = versionCode;
        this.zzamO = Collections.unmodifiableList(list0);
        this.zzOt = status;
    }

    public BleDevicesResult(List list0, Status status) {
        this.zzCY = 3;
        this.zzamO = Collections.unmodifiableList(list0);
        this.zzOt = status;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof BleDevicesResult && this.zzb(((BleDevicesResult)that));
    }

    public List getClaimedBleDevices() {
        return this.zzamO;
    }

    public List getClaimedBleDevices(DataType dataType) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzamO) {
            BleDevice bleDevice0 = (BleDevice)object0;
            if(bleDevice0.getDataTypes().contains(dataType)) {
                arrayList0.add(bleDevice0);
            }
        }
        return Collections.unmodifiableList(arrayList0);
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOt, this.zzamO});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("bleDevices", this.zzamO).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zza.zza(this, dest, flags);
    }

    public static BleDevicesResult zzJ(Status status0) {
        return new BleDevicesResult(Collections.emptyList(), status0);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(BleDevicesResult bleDevicesResult0) {
        return this.zzOt.equals(bleDevicesResult0.zzOt) && zzt.equal(this.zzamO, bleDevicesResult0.zzamO);
    }
}

