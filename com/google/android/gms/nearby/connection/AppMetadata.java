package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

public final class AppMetadata implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final List zzaFn;

    static {
        AppMetadata.CREATOR = new zzb();
    }

    AppMetadata(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzaFn = (List)zzu.zzb(list0, "Must specify application identifiers");
        zzu.zza(list0.size(), "Application identifiers cannot be empty");
    }

    public AppMetadata(List list0) {
        this(1, list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List getAppIdentifiers() {
        return this.zzaFn;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }
}

