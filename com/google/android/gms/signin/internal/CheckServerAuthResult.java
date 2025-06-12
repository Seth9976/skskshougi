package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CheckServerAuthResult implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final boolean zzaJY;
    final List zzaJZ;

    static {
        CheckServerAuthResult.CREATOR = new zzc();
    }

    CheckServerAuthResult(int versionCode, boolean newAuthCodeRequired, List list0) {
        this.zzCY = versionCode;
        this.zzaJY = newAuthCodeRequired;
        this.zzaJZ = list0;
    }

    public CheckServerAuthResult(boolean newAuthCodeRequired, Set set0) {
        this(1, newAuthCodeRequired, CheckServerAuthResult.zzf(set0));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }

    private static List zzf(Set set0) {
        return set0 == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(set0));
    }
}

