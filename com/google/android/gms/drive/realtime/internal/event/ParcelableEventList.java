package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableEventList implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DataHolder zzaiQ;
    final boolean zzaiR;
    final List zzaiS;
    final List zzoB;

    static {
        ParcelableEventList.CREATOR = new zzd();
    }

    ParcelableEventList(int versionCode, List list0, DataHolder eventData, boolean undoRedoStateChanged, List list1) {
        this.zzCY = versionCode;
        this.zzoB = list0;
        this.zzaiQ = eventData;
        this.zzaiR = undoRedoStateChanged;
        this.zzaiS = list1;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzd.zza(this, dest, flags);
    }
}

