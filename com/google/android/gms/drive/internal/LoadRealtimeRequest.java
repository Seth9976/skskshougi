package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final DriveId zzacT;
    final boolean zzafQ;
    final List zzafR;
    final boolean zzafS;
    final DataHolder zzafT;

    static {
        LoadRealtimeRequest.CREATOR = new zzap();
    }

    LoadRealtimeRequest(int versionCode, DriveId driveId, boolean useTestMode, List list0, boolean isInMemory, DataHolder json) {
        this.zzCY = versionCode;
        this.zzacT = driveId;
        this.zzafQ = useTestMode;
        this.zzafR = list0;
        this.zzafS = isInMemory;
        this.zzafT = json;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzap.zza(this, dest, flags);
    }
}

