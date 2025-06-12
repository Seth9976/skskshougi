package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public class AccountChangeEvent implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int mVersion;
    final String zzOA;
    final long zzOw;
    final String zzOx;
    final int zzOy;
    final int zzOz;

    static {
        AccountChangeEvent.CREATOR = new zza();
    }

    AccountChangeEvent(int version, long id, String accountName, int changeType, int eventIndex, String changeData) {
        this.mVersion = version;
        this.zzOw = id;
        this.zzOx = (String)zzu.zzu(accountName);
        this.zzOy = changeType;
        this.zzOz = eventIndex;
        this.zzOA = changeData;
    }

    public AccountChangeEvent(long id, String accountName, int changeType, int eventIndex, String changeData) {
        this.mVersion = 1;
        this.zzOw = id;
        this.zzOx = (String)zzu.zzu(accountName);
        this.zzOy = changeType;
        this.zzOz = eventIndex;
        this.zzOA = changeData;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object that) {
        return that == this ? true : that instanceof AccountChangeEvent && (this.mVersion == ((AccountChangeEvent)that).mVersion && this.zzOw == ((AccountChangeEvent)that).zzOw && zzt.equal(this.zzOx, ((AccountChangeEvent)that).zzOx) && this.zzOy == ((AccountChangeEvent)that).zzOy && this.zzOz == ((AccountChangeEvent)that).zzOz && zzt.equal(this.zzOA, ((AccountChangeEvent)that).zzOA));
    }

    public String getAccountName() {
        return this.zzOx;
    }

    public String getChangeData() {
        return this.zzOA;
    }

    public int getChangeType() {
        return this.zzOy;
    }

    public int getEventIndex() {
        return this.zzOz;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mVersion, this.zzOw, this.zzOx, this.zzOy, this.zzOz, this.zzOA});
    }

    @Override
    public String toString() {
        switch(this.zzOy) {
            case 1: {
                return "AccountChangeEvent {accountName = " + this.zzOx + ", changeType = " + "ADDED" + ", changeData = " + this.zzOA + ", eventIndex = " + this.zzOz + "}";
            }
            case 2: {
                return "AccountChangeEvent {accountName = " + this.zzOx + ", changeType = " + "REMOVED" + ", changeData = " + this.zzOA + ", eventIndex = " + this.zzOz + "}";
            }
            case 3: {
                return "AccountChangeEvent {accountName = " + this.zzOx + ", changeType = " + "RENAMED_FROM" + ", changeData = " + this.zzOA + ", eventIndex = " + this.zzOz + "}";
            }
            case 4: {
                return "AccountChangeEvent {accountName = " + this.zzOx + ", changeType = " + "RENAMED_TO" + ", changeData = " + this.zzOA + ", eventIndex = " + this.zzOz + "}";
            }
            default: {
                return "AccountChangeEvent {accountName = " + this.zzOx + ", changeType = " + "UNKNOWN" + ", changeData = " + this.zzOA + ", eventIndex = " + this.zzOz + "}";
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zza.zza(this, dest, flags);
    }
}

