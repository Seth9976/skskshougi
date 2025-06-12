package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParentDriveIdSet implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzagJ;

    static {
        ParentDriveIdSet.CREATOR = new zzk();
    }

    public ParentDriveIdSet() {
        this(1, new ArrayList());
    }

    ParentDriveIdSet(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzagJ = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzk.zza(this, out, flags);
    }

    public Set zzC(long v) {
        Set set0 = new HashSet();
        for(Object object0: this.zzagJ) {
            set0.add(((PartialDriveId)object0).zzD(v));
        }
        return set0;
    }

    public void zza(PartialDriveId partialDriveId0) {
        this.zzagJ.add(partialDriveId0);
    }
}

