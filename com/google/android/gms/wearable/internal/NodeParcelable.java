package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

public class NodeParcelable implements SafeParcelable, Node {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private final String zzKI;
    private final int zzaUL;
    private final boolean zzaUM;
    private final String zzadI;

    static {
        NodeParcelable.CREATOR = new zzay();
    }

    NodeParcelable(int versionCode, String id, String displayName, int hopCount, boolean isNearby) {
        this.zzCY = versionCode;
        this.zzKI = id;
        this.zzadI = displayName;
        this.zzaUL = hopCount;
        this.zzaUM = isNearby;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof NodeParcelable ? ((NodeParcelable)o).zzKI.equals(this.zzKI) : false;
    }

    @Override  // com.google.android.gms.wearable.Node
    public String getDisplayName() {
        return this.zzadI;
    }

    public int getHopCount() {
        return this.zzaUL;
    }

    @Override  // com.google.android.gms.wearable.Node
    public String getId() {
        return this.zzKI;
    }

    @Override
    public int hashCode() {
        return this.zzKI.hashCode();
    }

    @Override  // com.google.android.gms.wearable.Node
    public boolean isNearby() {
        return this.zzaUM;
    }

    @Override
    public String toString() {
        return "Node{" + this.zzadI + ", id=" + this.zzKI + ", hops=" + this.zzaUL + ", isNearby=" + this.zzaUM + "}";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzay.zza(this, dest, flags);
    }
}

