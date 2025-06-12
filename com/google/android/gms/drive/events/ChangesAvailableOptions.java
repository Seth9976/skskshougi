package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class ChangesAvailableOptions implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final int zzadP;
    final boolean zzadQ;
    final List zzadR;
    private final Set zzadS;

    static {
        ChangesAvailableOptions.CREATOR = new zzd();
    }

    ChangesAvailableOptions(int versionCode, int changesSizeLimit, boolean repeats, List list0) {
        this(versionCode, changesSizeLimit, repeats, list0, (list0 == null ? null : new HashSet(list0)));
    }

    private ChangesAvailableOptions(int versionCode, int changesSizeLimit, boolean repeats, List list0, Set set0) {
        this.zzCY = versionCode;
        this.zzadP = changesSizeLimit;
        this.zzadQ = repeats;
        this.zzadR = list0;
        this.zzadS = set0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == this.getClass() ? o == this || zzt.equal(this.zzadS, ((ChangesAvailableOptions)o).zzadS) && this.zzadP == ((ChangesAvailableOptions)o).zzadP && this.zzadQ == ((ChangesAvailableOptions)o).zzadQ : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzadS, this.zzadP, Boolean.valueOf(this.zzadQ)});
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", this.zzadP, Boolean.valueOf(this.zzadQ), this.zzadR);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzd.zza(this, dest, flags);
    }
}

