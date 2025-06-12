package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public class CreateContentsRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final int zzacS;

    static {
        CreateContentsRequest.CREATOR = new zzi();
    }

    public CreateContentsRequest(int mode) {
        this(1, mode);
    }

    CreateContentsRequest(int versionCode, int mode) {
        this.zzCY = versionCode;
        zzu.zzb(mode == 0x20000000 || mode == 0x30000000, "Cannot create a new read-only contents!");
        this.zzacS = mode;
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

