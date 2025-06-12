package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable implements SafeParcelable, CapabilityInfo {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    final int zzCY;
    private Set zzaTE;
    private final List zzaTH;
    private final Object zzqt;

    static {
        CapabilityInfoParcelable.CREATOR = new zzh();
    }

    CapabilityInfoParcelable(int versionCode, String name, List list0) {
        this.zzqt = new Object();
        this.zzCY = versionCode;
        this.mName = name;
        this.zzaTH = list0;
        this.zzaTE = null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if(this.zzCY != ((CapabilityInfoParcelable)o).zzCY) {
            return false;
        }
        if(this.mName != null) {
            if(this.mName.equals(((CapabilityInfoParcelable)o).mName)) {
                return this.zzaTH == null ? ((CapabilityInfoParcelable)o).zzaTH == null : this.zzaTH.equals(((CapabilityInfoParcelable)o).zzaTH);
            }
            return false;
        }
        if(((CapabilityInfoParcelable)o).mName == null) {
            return this.zzaTH == null ? ((CapabilityInfoParcelable)o).zzaTH == null : this.zzaTH.equals(((CapabilityInfoParcelable)o).zzaTH);
        }
        return false;
    }

    @Override  // com.google.android.gms.wearable.CapabilityInfo
    public String getName() {
        return this.mName;
    }

    @Override  // com.google.android.gms.wearable.CapabilityInfo
    public Set getNodes() {
        synchronized(this.zzqt) {
            if(this.zzaTE == null) {
                this.zzaTE = new HashSet(this.zzaTH);
            }
            return this.zzaTE;
        }
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.zzCY * 0x1F;
        int v2 = this.mName == null ? 0 : this.mName.hashCode();
        if(this.zzaTH != null) {
            v = this.zzaTH.hashCode();
        }
        return (v2 + v1) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "CapabilityInfo{" + this.mName + ", " + this.zzaTH + "}";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }

    public List zzBa() {
        return this.zzaTH;
    }
}

