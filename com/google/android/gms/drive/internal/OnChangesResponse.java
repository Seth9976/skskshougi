package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

public class OnChangesResponse extends WriteAwareParcelable implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DataHolder zzaga;
    final List zzagb;
    final ChangeSequenceNumber zzagc;
    final boolean zzagd;

    static {
        OnChangesResponse.CREATOR = new zzat();
    }

    OnChangesResponse(int versionCode, DataHolder newOrModifiedResourcesData, List list0, ChangeSequenceNumber lastChangeSequenceNumber, boolean moreChangesExist) {
        this.zzCY = versionCode;
        this.zzaga = newOrModifiedResourcesData;
        this.zzagb = list0;
        this.zzagc = lastChangeSequenceNumber;
        this.zzagd = moreChangesExist;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.drive.WriteAwareParcelable
    protected void zzI(Parcel parcel0, int v) {
        zzat.zza(this, parcel0, v | 1);
    }
}

