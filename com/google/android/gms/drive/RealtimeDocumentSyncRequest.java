package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

public class RealtimeDocumentSyncRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzadF;
    final List zzadG;

    static {
        RealtimeDocumentSyncRequest.CREATOR = new zzi();
    }

    RealtimeDocumentSyncRequest(int versionCode, List list0, List list1) {
        this.zzCY = versionCode;
        this.zzadF = (List)zzu.zzu(list0);
        this.zzadG = (List)zzu.zzu(list1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }
}

