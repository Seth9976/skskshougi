package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class GestureRequest implements SafeParcelable {
    public static final zzb CREATOR;
    private final int zzCY;
    private static final List zzaxL;
    private static final List zzaxM;
    private static final List zzaxN;
    private static final List zzaxO;
    private final List zzaxP;

    static {
        GestureRequest.zzaxL = Collections.unmodifiableList(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}));
        GestureRequest.zzaxM = Collections.unmodifiableList(Arrays.asList(new Integer[]{1}));
        GestureRequest.zzaxN = Collections.unmodifiableList(Arrays.asList(new Integer[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 19}));
        GestureRequest.zzaxO = Collections.unmodifiableList(Arrays.asList(new Integer[]{3, 5, 7, 9, 11, 13, 15, 17}));
        GestureRequest.CREATOR = new zzb();
    }

    GestureRequest(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzaxP = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    public List zzuo() {
        return this.zzaxP;
    }
}

