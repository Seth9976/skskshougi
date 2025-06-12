package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class ConnectionConfiguration implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    final int zzCY;
    private boolean zzMq;
    private final int zzSq;
    private final boolean zzaSQ;
    private String zzaSR;
    private boolean zzaSS;
    private String zzaST;
    private final int zzadD;
    private final String zzajO;

    static {
        ConnectionConfiguration.CREATOR = new zze();
    }

    ConnectionConfiguration(int versionCode, String name, String address, int type, int role, boolean connectionEnabled, boolean isConnected, String peerNodeId, boolean btlePriority, String nodeId) {
        this.zzCY = versionCode;
        this.mName = name;
        this.zzajO = address;
        this.zzSq = type;
        this.zzadD = role;
        this.zzaSQ = connectionEnabled;
        this.zzMq = isConnected;
        this.zzaSR = peerNodeId;
        this.zzaSS = btlePriority;
        this.zzaST = nodeId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(80)
    @Override
    public boolean equals(Object o) {
        return o instanceof ConnectionConfiguration ? zzt.equal(this.zzCY, ((ConnectionConfiguration)o).zzCY) && zzt.equal(this.mName, ((ConnectionConfiguration)o).mName) && zzt.equal(this.zzajO, ((ConnectionConfiguration)o).zzajO) && zzt.equal(this.zzSq, ((ConnectionConfiguration)o).zzSq) && zzt.equal(this.zzadD, ((ConnectionConfiguration)o).zzadD) && zzt.equal(Boolean.valueOf(this.zzaSQ), Boolean.valueOf(((ConnectionConfiguration)o).zzaSQ)) && zzt.equal(Boolean.valueOf(this.zzaSS), Boolean.valueOf(((ConnectionConfiguration)o).zzaSS)) : false;
    }

    public String getAddress() {
        return this.zzajO;
    }

    public String getName() {
        return this.mName;
    }

    public String getNodeId() {
        return this.zzaST;
    }

    public int getRole() {
        return this.zzadD;
    }

    public int getType() {
        return this.zzSq;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzCY, this.mName, this.zzajO, this.zzSq, this.zzadD, Boolean.valueOf(this.zzaSQ), Boolean.valueOf(this.zzaSS)});
    }

    public boolean isConnected() {
        return this.zzMq;
    }

    public boolean isEnabled() {
        return this.zzaSQ;
    }

    @Override
    public String toString() {
        return "ConnectionConfiguration[ " + ("mName=" + this.mName) + (", mAddress=" + this.zzajO) + (", mType=" + this.zzSq) + (", mRole=" + this.zzadD) + (", mEnabled=" + this.zzaSQ) + (", mIsConnected=" + this.zzMq) + (", mPeerNodeId=" + this.zzaSR) + (", mBtlePriority=" + this.zzaSS) + (", mNodeId=" + this.zzaST) + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }

    public String zzAP() {
        return this.zzaSR;
    }

    public boolean zzAQ() {
        return this.zzaSS;
    }
}

